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
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author user
 */
public class BeneficiosController implements Initializable {

    @FXML
    private JFXButton btnMasVendidos;
    @FXML
    private JFXButton btnEnvasesRecomendados;
    @FXML
    private JFXButton btnVentasPorMes;
    @FXML
    private JFXButton btnBeneficios;
    @FXML
    private BarChart<?, ?> graficaBeneficios;
    @FXML
    private NumberAxis y;
    @FXML
    private CategoryAxis x;
    @FXML
    private JFXButton btnAtras;
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
    private void mostrarMasVendidos(ActionEvent event) {

        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Estadisticas.fxml"));

            Parent root = loader.load();

            EstadisticasController controlador = loader.getController();

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
            Logger.getLogger(BeneficiosController.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @FXML
    private void envasesUtilizados(ActionEvent event) {
    }

    @FXML
    private void ventasPorMes(ActionEvent event) {

        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("GraficaDeVentaXMes.fxml"));

            Parent root = loader.load();

            GraficaDeVentaXMesController controlador = loader.getController();

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
            Logger.getLogger(BeneficiosController.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @FXML
    private void mostrarBeneficios(ActionEvent event) {

    }

    @FXML
    private void volverVentanaAnterior(ActionEvent event) {

        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Cliente.fxml"));

            Parent root = loader.load();

            ClienteController controlador = loader.getController();

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
            Logger.getLogger(BeneficiosController.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @FXML
    private void volverAInicio(ActionEvent event) {

        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Cliente.fxml"));

            Parent root = loader.load();

            ClienteController controlador = loader.getController();

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
            Logger.getLogger(BeneficiosController.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void cerrarVentana() {

        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Cliente.fxml"));

            Parent root = loader.load();

            ClienteController controlador = loader.getController();

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
            Logger.getLogger(BeneficiosController.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public Sistema getSistema() {
        return sistema;
    }

    public void setSistema(Sistema sistema) {
        this.sistema = sistema;
    }

}
