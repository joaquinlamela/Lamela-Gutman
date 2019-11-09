package Dominio;

import java.time.LocalTime;
import java.util.*;

public class Tienda {

    private String direccion;
    private int numeroSucursal;
    private ArrayList<Sucursal> sucursales;
    private long telefono;
    private ArrayList<Producto> listaDeProductosEnStock;
    private int[] stockDeProductoPorId; //tipo funcion hash;

    private LocalTime horaInicio;
    private LocalTime horaFinalizacion;

    public Tienda(int numeroSucursal, String direccion, ArrayList<Sucursal> sucursales,
            long telefono, Date horario, ArrayList<Producto> listaDeProductosEnStock,
            int[] stockDeProductoPorId, String paginaWeb, LocalTime horaI,
            LocalTime horaF) {
        this.setNumeroSucursal(numeroSucursal);
        this.setDireccion(direccion);
        this.setSucursales(sucursales);
        this.setTelefono(telefono);

        this.setListaDeProductosEnStock(listaDeProductosEnStock);
        this.setStockDeProductoPorId(stockDeProductoPorId);

        this.setHoraInicio(horaI);
        this.setHoraFinalizacion(horaF);

    }

    public Tienda() {
        this.setNumeroSucursal(1);
        this.setDireccion("Direccion");
        this.setSucursales(new ArrayList<Sucursal>());
        this.setTelefono(1);

        this.setListaDeProductosEnStock(new ArrayList<Producto>());
        this.setStockDeProductoPorId(new int[10]);

        this.setHoraInicio(LocalTime.parse("10:00"));
        this.setHoraFinalizacion(LocalTime.parse("18:00"));
    }

    //Get´s && Set´s
    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        if (!direccion.trim().equals("")) {
            this.direccion = direccion;
        }else{
            throw new RuntimeException("direccionNoVacia");
        }
    }

    public void setSucursales(ArrayList<Sucursal> sucursales) {
        this.sucursales = sucursales;
    }

    public long getTelefono() {
        return telefono;
    }

    public void setTelefono(long telefono) {
        if (telefono >=1) {
            this.telefono = telefono;
        }else{
            throw new RuntimeException("telefonoMayorA0");
        }
    }

    public ArrayList<Producto> getListaDeProductosEnStock() {
        return listaDeProductosEnStock;
    }

    public void setListaDeProductosEnStock(ArrayList<Producto> listaDeProductosEnStock) {
        this.listaDeProductosEnStock = listaDeProductosEnStock;
    }

    public int[] getStockDeProductoPorId() {
        return stockDeProductoPorId;
    }

    public void setStockDeProductoPorId(int[] stockDeProductoPorId) {
        this.stockDeProductoPorId = stockDeProductoPorId;
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

    public LocalTime getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(LocalTime horaInicio) {
        this.horaInicio = horaInicio;
    }

    public LocalTime getHoraFinalizacion() {
        return horaFinalizacion;
    }

    public void setHoraFinalizacion(LocalTime horaFinalizacion) {
        this.horaFinalizacion = horaFinalizacion;
    }

    //Metodos:
    public void agregarProducto(Producto producto) {
        if (!this.listaDeProductosEnStock.contains(producto)) {

            this.listaDeProductosEnStock.add(producto);
        }
        //this.getStockDeProductoPorId()[producto.getCodigoIdentificador()]++;
    }

    public void eliminarProducto(Producto producto) {
        if (this.getStockDeProductoPorId()[producto.getCodigoIdentificador()] == 0) {
            this.listaDeProductosEnStock.remove(producto);
        }
    }
    
    public void agregarSucursal(Sucursal s) {
        if (!this.sucursales.contains(s)) {

            this.sucursales.add(s);
        }
        //this.getStockDeSucursalPorId()[producto.getCodigoIdentificador()]++;
    }

    public void eliminarSucursal(Sucursal s) {
        if (this.sucursales.contains(s)) {
            this.sucursales.remove(s);
        }
    }

    @Override
    public boolean equals(Object o) {
        Tienda tienda = (Tienda) o;
        return this.getNumeroSucursal() == tienda.getNumeroSucursal();
    }

}
