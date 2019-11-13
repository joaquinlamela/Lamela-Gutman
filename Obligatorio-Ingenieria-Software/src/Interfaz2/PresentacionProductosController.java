/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz2;

import Dominio.Producto;
import Dominio.Sistema;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXComboBox;
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
public class PresentacionProductosController implements Initializable {

    @FXML
    private JFXButton btnPreventa;
    @FXML
    private JFXButton carrito;
    @FXML
    private ImageView imagenProducto;
    @FXML
    private Label nombreProd;
    @FXML
    private Label precioProducto;
    @FXML
    private Label descripcion;
    @FXML
    private JFXComboBox<Integer> cantidadProductos;

    private Sistema sistema;

    private CarritoController controlador;

    @FXML
    private Label identificador;

    //Gets ands sets: 
    public Sistema getSistema() {
        return sistema;
        // TODO
    }

    public void setSistema(Sistema sistema) {
        this.sistema = sistema;
    }

    public JFXButton getBtnPreventa() {
        return btnPreventa;
    }

    public void setBtnPreventa(JFXButton btnPreventa) {
        this.btnPreventa = btnPreventa;
    }

    public JFXButton getCarrito() {
        return carrito;
    }

    public void setCarrito(JFXButton carrito) {
        this.carrito = carrito;
    }

    public ImageView getImagenProducto() {
        return imagenProducto;
    }

    public void setImagenProducto(ImageView imagenProducto) {
        this.imagenProducto = imagenProducto;
    }

    public Label getNombreProd() {
        return nombreProd;
    }

    public void setNombreProd(Label nombreProd) {
        this.nombreProd = nombreProd;
    }

    public Label getPrecioProducto() {
        return precioProducto;
    }

    public void setPrecioProducto(Label precioProducto) {
        this.precioProducto = precioProducto;
    }

    public Label getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(Label descripcion) {
        this.descripcion = descripcion;
    }

    public JFXComboBox<Integer> getCantidadProductos() {
        return cantidadProductos;
    }

    public void setCantidadProductos(JFXComboBox<Integer> cantidadProductos) {
        this.cantidadProductos = cantidadProductos;
    }

    public Label getIdentificador() {
        return identificador;
    }

    public void setIdentificador(Label identificador) {
        this.identificador = identificador;
    }

    public CarritoController getControlador() {
        return controlador;
    }

    public void setControlador(CarritoController controlador) {
        this.controlador = controlador;
    }

    //Metodos: 
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void agregarPreventa(ActionEvent event) {

    }

    @FXML
    private void agregarCarrito(ActionEvent event) {
        boolean esValido = true;

        int cantProductos = 1;

        if (!this.cantidadProductos.getSelectionModel().isEmpty()) {
            cantProductos = this.cantidadProductos.getSelectionModel().getSelectedItem();
        } else {
            esValido = false;
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("¡Cuidado!");
            alert.setHeaderText("Error: no ha seleccionado ninguna cantidad");
            alert.setContentText("!Seleccione un origen!");
            alert.showAndWait();
        }

        if (esValido) {
            int codigoIdentificador = Integer.parseInt(this.getIdentificador().getText());

            ArrayList<Producto> listaProductos = this.getSistema().getEchoShop().getListaDeProductosEnStock();
            for (int i = 0; i < listaProductos.size(); i++) {
                if (codigoIdentificador == listaProductos.get(i).getCodigoIdentificador()) {
                    Producto p = listaProductos.get(i);
                    this.getSistema().agregarProductosALaListaDeProductosSesionActiva(p);
                    this.getSistema().getCantidadPorIdDeProd()[codigoIdentificador] = cantProductos;
                }
            }

        }

    }

    public void inicializarDatos(Producto producto, Sistema sistema) {
        this.setSistema(sistema);
        this.imagenProducto.setImage(producto.getImagenDelProducto());
        this.nombreProd.setText(producto.getNombre());
        this.precioProducto.setText(Double.toString(producto.getPrecio()));
        for (int i = 1; i < 100; i++) {
            cantidadProductos.getItems().add(i);
        }
        this.descripcion.setText(producto.getDescripcionDelProducto());
        this.identificador.setText(Integer.toString(producto.getCodigoIdentificador()));
    }

}
