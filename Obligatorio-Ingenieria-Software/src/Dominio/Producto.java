package Dominio;

import java.util.*;

enum tipoOrigen{
    Vegetal,
    Mineral,
    Animal,
    Fosil,
    Indefinido
}



public class Producto {

    //Atributos:
    private ArrayList<tipoOrigen> listaDeOrigenes;
    private String descripcionDelProducto;
    private int pesoDelProducto;
    private ArrayList<Envase> posiblesEnvasesRecomendados;
    private double precio;
    private int codigoIdentificador; //Puede ser un int, si se quiere facilitar el sistema, pero me guie en productos reales
    private ArrayList<tipoMaterial> listaDeMateriales;
    private int cantidadVendidos;
    
    //Constructores:

    public Producto() {
        this.setListaDeOrigenes(new ArrayList<tipoOrigen>());
        this.setDescripcionDelProducto("");
        this.setPesoDelProducto(0);
        this.setPosiblesEnvasesRecomendados(new ArrayList<Envase>());
        this.setPrecio(0);
        this.setCodigoIdentificador(0);
        this.setListaDeMateriales(new ArrayList<tipoMaterial>());
        this.setCantidadVendidos(0);
    }

    public Producto(ArrayList<tipoOrigen> listaDeOrigenes, String descripcionDelProducto, int pesoDelProducto, ArrayList<Envase> posiblesEnvasesRecomendados, double precio, int codigoIdentificador, ArrayList<tipoMaterial> listaDeMateriales, int cantVendidos) {
        this.setListaDeOrigenes(listaDeOrigenes);
        this.setDescripcionDelProducto(descripcionDelProducto);
        this.setPesoDelProducto(pesoDelProducto);
        this.setPosiblesEnvasesRecomendados(posiblesEnvasesRecomendados);
        this.setPrecio(precio);
        this.setCodigoIdentificador(codigoIdentificador);
        this.setListaDeMateriales(listaDeMateriales);
        this.setCantidadVendidos(cantVendidos);
    }

    //Get´s && Set´s

    public ArrayList<tipoOrigen> getListaDeOrigenes() {
        return listaDeOrigenes;
    }

    public void setListaDeOrigenes(ArrayList<tipoOrigen> listaDeOrigenes) {
        this.listaDeOrigenes = listaDeOrigenes;
    }

    public String getDescripcionDelProducto() {
        return descripcionDelProducto;
    }

    public void setDescripcionDelProducto(String descripcionDelProducto) {
        this.descripcionDelProducto = descripcionDelProducto;
    }

    public int getPesoDelProducto() {
        return pesoDelProducto;
    }

    public void setPesoDelProducto(int pesoDelProducto) {
        this.pesoDelProducto = pesoDelProducto;
    }

    public ArrayList<Envase> getPosiblesEnvasesRecomendados() {
        return posiblesEnvasesRecomendados;
    }

    public void setPosiblesEnvasesRecomendados(ArrayList<Envase> posiblesEnvasesRecomendados) {
        this.posiblesEnvasesRecomendados = posiblesEnvasesRecomendados;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCodigoIdentificador() {
        return codigoIdentificador;
    }

    public void setCodigoIdentificador(int codigoIdentificador) {
        this.codigoIdentificador = codigoIdentificador;
    }

    public ArrayList<tipoMaterial> getListaDeMateriales() {
        return listaDeMateriales;
    }

    public void setListaDeMateriales(ArrayList<tipoMaterial> listaDeMateriales) {
        this.listaDeMateriales = listaDeMateriales;
    }

    public int getCantidadVendidos() {
        return cantidadVendidos;
    }

    public void setCantidadVendidos(int cantidadVendidos) {
        this.cantidadVendidos = cantidadVendidos;
    }
    

    
@Override
    public boolean equals(Object o){
        Producto p= (Producto)o;
        return  this.getCodigoIdentificador()== p.getCodigoIdentificador();
    }


}