package Dominio;

import java.util.*;

public class Tienda {

    private String direccion;
    private int numeroSucursal;
    private ArrayList<Sucursal> sucursales;
    private long telefono;
    private Date horario;
    private ArrayList<Producto> listaDeProductosEnStock;
    private int [] stockDeProductoPorId; //tipo funcion hash;
    private String paginaWeb;

    public Tienda(int numeroSucursal, String direccion, ArrayList<Sucursal> sucursales, long telefono, Date horario, ArrayList<Producto> listaDeProductosEnStock, int [] stockDeProductoPorId, String paginaWeb) {
        this.setNumeroSucursal(numeroSucursal);
        this.setDireccion(direccion);
        this.setSucursales(sucursales);
        this.setTelefono(telefono);
        this.setHorario(horario);
        this.setListaDeProductosEnStock(listaDeProductosEnStock);
        this.setStockDeProductoPorId(stockDeProductoPorId);
        this.setPaginaWeb(paginaWeb);
    }

    public Tienda() {
        this.setNumeroSucursal(0);
        this.setDireccion("");
        this.setSucursales(new ArrayList<Sucursal>());
        this.setTelefono(-1);
        this.setHorario(new Date());
        this.setListaDeProductosEnStock(new ArrayList<Producto>());
        this.setStockDeProductoPorId(new int [10]);
        this.setPaginaWeb("");
    }

    //Get´s && Set´s

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public ArrayList<Sucursal> getNumeroLocal() {
        return sucursales;
    }

    public void setSucursales(ArrayList<Sucursal> sucursales) {
        this.sucursales = sucursales;
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

    public int getNumeroSucursal() {
        return numeroSucursal;
    }

    public void setNumeroSucursal(int numeroSucursal) {
        this.numeroSucursal = numeroSucursal;
    }

    public ArrayList<Sucursal> getSucursales() {
        return sucursales;
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


    public class Sucursal{
        private int numeroSucursal;
        private String direccion;

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

        public Sucursal(int numeroSucursal, String direccion) {
            this.setNumeroSucursal(numeroSucursal);
            this.setDireccion(direccion);
        }

        public Sucursal() {
            this.setNumeroSucursal(0);
            this.setDireccion("");
        }

    }



}
