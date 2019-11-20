/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import dominio.Producto;
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

    private Sistema sistema;

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

            controlador.cargarDatos(this.getSistema().getEchoShop().getTodosLosEnvasesDisponibles(), this.sistema);

            Scene escena = new Scene(root);

            Stage stage = new Stage();

            stage.setScene(escena);

            stage.show();

            stage.setHeight(675);

            stage.setWidth(366);

            stage.setResizable(false);

            controlador.setSistema(sistema);

            stage.setOnCloseRequest(e -> controlador.cerrarVentana());

            Stage myStage = (Stage) this.btnAgregarEnvase.getScene().getWindow();
            myStage.close();
        } catch (IOException ex) {
            Logger.getLogger(MenuController.class.getName()).log(Level.SEVERE, null, ex);
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

            stage.setHeight(675);

            stage.setWidth(366);

            stage.setResizable(false);

            controlador.setSistema(sistema);

            stage.setOnCloseRequest(e -> controlador.cerrarVentana());

            Stage myStage = (Stage) this.btnAgregarEnvase.getScene().getWindow();
            myStage.close();
        } catch (IOException ex) {
            Logger.getLogger(MenuController.class.getName()).log(Level.SEVERE, null, ex);
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

            stage.setHeight(675);

            stage.setWidth(366);

            stage.setResizable(false);

            controlador.setSistema(sistema);

            stage.setOnCloseRequest(e -> controlador.cerrarVentana());

            Stage myStage = (Stage) this.btnAgregarEnvase.getScene().getWindow();
            myStage.close();
        } catch (IOException ex) {
            Logger.getLogger(MenuController.class.getName()).log(Level.SEVERE, null, ex);
        }
      

    }

    @FXML
    private void eliminarProducto(ActionEvent event) {
         if (!this.getSistema().getEchoShop().getListaDeProductosEnStock().isEmpty()) {
            
             try {
                 FXMLLoader loader = new FXMLLoader(getClass().getResource("EliminarProducto.fxml"));
                 
                 Parent root = loader.load();
                 
                 EliminarProductoController controlador = loader.getController();
                 
                 ArrayList<Producto> listaProd = this.getSistema().getEchoShop().getListaDeProductosEnStock();
                 
                 controlador.cargarArticulos(listaProd, controlador, sistema);
                 
                 Scene escena = new Scene(root);
                 
                 Stage stage = new Stage();
                 
                 stage.setScene(escena);
                 
                 stage.show();
                 
                 stage.setHeight(675);
                 
                 stage.setWidth(366);
                 
                 stage.setResizable(false);
                 
                 controlador.setSistema(sistema);
                 
                 stage.setOnCloseRequest(e -> controlador.cerrarVentana());
                 
                 Stage myStage = (Stage) this.btnAgregarEnvase.getScene().getWindow();
                 myStage.close();
             } catch (IOException ex) {
                 Logger.getLogger(MenuController.class.getName()).log(Level.SEVERE, null, ex);
             }
          
        } else {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("¡Cuidado!");
            alert.setHeaderText("Error: no hay envases");
            alert.setContentText("¡No hay productos en el sistema para eliminar!");
            alert.showAndWait();
        }

    }

    @FXML
    private void volverInicio(ActionEvent event) {
        
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

            Stage myStage = (Stage) this.btnAgregarEnvase.getScene().getWindow();
            myStage.close();
        } catch (IOException ex) {
            Logger.getLogger(MenuController.class.getName()).log(Level.SEVERE, null, ex);
        }

        

    }

    public Sistema getSistema() {
        return sistema;
    }

    public void setSistema(Sistema sistema) {
        this.sistema = sistema;
    }

}
