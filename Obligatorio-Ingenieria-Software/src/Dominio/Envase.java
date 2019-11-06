package Dominio;

import java.util.*;


public class Envase {


    //Atributos
    private String nombre;
    private int idIdentificador; 
    private int pesoMaximoSoportado;
    private ArrayList<tipoMaterial> tiposDeMateriales;

    public Envase(String nombre, int pesoMaximoSoportado, ArrayList<tipoMaterial> tiposDeMateriales) {
        this.nombre = nombre;
        this.pesoMaximoSoportado = pesoMaximoSoportado;
        this.tiposDeMateriales = tiposDeMateriales;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPesoMaximoSoportado() {
        return pesoMaximoSoportado;
    }

    public void setPesoMaximoSoportado(int pesoMaximoSoportado) {
        this.pesoMaximoSoportado = pesoMaximoSoportado;
    }

    public ArrayList<tipoMaterial> getTiposDeMateriales() {
        return tiposDeMateriales;
    }

    public void setTiposDeMateriales(ArrayList<tipoMaterial> tiposDeMateriales) {
        this.tiposDeMateriales = tiposDeMateriales;
    }


}
