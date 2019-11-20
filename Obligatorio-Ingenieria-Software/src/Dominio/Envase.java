package Dominio;

import java.util.*;
import javafx.scene.image.Image;

public class Envase {

    //Atributos
    private String nombre;
    private int idIdentificador; 
    private int pesoMaximoSoportado;
    private ArrayList<TipoMateriales> tiposDeMateriales;
    private Image imagenDelProducto;
    
    //Constructores
    public Envase(String nombre,int id, int pesoMaximoSoportado, 
            ArrayList<TipoMateriales> tiposDeMateriales, Image imagen){
        this.setNombre(nombre);
        this.setIdIdentificador(id);
        this.setPesoMaximoSoportado(pesoMaximoSoportado);
        this.setTiposDeMateriales(tiposDeMateriales);
        this.setImagenDelProducto(imagen);
    }

    public Envase(){
        this.setNombre("Nombre");
        this.setPesoMaximoSoportado(1);
        this.setTiposDeMateriales(new ArrayList<TipoMateriales>());
    }

    //Getters && Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        //assert();
        if (!nombre.trim().equals("")) {
            this.nombre = nombre;
        }else{
            throw new RuntimeException("NombreNoVacio");
        }        
    }

    public int getPesoMaximoSoportado() {
        return pesoMaximoSoportado;
    }

    public void setPesoMaximoSoportado(int pesoMaximoSoportado) {
        if (pesoMaximoSoportado >=1 && pesoMaximoSoportado<=100) {
            this.pesoMaximoSoportado = pesoMaximoSoportado;
        }else{
            throw new RuntimeException("PesoEntre1y100");
        }
    }

    public ArrayList<TipoMateriales> getTiposDeMateriales() {
        return tiposDeMateriales;
    }

    public void setTiposDeMateriales(ArrayList<TipoMateriales> tiposDeMateriales) {
        this.tiposDeMateriales = tiposDeMateriales;
    }
    
    public void agregarMateriales(TipoMateriales t){
        if (!this.tiposDeMateriales.contains(t)) {
            this.tiposDeMateriales.add(t);
        }
    }
    
    public void eliminarMaterial(TipoMateriales t){
        if (this.tiposDeMateriales.contains(t)) {
            this.tiposDeMateriales.remove(t);
        }
    }

    public int getIdIdentificador() {
        return idIdentificador;
    }

    public void setIdIdentificador(int idIdentificador) {
         if (idIdentificador >=1) {
            this.idIdentificador = idIdentificador;
        }else{
            throw new RuntimeException("IdentificadorMayorA1");
        }
    }

    public Image getImagenDelProducto() {
        return imagenDelProducto;
    }

    public void setImagenDelProducto(Image imagenDelProducto) {
        this.imagenDelProducto = imagenDelProducto;
    }
    
    //Metodos
    @Override
    public String toString() {
        return "Envase{" 
                + "nombre=" + nombre 
                + ", idIdentificador=" + idIdentificador 
                + ", pesoMaximoSoportado=" + pesoMaximoSoportado 
                + ", tiposDeMateriales=" + tiposDeMateriales + '}';
    }
    
    @Override
    public boolean equals(Object o) {
        boolean retorno = false;
        if (o instanceof Envase) {
            Envase e = (Envase) o;
            retorno = this.getIdIdentificador()
                    == e.getIdIdentificador();
        }
        return retorno;
    }

    public int hashCode() {
        assert false : "hashCode not designed";
        return 1;
    }
    
}