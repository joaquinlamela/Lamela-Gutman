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
        this.setDomicilio("Domicilio");
        this.setEdad(1);
        this.setNombre("Nombre");
        this.setRutComprador("Rut");
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
        if (!nombre.trim().equals("")) {
            this.nombre = nombre;
        }else{
            throw new RuntimeException("NombreNoVacio");
        }
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad >=0 && edad<=100) {
            this.edad = edad;
        }else{
            throw new RuntimeException("EdadEntre0y100");
        }
        this.edad = edad;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        if (!domicilio.trim().equals("")) {
            this.domicilio = domicilio;
        }else{
            throw new RuntimeException("DomicilioNoVacio");
        }
    }

    public String getRutComprador() {
        return rutComprador;
    }

    public void setRutComprador(String rutComprador) {
        if (!rutComprador.trim().equals("")) {
            this.rutComprador = rutComprador;
        }else{
            throw new RuntimeException("RutNoVacio");
        }
        
    }

    //Metodos si tiene:




}
