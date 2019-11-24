/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;
import dominio.Producto;
import dominio.Sistema;
import com.jfoenix.controls.JFXButton;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
/**
 * FXML Controller class
 *
 * @author user
 */
public class ProductosCarritoController implements Initializable {
    @FXML
    private Label nombreProducto;
    @FXML
    private Label cantidad;
    private Sistema sistema;
    private CarritoController controlador;
    @FXML
    private ImageView imagenProducto;
    @FXML
    private JFXButton btnAgregar;
    @FXML
    private JFXButton btnBajarCant;
    @FXML
    private Label precioTotal;
    private int identificador;
    @FXML
    private JFXButton btnEliminar;
    //Gets and sets: 
    public Label getNombreProducto() {
        return nombreProducto;
        // TODO
    }
    public void setNombreProducto(Label nombreProducto) {
        this.nombreProducto = nombreProducto;
    }
    public Label getCantidad() {
        return cantidad;
    }
    public void setCantidad(Label cantidad) {
        this.cantidad = cantidad;
    }
    public Sistema getSistema() {
        return sistema;
    }
    public void setSistema(Sistema sistema) {
        this.sistema = sistema;
    }
    public CarritoController getControlador() {
        return controlador;
    }
    public void setControlador(CarritoController controlador) {
        this.controlador = controlador;
    }
    public ImageView getImagenProducto() {
        return imagenProducto;
    }
    public void setImagenProducto(ImageView imagenProducto) {
        this.imagenProducto = imagenProducto;
    }
    public JFXButton getBtnAgregar() {
        return btnAgregar;
    }
    public void setBtnAgregar(JFXButton btnAgregar) {
        this.btnAgregar = btnAgregar;
    }
    public JFXButton getBtnBajarCant() {
        return btnBajarCant;
    }
    public void setBtnBajarCant(JFXButton btnBajarCant) {
        this.btnBajarCant = btnBajarCant;
    }
    public int getIdentificador() {
        return identificador;
    }
    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }
    //Metodos: 
    public void inicializarDatos(Producto producto, Sistema sistema, CarritoController controlador, int[] cantidadPorId) {
        this.setSistema(sistema);
        this.setIdentificador(producto.getCodigoIdentificador());
        this.setControlador(controlador);
        this.imagenProducto.setImage(producto.getImagenDelProducto());
        this.nombreProducto.setText(producto.getNombre());
        int cant = cantidadPorId[producto.getCodigoIdentificador()];
        this.cantidad.setText(Integer.toString(cant));
        this.precioTotal.setText(Double.toString(cant * producto.getPrecio()));
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
    @FXML
    private void agregarCantidad(ActionEvent event) {
        int cantidadActual = Integer.parseInt(this.getCantidad().getText());
        if (cantidadActual < 99) {
            this.cantidad.setText(Integer.toString(cantidadActual + 1));
            this.precioTotal.setText(Double.toString((this.obtenerProducto().getPrecio()) * (cantidadActual + 1)));
            this.getSistema().getCantidadPorIdDeProd()[this.getIdentificador()] = cantidadActual + 1;
        }
    }
    @FXML
    private void bajarCantidad(ActionEvent event) {
        //Ver cuando es 0 la cantidad 
        int cantidadActual = Integer.parseInt(this.getCantidad().getText());
        if (cantidadActual > 1) {
            this.cantidad.setText(Integer.toString(cantidadActual - 1));
            this.precioTotal.setText(Double.toString((this.obtenerProducto().getPrecio()) * (cantidadActual - 1)));
            this.getSistema().getCantidadPorIdDeProd()[this.getIdentificador()] = (cantidadActual - 1);
        }
    }
    public Producto obtenerProducto() {
        Producto p = new Producto();
        for (int i = 0; i < this.getSistema().getProductosAVenderEnSesionActiva().size(); i++) {
            if (this.getIdentificador() == this.getSistema().getProductosAVenderEnSesionActiva().get(i).getCodigoIdentificador()) {
                p = this.getSistema().getProductosAVenderEnSesionActiva().get(i);
            }
        }
        return p;
    }
    @FXML
    private void eliminarProducto(ActionEvent event) {
        Producto p = this.obtenerProducto();
        if (this.getSistema().getProductosAVenderEnSesionActiva().contains(p)) {
            this.getSistema().getCantidadPorIdDeProd()[p.getCodigoIdentificador()] = 0;
            this.getSistema().getProductosAVenderEnSesionActiva().remove(p);
             for (int i = 0; i < p.getPosiblesEnvasesRecomendados().size(); i++) {
                this.getSistema().getEnvasesALlevarEnVenta().remove(p.getPosiblesEnvasesRecomendados().get(i)); 
            }
        }
        this.getControlador().cargarProductos(this.getSistema().getProductosAVenderEnSesionActiva(), sistema, controlador, this.getSistema().getCantidadPorIdDeProd());
    }
}
