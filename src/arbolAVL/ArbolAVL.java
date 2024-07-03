package arbolAVL;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ArbolAVL {

    private NodoAVL raiz;

    public ArbolAVL() {
        raiz = null;
    }

    public NodoAVL getRaiz() {
        return raiz;
    }

    public NodoAVL buscar(String d, NodoAVL nodoB) {
        if (nodoB == null) {
            return null;
        } else if (d.equals(nodoB.getDato().getContacto())) {
            return nodoB;
        } else if (d.compareTo(nodoB.getDato().getContacto()) > 0) {
            return buscar(d, nodoB.getHijoDerecho());
        } else {
            return buscar(d, nodoB.getHijoIzquierdo());
        }
    }

    public int obtenerFE(NodoAVL x) {
        if (x == null) {
            return -1;
        } else {
            return x.getFe();
        }
    }

    public NodoAVL rotacionIzquierda(NodoAVL nodoB) {
        NodoAVL aux = nodoB.getHijoIzquierdo();
        nodoB.setHijoIzquierdo(aux.getHijoDerecho());
        aux.setHijoDerecho(nodoB);
        nodoB.setFe(Math.max(obtenerFE(nodoB.getHijoIzquierdo()), obtenerFE(nodoB.getHijoDerecho())) + 1);
        aux.setFe(Math.max(obtenerFE(aux.getHijoIzquierdo()), obtenerFE(aux.getHijoDerecho())) + 1);
        return aux;
    }

    public NodoAVL rotacionDerecha(NodoAVL nodoB) {
        NodoAVL aux = nodoB.getHijoDerecho();
        nodoB.setHijoDerecho(aux.getHijoIzquierdo());
        aux.setHijoIzquierdo(nodoB);
        nodoB.setFe(Math.max(obtenerFE(nodoB.getHijoIzquierdo()), obtenerFE(nodoB.getHijoDerecho())) + 1);
        aux.setFe(Math.max(obtenerFE(aux.getHijoIzquierdo()), obtenerFE(aux.getHijoDerecho())) + 1);
        return aux;
    }

    public NodoAVL rotacionDobleIzquierda(NodoAVL nodoB) {
        NodoAVL aux;
        nodoB.setHijoIzquierdo(rotacionDerecha(nodoB.getHijoIzquierdo()));
        aux = rotacionIzquierda(nodoB);
        return aux;
    }

    public NodoAVL rotacionDobleDerecha(NodoAVL nodoB) {
        NodoAVL aux;
        nodoB.setHijoDerecho(rotacionIzquierda(nodoB.getHijoDerecho()));
        aux = rotacionDerecha(nodoB);
        return aux;
    }

    public NodoAVL insertarAVL(NodoAVL nuevo, NodoAVL subAr) {
        NodoAVL nuevoPadre = subAr;
        if (nuevo.getDato().getContacto().compareTo(subAr.getDato().getContacto()) < 0) {
            if (subAr.getHijoIzquierdo() == null) {
                subAr.setHijoIzquierdo(nuevo);
            } else {
                subAr.setHijoIzquierdo(insertarAVL(nuevo, subAr.getHijoIzquierdo()));
                if ((obtenerFE(subAr.getHijoIzquierdo()) - obtenerFE(subAr.getHijoDerecho()) == 2)) {
                    if (nuevo.getDato().getContacto().compareTo(subAr.getHijoIzquierdo().getDato().getContacto()) < 0) {
                        nuevoPadre = rotacionIzquierda(subAr);
                    } else {
                        nuevoPadre = rotacionDobleIzquierda(subAr);
                    }
                }
            }
        } else if (nuevo.getDato().getContacto().compareTo(subAr.getDato().getContacto()) > 0) {
            if (subAr.getHijoDerecho() == null) {
                subAr.setHijoDerecho(nuevo);
            } else {
                subAr.setHijoDerecho(insertarAVL(nuevo, subAr.getHijoDerecho()));
                if ((obtenerFE(subAr.getHijoDerecho()) - obtenerFE(subAr.getHijoIzquierdo()) == 2)) {
                    if (nuevo.getDato().getContacto().compareTo(subAr.getHijoDerecho().getDato().getContacto()) > 0) {
                        nuevoPadre = rotacionDerecha(subAr);
                    } else {
                        nuevoPadre = rotacionDobleDerecha(subAr);
                    }
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Nodo duplicado");
        }

        if ((subAr.getHijoIzquierdo() == null) && (subAr.getHijoDerecho() != null)) {
            subAr.setFe(subAr.getHijoDerecho().getFe() + 1);
        } else if ((subAr.getHijoDerecho() == null) && (subAr.getHijoIzquierdo() != null)) {
            subAr.setFe(subAr.getHijoIzquierdo().getFe() + 1);
        } else {
            subAr.setFe(Math.max(obtenerFE(subAr.getHijoIzquierdo()), obtenerFE(subAr.getHijoDerecho())) + 1);
        }
        return nuevoPadre;
    }

    public void insertar(Contacto d) {
        NodoAVL nuevo = new NodoAVL(d);
        if (raiz == null) {
            raiz = nuevo;
        } else {
            raiz = insertarAVL(nuevo, raiz);
        }
    }

    public ArrayList recorridoPreorden(NodoAVL r, ArrayList<Contacto> lineaC) {
        if (r != null) {
            lineaC.add(r.getDato());
            recorridoPreorden(r.getHijoIzquierdo(), lineaC);
            recorridoPreorden(r.getHijoDerecho(), lineaC);
        }
        return lineaC;
    }
}
