package Dominio;

import java.util.*;

public class Venta {

    //Atributos:
    private ArrayList<Producto> listaDeProductosAVender;
    private int precioTotal;
    private int[] cantidadesPorProducto; 
    private Date fechaDeCompra;
    private Persona comprador; 
    private Tienda echoShop;
    private ArrayList<Envase> listaDeEnvasesUtilizados;
    private int codigoIdentificadorDeVenta;
    private String direccionAEnviar;
  
    //Constructor:
    public Venta( ArrayList<Producto> listaDeProductosAVender, int precioTotal, int[] cantidadesPorProducto, Date fechaDeCompra, Persona comprador, Tienda tienda, ArrayList<Envase> listaDeEnvases, int codigoIdentificador, String direccion) {
        this.setListaDeProductosAVender(listaDeProductosAVender);
        this.setPrecioTotal(precioTotal);
        this.setCantidadesPorProducto(cantidadesPorProducto);
        this.setFechaDeCompra(fechaDeCompra);
        this.setComprador(comprador);     
        this.setEchoShop(tienda);
        this.setListaDeEnvasesUtilizados(listaDeEnvases);
        this.setCodigoIdentificadorDeVenta(codigoIdentificador);
        this.setDireccionAEnviar(direccion);
    }

    public Venta() {
        this.setListaDeProductosAVender(new ArrayList<Producto>());
        this.setPrecioTotal(1);
        this.setCantidadesPorProducto(new int[10]);
        this.setFechaDeCompra(new Date());
        this.setComprador(new Persona());
        this.setEchoShop(new Tienda());
        this.setListaDeEnvasesUtilizados(new ArrayList<Envase>());
        this.setCodigoIdentificadorDeVenta(1);
        this.setDireccionAEnviar("Direccion");
    }

    //Getters && Setters
    public ArrayList<Producto> getListaDeProductosAVender() {
        return listaDeProductosAVender;
    }

    public void setListaDeProductosAVender(ArrayList<Producto> listaDeProductosAVender) {
        this.listaDeProductosAVender = listaDeProductosAVender;
    }

    public int getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(int precioTotal) {
        if (precioTotal >= 1) {
            this.precioTotal = precioTotal;
        } else {
            throw new RuntimeException("PrecioMayorA0");
        }
    }

    public int[] getCantidadesPorProducto() {
        return cantidadesPorProducto;
    }

    public void setCantidadesPorProducto(int[] cantidadesPorProducto) {
        this.cantidadesPorProducto = cantidadesPorProducto;
    }

    public Date getFechaDeCompra() {
        return fechaDeCompra;
    }

    public void setFechaDeCompra(Date fechaDeCompra) {
        this.fechaDeCompra = fechaDeCompra;
    }

    public Persona getComprador() {
        return comprador;
    }

    public void setComprador(Persona comprador) {
        this.comprador = comprador;
    }

    public Tienda getEchoShop() {
        return echoShop;
    }

    public void setEchoShop(Tienda echoShop) {
        this.echoShop = echoShop;
    }

    public ArrayList<Envase> getListaDeEnvasesUtilizados() {
        return listaDeEnvasesUtilizados;
    }

    public void setListaDeEnvasesUtilizados(ArrayList<Envase> listaDeEnvasesUtilizados) {
        this.listaDeEnvasesUtilizados = listaDeEnvasesUtilizados;
    }

    public int getCodigoIdentificadorDeVenta() {
        return codigoIdentificadorDeVenta;
    }

    public void setCodigoIdentificadorDeVenta(int codigoIdentificadorDeVenta) {
        if (codigoIdentificadorDeVenta >= 1) {
            this.codigoIdentificadorDeVenta = codigoIdentificadorDeVenta;
        } else {
            throw new RuntimeException("IdentificadorMayorA1");
        }
    }

    public String getDireccionAEnviar() {
        return direccionAEnviar;
    }

    public void setDireccionAEnviar(String direccionAEnviar) {
        if (!direccionAEnviar.trim().equals("")) {
            this.direccionAEnviar = direccionAEnviar;
        } else {
            throw new RuntimeException("direccionNoVacia");
        }
    }

    //Metodos
    public void agregarProducto(Producto producto) {
        if (!this.listaDeProductosAVender.contains(producto)) {
            this.listaDeProductosAVender.add(producto);
            int tamañoDeListaDeEnvases = producto.getPosiblesEnvasesRecomendados().size()-1;
            while (tamañoDeListaDeEnvases > 0) {
                Envase envase = producto.getPosiblesEnvasesRecomendados().get(tamañoDeListaDeEnvases);
                tamañoDeListaDeEnvases--;
                this.getListaDeEnvasesUtilizados().add(envase);
            }
            this.precioTotal += producto.getPrecio();
        }
    }

    public void eliminarProducto(Producto producto) {
        if (this.listaDeProductosAVender.contains(producto)) {
            this.listaDeProductosAVender.remove(producto);
            int tamañoDeListaDeEnvases = producto.getPosiblesEnvasesRecomendados().size();
            while (tamañoDeListaDeEnvases > 0) {
                Envase envase = producto.getPosiblesEnvasesRecomendados().get(tamañoDeListaDeEnvases);
                tamañoDeListaDeEnvases--;
                this.getListaDeEnvasesUtilizados().remove(envase);
            }
            this.precioTotal -= producto.getPrecio();
        }
    }

    @Override
    public String toString() {
        return "Venta{" + "listaDeProductosAVender=" + listaDeProductosAVender.toString()
                + ", precioTotal=" + precioTotal 
                + ", cantidadesPorProducto=" +Arrays.toString(cantidadesPorProducto) 
                + ", fechaDeCompra=" + fechaDeCompra 
                + ", comprador=" + comprador   
                + ", echoShop=" + echoShop 
                + ", listaDeEnvasesUtilizados=" + listaDeEnvasesUtilizados 
                + ", codigoIdentificadorDeVenta=" + codigoIdentificadorDeVenta 
                + ", direccionAEnviar=" + direccionAEnviar + '}';
    }
    
    public void agregarEnvase(Envase e){
        if (!this.listaDeEnvasesUtilizados.contains(e)) {
            this.listaDeEnvasesUtilizados.add(e);
        }
    }
    
    public void eliminarEnvase(Envase e){
        if (this.listaDeEnvasesUtilizados.contains(e)) {
            this.listaDeEnvasesUtilizados.remove(e);
        }
    }
    
    @Override
    public boolean equals(Object o) {
        boolean retorno = false;
        if (o instanceof Venta) {
            Venta venta = (Venta) o;
            retorno = this.getCodigoIdentificadorDeVenta()
                    == venta.getCodigoIdentificadorDeVenta();
        }
        return retorno;
    }

    public int hashCode() {
        assert false : "hashCode not designed";
        return 1;
    }
}
