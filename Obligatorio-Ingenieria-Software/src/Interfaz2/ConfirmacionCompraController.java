/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz2;

import Dominio.Envase;
import Dominio.Producto;
import Dominio.Sistema;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXDatePicker;
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
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author user
 */
public class ConfirmacionCompraController implements Initializable {

    @FXML
    private JFXButton btnConfirmar;
    @FXML
    private JFXButton btnInicio;
    @FXML
    private Label nombreCliente;
    @FXML
    private ComboBox<?> numeroSucursal;
    @FXML
    private Label direccionSucursal;
    @FXML
    private JFXDatePicker fechaRetiro;
   
     @FXML
    private Label precioTotal;

    @FXML
    private VBox listaDeEnvases;
    
    

    private Sistema sistema;

   
    public Sistema getSistema() {
        return sistema;
    }

    public void setSistema(Sistema sistema) {
        this.sistema = sistema;
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void confirmarVenta(ActionEvent event) {
    }

    @FXML
    private void volverInicio(ActionEvent event) {
    }

    public void cargarProductos(ArrayList<Envase> lista, Sistema sis, ConfirmacionCompraController paraCargarPestañaCarrito) {

        this.setSistema(sis);

        this.listaDeEnvases.getChildren().clear();

        this.listaDeEnvases.setSpacing(10);

        for (int i = 0; i < lista.size(); i++) {

            try {
                Envase envase= lista.get(i);
                //Cargarart el objeto

                FXMLLoader fxml = new FXMLLoader(getClass().getResource("EnvasesParaConfirmacionDePreventa.fxml"));

                Parent nodo = fxml.load();

                //Carga los datos
                EnvasesParaConfirmacionDePreventaController controlador = fxml.getController();

                controlador.inicializarDatos2(envase, sistema, paraCargarPestañaCarrito);

                controlador.setSistema(sistema);

                //Cargo el nuevo objeto
                this.listaDeEnvases.getChildren().add((Node) nodo);

            } catch (IOException ex) {
                Logger.getLogger(ClienteController.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

    }
    
    
    
    public void cerrarVentana() {

        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("PreVenta.fxml"));

            Parent root = loader.load();

            PreVentaController controlador = loader.getController();

            Scene escena = new Scene(root);

            Stage stage = new Stage();

            stage.setScene(escena);

            stage.show();

            stage.setHeight(675);

            stage.setWidth(366);

            stage.setResizable(false);

            controlador.setSistema(sistema);

            controlador.cargarProductos(this.getSistema().getProductosPreVentaSesionActiva(), sistema, controlador, this.getSistema().getCantidadPorIdDePreVenta());

            stage.setOnCloseRequest(e -> controlador.cerrarVentana());

            Stage myStage = (Stage) this.btnConfirmar.getScene().getWindow();
            myStage.close();
        } catch (IOException ex) {
            Logger.getLogger(PreVentaController.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
