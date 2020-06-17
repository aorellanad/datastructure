package ListaEnlazadaSimple;
public class ListaEnlazada<Persona>{
    private  Nodo<Persona> primero;
    public  ListaEnlazada(){
        ListaVacia();
    }
    private void ListaVacia(){ //vaciamos la lista
        primero = null;

    }
    public boolean estaVacia(){ //pregunta si la lista está vacía
        return primero == null; 
    }
    public void InsertarPrimero(Persona t){ //Insertamos un objeto al principio de la lista
        Nodo<Persona> nuevo = new Nodo<>(t);
        if (!estaVacia()) {
            /*Sino esta vacia, el primero actual pasa a ser
            el siguiente de nuestro nuevo nodo*/
            
            nuevo.setSiguiente(primero);
            primero = nuevo;

        }
        primero = nuevo;// y el primero apunta al nodo nuevo
    }
    public void InsertarUltimo(Persona t){//Insertar al final de la lista un objeto
        Nodo<Persona> aux = new Nodo<>(t);
        Nodo<Persona> rec_aux;
        if (estaVacia()) {
            InsertarPrimero(t);
        }else{
            rec_aux = primero;
            
            while (rec_aux.getSiguiente() != null) {//recorremos hasta hallar el ultimo nodo 
                rec_aux = rec_aux.getSiguiente();
            }
            rec_aux.setSiguiente(aux);//Actualizamos el siguiente del ultimo
        }
    }
    public void QuitarPrimero(){
        Nodo<Persona> aux;
        if (!estaVacia()) {
            aux = primero;
            primero = primero.getSiguiente();
            aux = null;//Lo marcamos para el recolector de basura
        }
    } 
    public void QuitarUltimo(){//Quitamos el ultimo elemento de la lista
        Nodo<Persona> aux = primero;
        if (aux.getSiguiente() == null)//Aqui entra, si la lista tiene un elemnto 
        {
            ListaVacia();
        }
        if (!estaVacia()) {
            aux = primero;
            //Buscamos el penultimo, por eso hay dos getSiguiente()
            aux = aux.getSiguiente();
        }
        //Buscamos el siguiente del antepenultimo como nulo, eliminando el ultimo
        aux.setSiguiente(null);
    }
    public  Persona DevolverUltimo(){//Devuelve el ultimo elemento de la lista
        Persona elemento = null;
        Nodo<Persona> aux;
        if (!estaVacia()) {
            aux = primero;
            //Recorremos
            while (aux.getSiguiente() != null) {
                aux = aux.getSiguiente();                
            }
            elemento = aux.getDato();
        }
        return elemento;
    }
    public Persona DevolverPrimero(){//Devuelve el primer elemento de la lista
        Persona elemento = null;
        if (!estaVacia()) {
            elemento = primero.getDato();
        }
        return elemento;//retorna el primer elemento, null si esta vacia
    }
    public int CuantosElementos(){//Devuelve el número de elementos de la lista
        Nodo<Persona> aux;
        int numero_de_Elementos = 0;
        aux = primero;
        
        //Recorremos
        while (aux != null) {
            numero_de_Elementos++;
            aux = aux.getSiguiente();
        }
        return numero_de_Elementos;//Retorna el número de elementos
    }
    public Persona DevolverDato(int pos){//Devuelve el dato del nodo en la pos
        Nodo<Persona> aux = primero;
        int contador =0;
        Persona dato = null;
        
        if (pos < 0 || pos >= CuantosElementos()) {
            System.out.println("La posicion insertada no es correcta");
        }else{
            while (aux != null) {
                if (pos == contador) {
                    //cogemos el dato
                    dato = aux.getDato();
                }
                aux = aux.getSiguiente();
                contador++;
            }
        }
        return dato;//Retorna el dato del nodo en la posicion indicada
    }
    public  Nodo<Persona> DevolverNodo(int pos){//Devolver el nodo de la posicion indicada
      Nodo<Persona> aux = primero;
      int contador =0;
        Persona dato = null;
        
        if (pos < 0 || pos >= CuantosElementos()) {
            System.out.println("La posicion insertada no es correcta");
        }else{
            //Recorremos
            while (aux != null) {
                if (pos == contador) {
                    //Devuelve aux, con esto salimos de la función
                    return aux;                   
                }
                //Actualizo el Siguiente
                aux = aux.getSiguiente();
                contador++;
            }
        }
        return aux;//Devuelve el Nodo de la posicion indicada
    }
    public void IntroducirDato(int pos, Persona dato){
        Nodo<Persona> aux = primero;
        Nodo<Persona> auxDato = null;// Debemos crear un nodo para insertar el dato
        Nodo<Persona> anterior = primero;// Debemos crear un nodo insertar el dato
        
        int contador = 0;
        
        if (pos < 0 || pos > CuantosElementos()) {
            System.out.println("La posicion insertada no es correcta");
        }else if (pos == 0) {
            InsertarPrimero(dato);
        }else if (pos == CuantosElementos()) {
            InsertarUltimo(dato);
        }else {
            while (aux != null) {
                if (pos == contador) {
                    //Creo el nodo
                    auxDato = new Nodo<>(dato, aux);
                    //El siguiente del anterior a aux es auxDato
                    anterior.setSiguiente(auxDato);
                }
                //Actualizo anterior
                anterior = aux;
                
                contador++;
                aux = aux.getSiguiente();//Actualizo siguiente
            }
        }
    }
    public void ModificarDato(int pos, Persona dato){
        Nodo<Persona> aux = primero;
        int contador = 0;
        
        if (pos < 0 || pos >= CuantosElementos()) {
            System.out.println("La posicion insertada no es correcta");
        }else{
            while (aux !=null) {
                if (pos == contador) {
                    //Modificamos el dato directamente
                    aux.setDato(dato);
                }
                contador++;
                aux = aux.getSiguiente();//Actualizamos
            }
        }
    }
    public void BorrarPosicion(int pos){//Borra un elemento de la lista
                                        //Recibe Posicion de la lista que queremos borrar
        Nodo<Persona> aux = primero;
        Nodo<Persona> anterior = null;
        int contador = 0;

        if (pos < 0 || pos >= CuantosElementos()) {
            System.out.println("La posicion insertada no es correcta");
        }else{
            while (aux !=null) {
                if (pos == contador) {
                    if (anterior == null) {
                        primero = primero.getSiguiente();
                    }else{
                    //Actualizamos el anterior
                    anterior.setSiguiente(aux.getSiguiente());
                    }
                    aux = null; 
                }else{
                    anterior = aux;
                    aux = aux.getSiguiente();
                    contador++;
                }
            }
        }
    }
    public Persona DevolveryBorrarPrimero(){//Devuelve el primer elemento y lo borra de la lista
        Persona dato = DevolverPrimero();
        QuitarPrimero();
        return dato;//Primer elemento de la lista
    }
    public int indexOf(Persona t){
        Nodo<Persona> aux = primero;
        if (estaVacia()) {
            return -1;
        }else{
            int contador = 0;
            boolean encontrado = false;
            
            //Recorremos, cuando encontrado=dato, sale del bucle
            while (aux != null && !encontrado) {
                if (t.equals(aux.getDato())) {//t es el dato buscado
                    //Cambiamos a true
                    encontrado = true;
                }else{
                    contador++;
                    //actualizamos
                    aux = aux.getSiguiente();
                }
            }
            if (encontrado) {
                return contador;
            }else{
                //No se ha encontrado
                return -1;//Posición del dato buscado, -1 si no se encuentra o esta vacia
            }
        }
    }
    public int indexOf(Persona t, int pos){//Indica la posición del primer dato desde la posicion indicada
        Nodo<Persona> aux;
        if (estaVacia()) {
            return -1;
        }else{
            int contador = pos;
            boolean encontrado = false;
            
            //Empezamos desde el nodo correspondiente
            aux = DevolverNodo(pos);
            
            //Recorremos, cuando encontrado=true, sale el bucle
            while (aux != null && !encontrado) {
                if (t.equals(aux.getDato())) {//t es el dato buscado
                    //Cambiamos a true
                    encontrado = true;
                }else{
                    contador++;
                    //actualizamos
                    aux = aux.getSiguiente();
                }
            }
            if (encontrado) {
                return contador;
            }else{
                //No se ha encontrado
                return -1;//Posición del dato buscado, -1 si no se encuentra o esta vacia
            }
        }
    }
    public boolean DatoExistente(Persona t){//Indica si un dato existe en la lista
        boolean existe = false;
        Nodo<Persona> aux = primero;
        
        while (aux != null && !existe) {
            if (aux.getDato().equals(t)) {//Dato a comprobar
                existe = true;
            }
            //Actualizamos
            aux = aux.getSiguiente();
        }
        return existe;//Si el dato existe contenido de la lista
    }
    public void Mostrar(){//Muestra el contenido de la lista
        System.out.println("Contenido de la lista");
        System.out.println("======================");
 
        Nodo<Persona> aux = primero;
        if (!estaVacia()) 
        {
            aux = primero;
        }
        while (aux != null) {
            System.out.println(aux.getDato());//mostra el dato
            aux = aux.getSiguiente();
        } 
    }
    @Override
    public String toString(){//Devuelve el contenido de la lista en un String
        String contenido = "";
        int cont=0;
        Nodo<Persona> aux = primero;
        while (aux != null) {   
            contenido += aux.getDato() +"\n";//Guardamos el dato
        }
        return contenido;//Contenido de la lista
    }
}
