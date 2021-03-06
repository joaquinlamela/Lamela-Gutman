/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import dominio.Producto;
import dominio.Sistema;
import com.jfoenix.controls.JFXButton;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author user
 */
public class PruebaController implements Initializable {

    @FXML
    private JFXButton btnCarro;
    @FXML
    private JFXButton btnMapita;
    @FXML
    private JFXButton btnMercadito;
    @FXML
    private JFXButton btnTop;
    @FXML
    private JFXButton btnMenu;
    @FXML
    private JFXButton btnIrAInicio;
    @FXML
    private TableView<Producto> tbProductos;
    @FXML
    private TableColumn coluNombre;
    @FXML
    private TableColumn coluIdentifica;
    @FXML
    private TableColumn coluCant;
    @FXML
    private TableColumn coluPrecio;
    private ObservableList<Producto> productos;
    private Sistema sistema;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // this.cargarTabla();
    }

    public void cargarTabla() {
        productos = FXCollections.observableArrayList();
        this.coluNombre.setCellFactory(new PropertyValueFactory("nombre"));
        this.coluIdentifica.setCellFactory(new PropertyValueFactory("codigoIdentificador"));
        this.coluCant.setCellFactory(new PropertyValueFactory("cantidadVendidos"));
        this.coluPrecio.setCellFactory(new PropertyValueFactory("precio"));
        for (int i = 0; i < this.getSistema().getEchoShop().getListaDeProductosEnStock().size(); i++) {
            productos.add(this.getSistema().getEchoShop().getListaDeProductosEnStock().get(i));
        }
        this.tbProductos.setItems(productos);
    }

    @FXML
    private void irAlCarrito(ActionEvent event) {
    }

    @FXML
    private void irAlMapa(ActionEvent event) {
    }

    @FXML
    private void irAlMercado(ActionEvent event) {
    }

    @FXML
    private void topVentas(ActionEvent event) {
    }

    @FXML
    private void inicio(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Inicio.fxml"));
            Parent root = loader.load();
            InicioController controlador = loader.getController();
            Scene escena = new Scene(root);
            Stage stage = new Stage();
            stage.setScene(escena);
            stage.show();
            stage.setHeight(675);
            stage.setWidth(366);
            stage.setResizable(false);
            controlador.setSistema(sistema);
            Stage myStage = (Stage) this.btnCarro.getScene().getWindow();
            myStage.close();
        } catch (IOException ex) {
            Logger.getLogger(VendedorController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void irAtras(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Inicio.fxml"));
            Parent root = loader.load();
            InicioController controlador = loader.getController();
            Scene escena = new Scene(root);
            Stage stage = new Stage();
            stage.setScene(escena);
            stage.show();
            stage.setHeight(675);
            stage.setWidth(366);
            stage.setResizable(false);
            controlador.setSistema(sistema);
            Stage myStage = (Stage) this.btnCarro.getScene().getWindow();
            myStage.close();
        } catch (IOException ex) {
            Logger.getLogger(VendedorController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Sistema getSistema() {
        return sistema;
    }

    public void setSistema(Sistema sistema) {
        this.sistema = sistema;
    }

    public void cerrarVentana() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Inicio.fxml"));
            Parent root = loader.load();
            InicioController controlador = loader.getController();
            Scene escena = new Scene(root);
            Stage stage = new Stage();
            stage.setScene(escena);
            stage.show();
            stage.setHeight(675);
            stage.setWidth(366);
            stage.setResizable(false);
            controlador.setSistema(sistema);
            Stage myStage = (Stage) this.btnCarro.getScene().getWindow();
            myStage.close();
        } catch (IOException ex) {
            Logger.getLogger(VendedorController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
