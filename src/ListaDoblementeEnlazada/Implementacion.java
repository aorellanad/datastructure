package ListaDoblementeEnlazada;

import java.util.Scanner;
public class Implementacion {
    public static void main(String arg[]){ 
        Lista lista = new Lista(); 
        Scanner entrada = new Scanner (System.in);
        int opcion =0;
        do
        {
            System.out.println("1. Insertar");
            System.out.println("2. Imprimir");
            System.out.println("3. Salir");
            System.out.println("Opción elegida");
            opcion = entrada.nextInt();
            switch(opcion)
            {
                case 1: lista.insertar(); break;
                case 2: lista.imprimir(); break;
                case 3: System.out.println("Saliendo"); break;
            }
        }while (opcion!=3);
            
        } 

}
