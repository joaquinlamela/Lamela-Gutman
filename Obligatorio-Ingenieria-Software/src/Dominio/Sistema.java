package Dominio;

import java.util.ArrayList;

public class Sistema {

    //Atributos:
    private ArrayList<Venta> listaDeVentasDelSistema;
    private ArrayList<PreVenta> listaDePreventas;
    private Tienda echoShop;
    private int cantPreVentas;
    private ArrayList<Persona> listaCliente;
    
    
    private ArrayList<Producto> productosAVenderEnSesionActiva; 
    private int [] cantidadPorIdDeProd; 

    //Constructor:
    public Sistema() {
        this.listaDePreventas = new ArrayList<PreVenta>();
        this.listaDeVentasDelSistema = new ArrayList<Venta>();
        this.echoShop = new Tienda();
        this.cantPreVentas = 0;
        this.listaCliente = new ArrayList<Persona>();
        this.productosAVenderEnSesionActiva= new ArrayList<Producto>(); 
        this.cantidadPorIdDeProd= new int[25]; 
    }

    public int getCantPreVentas() {
        return cantPreVentas;
    }

    public void setCantPreVentas(int cantPreVentas) {
        this.cantPreVentas = cantPreVentas;
    }

    //Get´s && Set´s
    public ArrayList<Venta> getListaDeVentasDelSitema() {
        return listaDeVentasDelSistema;
    }

    public void setListaDeVentasDelSitema(ArrayList<Venta> listaDeVentasDelSitema) {
        this.listaDeVentasDelSistema = listaDeVentasDelSitema;
    }

    public ArrayList<PreVenta> getListaDePreventas() {
        return listaDePreventas;
    }

    public void setListaDePreventas(ArrayList<PreVenta> listaDePreventas) {
        this.listaDePreventas = listaDePreventas;
    }

    public Tienda getEchoShop() {
        return this.echoShop;
    }

    public void setEchToShop(Tienda listaDeEchoShop) {
        this.echoShop = listaDeEchoShop;
    }

    public ArrayList<Persona> getListaCliente() {
        return listaCliente;
    }

    public void setListaCliente(ArrayList<Persona> listaCliente) {
        this.listaCliente = listaCliente;
    }

    public ArrayList<Producto> getProductosAVenderEnSesionActiva() {
        return productosAVenderEnSesionActiva;
    }

    public void setProductosAVenderEnSesionActiva(ArrayList<Producto> productosAVenderEnSesionActiva) {
        this.productosAVenderEnSesionActiva = productosAVenderEnSesionActiva;
    }

    public int[] getCantidadPorIdDeProd() {
        return cantidadPorIdDeProd;
    }

    public void setCantidadPorIdDeProd(int[] cantidadPorIdDeProd) {
        this.cantidadPorIdDeProd = cantidadPorIdDeProd;
    }
    
    
    
    
    

    //Metodos:
    public void agregarSucursal(Sucursal nueva) {
//TODO metodo para que se vea en el mapa
        this.echoShop.getSucursales().add(nueva);
        this.echoShop.setNumeroSucursal(this.echoShop.getNumeroSucursal() + 1);

    }

    public void eliminarSucursal(Sucursal aEliminar) {
//TODO metodo para que se deje de ver en el mapa
        for (int i = 0; i < this.echoShop.getSucursales().size(); i++) {
            if (this.echoShop.getSucursales().get(i).getNumeroSucursal() == aEliminar.getNumeroSucursal()) {
                this.echoShop.getSucursales().remove(i);
            }
        }
    }

    public void agregarVenta(Venta venta) {
//TODO agregar Ticket electronico
        if (!this.listaDeVentasDelSistema.contains(venta)) {
            this.listaDeVentasDelSistema.add(venta);
            ArrayList<Producto> listaProductosParaVender = venta.getListaDeProductosAVender();
            for (int i = 0; i < listaProductosParaVender.size(); i++) {
                Producto vendido = listaProductosParaVender.get(i);
                vendido.setCantidadVendidos(vendido.getCantidadVendidos() + 1);
            }
            venta.setCodigoIdentificadorDeVenta(this.listaDeVentasDelSistema.size() + 1);
        }
    }

    public void eliminarVenta(Venta venta) {

        if (this.listaDeVentasDelSistema.contains(venta)) {

            Venta elim = new Venta();

            for (int i = 0; i < this.listaDeVentasDelSistema.size(); i++) {
                if (this.listaDeVentasDelSistema.get(i).equals(venta)) {
                    elim = this.listaDeVentasDelSistema.get(i);
                }
                Venta v = this.listaDeVentasDelSistema.get(i);
                v.setCodigoIdentificadorDeVenta(this.listaDeVentasDelSistema.size() - 1);
            }
            this.listaDeVentasDelSistema.remove(elim);
        }
    }

    public void agregarPreVenta(PreVenta preCompra) {

//TODO falta calendario
        //preCompra.setIdentificadorDePreventa(this.getCantPreVentas()+1);
        if (!this.listaDePreventas.contains(preCompra)) {
            this.setCantPreVentas(this.getCantPreVentas() + 1);
            preCompra.setIdentificadorDePreventa(this.getCantPreVentas());
            this.listaDePreventas.add(preCompra);
        }
    }

    public void cancelarPreVenta(PreVenta preCompra) {
//TODO eliminar del calendario
        if (this.listaDePreventas.contains(preCompra)) {
            this.listaDePreventas.remove(preCompra);
            for (int i = 0; i < this.listaDePreventas.size(); i++) {
                PreVenta preVen = this.listaDePreventas.get(i);
                if (preCompra.getIdentificadorDePreventa() < preVen.getIdentificadorDePreventa()) {
                    preVen.setIdentificadorDePreventa(preVen.getIdentificadorDePreventa() - 1);
                }
            }
        }

    }

    public void actualizarStock(Venta venta) {
        Tienda tiendaDeVenta = venta.getEchoShop();
        ArrayList<Producto> listaDeProductosComprados = venta.getListaDeProductosAVender();
        for (int i = 0; i < tiendaDeVenta.getListaDeProductosEnStock().size(); i++) {
            Producto productoComprado = listaDeProductosComprados.get(i);
            tiendaDeVenta.getStockDeProductoPorId()[productoComprado.getCodigoIdentificador()] = tiendaDeVenta.getStockDeProductoPorId()[productoComprado.getCodigoIdentificador()] - venta.getCantidadesPorProducto()[productoComprado.getCodigoIdentificador()];
        }

    }

    public int ponerIdentificadorAProducto() {
        int cantidadDeElementos = this.echoShop.getListaDeProductosEnStock().size() + 1;
        return cantidadDeElementos++;
    }

    public int ponerIdentificadorAEnvase() {
        int cantidadDeElementos = this.echoShop.getTodosLosEnvasesDisponibles().size() + 1;
        return cantidadDeElementos++;
    }

    public void agregarCliente(Persona cliente) {
        if (!this.listaCliente.contains(cliente)) {
            this.listaCliente.add(cliente);
        }
    }

    public void mostrar() {
        for (int i = 0; i < this.getEchoShop().getListaDeProductosEnStock().size(); i++) {
            System.out.println(this.getEchoShop().getListaDeProductosEnStock().get(i));

        }
    }
    
    
    public void agregarProductosALaListaDeProductosSesionActiva(Producto producto){
        if(!this.getProductosAVenderEnSesionActiva().contains(producto)){
            this.getProductosAVenderEnSesionActiva().add(producto); 
        }
    }

}
