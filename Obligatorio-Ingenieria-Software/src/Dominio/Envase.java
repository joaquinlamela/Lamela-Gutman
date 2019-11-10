package Dominio;

import java.util.*;


public class Envase {


    //Atributos
    private String nombre;
    private int idIdentificador; 
    private int pesoMaximoSoportado;
    private ArrayList<tipoMaterial> tiposDeMateriales;

    public Envase(String nombre,int id, int pesoMaximoSoportado, ArrayList<tipoMaterial> tiposDeMateriales) {
        this.setNombre(nombre);
        this.setIdIdentificador(id);
        this.setPesoMaximoSoportado(pesoMaximoSoportado);
        this.setTiposDeMateriales(tiposDeMateriales);
    }

    public Envase(){
        this.setNombre("Nombre");
        this.setPesoMaximoSoportado(1);
        this.setTiposDeMateriales(new ArrayList<tipoMaterial>());
    }

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

    public ArrayList<tipoMaterial> getTiposDeMateriales() {
        return tiposDeMateriales;
    }

    public void setTiposDeMateriales(ArrayList<tipoMaterial> tiposDeMateriales) {
        this.tiposDeMateriales = tiposDeMateriales;
    }
    
    public void agregarMateriales(tipoMaterial t){
        if (!this.tiposDeMateriales.contains(t)) {
            this.tiposDeMateriales.add(t);
        }
    }
    
    public void eliminarMaterial(tipoMaterial t){
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

    @Override
    public String toString() {
        return "Envase{" + "nombre=" + nombre + ", idIdentificador=" + idIdentificador + ", pesoMaximoSoportado=" + pesoMaximoSoportado + ", tiposDeMateriales=" + tiposDeMateriales + '}';
    }
    
    
    
    
    

}