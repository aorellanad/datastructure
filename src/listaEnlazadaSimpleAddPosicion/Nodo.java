package listaEnlazadaSimpleAddPosicion;

public class Nodo<Object> {
    Object dato;//informacion o el dato que lleva el Nodo
    Nodo<Object> siguiente;//puntero o enlace
    Nodo<Object> anterior;//puntero o enlace

    public Nodo() {
        siguiente=null;
        anterior=null;
    }
    public Nodo(Object persona){
        siguiente=null;
        anterior=null;
        dato=persona;        
    }

    public Nodo(Object dato, Nodo siguiente, Nodo anterior) {
        this.dato = dato;
        this.siguiente = siguiente;
        this.anterior= anterior;
    }

    Nodo(Object dato, Nodo<Object> auxRecorrido ) {
        this.dato = dato;
        this.siguiente = auxRecorrido;
    }

    public Nodo<Object> getAnterior() {
        return anterior;
    }

    public void setAnterior(Nodo<Object> anterior) {
        this.anterior = anterior;
    }

    public Object getDato() {
        return dato;
    }

    public void setDato(Object dato) {
        this.dato = dato;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
    
    
}
