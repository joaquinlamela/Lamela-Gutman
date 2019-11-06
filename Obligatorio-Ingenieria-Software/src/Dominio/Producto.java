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
    ArrayList<tipoOrigen> listaDeOrigenes;
    String descripcionDelProducto;
    int pesoDelProducto;
    ArrayList<Envase> posiblesEnvasesRecomendados;
    double precio;
    int codigoIdentificador; //Puede ser un int, si se quiere facilitar el sistema, pero me guie en productos reales
    ArrayList<tipoMaterial> listaDeMateriales;
    int cantidadVendidos; 
    
    //Constructores:

    public Producto() {
        this.listaDeOrigenes= new ArrayList<tipoOrigen>();
        this.descripcionDelProducto= "";
        this.pesoDelProducto=0;
        this.posiblesEnvasesRecomendados= new ArrayList<Envase>();
        this.precio=0;
        this.codigoIdentificador= 0;
        this.listaDeMateriales= new ArrayList<tipoMaterial>();
        this.cantidadVendidos= 0; 
    }

    public Producto(ArrayList<tipoOrigen> listaDeOrigenes, String descripcionDelProducto, int pesoDelProducto, ArrayList<Envase> posiblesEnvasesRecomendados, double precio, int codigoIdentificador, ArrayList<tipoMaterial> listaDeMateriales, int cantVendidos) {
        this.listaDeOrigenes = listaDeOrigenes;
        this.descripcionDelProducto = descripcionDelProducto;
        this.pesoDelProducto = pesoDelProducto;
        this.posiblesEnvasesRecomendados = posiblesEnvasesRecomendados;
        this.precio = precio;
        this.codigoIdentificador = codigoIdentificador;
        this.listaDeMateriales = listaDeMateriales;
        this.cantidadVendidos=cantVendidos; 
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
