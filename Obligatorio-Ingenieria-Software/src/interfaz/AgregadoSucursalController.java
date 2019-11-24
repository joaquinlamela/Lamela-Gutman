/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;
import dominio.Sistema;
import dominio.Tienda;
import dominio.Sucursal;
import dominio.TipoOrigen;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXTextField;
import com.jfoenix.controls.JFXTimePicker;
import java.io.IOException;
import java.net.URL;
import java.time.LocalTime;
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
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;
/**
 * FXML Controller class
 *
 * @author user
 */
public class AgregadoSucursalController implements Initializable {
    @FXML
    private JFXComboBox<Integer> cmbNumeroSucursal;
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
    private Sistema sistema;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        //En este caso lo que estamos haciendo es decir que el maximo de sucursales que va a haber por sistema en este caso van a ser 50, pero no todas estas son las que se mostraran en el mapa
        this.dateInicio.setValue(LocalTime.now());
        this.dateFinalizacion.setValue(LocalTime.now());
    }
    public void cargarProductos(Sistema sis) {
        this.setSistema(sis);
        this.getSistema().getEchoShop().getSucursales();
        for (int i = this.getSistema().getEchoShop().getSucursales().size() + 1; i < 50; i++) {
            cmbNumeroSucursal.getItems().add(i);
        }
        this.cmbNumeroSucursal.setValue(this.getSistema().getEchoShop().getSucursales().size() + 1);
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
        boolean esValido = true;
        int telefon = 911;
        int numeroSucursal = 1;
        //Parte de sucursal
        if (!this.cmbNumeroSucursal.getSelectionModel().isEmpty()) {
            numeroSucursal = this.cmbNumeroSucursal.getSelectionModel().getSelectedItem();
        } else {
            if (this.cmbNumeroSucursal.getSelectionModel().isEmpty()) {
                esValido = false;
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("¡Cuidado!");
                alert.setHeaderText("Error: no ha seleccionado ningun numero de sucursal");
                alert.setContentText("!Seleccione un numero para la sucursal!");
                alert.showAndWait();
            } else {
                for (int i = 0; i < this.getSistema().getEchoShop().getSucursales().size(); i++) {
                    if (numeroSucursal == this.getSistema().getEchoShop().getSucursales().get(i).getNumeroSucursal()) {
                        esValido = false;
                    }
                    if (!esValido) {
                        Alert alert = new Alert(Alert.AlertType.ERROR);
                        alert.setTitle("¡Cuidado!");
                        alert.setHeaderText("Error: ha seleccionado un numero existente");
                        alert.setContentText("!Seleccione un nuevo numero!");
                        alert.showAndWait();
                    }
                    esValido = true;
                }
            }
        }
        //Parte de direccion
        String direccion = txtFDireccion.getText().trim();
        if (direccion.length() == 0) {
            esValido = false;
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("¡Cuidado!");
            alert.setHeaderText("Error: campo vacio");
            alert.setContentText("El campo de direccion, se encuentra vacio!");
            alert.showAndWait();
        }
        //Parte de telefono
        try {
            String telefono = txtFTelefono.getText().trim();
            if (telefono.length() == 0) {
                esValido = false;
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("¡Cuidado!");
                alert.setHeaderText("Error: campo vacio");
                alert.setContentText("El campo de telefono, se encuentra vacio!");
                alert.showAndWait();
            } else {
                if (telefono.length() > 9) {
                    esValido = false;
                    Alert alert = new Alert(Alert.AlertType.ERROR);
                    alert.setTitle("¡Cuidado!");
                    alert.setHeaderText("Error: numero invalido");
                    alert.setContentText("No es un telefono valido en Uruguay!");
                    alert.showAndWait();
                } else {
                    telefon = Integer.parseInt(telefono);
                    if (telefon <= 0) {
                        esValido = false;
                        Alert alert = new Alert(Alert.AlertType.ERROR);
                        alert.setTitle("¡Cuidado!");
                        alert.setHeaderText("Error: no es un telefono valido");
                        alert.setContentText("Ingrese un telefono valido");
                        alert.showAndWait();
                    }
                }
            }
        } catch (NumberFormatException e) {
            esValido = false;
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("¡Cuidado!");
            alert.setHeaderText("Error: no es un telefono valido");
            alert.setContentText("Reingrese el valor del telefono!");
            alert.showAndWait();
        }
        //Parte de hora de inicio 
        LocalTime horaInicio = this.dateInicio.getValue();
        //Parte de hora de finalizacion
        LocalTime horaFinalizacion = this.dateFinalizacion.getValue();
        if (horaInicio.isAfter(horaFinalizacion)) {
            esValido = false;
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("¡Cuidado!");
            alert.setHeaderText("Error: horario no valido");
            alert.setContentText("Reingrese la hora de inicio, de manera que sea valida!");
            alert.showAndWait();
        } else {
            if (horaFinalizacion.isBefore(horaInicio)) {
                esValido = false;
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("¡Cuidado!");
                alert.setHeaderText("Error: horario no valido");
                alert.setContentText("Reingrese la hora de finalizacion, de manera que sea valida!");
                alert.showAndWait();
            }
        }
        if (esValido) {
            Sucursal sucursalAgregar = new Sucursal(numeroSucursal, direccion, telefon);
            Tienda echoShop = this.sistema.getEchoShop();
            echoShop.getSucursales().add(sucursalAgregar);
            echoShop.setHoraInicio(horaInicio);
            echoShop.setHoraFinalizacion(horaFinalizacion);
            this.cargarProductos(sistema);
            Alert alert = new Alert(AlertType.INFORMATION);
            alert.setTitle("Agregado de sucursal");
            alert.setHeaderText("Se ha agregado correctamente la sucursal");
            alert.showAndWait();
        }
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
            stage.setHeight(675);
            stage.setWidth(366);
            stage.setResizable(false);
            controlador.setSistema(sistema);
            stage.setOnCloseRequest(e -> controlador.cerrarVentana());
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
            stage.setHeight(675);
            stage.setWidth(366);
            stage.setResizable(false);
            controlador.setSistema(sistema);
            stage.setOnCloseRequest(e -> controlador.cerrarVentana());
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
            stage.setHeight(675);
            stage.setWidth(366);
            stage.setResizable(false);
            controlador.setSistema(sistema);
            stage.setOnCloseRequest(e -> controlador.cerrarVentana());
            Stage myStage = (Stage) this.btnAgregar.getScene().getWindow();
            myStage.close();
        } catch (IOException ex) {
            Logger.getLogger(AgregadoSucursalController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public Sistema getSistema() {
        return sistema;
    }
    public void setSistema(Sistema sistema) {
        this.sistema = sistema;
    }
}
