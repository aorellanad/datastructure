package ListaEnlazadaSimple;
import java.util.Scanner;
public class Principal {
    public static void main(String[] args) {
        
        new Principal().menu();
    }
    Scanner leer = new Scanner(System.in);
    ListaEnlazada<Persona> Lista = new ListaEnlazada<>();//Crear la lista
    
    public void menu(){
        int op = 0;
        do {            
            System.out.println("Ejemplo Lista Simple Enlazada");
            System.out.println("1.- Insertar Primero");
            System.out.println("2.- Insertar Ultimo");
            System.out.println("3.- Insertar en N Posicion");
            System.out.println("4.- Remover");
            System.out.println("5.- Editar");
            System.out.println("6.- esVacia");
            System.out.println("7.- Buscar");
            System.out.println("8.- Eliminar primer elemento de la lista");
            System.out.println("9.- Listar");
            System.out.println("10.- Tamaño de la Lista");
            System.out.println("0.- EXIT \n");
            System.out.println("-----Ingrese Numero de opcion que desea realizar-----");
            op = leer.nextInt();
            switch (op) 
            {
                case 1:
                    InsertarPrimero();
                    break;
                case 2:
                    InsertarUltimo();
                    break;
                case 3:
                    InsertarPosicion();
                    break;
                case 4:
                  Eliminar();
                    break;
                case 5:
                    Editar();
                    break;
                case 6:
                    estaVacia();
                    break;
                case 7:
                    Buscar();
                    break;
                case 8:
                    EliminarPrimerElemento();
                    break;
                case 9:
                    ListarElementos();
                    break;
                case 10:
                    TamanioLista();
                    break;              

            }//>Termina bucle Swich
        } while (op != 0);
    } //Termina Menu
    
    void InsertarUltimo(){
        System.out.println("Inserte al Ultimo de la Lista");
        Persona obj = new Persona();
        System.out.println("Ingrese el Nombre: ");
        obj.setNombre(leer.next());
        System.out.println("Ingrese la Edad: ");
        obj.setEdad(leer.nextInt());
        Lista.InsertarUltimo(obj);
        ListarElementos();
    }
    void InsertarPrimero(){
        System.out.println("Inserte al principio de la lista");
        Persona obj = new Persona();
        System.out.println("Ingrese el Nombre: ");
        obj.setNombre(leer.next());
        System.out.println("Ingrese la Edad: ");
        obj.setEdad(leer.nextInt());
        Lista.InsertarPrimero(obj);
        ListarElementos();
    }
    public void InsertarPosicion(){
        if (Lista.estaVacia()) {
            System.out.println("La lista esta vacia");
        }else{
            ListarElementos();
            System.out.println("Ingrese la posicion: ");
            int pos = leer.nextInt();
            System.out.println("Insertar en la posicion "+ pos + " de la lista");
            Persona obj = new Persona();
            System.out.println("Ingrese el Nombre: ");
            obj.setNombre(leer.next());
            System.out.println("Ingrese la Edad: ");
            obj.setEdad(leer.nextInt());
            Lista.IntroducirDato(pos, obj);
            ListarElementos();
        }
        
        
    }
    public void Eliminar(){
        if (Lista.estaVacia()) {
            System.out.println("La lista esta vacia");
        }else{
            ListarElementos();
            System.out.println("Ingrese la posicion que desea eliminar: ");
            int pos = leer.nextInt();
            System.out.println("Posiciion a eliminar "+ pos + " de la lista");
            Persona obj = new Persona();
            Lista.BorrarPosicion(pos);
            ListarElementos();
        }
        
    }
    public void ListarElementos(){
        
        if (Lista.estaVacia()) {
             System.out.println("La lista esta vacia");
        }else{
            Lista.Mostrar();
        }
        
    }
    
    
    private void TamanioLista(){
        System.out.println("Existen "+ Lista.CuantosElementos() + " elementos: ");
         ListarElementos();
    }
    private void Editar(){
        if (Lista.estaVacia()) {
            System.out.println("La lista esta vacia");
        }else{
            ListarElementos();
            System.out.println("Ingrese la posicion: ");
            int pos = leer.nextInt();
            System.out.println("Modificar en la posicion "+ pos + " de la lista");
            Persona obj = new Persona();
            System.out.println("Ingrese el Nombre: ");
            obj.setNombre(leer.next());
            System.out.println("Ingrese la Edad: ");
            obj.setEdad(leer.nextInt());
            Lista.ModificarDato(pos, obj);
            ListarElementos();
        }
 
    }
    private void estaVacia(){
        if (Lista.estaVacia()) {
            System.out.println("La lista esta vacia");
        }else{
            System.out.println("La lista tiene almenos un dato");
            TamanioLista();
            ListarElementos();
        }
    }
    private void Buscar(){
        if (Lista.estaVacia()) {
            System.out.println("La lista esta vacia");
        }else{
            System.out.println("Ingrese la posicion: ");
            int pos = leer.nextInt();
            System.out.println("El elemento en la posiciom " + pos + " de la lista");
            Persona obj = Lista.DevolverDato(pos);
            System.out.println("Nombre: "+obj.getNombre());
            System.out.println("Edad : "+obj.getEdad());
        }
    }
    private void EliminarPrimerElemento(){
        if (Lista.estaVacia()) {
            System.out.println("La lista esta vacia");
        }else{
        Persona obj = Lista.DevolveryBorrarPrimero();
        System.out.println("Dato Eliminado: ");
        System.out.println("Nombre: "+obj.getNombre());
        System.out.println("Edad : "+obj.getEdad());
        }
        
        
    }   

}