/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;
import dominio.Envase;
import dominio.Sistema;
import dominio.TipoMateriales;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXRadioButton;
import com.jfoenix.controls.JFXTextField;
import java.io.File;
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
import javafx.scene.image.Image;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import javax.swing.filechooser.FileNameExtensionFilter;
/**
 * FXML Controller class
 *
 * @author user
 */
public class AgregarEnvaseController implements Initializable {
    @FXML
    private JFXTextField txtFPesoSoportado;
    @FXML
    private JFXTextField txtFNombreEnvase;
    @FXML
    private JFXButton btnAgregar;
    @FXML
    private JFXButton btnAtras;
    @FXML
    private JFXButton btnInicio;
    private Sistema sistema;
    @FXML
    private JFXRadioButton rbPlastico;
    @FXML
    private JFXRadioButton rbCarton;
    @FXML
    private JFXRadioButton rbPapel;
    @FXML
    private JFXRadioButton rbMetal;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
    @FXML
    private void obtenerPesoSoportado(ActionEvent event) {
    }
    @FXML
    private void obtenerNombreEnvase(ActionEvent event) {
    }
    @FXML
    private void agregarEnvase(ActionEvent event) {
        boolean esValido = true;
        int peso = 1;
        //Parte de nombre del envase
        String nombre = this.txtFNombreEnvase.getText().trim();
        if (nombre.length() == 0) {
            esValido = false;
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("¡Cuidado!");
            alert.setHeaderText("Error: campo vacio");
            alert.setContentText("El campo de nombre, se encuentra vacio!");
            alert.showAndWait();
        }
        //Parte de peso
        try {
            String pesoString = this.txtFPesoSoportado.getText().trim();
            if (pesoString.length() == 0) {
                esValido = false;
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("¡Cuidado!");
                alert.setHeaderText("Error: campo vacio");
                alert.setContentText("El campo de peso, se encuentra vacio!");
                alert.showAndWait();
            } else {
                peso = Integer.parseInt(pesoString);
                if (peso <= 0) {
                    esValido = false;
                    Alert alert = new Alert(Alert.AlertType.ERROR);
                    alert.setTitle("¡Cuidado!");
                    alert.setHeaderText("Error: no es un precio valido");
                    alert.setContentText("Ingrese un peso positivo y mayor a 0");
                    alert.showAndWait();
                } else {
                    if (peso > 100) {
                        esValido = false;
                        Alert alert = new Alert(Alert.AlertType.ERROR);
                        alert.setTitle("¡Cuidado!");
                        alert.setHeaderText("Error: no es un peso valido");
                        alert.setContentText("Ingrese un peso menor o igual a 100");
                        alert.showAndWait();
                    }
                }
            }
        } catch (NumberFormatException e) {
            esValido = false;
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("¡Cuidado!");
            alert.setHeaderText("Error: no es un peso valido");
            alert.setContentText("Reingrese el valor del peso!");
            alert.showAndWait();
        }
        //Parte de tipos de materiales
        ArrayList<dominio.TipoMateriales> materiales = new ArrayList<>();
        if (this.rbPlastico.isSelected()) {
            materiales.add(TipoMateriales.Plastico);
        }
        if (this.rbPapel.isSelected()) {
            materiales.add(TipoMateriales.Papel);
        }
        if (this.rbMetal.isSelected()) {
            materiales.add(TipoMateriales.Metal);
        }
        if (this.rbCarton.isSelected()) {
            materiales.add(TipoMateriales.Carton);
        }
        if (materiales.isEmpty()) {
            esValido = false;
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("¡Cuidado!");
            alert.setHeaderText("Error: no ha seleccionado los materiales");
            alert.setContentText("Debe seleccionar al menos un material !");
            alert.showAndWait();
        }
        //Parte del codigo identificador del envase
        int codigoIdentificadorEnvase = this.getSistema().ponerIdentificadorAEnvase();
        //Parte de la creacion del envase si es valido
        if (esValido) {
            FileChooser fileChooser = new FileChooser();
            FileChooser.ExtensionFilter filter = new FileChooser.ExtensionFilter("Imagenes (*.png, *.jpg, *.jpeg)", "*.png", "*.jpeg", "*.jpg");
            fileChooser.getExtensionFilters().add(filter);
            File selectedFile = fileChooser.showOpenDialog(new Stage());
            if (selectedFile == null) {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("¡Cuidado!");
                alert.setHeaderText("Error: seleccione una imagen");
                alert.setContentText("Debe seleccionar un imagen!");
                alert.showAndWait();
            } else {
                Image imagenProducto = new Image(selectedFile.toURI().toString());
                Envase envaseAgregar = new Envase(nombre, codigoIdentificadorEnvase, peso, materiales, imagenProducto);
                this.getSistema().getEchoShop().agregarEnvase(envaseAgregar);
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Agregado de envase");
                alert.setHeaderText("Se ha agregado correctamente el envase");
                alert.showAndWait();
            }
        }
        for (int i = 0; i < this.getSistema().getEchoShop().getTodosLosEnvasesDisponibles().size(); i++) {
            System.out.println(this.getSistema().getEchoShop().getTodosLosEnvasesDisponibles().get(i));
        }
    }
    @FXML
    private void volverAtras(ActionEvent event) {
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
            Logger.getLogger(AgregarEnvaseController.class.getName()).log(Level.SEVERE, null, ex);
        }
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
            stage.setHeight(675);
            stage.setWidth(366);
            stage.setResizable(false);
            controlador.setSistema(sistema);
            stage.setOnCloseRequest(e -> controlador.cerrarVentana());
            Stage myStage = (Stage) this.btnAgregar.getScene().getWindow();
            myStage.close();
        } catch (IOException ex) {
            Logger.getLogger(AgregarEnvaseController.class.getName()).log(Level.SEVERE, null, ex);
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
            stage.setHeight(675);
            stage.setWidth(366);
            stage.setResizable(false);
            controlador.setSistema(sistema);
            stage.setOnCloseRequest(e -> controlador.cerrarVentana());
            Stage myStage = (Stage) this.btnAgregar.getScene().getWindow();
            myStage.close();
        } catch (IOException ex) {
            Logger.getLogger(AgregarEnvaseController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public Sistema getSistema() {
        return sistema;
    }
    public void setSistema(Sistema sistema) {
        this.sistema = sistema;
    }
}
