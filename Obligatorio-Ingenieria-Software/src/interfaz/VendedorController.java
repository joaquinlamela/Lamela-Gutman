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
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
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
public class VendedorController implements Initializable {

    @FXML
    private JFXButton btnAgregarProducto;
    @FXML
    private JFXButton btnAgregarTienda;
    @FXML
    private JFXButton btnAgregarEnvase;
    @FXML
    private JFXButton btnEliminarProducto;
    @FXML
    private JFXButton btnTopVentas;
    @FXML
    private JFXButton btnVentasPorMes;
    @FXML
    private JFXButton btnEstadisticas;
    @FXML
    private JFXButton btnMenu;
    @FXML
    private JFXButton btnInicio;

    private Sistema sistema;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
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
            Logger.getLogger(VendedorController.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @FXML
    private void agregarTienda(ActionEvent event) {

        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("AgregadoSucursal.fxml"));

            Parent root = loader.load();

            AgregadoSucursalController controlador = loader.getController();

            controlador.cargarProductos(sistema);

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
            Logger.getLogger(VendedorController.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(VendedorController.class.getName()).log(Level.SEVERE, null, ex);
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
                Logger.getLogger(VendedorController.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("¡Cuidado!");
            alert.setHeaderText("Error: no hay hay productos");
            alert.setContentText("¡No hay productos en el sistema para eliminar!");
            alert.showAndWait();
        }

    }

    @FXML
    private void topVentas(ActionEvent event) {

        if (!this.getSistema().getEchoShop().getListaDeProductosEnStock().isEmpty()) {
            if (!this.getSistema().getListaDeVentasDelSitema().isEmpty()) {
                try {
                    FXMLLoader loader = new FXMLLoader(getClass().getResource("TopVentas.fxml"));

                    Parent root = loader.load();

                    TopVentasController controlador = loader.getController();

                    ArrayList<Producto> los5MasVendidosInversa = this.getSistema().getEchoShop().obtenerLos5MasVendidos();

                    controlador.cargarProductos(los5MasVendidosInversa, sistema);

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
                    Logger.getLogger(VendedorController.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {

                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("¡Cuidado!");
                alert.setHeaderText("Error: no hay productos vendidos en el sistema");
                alert.setContentText("¡No hay productos vendidos en el sistema!");
                alert.showAndWait();

            }
        } else {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("¡Cuidado!");
            alert.setHeaderText("Error: no hay productos en el sistema");
            alert.setContentText("¡No hay productos registrados en el sistema, de manera que no se pueden mostrar los mas vendidos!");
            alert.showAndWait();

        }

    }

    @FXML
    private void ventasPorMes(ActionEvent event) {

        if (!this.getSistema().getListaDeVentasDelSitema().isEmpty()) {
            try {
                FXMLLoader loader = new FXMLLoader(getClass().getResource("VentaPorMes.fxml"));

                Parent root = loader.load();

                VentaPorMesController controlador = loader.getController();

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
                Logger.getLogger(VendedorController.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("¡Cuidado!");
            alert.setHeaderText("Error: no hay productos vendidos en el sistema");
            alert.setContentText("¡No hay productos vendidos en el sistema!");
            alert.showAndWait();

        }

    }

    @FXML
    private void obtenerEstadisticas(ActionEvent event) {

        if (!this.getSistema().getListaDeVentasDelSitema().isEmpty()) {
            try {
                FXMLLoader loader = new FXMLLoader(getClass().getResource("Estadisticas.fxml"));

                Parent root = loader.load();

                EstadisticasController controlador = loader.getController();

                controlador.cargarGraficas(sistema);

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
                Logger.getLogger(VendedorController.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            if (!this.getSistema().getEnvasesALlevarEnVenta().isEmpty()) {
                try {
                    FXMLLoader loader = new FXMLLoader(getClass().getResource("EnvasesReutilizados.fxml"));

                    Parent root = loader.load();

                    EnvasesReutilizadosController controlador = loader.getController();

                    controlador.cargarGraficaEnvases(sistema);

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
                    Logger.getLogger(EstadisticasController.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                if (!this.getSistema().getListaDeVentasDelSitema().isEmpty()) {
                    try {
                        FXMLLoader loader = new FXMLLoader(getClass().getResource("GraficaDeVentaXMes.fxml"));

                        Parent root = loader.load();

                        GraficaDeVentaXMesController controlador = loader.getController();

                        controlador.cargarGraficaDeVentas(sistema);

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
                        Logger.getLogger(EstadisticasController.class.getName()).log(Level.SEVERE, null, ex);
                    }

                } else {
                    if (!this.getSistema().getListaDeVentasDelSitema().isEmpty()) {

                        try {
                            FXMLLoader loader = new FXMLLoader(getClass().getResource("Beneficios.fxml"));

                            Parent root = loader.load();

                            BeneficiosController controlador = loader.getController();

                            controlador.cargarGraficaDeBeneficios(sistema);

                            Scene escena = new Scene(root);

                            Stage stage = new Stage();

                            stage.setScene(escena);

                            stage.show();

                            stage.setHeight(675);

                            stage.setWidth(366);

                            stage.setResizable(false);

                            controlador.setSistema(sistema);

                            stage.setOnCloseRequest(e -> controlador.cerrarVentana());

                            Stage myStage = (Stage) this.btnAgregarTienda.getScene().getWindow();
                            myStage.close();
                        } catch (IOException ex) {
                            Logger.getLogger(EstadisticasController.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    } else {
                        Alert alert = new Alert(Alert.AlertType.ERROR);
                        alert.setTitle("¡Cuidado!");
                        alert.setHeaderText("Error: no hay ventas");
                        alert.setContentText("¡No hay ventas registradas en el sistema!");
                        alert.showAndWait();
                    }
                }
            }
        }

    }

    @FXML
    private void irAMenu(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Menu.fxml"));

            Parent root = loader.load();

            MenuController controlador = loader.getController();

            Scene escena = new Scene(root);

            Stage stage = new Stage();

            stage.setScene(escena);

            stage.show();

            stage.setHeight(675);

            stage.setWidth(366);

            stage.setResizable(false);

            controlador.setSistema(sistema);

            Stage myStage = (Stage) this.btnAgregarEnvase.getScene().getWindow();
            myStage.close();

        } catch (IOException ex) {
            Logger.getLogger(InicioController.class.getName()).log(Level.SEVERE, null, ex);
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

            Stage myStage = (Stage) this.btnAgregarEnvase.getScene().getWindow();
            myStage.close();

        } catch (IOException ex) {
            Logger.getLogger(InicioController.class.getName()).log(Level.SEVERE, null, ex);
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

            Stage myStage = (Stage) this.btnEliminarProducto.getScene().getWindow();
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

}
