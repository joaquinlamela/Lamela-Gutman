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
import javafx.scene.control.SortEvent;
import javafx.scene.control.TableView;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author user
 */
public class VentaPorMesController implements Initializable {

    @FXML
    private JFXButton btnInicio;
    @FXML
    private JFXButton btnAtras;
    @FXML
    private TableView<?> tablaDeProductosPorFecha;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void volverAInicio(ActionEvent event) {
        
                try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Vendedor.fxml"));

            Parent root = loader.load();

            VendedorController controlador = loader.getController();

            Scene escena = new Scene(root);

            Stage stage = new Stage();

            stage.setScene(escena);

            stage.show();
            
            
            Stage myStage = (Stage) this.btnAtras.getScene().getWindow();
            myStage.close();
        } catch (IOException ex) {
            Logger.getLogger(TopVentasController.class.getName()).log(Level.SEVERE, null, ex);
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
            
            
            Stage myStage = (Stage) this.btnAtras.getScene().getWindow();
            myStage.close();
        } catch (IOException ex) {
            Logger.getLogger(TopVentasController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void productosPorFecha(SortEvent<?> event) {
    }
    
    
    public void cerrarVentana(){
        
       
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Vendedor.fxml"));
            
            Parent root = loader.load();

            VendedorController controlador = loader.getController();

            Scene escena = new Scene(root);

            Stage stage = new Stage();

            stage.setScene(escena);

            stage.show();

            stage.setOnCloseRequest(e -> controlador.cerrarVentana());

            Stage myStage = (Stage) this.tablaDeProductosPorFecha.getScene().getWindow();
            myStage.close();
        } catch (IOException ex) {
            Logger.getLogger(VentaPorMesController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
            
        
    }
    
}
