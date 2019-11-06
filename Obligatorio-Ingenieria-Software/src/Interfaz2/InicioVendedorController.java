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
public class InicioVendedorController implements Initializable {

    @FXML
    private JFXButton btnContinuar;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void continuar(ActionEvent event) {
        
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Vendedor.fxml"));
             
            Parent root = loader.load();
            
            VendedorController controlador= loader.getController(); 
            
            Scene escena= new Scene(root); 
            
            Stage stage= new Stage(); 
            
            stage.setScene(escena);
            
            stage.show();
            
            stage.setOnCloseRequest(e -> controlador.cerrarVentana());
            
            Stage myStage= (Stage) this.btnContinuar.getScene().getWindow(); 
            myStage.close();
            
        } catch (IOException ex) {
            Logger.getLogger(InicioVendedorController.class.getName()).log(Level.SEVERE, null, ex);
        }
            
            
        
    
    
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

            Stage myStage = (Stage) this.btnContinuar.getScene().getWindow();
            myStage.close();

        } catch (IOException ex) {
            Logger.getLogger(VendedorController.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
}
