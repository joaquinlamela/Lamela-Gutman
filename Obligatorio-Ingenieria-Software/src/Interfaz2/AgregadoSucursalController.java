/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz2;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXTextField;
import com.jfoenix.controls.JFXTimePicker;
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
public class AgregadoSucursalController implements Initializable {

    @FXML
    private JFXComboBox<?> cmbNumeroSucursal;
    @FXML
    private JFXTextField txtFDireccion;
    @FXML
    private JFXTextField txtFTelefono;
    @FXML
    private JFXButton btnAgregar;
    @FXML
    private JFXButton btnAtras;
    @FXML
    private JFXButton btnInicio;
    @FXML
    private JFXTimePicker dateInicio;
    @FXML
    private JFXTimePicker dateFinalizacion;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void obtenerNumeroSucursal(ActionEvent event) {
    }

    @FXML
    private void obtenerDireccion(ActionEvent event) {
    }

    @FXML
    private void obtenerTelefono(ActionEvent event) {
    }

    @FXML
    private void agregarSucursal(ActionEvent event) {
    }

    @FXML
    private void volverAVendedor(ActionEvent event) {
        
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Vendedor.fxml"));

            Parent root = loader.load();

            VendedorController controlador = loader.getController();

            Scene escena = new Scene(root);

            Stage stage = new Stage();

            stage.setScene(escena);

            stage.show();
            
            
            Stage myStage = (Stage) this.btnAgregar.getScene().getWindow();
            myStage.close();
        } catch (IOException ex) {
            Logger.getLogger(AgregadoSucursalController.class.getName()).log(Level.SEVERE, null, ex);
        }

        
        
    }

    @FXML
    private void volverVentanaAnterior(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Vendedor.fxml"));

            Parent root = loader.load();

            VendedorController controlador = loader.getController();

            Scene escena = new Scene(root);

            Stage stage = new Stage();

            stage.setScene(escena);

            stage.show();
            
            
            Stage myStage = (Stage) this.btnAgregar.getScene().getWindow();
            myStage.close();
        } catch (IOException ex) {
            Logger.getLogger(AgregadoSucursalController.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @FXML
    private void obtenerHoraInicio(ActionEvent event) {
    }

    @FXML
    private void obtenerHoraFinalizacion(ActionEvent event) {
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

            stage.setOnCloseRequest(e -> controlador.cerrarVentana());
            
            Stage myStage = (Stage) this.btnAgregar.getScene().getWindow();
            myStage.close();
        } catch (IOException ex) {
            Logger.getLogger(AgregadoSucursalController.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }
    
}
