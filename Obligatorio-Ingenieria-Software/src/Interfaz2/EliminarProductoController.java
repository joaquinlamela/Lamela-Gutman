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
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author user
 */
public class EliminarProductoController implements Initializable {

    @FXML
    private JFXButton btnEliminar;
    @FXML
    private JFXButton btnAtras;
    @FXML
    private JFXButton btnInicio;
    @FXML
    private TableView<Producto> tablaDeProductos;

    private Sistema sistema;

    private ObservableList<Producto> listaDeProductos;
    @FXML
    private TableColumn<Producto, String> clNombre;
    @FXML
    private TableColumn<Producto, String> clIdentificador;
    @FXML
    private TableColumn<Producto, Integer> clPrecio;
    @FXML
    private TableColumn<Producto, Integer> clCantVendidos;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        this.tablaDeProductos.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
        listaDeProductos = FXCollections.observableArrayList();

    }
    
    /*

    public void cargarArticulos(ArrayList<Producto> lista, Sistema sistema) {

        this.productosMasVendidos.getChildren().clear();

        this.productosMasVendidos.setSpacing(20);

        for (int i = 0; i < listaProductos.size(); i++) {

            try {
                Producto producto = listaProductos.get(i);
                //Cargarart el objeto

                FXMLLoader fxml = new FXMLLoader(getClass().getResource("ProductosAEliminar.fxml"));

                Parent nodo = fxml.load();

                //Carga los datos
                ProductosAEliminarController controlador = fxml.getController();

                controlador.inicializarDatos(producto, sistema, paraCargarDevuelta);

                controlador.setSistema(sistema);

                //Cargo el nuevo objeto
                this.productosMasVendidos.getChildren().add((Node) nodo);

            } catch (IOException ex) {
                Logger.getLogger(TopVentasController.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }
    */

    /*
    public void cargarDatos(ArrayList<Producto> lista, Sistema sistema) {
       
        this.setSistema(sistema);
        if (this.getSistema().getEchoShop().getListaDeProductosEnStock().size() == 0) {

            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("¡Cuidado!");
            alert.setHeaderText("Error: no hay envases");
            alert.setContentText("¡No hay productos en el sistema para eliminar!");
            alert.showAndWait();
        } else {

            this.clNombre.setCellValueFactory(new PropertyValueFactory("nombre"));
            this.clIdentificador.setCellValueFactory(new PropertyValueFactory("codigoIdentificador"));
            this.clPrecio.setCellValueFactory(new PropertyValueFactory("precio"));
            this.clCantVendidos.setCellValueFactory(new PropertyValueFactory("cantidadVendidos"));

            for (int i = 0; i < this.getSistema().getEchoShop().getListaDeProductosEnStock().size(); i++) {
                    listaDeProductos.add(lista.get(i)); 
                    // listaDeProductos.add(this.getSistema().getEchoShop().getListaDeProductosEnStock().get(i));
            }

            this.tablaDeProductos.setItems(listaDeProductos);
        }
    }
     */
    @FXML
    private void eliminarProductoSeleccionado(ActionEvent event) {

        //Parte de eliminar los productos seleccionados
        boolean esValido = true;

        ArrayList<Producto> listaProducto = new ArrayList<Producto>();

        if (tablaDeProductos.getItems().isEmpty()) {
            esValido = false;
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("¡Cuidado!");
            alert.setHeaderText("Error: no hay envases");
            alert.setContentText("¡Debe ingresar envases al sistema!");
            alert.showAndWait();
        } else {
            ObservableList<Dominio.Producto> lista = (ObservableList<Dominio.Producto>) this.tablaDeProductos.getSelectionModel().getSelectedItems();
            if (lista.isEmpty()) {
                esValido = false;
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("¡Cuidado!");
                alert.setHeaderText("Error: no ha seleccionado los envases");
                alert.setContentText("¡Debe seleccionar envases para poder ingresar el producto!");
                alert.showAndWait();
            }

            for (int i = 0; i < lista.size(); i++) {
                listaProducto.add(lista.get(i));
            }

        }

        for (int i = 0; i < listaProducto.size(); i++) {
            Producto prodAElim = this.getSistema().getEchoShop().getListaDeProductosEnStock().get(i);
            this.getSistema().getEchoShop().eliminarProductoSinImportarStock(prodAElim);

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

    @FXML
    private void seleccionarElementoAEliminar(SortEvent<?> event) {

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

            Stage myStage = (Stage) this.btnEliminar.getScene().getWindow();
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
