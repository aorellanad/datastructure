package esctructura_de_datos;

import ListaEnlazadaSimple.ListaEnlazada;
import ListaEnlazadaSimple.Persona;
//import ListaEnlazadaSimple.Principal;
import java.util.Arrays;
import java.util.Scanner;
import metodos_busqueda.Binaria;
import metodos_busqueda.Secuencial;

public class main {
    public static void main(String[] args) {
        int[] rNumbers = {5,89,12,4,3};
        Bubble bubble = new Bubble();
        Direct_Insertion Di=new Direct_Insertion();
        Seleccion select=new Seleccion();
        Shell_sort Sh = new Shell_sort();
        Merge_sort Ms = new Merge_sort();
        Quick_sort Qs = new Quick_sort();
        //Metodos de Busqueda
        Secuencial Sc = new Secuencial();
        Binaria B = new Binaria();
        // print messy array
        System.out.println(Arrays.toString(rNumbers));
        // print sort array
        System.out.println("Burbuja");
        System.out.println(Arrays.toString(bubble.toSort(rNumbers)));
        System.out.println("Insercion");
        System.out.println(Arrays.toString(Di.toSort(rNumbers)));
        System.out.println("Seleccion");   
        System.out.println(Arrays.toString(select.toSort(rNumbers)));
        System.out.println("Shell sort");
        System.out.println(Arrays.toString(Sh.toSort(rNumbers)));
        System.out.println("Merge sort");
        System.out.println(Arrays.toString(Ms.toSort(rNumbers)));
        System.out.println("Quick sort");
        System.out.println(Arrays.toString(Qs.toSort(rNumbers)));
        // print Metodos de Busqueda
        System.out.println("Secuencial");
        System.out.println(Sc.getPosition(rNumbers, 12));
        System.out.println("Binaria");
        System.out.println(B.getPosition(rNumbers, 12));
        
        new main().menu();
    }
    
    
    Scanner leer = new Scanner(System.in);
    ListaEnlazada<Persona> Lista = new ListaEnlazada<>();//Crear la lista
    
    //----- Metodos de la ListaEnlazadaSimple----------
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
