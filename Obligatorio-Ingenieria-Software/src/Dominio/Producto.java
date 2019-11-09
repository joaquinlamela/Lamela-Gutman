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
        this.setDescripcionDelProducto("Descripcion");
        this.setPesoDelProducto(1);
        this.setPosiblesEnvasesRecomendados(new ArrayList<Envase>());
        this.setPrecio(2);
        this.setCodigoIdentificador(1);
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
        if (!descripcionDelProducto.trim().equals("")) {
            this.descripcionDelProducto = descripcionDelProducto;
        }else{
            throw new RuntimeException("DescripcionNoVacia");
        }
    }

    public int getPesoDelProducto() {
        return pesoDelProducto;
    }

    public void setPesoDelProducto(int pesoDelProducto) {
        if (pesoDelProducto >=1) {
            this.pesoDelProducto = pesoDelProducto;
        }else{
            throw new RuntimeException("PesoMayorA0");
        }
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
        if (precio >=1) {
            this.precio = precio;
        }else{
            throw new RuntimeException("PrecioMayorA0");
        }
    }

    public int getCodigoIdentificador() {
        return codigoIdentificador;
    }

    public void setCodigoIdentificador(int codigoIdentificador) {
        if (codigoIdentificador >=1) {
            this.codigoIdentificador = codigoIdentificador;
        }else{
            throw new RuntimeException("IdentificadorMayorA0");
        }
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
        if (cantidadVendidos >=0) {
            this.cantidadVendidos = cantidadVendidos;
        }else{
            throw new RuntimeException("cantidadVendidosPositivo");
        }
    }

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

    public void agregarEnvase(Envase e){
        if (!this.posiblesEnvasesRecomendados.contains(e)) {
            this.posiblesEnvasesRecomendados.add(e);
        }
    }
    
    public void eliminarEnvase(Envase e){
        if (this.posiblesEnvasesRecomendados.contains(e)) {
            this.posiblesEnvasesRecomendados.remove(e);
        }
    }
    
    public void agregarMateriales(tipoMaterial t){
        if (!this.listaDeMateriales.contains(t)) {
            this.listaDeMateriales.add(t);
        }
    }
    
    public void eliminarMaterial(tipoMaterial t){
        if (this.listaDeMateriales.contains(t)) {
            this.listaDeMateriales.remove(t);
        }
    }
    
    @Override
    public boolean equals(Object o) {
        Producto p = (Producto) o;
        return this.getCodigoIdentificador() == p.getCodigoIdentificador();
    }
    
    
    

}
