package Dominio;

import java.util.ArrayList;

public class PreVenta {

    //Atributos:
    private Persona comprador;
    private int precioDePreVenta;
    private ArrayList<Producto> listaDeProductos;
    private Tienda lugarARetirar;
    
    private ArrayList<Envase> listaDeEnvase;
    private int identificadorDePreventa;


    //Constructor:

    public PreVenta(Persona comprador, int precioDePreVenta, ArrayList<Producto>
            listaDeProductos, Tienda lugarARetirar, 
            ArrayList<Envase> listaDeEnvase, int id) {
        this.setComprador(comprador);
        this.setPrecioDePreVenta(precioDePreVenta);
        this.setListaDeProductos(listaDeProductos);
        this.setLugarARetirar(lugarARetirar);
       
        this.setListaDeEnvase(listaDeEnvase);
        this.setIdentificadorDePreventa(id);
    }

    public PreVenta() {
        this.setComprador(new Persona());
        this.setPrecioDePreVenta(1);
        this.setListaDeProductos(new ArrayList<Producto>());
        this.setLugarARetirar(new Tienda());
        
        this.setListaDeEnvase(new ArrayList<Envase>());
        this.setIdentificadorDePreventa(1);
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
        if (precioDePreVenta >=1) {
            this.precioDePreVenta = precioDePreVenta;
        }else{
            throw new RuntimeException("PrecioMayorA0");
        }
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
         if (identificadorDePreventa >=1) {
            this.identificadorDePreventa = identificadorDePreventa;
        }else{
            throw new RuntimeException("IdentificadorMayorA1");
        }
    }
    
    public void agregarProducto(Producto p){
        if (!this.listaDeProductos.contains(p)) {
            this.listaDeProductos.add(p);
        }
    }
    
    public void agregarEnvase(Envase e){
        if (!this.listaDeEnvase.contains(e)) {
            this.listaDeEnvase.add(e);
        }
    }
    
    public void eliminarEnvase(Envase e){
        if (this.listaDeEnvase.contains(e)) {
            this.listaDeEnvase.remove(e);
        }
    }
    
    public void eliminarProducto(Producto e){
        if (this.listaDeProductos.contains(e)) {
            this.listaDeProductos.remove(e);
        }
    }

    @Override
    public String toString() {
        return "PreVenta{" + "comprador=" + comprador + ", precioDePreVenta=" + precioDePreVenta + 
                ", listaDeProductos=" + listaDeProductos + ", lugarARetirar=" + lugarARetirar + 
                ", listaDeEnvase=" + listaDeEnvase + ", identificadorDePreventa=" + identificadorDePreventa + '}';
    }
    
    
    

}
