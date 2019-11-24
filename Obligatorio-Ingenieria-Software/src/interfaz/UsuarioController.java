/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;
import dominio.Persona;
import dominio.Sistema;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXTextField;
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
import javafx.stage.Stage;
/**
 * FXML Controller class
 *
 * @author user
 */
public class UsuarioController implements Initializable {
    @FXML
    private JFXTextField txtFnombreUsuario;
    @FXML
    private JFXComboBox<Integer> cmbEdad;
    @FXML
    private JFXTextField txtFDireccion;
    @FXML
    private JFXTextField txtFRutComprador;
    @FXML
    private JFXButton btnConfirmar;
    @FXML
    private JFXButton btnInicio;
    private Sistema sistema;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        for (int i = 1; i < 100; i++) {
            cmbEdad.getItems().add(i);
        }
    }
    @FXML
    private void confirmarDatos(ActionEvent event) {
        boolean esValido = true;
        int edad = 1;
        int rutComprador = 1;
        //Parte de nombre de persona cliente
        String nombre = txtFnombreUsuario.getText().trim();
        if (nombre.length() == 0) {
            esValido = false;
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("¡Cuidado!");
            alert.setHeaderText("Error: campo vacio");
            alert.setContentText("El campo de nombre, se encuentra vacio!");
            alert.showAndWait();
        }
        //Parte de edad de persona
        if (!this.cmbEdad.getSelectionModel().isEmpty()) {
            edad = this.cmbEdad.getSelectionModel().getSelectedItem();
        } else {
            esValido = false;
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("¡Cuidado!");
            alert.setHeaderText("Error: no ha seleccionado ninguna edad");
            alert.setContentText("!Seleccione su edad!");
            alert.showAndWait();
        }
        //Parte de direccion
        String direccion = txtFDireccion.getText().trim();
        if (direccion.length() == 0) {
            esValido = false;
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("¡Cuidado!");
            alert.setHeaderText("Error: campo vacio");
            alert.setContentText("El campo de direccion se encuentra vacio!");
            alert.showAndWait();
        } else {
            if (direccion.length() <= 10) {
                esValido = false;
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("¡Cuidado!");
                alert.setHeaderText("Error: direccion invalida");
                alert.setContentText("Introduzca una direccion valida!");
                alert.showAndWait();
            }
        }
        //Parte de rut comprador
        String rutString = txtFRutComprador.getText().trim();
        if (rutString.length() == 0) {
            esValido = false;
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("¡Cuidado!");
            alert.setHeaderText("Error: campo vacio");
            alert.setContentText("El campo de rut, se encuentra vacio!");
            alert.showAndWait();
        } else {
            if (rutString.length() <= 5) {
                esValido = false;
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("¡Cuidado!");
                alert.setHeaderText("Error: no es un rut valido");
                alert.setContentText("Ingrese un rut valido");
                alert.showAndWait();
            }
        }
        if (esValido) {
            Persona cliente = new Persona(nombre, edad, direccion, rutString);
            this.getSistema().agregarCliente(cliente);
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
                controlador.setCliente(cliente);
                stage.setOnCloseRequest(e -> controlador.cerrarVentana());
                Stage myStage = (Stage) this.btnConfirmar.getScene().getWindow();
                myStage.close();
            } catch (IOException ex) {
                Logger.getLogger(InicioController.class.getName()).log(Level.SEVERE, null, ex);
            }
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
            Stage myStage = (Stage) this.btnInicio.getScene().getWindow();
            myStage.close();
        } catch (IOException ex) {
            Logger.getLogger(UsuarioController.class
                    .getName()).log(Level.SEVERE, null, ex);
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
            Stage myStage = (Stage) this.btnInicio.getScene().getWindow();
            myStage.close();
        } catch (IOException ex) {
            Logger.getLogger(UsuarioController.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
    }
    public Sistema getSistema() {
        return sistema;
    }
    public void setSistema(Sistema sistema) {
        this.sistema = sistema;
    }
}
