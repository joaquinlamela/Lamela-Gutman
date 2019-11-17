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
import java.nio.file.Paths;
import java.util.Collections;
import javafx.scene.Node;
import javafx.scene.control.Alert;
import javafx.scene.web.WebView;

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
        
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Carrito.fxml"));

            Parent root = loader.load();

            CarritoController controlador = loader.getController();

            Scene escena = new Scene(root);

            Stage stage = new Stage();

            stage.setScene(escena);

            stage.show();

            stage.setHeight(675);

            stage.setWidth(366);

            stage.setResizable(false);

            controlador.setSistema(sistema);

            controlador.cargarProductos(this.getSistema().getProductosAVenderEnSesionActiva(), sistema, controlador, this.getSistema().getCantidadPorIdDeProd());

            stage.setOnCloseRequest(e -> controlador.cerrarVentana());

            Stage myStage = (Stage) this.btnCarrito.getScene().getWindow();
            myStage.close();
        } catch (IOException ex) {
            Logger.getLogger(ClienteController.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @FXML
    private void irAlMapa(ActionEvent event) {

        WebView webView = new WebView();
        webView.getEngine().load("file:" + Paths.get("").toAbsolutePath().toString() + "/src/CarpetaMapa/MapaNuevo.html");
        VBox vBox = new VBox(webView);
        Scene scene = new Scene(vBox, 600, 400);

        Stage primaryStage = new Stage();
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    @FXML
    private void irAlMercado(ActionEvent event) {

        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("PreVenta.fxml"));

            Parent root = loader.load();

            PreVentaController controlador = loader.getController();

            Scene escena = new Scene(root);

            Stage stage = new Stage();

            stage.setScene(escena);

            stage.show();

            stage.setHeight(675);

            stage.setWidth(366);

            stage.setResizable(false);

            controlador.setSistema(sistema);

            controlador.cargarProductos(this.getSistema().getProductosPreVentaSesionActiva(), sistema, controlador, this.getSistema().getCantidadPorIdDePreVenta());

            stage.setOnCloseRequest(e -> controlador.cerrarVentana());

            Stage myStage = (Stage) this.btnCarrito.getScene().getWindow();
            myStage.close();
        } catch (IOException ex) {
            Logger.getLogger(ClienteController.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
    //MODIFICARRRRRR: 

    @FXML
    private void topVentas(ActionEvent event) {
        if (!this.getSistema().getListaDeVentasDelSitema().isEmpty()) {
            try {
                FXMLLoader loader = new FXMLLoader(getClass().getResource("TopVentas.fxml"));

                Parent root = loader.load();

                TopVentasController controlador = loader.getController();

                
                /*
                ArrayList<Producto> todosLosProductosDelSistema = this.getSistema().getEchoShop().getListaDeProductosEnStock();

                ArrayList<Producto> los5MasVendidosInversa = new ArrayList<>();

                Producto producto = new Producto();

                for (int i = 0; i < 5; i++) {
                    Producto prodANoAgregar = new Producto();
                    producto = this.getSistema().getEchoShop().obtenerElMasVendidos(todosLosProductosDelSistema);
                    if (!(producto.getCodigoIdentificador()== prodANoAgregar.getCodigoIdentificador() && producto.getNombre().equals(prodANoAgregar.getNombre()))) {
                        los5MasVendidosInversa.add(producto);
                    }
                }

                
                Collections.reverse(los5MasVendidosInversa); 
                */ 
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

                stage.setOnCloseRequest(e -> controlador.cerrarVentana2());

                Stage myStage = (Stage) this.btnCarrito.getScene().getWindow();
                myStage.close();
            } catch (IOException ex) {
                Logger.getLogger(VendedorController.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("¡Cuidado!");
            alert.setHeaderText("Error: no hay ventas disponibles en el sistema");
            alert.setContentText("¡No se han realizado ventas en el sistema!");
            alert.showAndWait();
        }
        
        
    }

    @FXML
    private void irAlMenu(ActionEvent event) {
    }

    @FXML
    private void irAInicio(ActionEvent event) {

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
            Logger.getLogger(ClienteController.class.getName()).log(Level.SEVERE, null, ex);
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

            Stage myStage = (Stage) this.btnCarrito.getScene().getWindow();
            myStage.close();
        } catch (IOException ex) {
            Logger.getLogger(ClienteController.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public Sistema getSistema() {
        return sistema;
    }

    public void setSistema(Sistema sistema) {
        this.sistema = sistema;
    }

    public void cargarProductos(ArrayList<Producto> listaProductos, Sistema sis) {

        this.setSistema(sis);
        this.vBox.getChildren().clear();

        this.vBox.setSpacing(10);

        for (int i = 0; i < listaProductos.size(); i++) {

            try {
                Producto producto = listaProductos.get(i);
                //Cargarart el objeto

                FXMLLoader fxml = new FXMLLoader(getClass().getResource("PresentacionProductos.fxml"));

                Parent nodo = fxml.load();

                //Carga los datos
                PresentacionProductosController controlador = fxml.getController();

                controlador.inicializarDatos(producto, sistema);

                controlador.setSistema(sistema);

                //Cargo el nuevo objeto
                vBox.getChildren().add((Node) nodo);

            } catch (IOException ex) {
                Logger.getLogger(ClienteController.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

    }

}
