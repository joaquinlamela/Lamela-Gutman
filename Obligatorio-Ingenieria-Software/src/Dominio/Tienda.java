package Dominio;

import java.time.LocalTime;
import java.util.*;

public class Tienda {

    //Atributos
    private String direccion;
    private int numeroSucursal;
    private ArrayList<Sucursal> sucursales;
    private long telefono;
    private ArrayList<Producto> listaDeProductosEnStock;
    private int[] stockDeProductoPorId;
    private ArrayList<Envase> todosLosEnvasesDisponibles;
    private LocalTime horaInicio;
    private LocalTime horaFinalizacion;

    //Constructores
    public Tienda(int numeroSucursal, String direccion, ArrayList<Sucursal> sucursales,
            long telefono, Date horario, ArrayList<Producto> listaDeProductosEnStock,
            int[] stockDeProductoPorId, String paginaWeb, LocalTime horaI,
            LocalTime horaF, ArrayList<Envase> envases) {
        this.setNumeroSucursal(numeroSucursal);
        this.setDireccion(direccion);
        this.setSucursales(sucursales);
        this.setTelefono(telefono);
        this.setListaDeProductosEnStock(listaDeProductosEnStock);
        this.setStockDeProductoPorId(stockDeProductoPorId);
        this.setTodosLosEnvasesDisponibles(envases);
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
        this.setTodosLosEnvasesDisponibles(new ArrayList<Envase>());
        this.setHoraInicio(LocalTime.parse("10:00"));
        this.setHoraFinalizacion(LocalTime.parse("18:00"));
    }

    //Getters && Setters
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

    public void setSucursales(ArrayList<Sucursal> sucursales) {
        this.sucursales = sucursales;
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

    public ArrayList<Envase> getTodosLosEnvasesDisponibles() {
        return todosLosEnvasesDisponibles;
    }

    public void setTodosLosEnvasesDisponibles(ArrayList<Envase> todosLosEnvasesDisponibles) {
        this.todosLosEnvasesDisponibles = todosLosEnvasesDisponibles;
    }

    //Metodos:
    public void agregarProducto(Producto producto) {
        producto.setCodigoIdentificador(this.listaDeProductosEnStock.size() + 1);
        if (!this.listaDeProductosEnStock.contains(producto)) {
            this.listaDeProductosEnStock.add(producto);
        }
    }

    public void eliminarProducto(Producto producto) {
        if (this.getStockDeProductoPorId()[producto.getCodigoIdentificador()] == 0) {
            this.listaDeProductosEnStock.remove(producto);
        }
    }

    public void eliminarProductoSinImportarStock(Producto prod) {
        if (this.getListaDeProductosEnStock().contains(prod)) {
            this.listaDeProductosEnStock.remove(prod);
        }
    }

    public void agregarSucursal(Sucursal s) {
        s.setNumeroSucursal(this.sucursales.size() + 1);
        if (!this.sucursales.contains(s)) {
            this.sucursales.add(s);
        }
    }

    public void eliminarSucursal(Sucursal s) {
        if (this.sucursales.contains(s)) {
            this.sucursales.remove(s);
        }
    }

    public void agregarEnvase(Envase e) {
        e.setIdIdentificador(this.todosLosEnvasesDisponibles.size() + 1);
        if (!this.todosLosEnvasesDisponibles.contains(e)) {
            this.todosLosEnvasesDisponibles.add(e);
        }
    }

    public Producto obtenerElMasVendidos(ArrayList<Producto> listaProd) {
        int max = Integer.MIN_VALUE;
        Producto producto = new Producto();
        for (int i = 0; i < listaProd.size(); i++) {
            if (listaProd.get(i).getCantidadVendidos() > max) {
                producto = listaProd.get(i);
                max = listaProd.get(i).getCantidadVendidos();
            }
        }
        listaProd.remove(producto);
        return producto;
    }

    public ArrayList<Producto> obtenerLos5MasVendidos() {
        ArrayList<Producto> todosLosProductosDelSistema = this.getListaDeProductosEnStock();
        ArrayList<Producto> copiaDeTodosLosProductosDelSistema = new ArrayList();
        for (int i = 0; i < todosLosProductosDelSistema.size(); i++) {
            if (!copiaDeTodosLosProductosDelSistema.contains(todosLosProductosDelSistema.get(i))) {
                copiaDeTodosLosProductosDelSistema.add(todosLosProductosDelSistema.get(i));
            }
        }
        ArrayList<Producto> los5MasVendidosInversa = new ArrayList<>();
        Producto producto;
        for (int i = 0; i < 5; i++) {
            Producto prodANoAgregar = new Producto();
            producto = this.obtenerElMasVendidos(copiaDeTodosLosProductosDelSistema);
            if (!(producto.getCodigoIdentificador() == prodANoAgregar.getCodigoIdentificador() && producto.getNombre().equals(prodANoAgregar.getNombre()))) {
                los5MasVendidosInversa.add(producto);
            }
        }
        Collections.reverse(los5MasVendidosInversa);
        return los5MasVendidosInversa; 
    }

    @Override
    public String toString() {
        return "Tienda{" + "direccion=" + direccion 
                + ", numeroSucursal=" + numeroSucursal + ", sucursales=" + sucursales
                + ", telefono=" + telefono 
                + ", listaDeProductosEnStock="+ listaDeProductosEnStock 
                + ", stockDeProductoPorId=" + Arrays.toString(stockDeProductoPorId)
                + ", todosLosEnvasesDisponibles=" + todosLosEnvasesDisponibles
                + ", horaInicio=" + horaInicio 
                + ", horaFinalizacion=" + horaFinalizacion + '}';
    }
    
}
