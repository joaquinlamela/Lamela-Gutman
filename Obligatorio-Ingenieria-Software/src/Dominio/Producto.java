package Dominio;

import java.util.*;


public class Producto  {

    //Atributos:
    private String nombre; //Esta
    private tipoOrigen origen; //Esta
    private String descripcionDelProducto; //Esta
    private int pesoDelProducto;  //Esta
    private double precio; //Esta
    private int codigoIdentificador; //Puede ser un int, si se quiere facilitar el sistema, pero me guie en productos reales //Se marca por backend
    private ArrayList<Envase> posiblesEnvasesRecomendados; // Esta
    private ArrayList<tipoMaterial> listaDeMateriales; //Falta
    private int cantidadVendidos; //No se muestra a la hora de agregar productos
    
    

    //Constructores:
    public Producto() {
        this.setNombre("Nombre");
        this.setOrigen(tipoOrigen.Indefinido);
        this.setDescripcionDelProducto("");
        this.setPesoDelProducto(0);
        this.setPosiblesEnvasesRecomendados(new ArrayList<Envase>());
        this.setPrecio(2);
        this.setCodigoIdentificador(0);
        this.setListaDeMateriales(new ArrayList<tipoMaterial>());
        this.setCantidadVendidos(0);
    }

    public Producto(String nombre, tipoOrigen origen, String descripcionDelProducto,
            int pesoDelProducto, int precio, int codigoIdentificador,
            ArrayList<Envase> posiblesEnvasesRecomendados,
            ArrayList<tipoMaterial> listaDeMateriales, int cantVendidos) {
        this.setNombre(nombre);
        this.setOrigen(origen);
        this.setDescripcionDelProducto(descripcionDelProducto);
        this.setPesoDelProducto(pesoDelProducto);
        this.setPosiblesEnvasesRecomendados(posiblesEnvasesRecomendados);
        this.setPrecio(precio);
        this.setCodigoIdentificador(codigoIdentificador);
        this.setListaDeMateriales(listaDeMateriales);
        this.setCantidadVendidos(cantVendidos);
    }

    //Get´s && Set´s
    public tipoOrigen getOrigen() {
        return origen;
    }

    public void setOrigen(tipoOrigen origen) {
        this.origen = origen;
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

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public boolean equals(Object o) {
        Producto p = (Producto) o;
        return this.getCodigoIdentificador() == p.getCodigoIdentificador();
    }
    
    
    

}
