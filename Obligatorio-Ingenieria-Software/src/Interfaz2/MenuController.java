/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz2;

import com.jfoenix.controls.JFXButton;
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
public class MenuController implements Initializable {

    @FXML
    private JFXButton btnAgregarProducto;
    @FXML
    private JFXButton btnAgregarSucursal;
    @FXML
    private JFXButton btnAgregarEnvase;
    @FXML
    private JFXButton btnEliminarProducto;
    @FXML
    private JFXButton btnVolverAVendedor;
    @FXML
    private JFXButton btnAgregarProducto1;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        
    }    

    @FXML
    private void agregarProducto(ActionEvent event) {
        
         try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("AgregarProducto.fxml"));

            Parent root = loader.load();

            AgregarProductoController controlador = loader.getController();

            Scene escena = new Scene(root);

            Stage stage = new Stage();

            stage.setScene(escena);

            stage.show();

            stage.setOnCloseRequest(e -> controlador.cerrarVentana());

            Stage myStage = (Stage) this.btnAgregarEnvase.getScene().getWindow();
            myStage.close();
        } catch (IOException ex) {
            Logger.getLogger(VendedorController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void agregarSucursal(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("AgregadoSucursal.fxml"));

            Parent root = loader.load();

            AgregadoSucursalController controlador = loader.getController();

            Scene escena = new Scene(root);

            Stage stage = new Stage();

            stage.setScene(escena);

            stage.show();

            stage.setOnCloseRequest(e -> controlador.cerrarVentana());

            Stage myStage = (Stage) this.btnAgregarEnvase.getScene().getWindow();
            myStage.close();
        } catch (IOException ex) {
            Logger.getLogger(VendedorController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void agregarEnvase(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("AgregarEnvase.fxml"));

            Parent root = loader.load();

            AgregarEnvaseController controlador = loader.getController();

            Scene escena = new Scene(root);

            Stage stage = new Stage();

            stage.setScene(escena);

            stage.show();

            stage.setOnCloseRequest(e -> controlador.cerrarVentana());

            Stage myStage = (Stage) this.btnAgregarEnvase.getScene().getWindow();
            myStage.close();
        } catch (IOException ex) {
            Logger.getLogger(VendedorController.class.getName()).log(Level.SEVERE, null, ex);
        }

        
    }

    @FXML
    private void eliminarProducto(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("EliminarProducto.fxml"));

            Parent root = loader.load();

            EliminarProductoController controlador = loader.getController();

            Scene escena = new Scene(root);

            Stage stage = new Stage();

            stage.setScene(escena);

            stage.show();

            stage.setOnCloseRequest(e -> controlador.cerrarVentana());

            Stage myStage = (Stage) this.btnAgregarEnvase.getScene().getWindow();
            myStage.close();
        } catch (IOException ex) {
            Logger.getLogger(VendedorController.class.getName()).log(Level.SEVERE, null, ex);
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


            Stage myStage = (Stage) this.btnAgregarEnvase.getScene().getWindow();
            myStage.close();

        } catch (IOException ex) {
            Logger.getLogger(InicioController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
