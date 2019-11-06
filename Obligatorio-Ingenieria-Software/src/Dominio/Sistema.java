package Dominio;

import java.util.ArrayList;

public class Sistema {

    //Atributos:
    ArrayList<Venta> listaDeVentasDelSistema;
    ArrayList<PreVenta> listaDePreventas;
    Tienda echoShop;

    //Constructor:
    public Sistema(ArrayList<Venta> listaDeVentasDelSitema, ArrayList<PreVenta> listaDePreventas, Tienda listaDeEchoShop) {
        this.listaDeVentasDelSistema = listaDeVentasDelSitema;
        this.listaDePreventas = listaDePreventas;
        this.echoShop = listaDeEchoShop;
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
    public void agregarTienda(Tienda echoShopNuevo) {
        if (this.echoShop.equals(echoShopNuevo)) {
            System.out.println("Ya existe esta tienda");
        } else {
            this.echoShop = echoShopNuevo;
        }
        
    }
    
    public void eliminarTienda(Tienda echoShop) {
        if (this.echoShop.equals(echoShop)) {
            this.echoShop = null;
        }
    }
    
    public void agregarVenta(Venta venta) {
        
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
            
            for (int i = 0; i < this.listaDeVentasDelSistema.size(); i++) {
                Venta v = this.listaDeVentasDelSistema.get(i);
                venta.setCodigoIdentificadorDeVenta(this.listaDeVentasDelSistema.size() - 1);
            }
            this.listaDeVentasDelSistema.remove(venta);
        }
    }
    
    public void agregarPreVenta(PreVenta preCompra) {
        int contador = 0;
        if (!this.listaDePreventas.contains(preCompra)) {
            contador++;
            this.listaDePreventas.add(preCompra);
            preCompra.setIdentificadorDePreventa(contador);
        }
    }
    
    public void cancelarPreVenta(PreVenta preCompra) {
        
        if (this.listaDePreventas.contains(preCompra)) {
            this.listaDePreventas.remove(preCompra);
            for (int i = 0; i < 10; i++) {
                PreVenta preVen = this.listaDePreventas.get(i);
                try {
                    preVen.setIdentificadorDePreventa(preVen.getIdentificadorDePreventa() - 1);
                } catch (NullPointerException e) {
                    System.out.println("Ya no hay mas ventas en el sistema");
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
    
}
