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
        if (numeroSucursal >= 1) {
            this.numeroSucursal = numeroSucursal;
        } else {
            throw new RuntimeException("numeroSucursalMayorA0");
        }
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        if (!direccion.trim().equals("")) {
            this.direccion = direccion;
        } else {
            throw new RuntimeException("direccionNoVacia");
        }
    }

    public long getTelefono() {
        return telefono;
    }

    public void setTelefono(long telefono) {
        if (telefono >= 1) {
            this.telefono = telefono;
        } else {
            throw new RuntimeException("telefonoMayorA0");
        }
    }
    
    
    
    
    

    public Sucursal(int numeroSucursal, String direccion, long telefono) {
        this.setNumeroSucursal(numeroSucursal);
        this.setDireccion(direccion);
        this.setTelefono(telefono);
    }

    public Sucursal() {
        this.setNumeroSucursal(1);
        this.setDireccion("Direccion");
        this.setTelefono(1);
    }

    @Override
    public String toString() {
        return "Sucursal{" + "numeroSucursal=" + numeroSucursal + ", direccion="
                + direccion + ", telefono=" + telefono + '}';
    }

}
