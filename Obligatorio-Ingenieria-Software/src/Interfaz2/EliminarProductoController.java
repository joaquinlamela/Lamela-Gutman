/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz2;

import Dominio.Producto;
import Dominio.Sistema;
import com.jfoenix.controls.JFXButton;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.SortEvent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author user
 */
public class EliminarProductoController implements Initializable {

    @FXML
    private JFXButton btnAtras;

    @FXML
    private JFXButton btnInicio;

    private Sistema sistema;

    @FXML
    private VBox listaProductos;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }

    public void cargarArticulos(ArrayList<Producto> lista, EliminarProductoController paraCargarDevuelta, Sistema sis) {

        this.setSistema(sis);
        this.listaProductos.getChildren().clear();

        this.listaProductos.setSpacing(10);

        for (int i = 0; i < lista.size(); i++) {

            try {
                Producto producto = lista.get(i);
                //Cargarart el objeto

                FXMLLoader fxml = new FXMLLoader(getClass().getResource("ProductosAEliminar.fxml"));

                Parent nodo = fxml.load();

                //Carga los datos
                ProductosAEliminarController controlador = fxml.getController();

                controlador.setSistema(sistema);

                controlador.inicializarDatos(producto, sistema, paraCargarDevuelta);

                //Cargo el nuevo objeto
                this.listaProductos.getChildren().add((Node) nodo);

            } catch (IOException ex) {
                Logger.getLogger(TopVentasController.class.getName()).log(Level.SEVERE, null, ex);
            }

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

            Stage myStage = (Stage) this.btnAtras.getScene().getWindow();
            myStage.close();
        } catch (IOException ex) {
            Logger.getLogger(EliminarProductoController.class.getName()).log(Level.SEVERE, null, ex);
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

            Stage myStage = (Stage) this.btnAtras.getScene().getWindow();
            myStage.close();
        } catch (IOException ex) {
            Logger.getLogger(EliminarProductoController.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public Sistema getSistema() {
        return sistema;
    }

    public void setSistema(Sistema sistema) {
        this.sistema = sistema;
    }

}
