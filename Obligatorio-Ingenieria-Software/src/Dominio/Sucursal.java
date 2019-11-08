/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dominio;

/**
 *
 * @author user
 */
public class Sucursal {

    private int numeroSucursal;
    private String direccion;
    private long telefono; 

    public int getNumeroSucursal() {
        return numeroSucursal;
    }

    public void setNumeroSucursal(int numeroSucursal) {
        this.numeroSucursal = numeroSucursal;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public long getTelefono() {
        return telefono;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }
    
    
    

    public Sucursal(int numeroSucursal, String direccion, long telefono) {
        this.setNumeroSucursal(numeroSucursal);
        this.setDireccion(direccion);
        this.setTelefono(telefono);
    }

    public Sucursal() {
        this.setNumeroSucursal(0);
        this.setDireccion("");
        this.setTelefono(911);
    }

}
