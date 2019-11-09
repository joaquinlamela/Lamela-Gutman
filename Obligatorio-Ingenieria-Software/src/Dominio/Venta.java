package Dominio;

import java.util.*;

public class Venta {

    //En este caso vamos a utilizar la venta como si fuera ya la venta instantenea en el momento, de tal manera que se le agrega dicha funcionalidad al sistema de poder hacer una venta
    //Atributos:
    private ArrayList<Producto> listaDeProductosAVender;
    private int precioTotal;
    private int[] cantidadesPorProducto; //Para acceder a la posicion del producto le pasamos el codigo identificador;
    private Date fechaDeCompra;
    private Persona comprador; //En este caso seria la clase cliente, de manera que tiene clientes frecuentes
    private tipoPago tipoDePago;  //Segun el numero que ponga la persona lo que vamos a hacer es mostrar las pantallas (ejemplo 1 tarjeta debito y ponemos una interfaz diferente para cada uno)
    private Tienda echoShop;
    private ArrayList<Envase> listaDeEnvasesUtilizados;
    private int codigoIdentificadorDeVenta;
    private String direccionAEnviar;
    private int mes;

    //Constructor:
    public Venta(int mes, ArrayList<Producto> listaDeProductosAVender, int precioTotal, int[] cantidadesPorProducto, Date fechaDeCompra, Persona comprador, tipoPago tipoDePago, Tienda tienda, ArrayList<Envase> listaDeEnvases, int codigoIdentificador, String direccion) {
        this.setListaDeProductosAVender(listaDeProductosAVender);
        this.setPrecioTotal(precioTotal);
        this.setCantidadesPorProducto(cantidadesPorProducto);
        this.setFechaDeCompra(fechaDeCompra);
        this.setComprador(comprador);
        this.setTipoDePago(tipoDePago);
        this.setEchoShop(tienda);
        this.setListaDeEnvasesUtilizados(listaDeEnvases);
        this.setCodigoIdentificadorDeVenta(codigoIdentificador);
        this.setDireccionAEnviar(direccion);
        this.setMes(mes);
    }

    public Venta() {
        this.setListaDeProductosAVender(new ArrayList<Producto>());
        this.setPrecioTotal(0);
        this.setCantidadesPorProducto(new int[10]);
        this.setFechaDeCompra(new Date());
        this.setComprador(new Persona());
        this.setTipoDePago(tipoPago.Indefinido);
        this.setEchoShop(new Tienda());
        this.setListaDeEnvasesUtilizados(new ArrayList<Envase>());
        this.setCodigoIdentificadorDeVenta(0);
        this.setDireccionAEnviar("");
        this.setMes(0);
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

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    //Metodos
    public void agregarProducto(Producto producto) {
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

    public void eliminarProducto(Producto producto) {
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