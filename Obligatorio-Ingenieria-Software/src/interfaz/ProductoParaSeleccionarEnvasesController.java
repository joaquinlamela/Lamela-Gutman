/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import dominio.Envase;
import dominio.Producto;
import dominio.Sistema;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;

/**
 * FXML Controller class
 *
 * @author user
 */
public class ProductoParaSeleccionarEnvasesController implements Initializable {

    @FXML
    private ImageView imagenProducto;
    @FXML
    private Label nombreProd;
    @FXML
    private Label precioProducto;
    @FXML
    private Label descripcion;
    @FXML
    private Label identificador;
    @FXML
    private Label cantidadVendidos;
    private SeleccionarEnvasePorProductoController controlador;
    private SeleccionarEnvasePorProductoPreVentaController controladorPreVenta;
    private Sistema sistema;

    public Sistema getSistema() {
        return sistema;
    }

    public void setSistema(Sistema sistema) {
        this.sistema = sistema;
    }

    public SeleccionarEnvasePorProductoController getControlador() {
        return controlador;
    }

    public void setControlador(SeleccionarEnvasePorProductoController controlador) {
        this.controlador = controlador;
    }

    public SeleccionarEnvasePorProductoPreVentaController getControladorPreVenta() {
        return controladorPreVenta;
    }

    public void setControladorPreVenta(SeleccionarEnvasePorProductoPreVentaController controladorPreVenta) {
        this.controladorPreVenta = controladorPreVenta;
    }

    public void inicializarDatos(Producto producto, Sistema sistema, SeleccionarEnvasePorProductoController controlador) {
        this.setSistema(sistema);
        this.setControlador(controlador);
        this.imagenProducto.setImage(producto.getImagenDelProducto());
        this.nombreProd.setText(producto.getNombre());
        this.precioProducto.setText(Double.toString(producto.getPrecio()));
        this.descripcion.setText(producto.getDescripcionDelProducto());
        this.identificador.setText(Integer.toString(producto.getCodigoIdentificador()));
        this.cantidadVendidos.setText(Integer.toString(producto.getCantidadVendidos()));
    }

    public void inicializarDatosPreVenta(Producto producto, Sistema sistema, SeleccionarEnvasePorProductoPreVentaController controlador) {
        this.setSistema(sistema);
        this.setControladorPreVenta(controlador);
        this.imagenProducto.setImage(producto.getImagenDelProducto());
        this.nombreProd.setText(producto.getNombre());
        this.precioProducto.setText(Double.toString(producto.getPrecio()));
        this.descripcion.setText(producto.getDescripcionDelProducto());
        this.identificador.setText(Integer.toString(producto.getCodigoIdentificador()));
        this.cantidadVendidos.setText(Integer.toString(producto.getCantidadVendidos()));
    }

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
}
