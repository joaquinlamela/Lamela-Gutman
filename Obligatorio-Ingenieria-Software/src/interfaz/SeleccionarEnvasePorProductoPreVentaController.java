/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import dominio.Envase;
import dominio.Producto;
import dominio.Sistema;
import com.jfoenix.controls.JFXButton;
import dominio.Persona;
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
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author user
 */
public class SeleccionarEnvasePorProductoPreVentaController implements Initializable {

    @FXML
    private VBox productoSeleccionado;
    @FXML
    private VBox listaDeEnvases;

    @FXML
    private JFXButton btnAtras;
    @FXML
    private JFXButton btnVolver;

    private Sistema sistema;
    @FXML
    private JFXButton btnPreVenta;

    private Producto producto;

    private Persona cliente;

    public Sistema getSistema() {
        return sistema;
    }

    public void setSistema(Sistema sistema) {
        this.sistema = sistema;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public Persona getCliente() {
        return cliente;
    }

    public void setCliente(Persona cliente) {
        this.cliente = cliente;
    }

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void irACarrito(ActionEvent event) {

        if (!this.getSistema().getEnvasesALlevarEnPreVenta().isEmpty()) {

            try {
                FXMLLoader loader = new FXMLLoader(getClass().getResource("PreVenta.fxml"));

                Parent root = loader.load();

                PreVentaController controlador = loader.getController();

                Scene escena = new Scene(root);

                Stage stage = new Stage();

                stage.setScene(escena);

                stage.show();

                stage.setHeight(675);

                stage.setWidth(366);

                stage.setResizable(false);

                controlador.setSistema(sistema);

                controlador.setCliente(this.getCliente());

                controlador.cargarProductos(this.getSistema().getProductosPreVentaSesionActiva(), sistema, controlador, this.getSistema().getCantidadPorIdDePreVenta());

                stage.setOnCloseRequest(e -> controlador.cerrarVentana());

                Stage myStage = (Stage) this.btnPreVenta.getScene().getWindow();
                myStage.close();
            } catch (IOException ex) {
                Logger.getLogger(SeleccionarEnvasePorProductoPreVentaController.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("¡Cuidado!");
            alert.setHeaderText("Error: Seleccione almenos un envase");
            alert.setContentText("Agregue un envase, en el cual retirara el producto");
            alert.showAndWait();
        }

    }

    @FXML
    private void irAInicio(ActionEvent event) {

        if (!this.getSistema().getEnvasesALlevarEnPreVenta().isEmpty()) {
            try {
                FXMLLoader loader = new FXMLLoader(getClass().getResource("Cliente.fxml"));

                Parent root = loader.load();

                ClienteController controlador = loader.getController();

                Scene escena = new Scene(root);

                Stage stage = new Stage();

                stage.setScene(escena);

                stage.show();

                stage.setHeight(675);

                stage.setWidth(366);

                stage.setResizable(false);

                controlador.setSistema(sistema);

                controlador.setCliente(this.getCliente());

                controlador.cargarProductos(this.getSistema().getEchoShop().getListaDeProductosEnStock(), sistema);

                stage.setOnCloseRequest(e -> controlador.cerrarVentana());

                Stage myStage = (Stage) this.btnAtras.getScene().getWindow();
                myStage.close();
            } catch (IOException ex) {
                Logger.getLogger(CarritoController.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("¡Cuidado!");
            alert.setHeaderText("Error: Seleccione almenos un envase");
            alert.setContentText("Agregue un envase, en el cual retirara el producto");
            alert.showAndWait();
        }

    }

    @FXML
    private void volverInicio(ActionEvent event) {
        if (!this.getSistema().getEnvasesALlevarEnPreVenta().isEmpty()) {
            try {
                FXMLLoader loader = new FXMLLoader(getClass().getResource("Cliente.fxml"));

                Parent root = loader.load();

                ClienteController controlador = loader.getController();

                Scene escena = new Scene(root);

                Stage stage = new Stage();

                stage.setScene(escena);

                stage.show();

                stage.setHeight(675);

                stage.setWidth(366);

                stage.setResizable(false);

                controlador.setSistema(sistema);

                controlador.setCliente(this.getCliente());

                controlador.cargarProductos(this.getSistema().getEchoShop().getListaDeProductosEnStock(), sistema);

                stage.setOnCloseRequest(e -> controlador.cerrarVentana());

                Stage myStage = (Stage) this.btnAtras.getScene().getWindow();
                myStage.close();
            } catch (IOException ex) {
                Logger.getLogger(CarritoController.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("¡Cuidado!");
            alert.setHeaderText("Error: Seleccione almenos un envase");
            alert.setContentText("Agregue un envase, en el cual retirara el producto");
            alert.showAndWait();
        }

    }

    public void cargarProductos(Producto producto, Sistema sis, SeleccionarEnvasePorProductoPreVentaController paraCargarPestañaCarrito) {

        try {
            this.setSistema(sis);

            this.productoSeleccionado.getChildren().clear();

            //Cargarart el objeto
            FXMLLoader fxml = new FXMLLoader(getClass().getResource("ProductoParaSeleccionarEnvases.fxml"));

            Parent nodo = fxml.load();

            //Carga los datos
            ProductoParaSeleccionarEnvasesController controlador = fxml.getController();

            controlador.setSistema(sistema);

            controlador.inicializarDatosPreVenta(producto, sistema, paraCargarPestañaCarrito);

            //Cargo el nuevo objeto
            this.productoSeleccionado.getChildren().add((Node) nodo);
        } catch (IOException ex) {
            Logger.getLogger(SeleccionarEnvasePorProductoPreVentaController.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void cargarProductos2(ArrayList<Envase> lista, Sistema sis, SeleccionarEnvasePorProductoPreVentaController paraCargarPestañaCarrito, Producto producto) {

        this.setSistema(sis);

        this.setProducto(producto);

        this.listaDeEnvases.getChildren().clear();

        this.listaDeEnvases.setSpacing(10);

        for (int i = 0; i < lista.size(); i++) {

            try {
                Envase envase = lista.get(i);

                FXMLLoader fxml = new FXMLLoader(getClass().getResource("PresentacionEnvasesPreVenta.fxml"));

                Parent nodo = fxml.load();

                PresentacionEnvasesPreVentaController controlador = fxml.getController();

                controlador.inicializarDatos(envase, sistema, paraCargarPestañaCarrito, producto);

                controlador.setSistema(sistema);

                //Cargo el nuevo objeto
                this.listaDeEnvases.getChildren().add((Node) nodo);

            } catch (IOException ex) {
                Logger.getLogger(SeleccionarEnvasePorProductoPreVentaController.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

    }

    public void cerrarVentana() {

        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Cliente.fxml"));

            Parent root = loader.load();

            ClienteController controlador = loader.getController();

            Scene escena = new Scene(root);

            Stage stage = new Stage();

            stage.setScene(escena);

            stage.show();

            stage.setHeight(675);

            stage.setWidth(366);

            stage.setResizable(false);

            controlador.setSistema(sistema);

            controlador.setCliente(this.getCliente());

            controlador.cargarProductos(this.getSistema().getEchoShop().getListaDeProductosEnStock(), sistema);

            stage.setOnCloseRequest(e -> controlador.cerrarVentana());

            Stage myStage = (Stage) this.btnAtras.getScene().getWindow();
            myStage.close();
        } catch (IOException ex) {
            Logger.getLogger(CarritoController.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
