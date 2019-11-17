/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz2;

import Dominio.Envase;
import Dominio.Persona;
import Dominio.Producto;
import Dominio.Sistema;
import Dominio.Tienda;
import Dominio.Venta;
import com.jfoenix.controls.JFXButton;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Date;
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
import javafx.scene.control.Alert;
import javafx.scene.layout.VBox;
import javafx.scene.web.WebView;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author user
 */
public class CarritoController implements Initializable {

    @FXML
    private JFXButton btnAtras;
    @FXML
    private JFXButton btnInicio;
    @FXML
    private VBox listaProductos;

    private Sistema sistema;

    @FXML
    private JFXButton btnCancelar;
    @FXML
    private JFXButton btnConfirmar;

    //Gets and sets
    public JFXButton getBtnAtras() {
        return btnAtras;
    }

    public void setBtnAtras(JFXButton btnAtras) {
        this.btnAtras = btnAtras;
    }

    public JFXButton getBtnInicio() {
        return btnInicio;
    }

    public void setBtnInicio(JFXButton btnInicio) {
        this.btnInicio = btnInicio;
    }

    public VBox getListaProductos() {
        return listaProductos;
    }

    public void setListaProductos(VBox listaProductos) {
        this.listaProductos = listaProductos;
    }

    public Sistema getSistema() {
        return sistema;
    }

    public void setSistema(Sistema sistema) {
        this.sistema = sistema;
    }

    //Metodos: 
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
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

            controlador.cargarProductos(this.getSistema().getEchoShop().getListaDeProductosEnStock(), sistema);

            stage.setOnCloseRequest(e -> controlador.cerrarVentana());

