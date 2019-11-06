package Dominio;

import java.util.*;

public class Tienda {

    String direccion;
    int numeroLocal;
    long telefono;
    Date horario;
    ArrayList<Producto> listaDeProductosEnStock;
    int [] stockDeProductoPorId; //tipo funcion hash;
    String paginaWeb;

    public Tienda(String direccion, int numeroLocal, long telefono, Date horario, ArrayList<Producto> listaDeProductosEnStock, int [] stockDeProductoPorId, String paginaWeb) {
        this.direccion = direccion;
        this.numeroLocal = numeroLocal;
        this.telefono = telefono;
        this.horario = horario;
        this.listaDeProductosEnStock = listaDeProductosEnStock;
        this.stockDeProductoPorId = stockDeProductoPorId;
        this.paginaWeb = paginaWeb;

    }

    public Tienda() {
        this.direccion = "";
        this.numeroLocal = 0;
        this.telefono = -1;
        this.horario = new Date();
        this.listaDeProductosEnStock = new ArrayList<Producto>();
        this.stockDeProductoPorId = new int [10];
        this.paginaWeb = "";

    }

    //Get´s && Set´s

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getNumeroLocal() {
        return numeroLocal;
    }

    public void setNumeroLocal(int numeroLocal) {
        this.numeroLocal = numeroLocal;
    }

    public long getTelefono() {
        return telefono;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }

    public Date getHorario() {
        return horario;
    }

    public void setHorario(Date horario) {
        this.horario = horario;
    }

    public ArrayList<Producto> getListaDeProductosEnStock() {
        return listaDeProductosEnStock;
    }

    public void setListaDeProductosEnStock(ArrayList<Producto> listaDeProductosEnStock) {
        this.listaDeProductosEnStock = listaDeProductosEnStock;
    }

    public int [] getStockDeProductoPorId() {
        return stockDeProductoPorId;
    }

    public void setStockDeProductoPorId(int [] stockDeProductoPorId) {
        this.stockDeProductoPorId = stockDeProductoPorId;
    }

    public String getPaginaWeb() {
        return paginaWeb;
    }

    public void setPaginaWeb(String paginaWeb) {
        this.paginaWeb = paginaWeb;
    }


    //Metodos:
    public void agregarProducto(Producto producto){
        this.listaDeProductosEnStock.add(producto);
        this.getStockDeProductoPorId()[producto.getCodigoIdentificador()]++;
    }


    public void eliminarProducto(Producto producto){
        if(this.getStockDeProductoPorId()[producto.getCodigoIdentificador()]==0){
            this.listaDeProductosEnStock.remove(producto);
        }
    }
    
    @Override
    public boolean equals(Object o){
        Tienda tienda= (Tienda)o;
        return  this.getNumeroLocal()==tienda.getNumeroLocal();
    }




}
