package ListaEnlazadaSimple;
public class Persona {
    private String Nombre;
    private int Edad;
    
    @Override
    public String toString() {
        return "Persona = ["+ "Nombre = " + getNombre() + ", Edad = " + getEdad() + "]";
        
    }
    public String getNombre() {
        return Nombre;
    }
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    public int getEdad() {
        return Edad;
    }
    public void setEdad(int Edad) {
        this.Edad = Edad;
    }
    
//Constructor con todos los Parametros
    public Persona(String Nombre, int Edad) {
        this.Nombre = Nombre;
        this.Edad = Edad;
    }

    //creamos un constructor vacio
    public Persona(){}
    public String ToString(){
        return this.Nombre+ " : " + this.Edad;
    }
}