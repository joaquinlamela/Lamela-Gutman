package dominio;

import java.util.*;
import javafx.scene.image.Image;

public class Producto {

    //Atributos:
    private String nombre; 
    private TipoOrigen origen; 
    private String descripcionDelProducto; 
    private int pesoDelProducto;  
    private double precio; 
    private int codigoIdentificador; 
    private ArrayList<Envase> posiblesEnvasesRecomendados; 
    private ArrayList<TipoMateriales> listaDeMateriales;
    private int cantidadVendidos; 
    private Image imagenDelProducto;

    //Constructores:
    public Producto() {
        this.setNombre("Nombre");
        this.setOrigen(TipoOrigen.Indefinido);
        this.setDescripcionDelProducto("Descripcion");
        this.setPesoDelProducto(1);
        this.setPosiblesEnvasesRecomendados(new ArrayList<Envase>());
        this.setPrecio(2);
        this.setCodigoIdentificador(1);
        this.setListaDeMateriales(new ArrayList<TipoMateriales>());
        this.setCantidadVendidos(0);
    }

    public Producto(String nombre, TipoOrigen origen, String descripcionDelProducto,
            int pesoDelProducto, int precio, int codigoIdentificador,
            ArrayList<Envase> posiblesEnvasesRecomendados,
            ArrayList<TipoMateriales> listaDeMateriales, int cantVendidos, Image imagen) {
        this.setNombre(nombre);
        this.setOrigen(origen);
        this.setDescripcionDelProducto(descripcionDelProducto);
        this.setPesoDelProducto(pesoDelProducto);
        this.setPosiblesEnvasesRecomendados(posiblesEnvasesRecomendados);
        this.setPrecio(precio);
        this.setCodigoIdentificador(codigoIdentificador);
        this.setListaDeMateriales(listaDeMateriales);
        this.setCantidadVendidos(cantVendidos);
        this.setImagenDelProducto(imagen);
    }

    //Getters && Setters
    public TipoOrigen getOrigen() {
        return origen;
    }

    public void setOrigen(TipoOrigen origen) {
        this.origen = origen;
    }

    public String getDescripcionDelProducto() {
        return descripcionDelProducto;
    }

    public void setDescripcionDelProducto(String descripcionDelProducto) {
        if (!descripcionDelProducto.trim().equals("")) {
            this.descripcionDelProducto = descripcionDelProducto;
        } else {
            throw new RuntimeException("DescripcionNoVacia");
        }
    }

    public int getPesoDelProducto() {
        return pesoDelProducto;
    }

    public void setPesoDelProducto(int pesoDelProducto) {
        if (pesoDelProducto >= 1) {
            this.pesoDelProducto = pesoDelProducto;
        } else {
            throw new RuntimeException("PesoMayorA0");
        }
    }

    public ArrayList<Envase> getPosiblesEnvasesRecomendados() {
        return posiblesEnvasesRecomendados;
    }

    public void setPosiblesEnvasesRecomendados(ArrayList<Envase> posiblesEnvasesRecomendados) {
        this.posiblesEnvasesRecomendados = posiblesEnvasesRecomendados;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        if (precio >= 1) {
            this.precio = precio;
        } else {
            throw new RuntimeException("PrecioMayorA0");
        }
    }

    public int getCodigoIdentificador() {
        return codigoIdentificador;
    }

    public void setCodigoIdentificador(int codigoIdentificador) {
        if (codigoIdentificador >= 1) {
            this.codigoIdentificador = codigoIdentificador;
        } else {
            throw new RuntimeException("IdentificadorMayorA0");
        }
    }

    public ArrayList<TipoMateriales> getListaDeMateriales() {
        return listaDeMateriales;
    }

    public void setListaDeMateriales(ArrayList<TipoMateriales> listaDeMateriales) {
        this.listaDeMateriales = listaDeMateriales;
    }

    public int getCantidadVendidos() {
        return cantidadVendidos;
    }

    public void setCantidadVendidos(int cantidadVendidos) {
        if (cantidadVendidos >= 0) {
            this.cantidadVendidos = cantidadVendidos;
        } else {
            throw new RuntimeException("cantidadVendidosPositivo");
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (!nombre.trim().equals("")) {
            this.nombre = nombre;
        } else {
            throw new RuntimeException("NombreNoVacio");
        }
    }

    public Image getImagenDelProducto() {
        return imagenDelProducto;
    }

    public void setImagenDelProducto(Image imagenDelProducto) {
        this.imagenDelProducto = imagenDelProducto;
    }

    //Metodos
    public void agregarEnvase(Envase e) {
        if (!this.posiblesEnvasesRecomendados.contains(e)) {
            this.posiblesEnvasesRecomendados.add(e);
        }
    }

    public void eliminarEnvase(Envase e) {
        if (this.posiblesEnvasesRecomendados.contains(e)) {
            this.posiblesEnvasesRecomendados.remove(e);
        }
    }

    public void agregarMateriales(TipoMateriales t) {
        if (!this.listaDeMateriales.contains(t)) {
            this.listaDeMateriales.add(t);
        }
    }

    public void eliminarMaterial(TipoMateriales t) {
        if (this.listaDeMateriales.contains(t)) {
            this.listaDeMateriales.remove(t);
        }
    }

    @Override
    public boolean equals(Object o) {
        boolean retorno = false;
        if (o instanceof Producto) {
            Producto p = (Producto) o;
            retorno = this.getCodigoIdentificador()
                    == p.getCodigoIdentificador();
        }
        return retorno;
    }

    public int hashCode() {
        assert false : "hashCode not designed";
        return 1;
    }

    @Override
    public String toString() {
        return "Producto{" + "nombre=" + nombre + ", origen=" + origen
                + ", descripcionDelProducto=" + descripcionDelProducto
                + ", pesoDelProducto=" + pesoDelProducto + ", precio=" + precio
                + ", codigoIdentificador=" + codigoIdentificador 
                + ", posiblesEnvasesRecomendados=" + posiblesEnvasesRecomendados 
                + ", listaDeMateriales=" + listaDeMateriales
                + ", cantidadVendidos=" + cantidadVendidos + '}';
    }

}
