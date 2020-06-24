package listaEnlazadaSimpleERROR;
public class ListaEnlazada<Object> {
    Nodo<Object> primero;

    public ListaEnlazada() {
        vaciar();
    }
    
    
    public void add(Object t){
        Nodo<Object> nuevo=new Nodo<>(t);
        if (isEmpty()) {
            primero=nuevo;
        }else{
            Nodo<Object> aux=primero;
            while (aux.getSiguiente()!=null) {
                aux=aux.getSiguiente();
            }
            aux.setSiguiente(nuevo);            
        }
        
    }
    public void set(int pos,Object dato){
        Nodo<Object> aux=primero;
        int cont=0;
        if (pos<0 || pos>=size()){
            System.out.println("La posición no es correcta");
        }else{
            while (aux!=null) {
                if (pos==cont) {
                    aux.setDato(dato);
                }
                cont++;
                aux=aux.getSiguiente();
            }
        }
    }
    public void remove(int pos){
        Nodo<Object> aux=primero;
        Nodo<Object> anterior=null;
        int cont=0;
        if (pos<0 || pos>=size()) {
            System.out.println("La posición no es correcta");
        }else{
            while (aux!=null) {
                if (pos==cont) {
                    if (anterior==null) {
                        primero=primero.getSiguiente();
                    }else{
                        anterior.setSiguiente(aux.getSiguiente());
                    }
                    aux=null;
                }else{
                    anterior=aux;
                    aux=aux.getSiguiente();
                    cont++;
                }
            }
        }
    }
    public Object get(int pos){
        Nodo<Object> aux=primero;
        int cont=0;
        Object dato=null;
        if (pos<0 || pos>=size()) {
            System.out.println("La posición insertada no es la correcta");
        }else{
            while (aux!=null) {
                if (pos==cont) {
                    dato=aux.getDato();
                }
                aux=aux.getSiguiente();
                cont++;
            }
        }
        return dato;
    }
    public int size(){
        Nodo<Object> aux;
        int numElementos=0;
        aux=primero;
        while (aux!=null) {
            numElementos++;
            aux=aux.getSiguiente();
        }
        return numElementos;
    }
    
    public boolean estaVacia(){ //pregunta si la lista está vacía
        return primero == null; 
    }
    public void InsertarPrimero(Estudiante t){ //Insertamos un objeto al principio de la lista
        Nodo<Estudiante> nuevo = new Nodo<>(t);
        if (!estaVacia()) {
            nuevo.setSiguiente(primero);
            primero = (Nodo<Object>) nuevo;

        }
        primero = (Nodo<Object>) nuevo;// y el primero apunta al nodo nuevo
    }

     public void InsertarUltimo(Estudiante t){//Insertar al final de la lista un objeto
        Nodo<Estudiante> aux = new Nodo<>(t);
        Nodo<Estudiante> rec_aux;
        if (estaVacia()) {
            InsertarPrimero(t);
        }else{
            rec_aux = (Nodo<Estudiante>) primero;
            
            while (rec_aux.getSiguiente() != null) {//recorremos hasta hallar el ultimo nodo 
                rec_aux = rec_aux.getSiguiente();
            }
            rec_aux.setSiguiente(aux);//Actualizamos el siguiente del ultimo
        }
    }
        public int CuantosElementos(){//Devuelve el número de elementos de la lista
        Nodo<Estudiante> aux;
        int numero_de_Elementos = 0;
        aux = (Nodo<Estudiante>) primero;
        
        //Recorremos
        while (aux != null) {
            numero_de_Elementos++;
            aux = aux.getSiguiente();
        }
        return numero_de_Elementos;//Retorna el número de elementos
    }
     
    public void IntroducirEstudiante(int pos, Estudiante dato){
        Nodo<Estudiante> auxRecorrido = (Nodo<Estudiante>) primero;
        Nodo<Estudiante> auxDato = null;// Debemos crear un nodo para insertar el dato
        Nodo<Estudiante> anterior = (Nodo<Estudiante>) primero;// Debemos crear un nodo insertar el dato
        
        int contador = 0;
        
        if (pos < 0 || pos > CuantosElementos()) {
            System.out.println("La posicion insertada no es correcta");
        }else if (pos == 0) {
            InsertarPrimero(dato);
        }else if (pos == CuantosElementos()) {
            InsertarUltimo(dato);
        }else {
            while (auxRecorrido != null) {
                if (pos == contador) {
                    //Creo el nodo
                    auxDato = new Nodo<Estudiante>(dato, auxRecorrido);
                    //El siguiente del anterior a aux es auxDato
                    anterior.setSiguiente(auxDato);
                }
                //Actualizo anterior
                anterior = auxRecorrido;
                
                contador++;
                auxRecorrido = auxRecorrido.getSiguiente();//Actualizo siguiente
            }
        }
    }
    
     public void vaciar(){
        primero=null;
    }
    public boolean isEmpty(){
        return primero==null;
    }
}
