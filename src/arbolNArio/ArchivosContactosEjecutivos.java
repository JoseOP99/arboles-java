package arbolNArio;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ArchivosContactosEjecutivos {

    ArbolNArio arbol = new ArbolNArio("C");

    public void cargarContacos() {
        String datoR = String.valueOf(arbol.getRaiz().getDato());
        try {
            File file = new File("ContactosEjecutivos.txt");
            FileReader fr;
            BufferedReader br;
            if (file.exists()) {
                fr = new FileReader(file);
                br = new BufferedReader(fr);
                String linea;
                while ((linea = br.readLine()) != null) {
                    String[] aut = linea.split(":");
                    if ("1".equals(aut[0])) {
                        nuevoEjecutivo(aut[1], aut[2], true);

                    } else {
                        nuevoHijo(aut[1], aut[2], true);
                    }
                }
            } else {
                System.out.println("No existe un archivo");
            }
        } catch (IOException | NumberFormatException e) {
            System.out.println(e);
        }

    }

    public ArrayList mostrar() {
        ArrayList<String> lineaC = new ArrayList<String>();
        lineaC = arbol.mostrarPorListas();
        return lineaC;
    }

    public void nuevoHijo(String padre, String hijo, boolean agreg) {
        if (agreg) {
            if (arbol.existe(padre)) {
                if (!arbol.existe(hijo)) {
                    arbol.insertarNuevoHijo(padre, hijo);
                } else {
                    System.out.println("El hijo existte");
                }
            } else {
                System.out.println("El padre no existe");
            }

        } else {
            escribir(padre, hijo);
        }
    }

    public void nuevoEjecutivo(String nuevoEje, String nuevohijo, boolean agreg) {
        if (agreg) {
            if (arbol.existe(nuevoEje)) {
                if (!arbol.existe(nuevohijo)) {
                    nuevoHijo(nuevoEje, nuevohijo, agreg);
                } else {
                    System.out.println("El hijo existte");
                }
            } else {
                nuevoHijo("C", nuevoEje, agreg);
                nuevoHijo(nuevoEje, nuevohijo, agreg);
            }
        } else {
            escribirPadre(nuevoEje, nuevohijo);
        }
    }

    public ArrayList linea(String contacto, String nivel) {
        ArrayList<String> lineaC = new ArrayList<String>();
        try {
            File file = new File("ContactosEjecutivos.txt");
            FileReader fr;
            BufferedReader br;
            if (file.exists()) {
                fr = new FileReader(file);
                br = new BufferedReader(fr);
                String linea;
                while ((linea = br.readLine()) != null) {
                    String[] aut = linea.split(":");
                    if (contacto.equals(aut[1])) {
                        lineaC.add(aut[2]);
                    }
                }
            } else {
                System.out.println("No existe un archivo");
            }
        } catch (IOException | NumberFormatException e) {
            System.out.println(e);
        }
        return lineaC;
    }

    public String buscar(String contacto) {
        String lineaC = null;
        try {
            File file = new File("ContactosEjecutivos.txt");
            FileReader fr;
            BufferedReader br;
            if (file.exists()) {
                fr = new FileReader(file);
                br = new BufferedReader(fr);
                String linea;
                while ((linea = br.readLine()) != null) {
                    String[] aut = linea.split(":");
                    if (contacto.equals(aut[1])) {
                        lineaC = aut[0];
                    }
                }
            } else {
                System.out.println("No existe un archivo");
            }
        } catch (IOException | NumberFormatException e) {
            System.out.println(e);
        }
        return lineaC;
    }

    public void escribirPadre(String padre, String hijo) {
        try {
            File file = new File("ContactosEjecutivos.txt");
            FileWriter fw;
            BufferedWriter bw;
            if (file.exists()) {
                fw = new FileWriter(file, true);
                bw = new BufferedWriter(fw);
                bw.newLine();
                bw.write("1"
                        + ":" + padre
                        + ":" + hijo
                );
            } else {
                fw = new FileWriter(file);
                bw = new BufferedWriter(fw);
                bw.write("1"
                        + ":" + padre
                        + ":" + hijo
                );
            }
            bw.close();
            fw.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    public void escribir(String padre, String hijo) {
        try {
            File file = new File("ContactosEjecutivos.txt");
            FileWriter fw;
            BufferedWriter bw;
            if (file.exists()) {
                fw = new FileWriter(file, true);
                bw = new BufferedWriter(fw);
                bw.newLine();
                bw.write("2"
                        + ":" + padre
                        + ":" + hijo
                );
            } else {
                fw = new FileWriter(file);
                bw = new BufferedWriter(fw);
                bw.write("2"
                        + ":" + padre
                        + ":" + hijo
                );
            }
            bw.close();
            fw.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    public void mostrar12() {
        System.out.println("---nnnnnnnnnnnn-");
        NodoNArio r = arbol.getRaiz();
        NodoNArio x;
        while (r != null) {
            if (r.getSw() == 0) {
                System.out.println(arbol.distanciaRaiz(r));
            } else {
                x = (NodoNArio) r.getDato();
                System.out.println(arbol.distanciaRaiz(x));
            }

            r = r.getLiga();
        }
        System.out.println("----");
        //System.out.println(arbol.gradoA(arbol.encontrarPadreDeCoincidencia("b")));
        System.out.println(arbol.encontrarPadreDeCoincidencia("j").getDato());
        ArrayList<NodoNArio> hermanosCoincidencias = new ArrayList<>();
        ArrayList<NodoNArio> descendientesCoincidencias = new ArrayList<>();
        ArrayList<NodoNArio> ancestrosCoincidencias = new ArrayList<>();
        hermanosCoincidencias = arbol.encontrarIguales(arbol.encontrarPadreDeCoincidencia("j"));
        descendientesCoincidencias = arbol.encontrarInferiores(arbol.encontrarPadreDeCoincidencia("j"));

        System.out.println("------**********_____");

        System.out.println("------************_________");
        System.out.println("--------.........--------");
        System.out.println("--------.........--------");
        System.out.println("--------.........--------");
        System.out.println(arbol.distanciaRaiz(arbol.encontrarPadreDeCoincidencia("j")));
        System.out.println("--------.........--------");
        System.out.println("--------.........--------");
        System.out.println("--------.........--------");
        ancestrosCoincidencias = arbol.encontrarSuperiores(arbol.encontrarPadreDeCoincidencia("j"));
        System.out.println("------************_________superiores");
        for (int i = 0; i < ancestrosCoincidencias.size(); i++) {
            System.out.println(ancestrosCoincidencias.get(i).getDato());

        }
        System.out.println("------************_________ermanos");
        for (int i = 0; i < hermanosCoincidencias.size(); i++) {
            System.out.println(hermanosCoincidencias.get(i).getDato());

        }
        System.out.println("------************_________inferiores");
        for (int i = 0; i < descendientesCoincidencias.size(); i++) {
            System.out.println(descendientesCoincidencias.get(i).getDato());

        }
    }

}
