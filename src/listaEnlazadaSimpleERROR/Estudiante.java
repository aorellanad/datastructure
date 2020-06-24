package listaEnlazadaSimpleERROR;

public class Estudiante {
    private String Cedula;
    private String Nombre;
    private String Apellido;
    private int Edad;
    private String Direccion;
    private String Nivel;
    public Estudiante() {
    }



    
    public Estudiante(String Cedula, String Nombre, String Apellido, int Edad, String Direccion ,String Nivel) {
        this.Cedula = Cedula;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Edad = Edad;
        this.Direccion = Direccion;
        this.Nivel = Nivel;
    }

    Estudiante(String s, String s0, String s1 , int int0, String s2) {
    }

    
    public String getCedula() {
        return Cedula;
    }

    public void setCedula(String Cedula) {
        this.Cedula = Cedula;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getNivel() {
        return Nivel;
    }

    public void setNivel(String Nivel) {
        this.Nivel = Nivel;
    }

    
   
    
    
}
