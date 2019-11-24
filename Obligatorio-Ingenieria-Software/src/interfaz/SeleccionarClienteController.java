/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;
import com.jfoenix.controls.JFXButton;
import dominio.Persona;
import dominio.Sistema;
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
import javafx.scene.control.Alert;
import javafx.stage.Stage;
/**
 * FXML Controller class
 *
 * @author user
 */
public class SeleccionarClienteController implements Initializable {
    @FXML
    private JFXButton btnClientePorDefecto;
    @FXML
    private JFXButton btnClienteConDatos;
    @FXML
    private JFXButton btnVolverInicio;
    private Sistema sistema;
    public Sistema getSistema() {
        return sistema;
    }
    public void setSistema(Sistema sistema) {
        this.sistema = sistema;
    }
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
    @FXML
    private void tocoBotonPorDefecto(ActionEvent event) {
        Persona clientePorDefecto= new Persona("Ricardo Montaner", 45, "Cassinoni 1190 esquina Charrua", "ABCD8569" );
        this.getSistema().agregarCliente(clientePorDefecto);
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("InicioCliente.fxml"));
            Parent root = loader.load();
            InicioClienteController controlador = loader.getController();
            Scene escena = new Scene(root);
            Stage stage = new Stage();
            stage.setScene(escena);
            stage.show();
            stage.setHeight(675);
            stage.setWidth(366);
            stage.setResizable(false);
            controlador.setSistema(sistema);
            controlador.setCliente(clientePorDefecto); 
            stage.setOnCloseRequest(e -> controlador.cerrarVentana());
            Stage myStage = (Stage) this.btnClienteConDatos.getScene().getWindow();
            myStage.close();
        } catch (IOException ex) {
            Logger.getLogger(SeleccionarClienteController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    @FXML
    private void tocoBotonClienteConDatos(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Usuario.fxml"));
            Parent root = loader.load();
            UsuarioController controlador = loader.getController();
            Scene escena = new Scene(root);
            Stage stage = new Stage();
            stage.setScene(escena);
            stage.show();
            stage.setHeight(675);
            stage.setWidth(366);
            stage.setResizable(false);
            controlador.setSistema(sistema);
            stage.setOnCloseRequest(e -> controlador.cerrarVentana());
            Stage myStage = (Stage) this.btnClienteConDatos.getScene().getWindow();
            myStage.close();
        } catch (IOException ex) {
            Logger.getLogger(SeleccionarClienteController.class.getName()).log(Level.SEVERE, null, ex);
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
            stage.setHeight(675);
            stage.setWidth(366);
            stage.setResizable(false);
            controlador.setSistema(sistema);
            Stage myStage = (Stage) this.btnClienteConDatos.getScene().getWindow();
            myStage.close();
        } catch (IOException ex) {
            Logger.getLogger(SeleccionarClienteController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    @FXML
    private void tocoBotonInicio(ActionEvent event) {
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
            Stage myStage = (Stage) this.btnClienteConDatos.getScene().getWindow();
            myStage.close();
        } catch (IOException ex) {
            Logger.getLogger(SeleccionarClienteController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
