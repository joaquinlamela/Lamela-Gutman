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
import javafx.scene.control.Alert;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author user
 */
public class EstadisticasController implements Initializable {

    @FXML
    private JFXButton btnInicio;
    @FXML
    private JFXButton btnAtras;

    private Sistema sistema;
    @FXML
    private JFXButton btnMasVendidos;
    @FXML
    private JFXButton btnEnvasesRecomendados;
    @FXML
    private JFXButton btnVentasPorMes;
    @FXML
    private JFXButton btnBeneficios;
    @FXML
    private BarChart<?, ?> graficaMasVendidos;
    @FXML
    private NumberAxis y;
    @FXML
    private CategoryAxis x;

    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        
        /*
        XYChart.Series set1 = new XYChart.Series<>();

        ArrayList<Producto> listaProductos = this.getSistema().getEchoShop().obtenerLos5MasVendidos(this.getSistema().getEchoShop().getListaDeProductosEnStock());

        for (int i = 0; i < listaProductos.size(); i++) {
            String nombreProd = listaProductos.get(i).getNombre();
            int cantVendidos = listaProductos.get(i).getCantidadVendidos();
            set1.getData().add(new XYChart.Data(nombreProd, cantVendidos));
            graficaMasVendidos.getData().add(set1);
        }
        */ 

    }
    
    public void cargarGraficas(Sistema sistema){
        
        this.setSistema(sistema);
        
        XYChart.Series set1 = new XYChart.Series<>();

        ArrayList<Producto> listaProductos = this.getSistema().getEchoShop().obtenerLos5MasVendidos(this.getSistema().getEchoShop().getListaDeProductosEnStock());

        for (int i = 0; i < listaProductos.size(); i++) {
            String nombreProd = listaProductos.get(i).getNombre();
            int cantVendidos = listaProductos.get(i).getCantidadVendidos();
            set1.getData().add(new XYChart.Data(nombreProd, cantVendidos));
            graficaMasVendidos.getData().add(set1);
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
            Logger.getLogger(EstadisticasController.class.getName()).log(Level.SEVERE, null, ex);
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

            Stage myStage = (Stage) this.btnAtras.getScene().getWindow();
            myStage.close();
        } catch (IOException ex) {
            Logger.getLogger(EstadisticasController.class.getName()).log(Level.SEVERE, null, ex);
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

            Stage myStage = (Stage) this.btnInicio.getScene().getWindow();
            myStage.close();
        } catch (IOException ex) {
            Logger.getLogger(EstadisticasController.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public Sistema getSistema() {
        return sistema;
    }

    public void setSistema(Sistema sistema) {
        this.sistema = sistema;
    }

    @FXML
    private void mostrarMasVendidos(ActionEvent event) {
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
            Logger.getLogger(EstadisticasController.class.getName()).log(Level.SEVERE, null, ex);
        }

        
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
            Logger.getLogger(EstadisticasController.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(EstadisticasController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

}
