package Dominio;

import java.util.ArrayList;

public class PreVenta {

    //Atributos:
    Persona comprador;
    int precioDePreVenta;
    ArrayList<Producto> listaDeProductos;
    Tienda lugarARetirar;
    tipoPago tipoDePagoDefinido;
    ArrayList<Envase> listaDeEnvase;
    int identificadorDePreventa;     


    //Constructor:

    public PreVenta(Persona comprador, int precioDePreVenta, ArrayList<Producto>
            listaDeProductos, Tienda lugarARetirar, tipoPago tipoDePagoDefinido,
            ArrayList<Envase> listaDeEnvase, int id) {
        this.comprador = comprador;
        this.precioDePreVenta = precioDePreVenta;
        this.listaDeProductos = listaDeProductos;
        this.lugarARetirar = lugarARetirar;
        this.tipoDePagoDefinido = tipoDePagoDefinido;
        this.listaDeEnvase = listaDeEnvase;
        this.identificadorDePreventa=id; 
    }



    //Get´s && Set´s
    public Persona getComprador() {
        return comprador;
    }

    public void setComprador(Persona comprador) {
        this.comprador = comprador;
    }

    public int getPrecioDePreVenta() {
        return precioDePreVenta;
    }

    public void setPrecioDePreVenta(int precioDePreVenta) {
        this.precioDePreVenta = precioDePreVenta;
    }

    public ArrayList<Producto> getListaDeProductos() {
        return listaDeProductos;
    }

    public void setListaDeProductos(ArrayList<Producto> listaDeProductos) {
        this.listaDeProductos = listaDeProductos;
    }

    public Tienda getLugarARetirar() {
        return lugarARetirar;
    }

    public void setLugarARetirar(Tienda lugarARetirar) {
        this.lugarARetirar = lugarARetirar;
    }

    public tipoPago getTipoDePagoDefinido() {
        return tipoDePagoDefinido;
    }

    public void setTipoDePagoDefinido(tipoPago tipoDePagoDefinido) {
        this.tipoDePagoDefinido = tipoDePagoDefinido;
    }

    public ArrayList<Envase> getListaDeEnvase() {
        return listaDeEnvase;
    }

    public void setListaDeEnvase(ArrayList<Envase> listaDeEnvase) {
        this.listaDeEnvase = listaDeEnvase;
    }

    public int getIdentificadorDePreventa() {
        return identificadorDePreventa;
    }

    public void setIdentificadorDePreventa(int identificadorDePreventa) {
        this.identificadorDePreventa = identificadorDePreventa;
    }
    
    @Override
    public boolean equals(Object o){
        PreVenta pre= (PreVenta)o;
        return  this.getIdentificadorDePreventa()== pre.getIdentificadorDePreventa(); 
    }
    
    


}
