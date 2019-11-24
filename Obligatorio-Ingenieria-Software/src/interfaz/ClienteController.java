/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import dominio.Sistema;
import com.jfoenix.controls.JFXButton;
import dominio.Persona;
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
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import dominio.Producto;
import javafx.scene.Node;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;

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
    @FXML
    private Label txtCarrito;
    @FXML
    private Label txtPreventa;
    private Persona cliente;

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
            controlador.setCliente(this.getCliente());
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
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Mapa.fxml"));
            Parent root = loader.load();
            MapaController controlador = loader.getController();
            Scene escena = new Scene(root);
            Stage stage = new Stage();
            stage.setScene(escena);
            stage.show();
            stage.setHeight(675);
            stage.setWidth(366);
            stage.setResizable(false);
            controlador.setSistema(sistema);
            controlador.setCliente(this.getCliente());
            stage.setOnCloseRequest(e -> controlador.cerrarVentana());
            Stage myStage = (Stage) this.btnCarrito.getScene().getWindow();
            myStage.close();
        } catch (IOException ex) {
            Logger.getLogger(ClienteController.class.getName()).log(Level.SEVERE, null, ex);
        }
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
            controlador.setCliente(this.getCliente());
            controlador.cargarProductos(this.getSistema().getProductosPreVentaSesionActiva(), sistema, controlador, this.getSistema().getCantidadPorIdDePreVenta());
            stage.setOnCloseRequest(e -> controlador.cerrarVentana());
            Stage myStage = (Stage) this.btnCarrito.getScene().getWindow();
            myStage.close();
        } catch (IOException ex) {
            Logger.getLogger(ClienteController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void topVentas(ActionEvent event) {
        if (!this.getSistema().getListaDeVentasDelSitema().isEmpty()) {
            try {
                FXMLLoader loader = new FXMLLoader(getClass().getResource("TopVentasCliente.fxml"));
                Parent root = loader.load();
                TopVentasClienteController controlador = loader.getController();
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
                controlador.setCliente(this.getCliente());
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
            this.getSistema().getProductosAVenderEnSesionActiva().clear();
            for (int i = 0; i < this.getSistema().getCantidadPorIdDeProd().length; i++) {
                this.getSistema().getCantidadPorIdDeProd()[i] = 0;
            }
            this.getSistema().getEnvasesALlevarEnVenta().clear();
            this.getSistema().getProductosPreVentaSesionActiva().clear();
            for (int i = 0; i < this.getSistema().getCantidadPorIdDePreVenta().length; i++) {
                this.getSistema().getCantidadPorIdDePreVenta()[i] = 0;
            }
            this.getSistema().getEnvasesALlevarEnPreVenta().clear();
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
            this.getSistema().getProductosAVenderEnSesionActiva().clear();
            for (int i = 0; i < this.getSistema().getCantidadPorIdDeProd().length; i++) {
                this.getSistema().getCantidadPorIdDeProd()[i] = 0;
            }
            this.getSistema().getEnvasesALlevarEnVenta().clear();
            this.getSistema().getProductosPreVentaSesionActiva().clear();
            for (int i = 0; i < this.getSistema().getCantidadPorIdDePreVenta().length; i++) {
                this.getSistema().getCantidadPorIdDePreVenta()[i] = 0;
            }
            this.getSistema().getEnvasesALlevarEnPreVenta().clear();
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
        this.txtCarrito.setText(this.getSistema().getProductosAVenderEnSesionActiva().size() + "");
        this.txtPreventa.setText(this.getSistema().getProductosPreVentaSesionActiva().size() + "");
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
                controlador.setCliente(this.getCliente());
                //Cargo el nuevo objeto
                vBox.getChildren().add((Node) nodo);
            } catch (IOException ex) {
                Logger.getLogger(ClienteController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
