/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import dominio.Persona;
import dominio.Sistema;
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
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author user
 */
public class InicioClienteController implements Initializable {

    @FXML
    private JFXButton btnContinuar;
    private Sistema sistema;
    @FXML
    private JFXButton btnInicio;
    private Persona cliente;

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
    }

    @FXML
    private void continuar(ActionEvent event) {
        if (!this.getSistema().getEchoShop().getListaDeProductosEnStock().isEmpty()) {
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
                Stage myStage = (Stage) this.btnContinuar.getScene().getWindow();
                myStage.close();
            } catch (IOException ex) {
                Logger.getLogger(InicioVendedorController.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("¡Cuidado!");
            alert.setHeaderText("Error: no hay productos que vender");
            alert.setContentText("Agregue productos al sistema, desde el perfil vendedor");
            alert.showAndWait();
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
            Stage myStage = (Stage) this.btnContinuar.getScene().getWindow();
            myStage.close();
        } catch (IOException ex) {
            Logger.getLogger(InicioClienteController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void volverInicio(ActionEvent event) {
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
            Stage myStage = (Stage) this.btnContinuar.getScene().getWindow();
            myStage.close();
        } catch (IOException ex) {
            Logger.getLogger(InicioClienteController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
