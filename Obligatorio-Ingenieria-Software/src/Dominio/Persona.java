package Dominio;

public class Persona {
    //Atributos:
    private String nombre;
    private Integer edad;
    private String domicilio;
    private String rutComprador;

    //Constructor
    public Persona(){
        //Cuando se crea una persona sin parametros lo que hacemos es capturar la excepcion NULL pointer exception asi no rompe el obligatorio
        this.setDomicilio("");
        this.setEdad(-1);
        this.setNombre("");
        this.setRutComprador("");
    }



    public Persona(String nombre, int edad, String domicilio, String rutComprador) {
        this.setDomicilio(nombre);
        this.setEdad(edad);
        this.setNombre(domicilio);
        this.setRutComprador(rutComprador);
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
