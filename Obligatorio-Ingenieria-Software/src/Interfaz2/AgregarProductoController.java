/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz2;

import Dominio.Sistema;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXTextArea;
import com.jfoenix.controls.JFXTextField;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author user
 */
public class AgregarProductoController implements Initializable {

    @FXML
    private JFXTextField txtFNombre;
    @FXML
    private JFXTextField txtFPeso;
    @FXML
    private JFXTextField txtFPrecio;
    @FXML
    private JFXTextArea txtADescripcion;
    @FXML
    private JFXComboBox<?> cmbOrigen;
    @FXML
    private JFXButton btnAgregar;
    @FXML
    private JFXButton btnVolverVendedor;
    @FXML
    private JFXButton btnInicio;

    private Sistema sistema;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }

    @FXML
    private void obtenerNombre(ActionEvent event) {

    }

    @FXML
    private void obtenerPeso(ActionEvent event) {
    }

    @FXML
    private void obtenerPrecio(ActionEvent event) {
    }

    @FXML
    private void obtenerOrigen(ActionEvent event) {
    }

    @FXML
    private void agregarProductoCreado(ActionEvent event) {
    }

    @FXML
    private void volverInicio(ActionEvent event) {

        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Vendedor.fxml"));

            Parent root = loader.load();

            VendedorController controlador = loader.getController();

            Scene escena = new Scene(root);

            Stage stage = new Stage();

            stage.setScene(escena);

            stage.show();

            controlador.setSistema(sistema);

            stage.setOnCloseRequest(e -> controlador.cerrarVentana());

            Stage myStage = (Stage) this.btnAgregar.getScene().getWindow();
            myStage.close();
        } catch (IOException ex) {
            Logger.getLogger(AgregarProductoController.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @FXML
    private void irAInicio(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Vendedor.fxml"));

            Parent root = loader.load();

            VendedorController controlador = loader.getController();

            Scene escena = new Scene(root);

            Stage stage = new Stage();

            stage.setScene(escena);

            stage.show();

            controlador.setSistema(sistema);

            stage.setOnCloseRequest(e -> controlador.cerrarVentana());

            Stage myStage = (Stage) this.btnAgregar.getScene().getWindow();
            myStage.close();
        } catch (IOException ex) {
            Logger.getLogger(AgregarProductoController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void cerrarVentana() {

        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Vendedor.fxml"));

            Parent root = loader.load();

            VendedorController controlador = loader.getController();

            Scene escena = new Scene(root);

            Stage stage = new Stage();

            stage.setScene(escena);

            stage.show();

            controlador.setSistema(sistema);

            stage.setOnCloseRequest(e -> controlador.cerrarVentana());

            Stage myStage = (Stage) this.btnAgregar.getScene().getWindow();
            myStage.close();

        } catch (IOException ex) {
            Logger.getLogger(AgregarProductoController.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public Sistema getSistema() {
        return sistema;
    }

    public void setSistema(Sistema sistema) {
        this.sistema = sistema;
    }

}
