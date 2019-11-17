/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz2;

import Dominio.Envase;
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
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author user
 */
public class GraficaDeVentaXMesController implements Initializable {

    @FXML
    private JFXButton btnMasVendidos;
    @FXML
    private JFXButton btnEnvasesRecomendados;
    @FXML
    private JFXButton btnVentasPorMes;
    @FXML
    private JFXButton btnBeneficios;
    @FXML
    private BarChart<String, Integer> graficaVentas;
    @FXML
    private NumberAxis y;
    @FXML
    private CategoryAxis x;
    @FXML
    private JFXButton btnAtras;
    @FXML
    private JFXButton btnInicio;

    private Sistema sistema;

    //Get and set de sistema: 
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
    private void mostrarMasVendidos(ActionEvent event) {

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

            Stage myStage = (Stage) this.btnAtras.getScene().getWindow();
            myStage.close();
        } catch (IOException ex) {
            Logger.getLogger(GraficaDeVentaXMesController.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @FXML
    private void envasesUtilizados(ActionEvent event) {

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

            Stage myStage = (Stage) this.btnAtras.getScene().getWindow();
            myStage.close();
        } catch (IOException ex) {
            Logger.getLogger(GraficaDeVentaXMesController.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @FXML
    private void ventasPorMes(ActionEvent event) {

    }

    @FXML
    private void mostrarBeneficios(ActionEvent event) {

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

            Stage myStage = (Stage) this.btnAtras.getScene().getWindow();
            myStage.close();
        } catch (IOException ex) {
            Logger.getLogger(GraficaDeVentaXMesController.class.getName()).log(Level.SEVERE, null, ex);
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

            Stage myStage = (Stage) this.btnAtras.getScene().getWindow();
            myStage.close();
        } catch (IOException ex) {
            Logger.getLogger(GraficaDeVentaXMesController.class.getName()).log(Level.SEVERE, null, ex);
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

            Stage myStage = (Stage) this.btnAtras.getScene().getWindow();
            myStage.close();
        } catch (IOException ex) {
            Logger.getLogger(GraficaDeVentaXMesController.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(GraficaDeVentaXMesController.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void cargarGraficaDeVentas(Sistema sistema) {

        this.setSistema(sistema);

        XYChart.Series set1 = new XYChart.Series<>();

        int cantidadDeVentas = 0;

        for (int i = 1; i <= 12; i++) {

            cantidadDeVentas = this.getSistema().getVentasPorMes()[i-1];
            set1.getData().add(new XYChart.Data(Integer.toString(i), cantidadDeVentas));

        }
        this.graficaVentas.getData().add(set1);
    }

}
