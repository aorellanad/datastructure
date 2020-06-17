package ListaEnlazadaSimple;

public class Nodo<Persona>{
    private Persona dato; //Variable que Guarda los datos
    private Nodo<Persona> Siguiente;
 
//    Constructor vacio que inicializa la variable siguiente 
 //   de tipo nodo en null por
    public Nodo(){
        Siguiente = null;
    }
    public Nodo(Persona p){
        Siguiente = null;
        dato = p;
    }
    
    public Nodo (Persona t, Nodo<Persona> Siguiente){
        this.Siguiente= Siguiente;
        dato= t;
    }
    
    //Metodos get y set para los atributos
    public Persona getDato() {
        return dato;
    }
    public void setDato(Persona dato) {
        this.dato = dato;
    }
    public Nodo<Persona> getSiguiente() {
        return Siguiente;
    }
    public void setSiguiente(Nodo<Persona> Siguiente) {
        this.Siguiente = Siguiente;
    }   
}
