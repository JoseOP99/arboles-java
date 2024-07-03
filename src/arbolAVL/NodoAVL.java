package arbolAVL;

public class NodoAVL {

    private Contacto dato;
    private int fe;
    private NodoAVL hijoIzquierdo;
    private NodoAVL hijoDerecho;

    public NodoAVL(Contacto dato) {
        this.dato = dato;
        this.fe = 0;
        this.hijoIzquierdo = null;
        this.hijoDerecho = null;
    }

    public Contacto getDato() {
        return dato;
    }

    public void setDato(Contacto dato) {
        this.dato = dato;
    }

    public int getFe() {
        return fe;
    }

    public void setFe(int fe) {
        this.fe = fe;
    }

    public NodoAVL getHijoIzquierdo() {
        return hijoIzquierdo;
    }

    public void setHijoIzquierdo(NodoAVL hijoIzquierdo) {
        this.hijoIzquierdo = hijoIzquierdo;
    }

    public NodoAVL getHijoDerecho() {
        return hijoDerecho;
    }

    public void setHijoDerecho(NodoAVL hijoDerecho) {
        this.hijoDerecho = hijoDerecho;
    }

}
