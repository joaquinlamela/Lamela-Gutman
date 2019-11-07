package Dominio;

import java.util.ArrayList;

public class PreVenta {

    //Atributos:
    private Persona comprador;
    private int precioDePreVenta;
    private ArrayList<Producto> listaDeProductos;
    private Tienda lugarARetirar;
    private tipoPago tipoDePagoDefinido;
    private ArrayList<Envase> listaDeEnvase;
    private int identificadorDePreventa;


    //Constructor:

    public PreVenta(Persona comprador, int precioDePreVenta, ArrayList<Producto>
            listaDeProductos, Tienda lugarARetirar, tipoPago tipoDePagoDefinido,
            ArrayList<Envase> listaDeEnvase, int id) {
        this.setComprador(comprador);
        this.setPrecioDePreVenta(precioDePreVenta);
        this.setListaDeProductos(listaDeProductos);
        this.setLugarARetirar(lugarARetirar);
        this.setTipoDePagoDefinido(tipoDePagoDefinido);
        this.setListaDeEnvase(listaDeEnvase);
        this.setIdentificadorDePreventa(id);
    }

    public PreVenta() {
        this.setComprador(new Persona());
        this.setPrecioDePreVenta(-1);
        this.setListaDeProductos(new ArrayList<Producto>());
        this.setLugarARetirar(new Tienda());
        this.setTipoDePagoDefinido(tipoPago.Indefinido);
        this.setListaDeEnvase(new ArrayList<Envase>());
        this.setIdentificadorDePreventa(-1);
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