package Dominio;

import java.util.*;

public class Venta {

    //En este caso vamos a utilizar la venta como si fuera ya la venta instantenea en el momento, de tal manera que se le agrega dicha funcionalidad al sistema de poder hacer una venta
    //Atributos:
    ArrayList<Producto> listaDeProductosAVender;
    int precioTotal;
    int[] cantidadesPorProducto; //Para acceder a la posicion del producto le pasamos el codigo identificador;
    Date fechaDeCompra;
    Persona comprador; //En este caso seria la clase cliente, de manera que tiene clientes frecuentes
    tipoPago tipoDePago;  //Segun el numero que ponga la persona lo que vamos a hacer es mostrar las pantallas (ejemplo 1 tarjeta debito y ponemos una interfaz diferente para cada uno)
    Tienda echoShop;
    ArrayList<Envase> listaDeEnvasesUtilizados;
    int codigoIdentificadorDeVenta;
    String direccionAEnviar; 

    //Constructor:
    public Venta(ArrayList<Producto> listaDeProductosAVender, int precioTotal, int[] cantidadesPorProducto, Date fechaDeCompra, Persona comprador, tipoPago tipoDePago, Tienda tienda, ArrayList<Envase> listaDeEnvases, int codigoIdentificador, String direccion) {
        this.listaDeProductosAVender = listaDeProductosAVender;
        this.precioTotal = precioTotal;
        this.cantidadesPorProducto = cantidadesPorProducto;
        this.fechaDeCompra = fechaDeCompra;
        this.comprador = comprador;
        this.tipoDePago = tipoDePago;
        this.echoShop = tienda;
        this.listaDeEnvasesUtilizados = listaDeEnvases;
        this.codigoIdentificadorDeVenta = 0;
        this.direccionAEnviar=direccion; 

    }

    public Venta() {
        this.listaDeProductosAVender = new ArrayList<Producto>();
        this.precioTotal = 0;
        this.cantidadesPorProducto = new int[10];
        this.fechaDeCompra = new Date();
        this.comprador = new Persona();
        this.tipoDePago = tipoPago.Indefinido;
        this.echoShop = new Tienda();
        this.listaDeEnvasesUtilizados = new ArrayList<Envase>();
        this.codigoIdentificadorDeVenta = 0;
        this.direccionAEnviar=""; 

    }

    //Get´s && set´s
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
        this.precioTotal = precioTotal;
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

    public tipoPago getTipoDePago() {
        return tipoDePago;
    }

    public void setTipoDePago(tipoPago tipoDePago) {
        this.tipoDePago = tipoDePago;
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
        this.codigoIdentificadorDeVenta = codigoIdentificadorDeVenta;
    }

    public String getDireccionAEnviar() {
        return direccionAEnviar;
    }

    public void setDireccionAEnviar(String direccionAEnviar) {
        this.direccionAEnviar = direccionAEnviar;
    }

    
    

    //Metodos
    public void agregarProductosALaVenta(Producto producto) {
        this.listaDeProductosAVender.add(producto);
        int tamañoDeListaDeEnvases = producto.getPosiblesEnvasesRecomendados().size();
        while (tamañoDeListaDeEnvases >= 0) {
            Envase envase = producto.getPosiblesEnvasesRecomendados().get(tamañoDeListaDeEnvases);
            tamañoDeListaDeEnvases--;
            this.getListaDeEnvasesUtilizados().add(envase);
        }
        this.precioTotal += producto.getPrecio();
        // TODO: 27/10/2019 HACER QUE CUANDO EN LA INTERFAZ AGREGUE CANTIDAD DE ELEMENTOS, SUME EN LA CANTIDAD DE PRODUCTOS

        this.getCantidadesPorProducto()[producto.getCodigoIdentificador()] = this.getCantidadesPorProducto()[producto.getCodigoIdentificador()]+1;

    }

    public void eliminarProductosDeLaVenta(Producto producto) {
        this.listaDeProductosAVender.remove(producto);
        int tamañoDeListaDeEnvases = producto.getPosiblesEnvasesRecomendados().size();
        while (tamañoDeListaDeEnvases >= 0) {
            Envase envase = producto.getPosiblesEnvasesRecomendados().get(tamañoDeListaDeEnvases);
            tamañoDeListaDeEnvases--;
            this.getListaDeEnvasesUtilizados().remove(envase);
        }
        this.precioTotal -= producto.getPrecio();
        // TODO: 27/10/2019  ACTUALIZAR EN EL GET LA CANTIDAD DE ELEMENTOS 
        this.getCantidadesPorProducto()[producto.getCodigoIdentificador()] = this.getCantidadesPorProducto()[producto.getCodigoIdentificador()]-1;

    }

}
