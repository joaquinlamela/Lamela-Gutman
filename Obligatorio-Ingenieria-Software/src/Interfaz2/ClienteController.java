/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz2;

import Dominio.Sistema;
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
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import Dominio.Producto;
import javafx.scene.Node;

/**
 * FXML Controller class
 *
 * @author user
 */
public class ClienteController implements Initializable {

    @FXML
    private VBox vBox;
    @FXML
    private JFXButton btnCarrito;

    private Sistema sistema;

    @FXML
    private JFXButton btnMenu;
    @FXML
    private JFXButton btnIrAInicio;
    @FXML
    private ScrollPane scrollPane;
    @FXML
    private JFXButton btnMapa;
    @FXML
    private JFXButton btnMercado;
    @FXML
    private JFXButton btnTopVentas;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       
        
    }

    @FXML
    private void irAlCarrito(ActionEvent event) {
    }

    @FXML
    private void irAlMapa(ActionEvent event) {
    }

    @FXML
    private void irAlMercado(ActionEvent event) {
    }

    @FXML
    private void topVentas(ActionEvent event) {
    }

    @FXML
    private void irAlMenu(ActionEvent event) {
    }

    @FXML
    private void irAInicio(ActionEvent event) {
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

            Stage myStage = (Stage) this.btnCarrito.getScene().getWindow();
            myStage.close();

        } catch (IOException ex) {
            Logger.getLogger(VendedorController.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public Sistema getSistema() {
        return sistema;
    }

    public void setSistema(Sistema sistema) {
        this.sistema = sistema;
    }

    
    public void cargarProductos(ArrayList<Producto> listaProductos) {
        this.vBox.getChildren().clear();
       
        this.vBox.setSpacing(20);

        for (int i = 0; i < listaProductos.size(); i++) {

            try {
                Producto producto = listaProductos.get(i);
                //Cargarart el objeto

                FXMLLoader fxml = new FXMLLoader(getClass().getResource("Productos.fxml"));

                Parent nodo = fxml.load();

                //Carga los datos
                ProductosController controlador = fxml.getController();

                controlador.inicializarDatos(producto, sistema);

                controlador.setSistema(sistema);

                //Cargo el nuevo objeto
                
                vBox.getChildren().add((Node)nodo);

            } catch (IOException ex) {
                Logger.getLogger(ClienteController.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

    }
    
}


