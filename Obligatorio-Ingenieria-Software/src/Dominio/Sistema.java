package Dominio;

import java.util.ArrayList;

public class Sistema {

    //Atributos:
    private ArrayList<Venta> listaDeVentasDelSistema;
    private ArrayList<PreVenta> listaDePreventas;
    private Tienda echoShop;

    //Constructor:
    public Sistema() {
        this.listaDePreventas= new ArrayList<PreVenta>(); 
        this.listaDeVentasDelSistema= new ArrayList<Venta>(); 
        this.echoShop= new Tienda(); 
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

    //Metodos:
    public void agregarSucursal(Sucursal nueva) {
//TODO metodo para que se vea en el mapa
        this.echoShop.getSucursales().add(nueva);
        this.echoShop.setNumeroSucursal(this.echoShop.getNumeroSucursal()+1);
        
    }
    
    public void eliminarSucursal(Sucursal aEliminar) {
//TODO metodo para que se deje de ver en el mapa
        for (int i = 0; i < this.echoShop.getSucursales().size(); i++) {
            if (this.echoShop.getSucursales().get(i).getNumeroSucursal() == aEliminar.getNumeroSucursal()){
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
                vendido.setCantidadVendidos(vendido.getCantidadVendidos()+1);
            }
            venta.setCodigoIdentificadorDeVenta(this.listaDeVentasDelSistema.size() + 1);
        }
    }
    
    public void eliminarVenta(Venta venta) {
        
        if (this.listaDeVentasDelSistema.contains(venta)) {

            Venta elim = new Venta();

            for (int i = 0; i < this.listaDeVentasDelSistema.size(); i++) {
                if (this.listaDeVentasDelSistema.get(i).equals(venta)){
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
        int contador = 0;
        if (!this.listaDePreventas.contains(preCompra)) {
            contador++;
            this.listaDePreventas.add(preCompra);
            preCompra.setIdentificadorDePreventa(contador);
        }
    }
    
    public void cancelarPreVenta(PreVenta preCompra) {
//TODO eliminar del calendario
        if (this.listaDePreventas.contains(preCompra)) {
            this.listaDePreventas.remove(preCompra);
            for (int i = 0; i < this.listaDePreventas.size(); i++) {
                PreVenta preVen = this.listaDePreventas.get(i);
                preVen.setIdentificadorDePreventa(preVen.getIdentificadorDePreventa() - 1);
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
    
    public int ponerIdentificadorAProducto(){
        int cantidadDeElementos= this.echoShop.getListaDeProductosEnStock().size(); 
        return cantidadDeElementos++; 
    } 
    
    
    
}
