/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz2;

import Dominio.Envase;
import Dominio.Producto;
import Dominio.Sistema;
import com.jfoenix.controls.JFXButton;
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
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author user
 */
public class SeleccionarEnvasePorProductoController implements Initializable {

    @FXML
    private VBox productoSeleccionado;
    @FXML
    private VBox listaDeEnvases;
    @FXML
    private JFXButton btnCarrito;
    @FXML
    private JFXButton btnAtras;
    @FXML
    private JFXButton btnVolver;

    private Sistema sistema;

    public Sistema getSistema() {
        return sistema;
    }

    public void setSistema(Sistema sistema) {
        this.sistema = sistema;
    }

    public void cargarProductos(Producto producto, Sistema sis, SeleccionarEnvasePorProductoController paraCargarPestañaCarrito) {

        try {
            this.setSistema(sis);

            this.productoSeleccionado.getChildren().clear();

            //Cargarart el objeto
            FXMLLoader fxml = new FXMLLoader(getClass().getResource("ProductoParaSeleccionarEnvases.fxml"));

            Parent nodo = fxml.load();

            //Carga los datos
            ProductoParaSeleccionarEnvasesController controlador = fxml.getController();

            controlador.setSistema(sistema);

            controlador.inicializarDatos(producto, sistema, paraCargarPestañaCarrito);

            //Cargo el nuevo objeto
            this.productoSeleccionado.getChildren().add((Node) nodo);
        } catch (IOException ex) {
            Logger.getLogger(SeleccionarEnvasePorProductoController.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void cargarProductos2(ArrayList<Envase> listaDeEnvases, Sistema sis, SeleccionarEnvasePorProductoController paraCargarPestañaCarrito) {

        this.setSistema(sis);

        this.listaDeEnvases.getChildren().clear();

        this.listaDeEnvases.setSpacing(10);

        for (int i = 0; i < listaDeEnvases.size(); i++) {
            try {
                Envase envase = listaDeEnvases.get(i);

                FXMLLoader fxml = new FXMLLoader(getClass().getResource("PresentacionEnvases.fxml"));

                Parent nodo = fxml.load();

                PresentacionEnvasesController controlador = fxml.getController();

                controlador.inicializarDatos(envase, sistema, paraCargarPestañaCarrito);

                controlador.setSistema(sistema);

                //Cargo el nuevo objeto
                this.listaDeEnvases.getChildren().add((Node) nodo);
            } catch (IOException ex) {
                Logger.getLogger(SeleccionarEnvasePorProductoController.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void irACarrito(ActionEvent event) {

        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Carrito.fxml"));

            Parent root = loader.load();

            CarritoController controlador = loader.getController();

            Scene escena = new Scene(root);

            Stage stage = new Stage();

            stage.setScene(escena);

            stage.show();

            stage.setHeight(675);

            stage.setWidth(366);

            stage.setResizable(false);

            controlador.setSistema(sistema);

            controlador.cargarProductos(this.getSistema().getProductosAVenderEnSesionActiva(), sistema, controlador, this.getSistema().getCantidadPorIdDeProd());

            stage.setOnCloseRequest(e -> controlador.cerrarVentana());

            Stage myStage = (Stage) this.btnCarrito.getScene().getWindow();
            myStage.close();
        } catch (IOException ex) {
            Logger.getLogger(ClienteController.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @FXML
    private void irAInicio(ActionEvent event) {

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

            controlador.cargarProductos(this.getSistema().getEchoShop().getListaDeProductosEnStock(), sistema);

            stage.setOnCloseRequest(e -> controlador.cerrarVentana());

            Stage myStage = (Stage) this.btnAtras.getScene().getWindow();
            myStage.close();
        } catch (IOException ex) {
            Logger.getLogger(CarritoController.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @FXML
    private void volverInicio(ActionEvent event) {

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

            controlador.cargarProductos(this.getSistema().getEchoShop().getListaDeProductosEnStock(), sistema);

            stage.setOnCloseRequest(e -> controlador.cerrarVentana());

            Stage myStage = (Stage) this.btnAtras.getScene().getWindow();
            myStage.close();
        } catch (IOException ex) {
            Logger.getLogger(CarritoController.class.getName()).log(Level.SEVERE, null, ex);
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

            controlador.cargarProductos(this.getSistema().getEchoShop().getListaDeProductosEnStock(), sistema);

            stage.setOnCloseRequest(e -> controlador.cerrarVentana());

            Stage myStage = (Stage) this.btnAtras.getScene().getWindow();
            myStage.close();
        } catch (IOException ex) {
            Logger.getLogger(CarritoController.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
