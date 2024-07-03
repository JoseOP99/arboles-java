package arbolNArio;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ArbolNArio {

    final static boolean TRANSFORMAR = true;
    final static boolean NOTRANSFORMAR = false;
    private NodoNArio raiz;

    public NodoNArio getRaiz() {
        return raiz;
    }

    public ArbolNArio(String raiz) {
        this.raiz = new NodoNArio(raiz);
    }

    public boolean finRecorrido(NodoNArio x) {
        return x == null;
    }

    public void insertarNuevoHijo(String padre, String hijo) {
        NodoNArio recorrido = raiz;
        Queue<NodoNArio> miga = new LinkedList<>();
        while (recorrido != null) {
            if (recorrido.getSw() == 0) {
                if (recorrido.getDato().equals(padre)) {
                    if (recorrido == raiz) {
                        insertarHijo(recorrido, hijo, NOTRANSFORMAR);
                    } else {
                        insertarHijo(recorrido, hijo, TRANSFORMAR);
                    }
                    break;
                } 
            } else {
                NodoNArio nreal = (NodoNArio) recorrido.getDato();
                if (nreal.getDato().equals(padre)) {
                    insertarHijo(nreal, hijo, NOTRANSFORMAR);
                    break;
                } else {
                    miga.add(nreal.getLiga());
                }
            }
            recorrido = recorrido.getLiga();
            if (recorrido == null && !miga.isEmpty()) {
                recorrido = miga.remove();
            }
        }
    }

    private void insertarHijo(NodoNArio r, String dato, boolean TRANSFORMAR) {
        NodoNArio nuevoHijo = new NodoNArio(dato);
        if (TRANSFORMAR) {
            r.setSw(1);
            NodoNArio nuevoPadre = new NodoNArio(r.getDato());
            r.setDato(nuevoPadre);
            nuevoPadre.setLiga(nuevoHijo);
        } else {
            nuevoHijo.setLiga(r.getLiga());
            r.setLiga(nuevoHijo);
        }
    }

    public ArrayList mostrarPorListas() {
        ArrayList<String> lineaC = new ArrayList<String>();

        Stack<NodoNArio> migas = new Stack();
        migas.add(raiz);
        while (!migas.empty()) {
            NodoNArio pr = migas.pop();
            while (pr != null) {
                if (pr.getSw() == 0) {
                    lineaC.add((String) pr.getDato());
                } else {
                    NodoNArio npr = (NodoNArio) pr.getDato();
                    migas.add(npr);
                }
                pr = pr.getLiga();
            }
        }
        return lineaC;
    }

    boolean existe(String string) {
        Stack<NodoNArio> migas = new Stack();
        migas.add(getRaiz());
        boolean ex = false;
        while (!migas.empty()) {
            NodoNArio recorrido = migas.pop();
            while (recorrido != null) {
                if (recorrido.getSw() == 0) {
                    if (recorrido.getDato().equals(string)) {
                        ex = true;
                    }
                } else {
                    NodoNArio aux = (NodoNArio) recorrido.getDato();
                    migas.add(aux);
                }
                recorrido = recorrido.getLiga();
            }
        }
        return ex;
    }

    public boolean hijosEsCoincidencia(NodoNArio padre, String coincidencia) {
        boolean rr = false;
        NodoNArio x;
        while (!finRecorrido(padre)) {

            if (padre.getSw() == 0) {
                if (padre.getDato().equals(coincidencia)) {
                    rr = true;
                    break;
                }
            } else {
                x = (NodoNArio) padre.getDato();
                if (x.getDato().equals(coincidencia)) {
                    rr = true;
                    break;
                }
            }
            padre = padre.getLiga();
        }
        return rr;
    }

    public NodoNArio encontrarPadreDeCoincidencia(String coincidencia) {
        NodoNArio padre = null;
        Stack<NodoNArio> migas = new Stack();
        migas.add(getRaiz());
        while (!migas.empty()) {
            NodoNArio recorrido = migas.pop();
            while (recorrido != null) {
                if (recorrido.getSw() == 0) {
                    if (hijosEsCoincidencia(recorrido, coincidencia)) {
                        padre = recorrido;
                        break;
                    }
                } else {
                    NodoNArio aux = (NodoNArio) recorrido.getDato();
                    migas.add(aux);
                }
                recorrido = recorrido.getLiga();
            }
        }
        return padre;
    }

    public ArrayList encontrarHermanosCoincidencia(NodoNArio padre) {
        ArrayList<NodoNArio> hermanosCoincidencia = new ArrayList<>();
        NodoNArio recorrido = padre.getLiga();
        while (!finRecorrido(recorrido)) {
            if (recorrido.getSw() == 0) {
                hermanosCoincidencia.add(recorrido);
            } else {
                NodoNArio aux = (NodoNArio) recorrido.getDato();
                hermanosCoincidencia.add(aux);
            }
            recorrido = recorrido.getLiga();
        }
        return hermanosCoincidencia;
    }

    public ArrayList encontrarDescendientesCoincidencia(NodoNArio padre) {
        ArrayList<NodoNArio> lineaC = new ArrayList<>();
        NodoNArio coindicencia = padre.getLiga();
        Stack<NodoNArio> migas = new Stack();
        migas.add(coindicencia);
        while (!migas.empty()) {
            NodoNArio recorrido = migas.pop();
            while (recorrido != null) {
                if (recorrido.getSw() == 0) {
                    lineaC.add(recorrido);
                } else {
                    NodoNArio aux = (NodoNArio) recorrido.getDato();
                    migas.add(aux);
                }
                recorrido = recorrido.getLiga();
            }
        }
        return lineaC;
    }

    public ArrayList encontrarAncestrosCoincidencia(NodoNArio padre) {
        ArrayList<NodoNArio> ancestros = new ArrayList<>();
        while (padre != getRaiz()) {
            ancestros.add(padre);
            padre = encontrarPadreDeCoincidencia((String) padre.getDato());
        }
        ancestros.add(padre);
        return ancestros;
    }

    public int distanciaRaiz(NodoNArio r) {
        int distancia = 1;
        boolean retornado = false;
        NodoNArio recorrido = getRaiz();
        Stack<Object> migas = new Stack();
        migas.push(recorrido.getLiga());
        while (!migas.empty()) {
            NodoNArio x = (NodoNArio) migas.pop();
            retornado = false;
            while (x != null) {
                if (x.getSw() == 0) {
                    if (x.getDato().equals(r.getDato())) {
                        return distancia;
                    } else {
                        if (retornado) {
                            x = x.getLiga();
                            retornado = false;
                        } else {
                            x = x.getLiga();
                        }
                    }
                } else {
                    distancia = distancia + 1;

                    migas.push(x.getLiga());

                    x = (NodoNArio) x.getDato();
                    retornado = true;
                }
            }
            if (x == null) {
                distancia--;
            }
        }
        return distancia = 0;
    }

    public void buscarCoincidencias(ArbolNArio propio, ArbolNArio otro) {
        ArrayList<NodoNArio> coincidencias = new ArrayList<>();
        ArrayList<NodoNArio> falantes = new ArrayList<>();
        ArrayList<NodoNArio> hermanosCoincidencia = new ArrayList<>();
        ArrayList<NodoNArio> descendientesCoincidencia = new ArrayList<>();
        ArrayList<NodoNArio> ancestrosCoincidencia = new ArrayList<>();
        NodoNArio padreCoincidencia;
        Stack<NodoNArio> migas = new Stack();
        migas.add(otro.getRaiz());
        while (!migas.empty()) {
            NodoNArio recorrido = migas.pop();
            while (recorrido != null) {
                if (recorrido.getSw() == 0) {
                    if (propio.existe((String) recorrido.getDato())) {
                        coincidencias.add(recorrido);
                    } else {
                        falantes.add(recorrido);
                    }
                } else {
                    NodoNArio aux = (NodoNArio) recorrido.getDato();
                    migas.add(aux);
                }
                recorrido = recorrido.getLiga();
            }
        }
        System.out.println("Las coincidencias son: ");
        for (int i = 0; i < 10; i++) {
            System.out.println(coincidencias.get(i).getDato());
        }
        System.out.println("Los falttantes son: ");
        for (int i = 0; i < 10; i++) {
            System.out.println(falantes.get(i).getDato());
        }

        for (int i = 0; i < coincidencias.size(); i++) {
            padreCoincidencia = encontrarPadreDeCoincidencia((String) coincidencias.get(i).getDato());
            hermanosCoincidencia = encontrarHermanosCoincidencia(padreCoincidencia);
            System.out.println("Los hermanos de la coincidencia " + i + 1 + " son:");
            for (int j = 0; j < hermanosCoincidencia.size(); j++) {
                System.out.println(hermanosCoincidencia.get(j).getDato());
            }
            descendientesCoincidencia = encontrarDescendientesCoincidencia(coincidencias.get(i));
            System.out.println("Los descendientes de la coincidencia " + i + 1 + " son:");
            for (int k = 0; k < descendientesCoincidencia.size(); k++) {
                System.out.println(descendientesCoincidencia.get(k).getDato());
            }
            ancestrosCoincidencia = encontrarAncestrosCoincidencia(coincidencias.get(i));
            System.out.println("Los ancestros de la coincidencia " + i + 1 + " son:");
            for (int m = 0; m < ancestrosCoincidencia.size(); m++) {
                System.out.println(ancestrosCoincidencia.get(m).getDato());
            }
        }
    }

    public ArrayList encontrarSuperiores(NodoNArio padre) {
        System.out.println("mmmmmmmmmmmmmmmmmm");
        int nivel = distanciaRaiz(padre);
        System.out.println(nivel);
        ArrayList<NodoNArio> superiores = new ArrayList<>();
        Stack<NodoNArio> migas = new Stack();
        migas.add(getRaiz());
        while (!migas.empty()) {
            NodoNArio recorrido = migas.pop();
            while (recorrido != null) {
                if (recorrido.getSw() == 0) {
                    if (distanciaRaiz(recorrido) <= nivel) {
                        System.out.println(distanciaRaiz(recorrido));
                        superiores.add(recorrido);
                    }
                } else {
                    NodoNArio aux = (NodoNArio) recorrido.getDato();
                    migas.add(aux);
                }
                recorrido = recorrido.getLiga();
            }
        }
        return superiores;
    }

    public ArrayList encontrarInferiores(NodoNArio padre) {
        int nivel = distanciaRaiz(padre) + 1;
        ArrayList<NodoNArio> inferiores = new ArrayList<>();
        Stack<NodoNArio> migas = new Stack();
        migas.add(getRaiz());
        while (!migas.empty()) {
            NodoNArio recorrido = migas.pop();
            while (recorrido != null) {
                if (recorrido.getSw() == 0) {
                    if (distanciaRaiz(recorrido) > nivel) {
                        inferiores.add(recorrido);
                    }
                } else {
                    NodoNArio aux = (NodoNArio) recorrido.getDato();
                    migas.add(aux);
                }
                recorrido = recorrido.getLiga();
            }
        }
        return inferiores;
    }

    public ArrayList encontrarIguales(NodoNArio padre) {
        int nivel = distanciaRaiz(padre) + 1;
        ArrayList<NodoNArio> iguales = new ArrayList<>();
        Stack<NodoNArio> migas = new Stack();
        migas.add(getRaiz());
        while (!migas.empty()) {
            NodoNArio recorrido = migas.pop();
            while (recorrido != null) {
                if (recorrido.getSw() == 0) {
                    if (distanciaRaiz(recorrido) == nivel) {
                        iguales.add(recorrido);
                    }
                } else {
                    NodoNArio aux = (NodoNArio) recorrido.getDato();
                    migas.add(aux);
                }
                recorrido = recorrido.getLiga();
            }
        }
        return iguales;
    }

}
