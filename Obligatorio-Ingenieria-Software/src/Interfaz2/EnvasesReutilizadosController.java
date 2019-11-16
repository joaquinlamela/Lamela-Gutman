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
public class EnvasesReutilizadosController implements Initializable {

    @FXML
    private JFXButton btnMasVendidos;
    @FXML
    private JFXButton btnEnvasesRecomendados;
    @FXML
    private JFXButton btnVentasPorMes;
    @FXML
    private JFXButton btnBeneficios;
    @FXML
    private BarChart<?, ?> graficaEnvases;
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

    public void cargarGraficaEnvases(Sistema sistema) {

        this.setSistema(sistema);

        XYChart.Series set1 = new XYChart.Series<>();

        ArrayList<Envase> listaDeEnvases = this.getSistema().getEchoShop().getTodosLosEnvasesDisponibles();

        for (int i = 0; i < listaDeEnvases.size(); i++) {

            String nombreEnvase = listaDeEnvases.get(i).getNombre();
            int maximoPesoEnvase = listaDeEnvases.get(i).getPesoMaximoSoportado();
            set1.getData().add(new XYChart.Data(nombreEnvase, maximoPesoEnvase));
            graficaEnvases.getData().add(set1);
        }
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
            Logger.getLogger(EnvasesReutilizadosController.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(EnvasesReutilizadosController.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @FXML
    private void mostrarBeneficios(ActionEvent event) {

        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Beneficios.fxml"));

            Parent root = loader.load();

            BeneficiosController controlador = loader.getController();

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
            Logger.getLogger(EnvasesReutilizadosController.class.getName()).log(Level.SEVERE, null, ex);
        }

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

            stage.setOnCloseRequest(e -> controlador.cerrarVentana());

            Stage myStage = (Stage) this.btnAtras.getScene().getWindow();
            myStage.close();
        } catch (IOException ex) {
            Logger.getLogger(EnvasesReutilizadosController.class.getName()).log(Level.SEVERE, null, ex);
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

            stage.setOnCloseRequest(e -> controlador.cerrarVentana());

            Stage myStage = (Stage) this.btnAtras.getScene().getWindow();
            myStage.close();
        } catch (IOException ex) {
            Logger.getLogger(EnvasesReutilizadosController.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public Sistema getSistema() {
        return sistema;
    }

    public void setSistema(Sistema sistema) {
        this.sistema = sistema;
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
            Logger.getLogger(EnvasesReutilizadosController.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
