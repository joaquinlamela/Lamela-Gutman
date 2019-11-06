package Dominio;

public class Persona {
    //Atributos:
    String nombre;
    Integer edad;
    String domicilio;
    String rutComprador;

    //Constructor
    public Persona(){
        //Cuando se crea una persona sin parametros lo que hacemos es capturar la excepcion NULL pointer exception asi no rompe el obligatorio
        this.domicilio=null;
        this.edad= null ;
        this.nombre=null;
        this.rutComprador=null;
    }



    public Persona(String nombre, int edad, String domicilio, String rutComprador) {
        this.nombre = nombre;
        this.edad = edad;
        this.domicilio = domicilio;
        this.rutComprador = rutComprador;
    }

    //Get´s && Set´s

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getRutComprador() {
        return rutComprador;
    }

    public void setRutComprador(String rutComprador) {
        this.rutComprador = rutComprador;
    }

    //Metodos si tiene:




}
