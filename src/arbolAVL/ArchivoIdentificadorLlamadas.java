package arbolAVL;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ArchivoIdentificadorLlamadas {

    ArbolAVL arbol = new ArbolAVL();
    Contacto contacto;

    public void cargarContacos() {
        try {
            File file = new File("IdentificadorLlamadaspueba.txt");
            FileReader fr;
            BufferedReader br;
            if (file.exists()) {
                fr = new FileReader(file);
                br = new BufferedReader(fr);
                String linea;
                while ((linea = br.readLine()) != null) {
                    String[] aut = linea.split(":");
                    contacto = new Contacto(aut[0], aut[1]);
                    arbol.insertar(contacto);
                }
            } else {
                System.out.println("No existe un archivo");
            }
        } catch (IOException | NumberFormatException e) {
            System.out.println(e);
        }
    }

    public ArrayList mostrar() {
        ArrayList<Contacto> lineaC = new ArrayList<Contacto>();
        lineaC = arbol.recorridoPreorden(arbol.getRaiz(), lineaC);
        return lineaC;
    }

    public void buscar(String busc) {
        NodoAVL buscado;
        try {
            buscado = arbol.buscar(busc, arbol.getRaiz());
            JOptionPane.showMessageDialog(null, "El contacto es: " + buscado.getDato().getNombre() + "  Numero: " + buscado.getDato().getContacto());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "El contacto no existe", "Contacto", JOptionPane.WARNING_MESSAGE);
        }
    }

    public void nuevoCont(String contacto, String nombre, boolean agreg) {
        try {
            Contacto contacto1 = new Contacto(contacto, nombre);
            File file = new File("IdentificadorLlamadas.txt");
            FileReader fr;
            BufferedReader br;
            if (file.exists()) {
                fr = new FileReader(file);
                br = new BufferedReader(fr);
                String linea;
                while ((linea = br.readLine()) != null) {
                    String[] aut = linea.split(":");
                    if (contacto1.getContacto().equals(aut[0])) {
                        break;
                    }
                }
                if (linea == null) {
                    if (agreg) {
                        nuevoContacto(contacto1);
                        JOptionPane.showMessageDialog(null, "Contacto agregado al arbol AVL");
                    } else {
                        nuevoContactotxt(contacto1);
                        JOptionPane.showMessageDialog(null, "Contacto agregado al archivo txt");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "El contacto ya existe", "Contacto", JOptionPane.WARNING_MESSAGE);
                }
            } else {
                System.out.println("No existe un archivo");
            }
        } catch (IOException | NumberFormatException e) {
            System.out.println(e);
        }
    }

    public void nuevoContacto(Contacto contacto1) {
        arbol.insertar(contacto1);
    }

    public void nuevoContactotxt(Contacto contacto1) {
        try {
            File file = new File("IdentificadorLlamadas.txt");
            FileWriter fw;
            BufferedWriter bw;
            if (file.exists()) {
                fw = new FileWriter(file, true);
                bw = new BufferedWriter(fw);
                bw.newLine();
                bw.write(contacto1.getNombre()
                        + ":" + contacto1.getContacto()
                );
            } else {
                fw = new FileWriter(file);
                bw = new BufferedWriter(fw);
                bw.write(contacto1.getNombre()
                        + ":" + contacto1.getContacto()
                );
            }
            bw.close();
            fw.close();

        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