            Stage myStage = (Stage) this.btnAtras.getScene().getWindow();
            myStage.close();
        } catch (IOException ex) {
            Logger.getLogger(CarritoController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void cargarProductos(ArrayList<Producto> lista, Sistema sis, CarritoController paraCargarPestañaCarrito, int[] cantidadPorId) {

        this.setSistema(sis);

        this.listaProductos.getChildren().clear();

        this.listaProductos.setSpacing(10);

        for (int i = 0; i < lista.size(); i++) {

            try {
                Producto producto = lista.get(i);
                //Cargarart el objeto

                FXMLLoader fxml = new FXMLLoader(getClass().getResource("ProductosCarrito.fxml"));

                Parent nodo = fxml.load();

                //Carga los datos
                ProductosCarritoController controlador = fxml.getController();

                controlador.inicializarDatos(producto, sistema, paraCargarPestañaCarrito, cantidadPorId);

                controlador.setSistema(sistema);

                //Cargo el nuevo objeto
                this.listaProductos.getChildren().add((Node) nodo);

            } catch (IOException ex) {
                Logger.getLogger(ClienteController.class.getName()).log(Level.SEVERE, null, ex);
            }
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

            controlador.cargarProductos(this.getSistema().getEchoShop().getListaDeProductosEnStock(), sistema);

            stage.setOnCloseRequest(e -> controlador.cerrarVentana());

            Stage myStage = (Stage) this.btnAtras.getScene().getWindow();
            myStage.close();
        } catch (IOException ex) {
            Logger.getLogger(CarritoController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void cancelarVenta(ActionEvent event) {
        for (int i = 0; i < this.getSistema().getProductosAVenderEnSesionActiva().size(); i++) {
            Producto p = this.getSistema().getProductosAVenderEnSesionActiva().get(i);
            this.getSistema().getProductosAVenderEnSesionActiva().remove(p);
        }
        for (int i = 0; i < this.getSistema().getCantidadPorIdDeProd().length; i++) {
            this.getSistema().getCantidadPorIdDeProd()[i] = 0;
        }
         for (int i = 0; i < this.getSistema().getEnvasesALlevarEnVenta().size(); i++) {
                Envase envase = this.getSistema().getEnvasesALlevarEnVenta().get(i);
                this.getSistema().getEnvasesALlevarEnVenta().remove(envase);
            }
        

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

            controlador.cargarProductos(this.getSistema().getEchoShop().getListaDeProductosEnStock(), sistema);

            stage.setOnCloseRequest(e -> controlador.cerrarVentana());

            Stage myStage = (Stage) this.btnAtras.getScene().getWindow();
            myStage.close();
        } catch (IOException ex) {
            Logger.getLogger(CarritoController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void confirmarVenta(ActionEvent event) {
        if (!this.getSistema().getProductosAVenderEnSesionActiva().isEmpty()) {

            ArrayList<Producto> listaDeProductos = this.getSistema().getProductosAVenderEnSesionActiva();
            int precioTotal = 0;
            for (int i = 0; i < listaDeProductos.size(); i++) {
                this.getSistema().getProductosAVenderEnSesionActiva().get(i).setCantidadVendidos(
                        this.getSistema().getProductosAVenderEnSesionActiva().get(i).getCantidadVendidos()
                        + this.getSistema().getCantidadPorIdDeProd()[listaDeProductos.get(i).getCodigoIdentificador()]);
                precioTotal += (listaDeProductos.get(i).getPrecio() * this.getSistema().getCantidadPorIdDeProd()[listaDeProductos.get(i).getCodigoIdentificador()]);
            }
            int[] cantidadesPorId = this.getSistema().getCantidadPorIdDeProd();
            Date fecha = new Date();
            Persona comprador = this.getSistema().getListaCliente().get(this.getSistema().getListaCliente().size() - 1);
            Tienda tienda = this.getSistema().getEchoShop();
            ArrayList<Envase> listaDeEnvasesUtilizados = this.getSistema().getEnvasesALlevarEnVenta();
            int codigoIdentificador = 1;
            String direccionComprador = comprador.getDomicilio();
            Venta ventaAgregar = new Venta(listaDeProductos, precioTotal, cantidadesPorId,
                    fecha, comprador, tienda, listaDeEnvasesUtilizados, codigoIdentificador,
                    direccionComprador);
            sistema.agregarVenta(ventaAgregar);
            this.getSistema().agregarUnaVentaAlArray(ventaAgregar);
            this.getSistema().agregarGananciaEnVenta(ventaAgregar);
            for (int i = 0; i < this.getSistema().getEnvasesALlevarEnVenta().size(); i++) {
                this.getSistema().getEnvasesUtilizadosPorId()[this.getSistema().getEnvasesALlevarEnVenta().get(i).getIdIdentificador()]++; 
            }
            WebView webView = new WebView();
            String contenido = this.getSistema().factura(ventaAgregar);
            webView.getEngine().loadContent(contenido);
            VBox vBox = new VBox(webView);
            Scene scene = new Scene(vBox, 960, 600);
            Stage primaryStage = new Stage();
            primaryStage.setScene(scene);
            primaryStage.show();
            for (int i = 0; i < this.getSistema().getProductosAVenderEnSesionActiva().size(); i++) {
                Producto p = this.getSistema().getProductosAVenderEnSesionActiva().get(i);
                this.getSistema().getProductosAVenderEnSesionActiva().remove(p);
            }
            for (int i = 0; i < this.getSistema().getCantidadPorIdDeProd().length; i++) {
                this.getSistema().getCantidadPorIdDeProd()[i] = 0;
            }
            for (int i = 0; i < this.getSistema().getEnvasesALlevarEnVenta().size(); i++) {
                Envase envase = this.getSistema().getEnvasesALlevarEnVenta().get(i);
                this.getSistema().getEnvasesALlevarEnVenta().remove(envase);
            }
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

                controlador.cargarProductos(this.getSistema().getEchoShop().getListaDeProductosEnStock(), sistema);

                stage.setOnCloseRequest(e -> controlador.cerrarVentana());

                Stage myStage = (Stage) this.btnAtras.getScene().getWindow();
                myStage.close();
            } catch (IOException ex) {
                Logger.getLogger(CarritoController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{ 
             Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("¡Cuidado!");
            alert.setHeaderText("Error: no ha agregado productos al carrito");
            alert.setContentText("Agregue productos al carrito");
            alert.showAndWait();
        }
    }
    
}