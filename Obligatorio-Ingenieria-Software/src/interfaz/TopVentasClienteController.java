/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;
import com.jfoenix.controls.JFXButton;
import dominio.Persona;
import dominio.Producto;
import dominio.Sistema;
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
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
/**
 * FXML Controller class
 *
 * @author user
 */
public class TopVentasClienteController implements Initializable {
    @FXML
    private JFXButton btnAtras;
    @FXML
    private JFXButton btnInicio;
    @FXML
    private VBox productosMasVendidos;
    private Sistema sistema;
    private Persona cliente;
    public Sistema getSistema() {
        return sistema;
    }
    public void setSistema(Sistema sistema) {
        this.sistema = sistema;
    }
    public Persona getCliente() {
        return cliente;
    }
    public void setCliente(Persona cliente) {
        this.cliente = cliente;
    }
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
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
            controlador.setCliente(this.getCliente());
            controlador.cargarProductos(this.getSistema().getEchoShop().getListaDeProductosEnStock(), sistema);
            stage.setOnCloseRequest(e -> controlador.cerrarVentana());
            Stage myStage = (Stage) this.btnAtras.getScene().getWindow();
            myStage.close();
        } catch (IOException ex) {
            Logger.getLogger(TopVentasClienteController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    @FXML
    private void volverInicio(ActionEvent event) {
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
            controlador.setCliente(this.getCliente());
            controlador.cargarProductos(this.getSistema().getEchoShop().getListaDeProductosEnStock(), sistema);
            stage.setOnCloseRequest(e -> controlador.cerrarVentana());
            Stage myStage = (Stage) this.btnAtras.getScene().getWindow();
            myStage.close();
        } catch (IOException ex) {
            Logger.getLogger(TopVentasClienteController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void cerrarVentana2() {
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
            controlador.setCliente(this.getCliente());
            controlador.cargarProductos(this.getSistema().getEchoShop().getListaDeProductosEnStock(), sistema);
            stage.setOnCloseRequest(e -> controlador.cerrarVentana());
            Stage myStage = (Stage) this.btnAtras.getScene().getWindow();
            myStage.close();
        } catch (IOException ex) {
            Logger.getLogger(CarritoController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void cargarProductos(ArrayList<Producto> listaProductos, Sistema sis) {
        this.setSistema(sis);
        this.productosMasVendidos.getChildren().clear();
        this.productosMasVendidos.setSpacing(10);
        for (int i = 0; i < listaProductos.size(); i++) {
            try {
                Producto producto = listaProductos.get(i);
                //Cargarart el objeto
                FXMLLoader fxml = new FXMLLoader(getClass().getResource("MasVendidos.fxml"));
                Parent nodo = fxml.load();
                //Carga los datos
                MasVendidosController controlador = fxml.getController();
                controlador.inicializarDatos(producto, sistema);
                controlador.setSistema(sistema);
                //Cargo el nuevo objeto
                this.productosMasVendidos.getChildren().add((Node) nodo);
            } catch (IOException ex) {
                Logger.getLogger(TopVentasController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
