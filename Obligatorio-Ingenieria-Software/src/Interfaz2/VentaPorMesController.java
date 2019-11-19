/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz2;

import Dominio.Envase;
import Dominio.Sistema;
import Dominio.Venta;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXDatePicker;
import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.util.Date;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
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
public class VentaPorMesController implements Initializable {

    @FXML
    private JFXButton btnInicio;
    @FXML
    private JFXButton btnAtras;
    @FXML
    private TableView<Venta> tablaDeProductosPorFecha;

    private Sistema sistema;

    @FXML
    private JFXDatePicker fechaSeleccionada;
    @FXML
    private TableColumn<Venta, Integer> columnaIdentificador;
    @FXML
    private TableColumn<Venta, Integer> columnaCantidad;
    @FXML
    private TableColumn<Venta, Double> columnaPrecio;
    @FXML
    private TableColumn<Venta, Date> columnaFecha;

    private ObservableList<Venta> listaDeVenta;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        this.fechaSeleccionada.setValue(LocalDate.now());
        listaDeVenta = FXCollections.observableArrayList();
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
            Logger.getLogger(TopVentasController.class.getName()).log(Level.SEVERE, null, ex);
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

            Stage myStage = (Stage) this.btnAtras.getScene().getWindow();
            myStage.close();
        } catch (IOException ex) {
            Logger.getLogger(TopVentasController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void productosPorFecha(SortEvent<?> event) {
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

            Stage myStage = (Stage) this.tablaDeProductosPorFecha.getScene().getWindow();
            myStage.close();
        } catch (IOException ex) {
            Logger.getLogger(VentaPorMesController.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public Sistema getSistema() {
        return sistema;
    }

    public void setSistema(Sistema sistema) {
        this.sistema = sistema;
    }

    @FXML
    private void seleccionoFecha(ActionEvent event) {

        if (this.getSistema().getListaDeVentasDelSitema().isEmpty()) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("¡Cuidado!");
            alert.setHeaderText("Error: no hay ventas en el sistema");
            alert.setContentText("¡No hay ventas realizadas en el sistema!");
            alert.showAndWait();
        } else {
            this.columnaIdentificador.setCellValueFactory(new PropertyValueFactory("codigoIdentificadorDeVenta"));
            this.columnaPrecio.setCellValueFactory(new PropertyValueFactory("precioTotal"));
            this.columnaFecha.setCellValueFactory(new PropertyValueFactory("fechaDeCompra"));

            int mesDeVenta = this.fechaSeleccionada.getValue().getMonthValue();

            for (int i = 0; i < this.getSistema().getListaDeVentasDelSitema().size(); i++) {
                int mesFechaDeCompra = this.getSistema().getListaDeVentasDelSitema().get(i).getFechaDeCompra().getMonth() + 1;
                if (mesFechaDeCompra == mesDeVenta) {
                    listaDeVenta.add(this.getSistema().getListaDeVentasDelSitema().get(i));
                }

            }

            this.tablaDeProductosPorFecha.setItems(listaDeVenta);
        }

    }

}
