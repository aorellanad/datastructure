package ListaDoblementeEnlazada;

import java.util.Scanner;
public class Lista {
    private Nodo cabecera;
   public void add(Nodo newNodo){ 
        Nodo tmp = cabecera; //puntero temporal para recorrer en la lista 
        if(tmp==null){       //si la lista esta vacia 
	cabecera = newNodo; //lo agregamos a la cabecera
        }
        else{      //de lo contrario nos recorremos hasta el ultimo  
               while(tmp.siguiente!=null) 
                   tmp = tmp.siguiente; 
                tmp.siguiente = newNodo; //en el ultimo hacemos el enlace 
                newNodo.anterior =tmp;
        } 
  }
   
   public void insertar()
   {
       Nodo nodo = new Nodo();
       Scanner entrada= new Scanner (System.in);
       System.out.println("Ingrese nombres:");
       nodo.unEstudiante.setNombres(entrada.next());  
       System.out.println("Ingrese edad:");
       nodo.unEstudiante.setEdad(entrada.nextInt());
       add(nodo);
   }

   public void imprimir(){
       Nodo tmp=cabecera;
       if (tmp==null)
            {System.out.println("La lista está vacía");}
       else
       {
           while (tmp.siguiente!=null)
               tmp = tmp.siguiente;
           while (tmp!=null)
           {              
               System.out.println(tmp.unEstudiante.getNombres());
               System.out.println(tmp.unEstudiante.getEdad());             
               tmp=tmp.anterior;
           }
       }
   }
}
