package arbolNArio;

public class NodoNArio {

    private int sw;
    private Object dato;
    private NodoNArio liga;

    public NodoNArio(Object d) {
        dato = d;
    }

    public NodoNArio() {
    }

    public int getSw() {
        return sw;
    }

    public void setSw(int sw) {
        this.sw = sw;
    }

    public Object getDato() {
        return dato;
    }

    public void setDato(Object dato) {
        this.dato = dato;
    }

    public NodoNArio getLiga() {
        return liga;
    }

    public void setLiga(NodoNArio liga) {
        this.liga = liga;
    }

}
