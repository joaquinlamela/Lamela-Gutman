/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import dominio.Sistema;
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
public class InicioController implements Initializable {

    @FXML
    private JFXButton btnVendedor;
    @FXML
    private JFXButton btnVolverInicio;

    private Sistema sistema;
   
    @FXML
    private JFXButton btnCliente;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void tocoBotonVendedor(ActionEvent event) {

        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("InicioVendedor.fxml"));

            Parent root = loader.load();

            InicioVendedorController controlador = loader.getController();

            Scene escena = new Scene(root);

            Stage stage = new Stage();

            stage.setScene(escena);

            stage.show();

            stage.setHeight(675);
            
            stage.setWidth(366);
            
            stage.setResizable(false);

            controlador.setSistema(sistema);

            stage.setOnCloseRequest(e -> controlador.cerrarVentana());

            Stage myStage = (Stage) this.btnVendedor.getScene().getWindow();
            myStage.close();

        } catch (IOException ex) {
            Logger.getLogger(InicioController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        this.getSistema().mostrar();

    }

    @FXML
    private void tocoBotonCliente(ActionEvent event) {

        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("SeleccionarCliente.fxml"));

            Parent root = loader.load();

            SeleccionarClienteController controlador = loader.getController();

            Scene escena = new Scene(root);

            Stage stage = new Stage();

            stage.setScene(escena);

            stage.show();
            
            stage.setHeight(675);
            
            stage.setWidth(366);
            
            stage.setResizable(false);

            controlador.setSistema(sistema);

            stage.setOnCloseRequest(e -> controlador.cerrarVentana());

            Stage myStage = (Stage) this.btnVendedor.getScene().getWindow();
            myStage.close();

        } catch (IOException ex) {
            Logger.getLogger(InicioController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    

    }

    @FXML
    private void tocoBotonInicio(ActionEvent event) {

    }

    public Sistema getSistema() {
        return sistema;
    }

    public void setSistema(Sistema s) {
        this.sistema = s;
    }

 

}
