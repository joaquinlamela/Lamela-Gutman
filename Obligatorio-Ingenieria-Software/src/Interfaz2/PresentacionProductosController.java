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
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

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
    
    private int CodigoIdentificador; 

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

    public int getCodigoIdentificador() {
        return CodigoIdentificador;
    }

    public void setCodigoIdentificador(int CodigoIdentificador) {
        this.CodigoIdentificador = CodigoIdentificador;
    }
    
    
    
    

    //Metodos: 
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void agregarPreventa(ActionEvent event) {

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
                    this.getSistema().agregarProductosALaListaPreVenta(p);
                    this.getSistema().getCantidadPorIdDeProd()[codigoIdentificador] = cantProductos;
                }
            }

        }

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
            try {
                FXMLLoader loader = new FXMLLoader(getClass().getResource("SeleccionarEnvasePorProducto.fxml"));

                Parent root = loader.load();

                SeleccionarEnvasePorProductoController controlado = loader.getController();

                Scene escena = new Scene(root);

                Stage stage = new Stage();

                stage.setScene(escena);

                stage.show();

                stage.setHeight(675);

                stage.setWidth(366);

                stage.setResizable(false);

                controlado.setSistema(sistema);

                Producto p = new Producto();

                for (int i = 0; i < this.getSistema().getEchoShop().getListaDeProductosEnStock().size(); i++) {
                    if (this.getCodigoIdentificador() == this.getSistema().getEchoShop().getListaDeProductosEnStock().get(i).getCodigoIdentificador()) {
                        p = this.getSistema().getEchoShop().getListaDeProductosEnStock().get(i);
                    }
                }
                
                controlado.cargarProductos(p, sistema, controlado);

                controlado.cargarProductos2(p.getPosiblesEnvasesRecomendados(), sistema, controlado);

                stage.setOnCloseRequest(e -> controlado.cerrarVentana());

                Stage myStage = (Stage) this.btnPreventa.getScene().getWindow();
                myStage.close();
            } catch (IOException ex) {
                Logger.getLogger(ClienteController.class.getName()).log(Level.SEVERE, null, ex);
            }
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
        this.setCodigoIdentificador(producto.getCodigoIdentificador());
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
