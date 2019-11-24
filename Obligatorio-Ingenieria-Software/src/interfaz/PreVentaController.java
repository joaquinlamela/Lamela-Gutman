/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import dominio.Envase;
import dominio.Producto;
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
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author user
 */
public class PreVentaController implements Initializable {

    @FXML
    private VBox listaDeProductos;
    @FXML
    private JFXButton btnConfirmar;
    @FXML
    private JFXButton btnCancelar;
    @FXML
    private JFXButton btnAtras;
    @FXML
    private JFXButton btnInicio;

    private Sistema sistema;

    private Persona cliente;

    //Gets && sets: 
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

    public void cargarProductos(ArrayList<Producto> lista, Sistema sis, PreVentaController paraCargarPestañaCarrito, int[] cantidadPorId) {

        this.setSistema(sis);

        this.listaDeProductos.getChildren().clear();

        this.listaDeProductos.setSpacing(10);

        for (int i = 0; i < lista.size(); i++) {

            try {
                Producto producto = lista.get(i);
                //Cargarart el objeto

                FXMLLoader fxml = new FXMLLoader(getClass().getResource("ProductosPreVenta.fxml"));

                Parent nodo = fxml.load();

                //Carga los datos
                ProductosPreVentaController controlador = fxml.getController();

                controlador.inicializarDatos(producto, sistema, paraCargarPestañaCarrito, cantidadPorId);

                controlador.setSistema(sistema);

                //Cargo el nuevo objeto
                this.listaDeProductos.getChildren().add((Node) nodo);

            } catch (IOException ex) {
                Logger.getLogger(ClienteController.class.getName()).log(Level.SEVERE, null, ex);
            }

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

            controlador.setCliente(this.getCliente());

            controlador.cargarProductos(this.getSistema().getEchoShop().getListaDeProductosEnStock(), sistema);

            stage.setOnCloseRequest(e -> controlador.cerrarVentana());

            Stage myStage = (Stage) this.btnAtras.getScene().getWindow();
            myStage.close();
        } catch (IOException ex) {
            Logger.getLogger(PreVentaController.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void confirmarPreVenta(ActionEvent event) {

        if (!this.getSistema().getProductosPreVentaSesionActiva().isEmpty()) {

            try {
                FXMLLoader loader = new FXMLLoader(getClass().getResource("ConfirmacionCompra.fxml"));

                Parent root = loader.load();

                ConfirmacionCompraController controlador = loader.getController();

                Scene escena = new Scene(root);

                Stage stage = new Stage();

                stage.setScene(escena);

                stage.show();

                stage.setHeight(675);

                stage.setWidth(366);

                stage.setResizable(false);

                controlador.setSistema(sistema);

                controlador.setCliente(this.getCliente());


                /*
                ArrayList<Envase> listaDeEnvasesALlevar = new ArrayList<>();

                for (int i = 0; i < this.getSistema().getProductosPreVentaSesionActiva().size(); i++) {
                    Producto p = this.getSistema().getProductosPreVentaSesionActiva().get(i);
                    ArrayList<Envase> listaDeEnvaseDeUnProducto = p.getPosiblesEnvasesRecomendados();
                    for (int j = 0; j < listaDeEnvaseDeUnProducto.size(); j++) {
                        listaDeEnvasesALlevar.add(listaDeEnvaseDeUnProducto.get(i));
                    }

                }
                 */
                controlador.cargarProductos(this.getSistema().getEnvasesALlevarEnPreVenta(), sistema, controlador);

                stage.setOnCloseRequest(e -> controlador.cerrarVentana());

                Stage myStage = (Stage) this.btnAtras.getScene().getWindow();
                myStage.close();
            } catch (IOException ex) {
                Logger.getLogger(CarritoController.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("¡Cuidado!");
            alert.setHeaderText("Error: Seleccione almenos un producto para la preventa");
            alert.setContentText("Agregue un producto en la preventa");
            alert.showAndWait();
        }

    }

    @FXML
    private void cancelarPreVenta(ActionEvent event) {
        for (int i = 0; i < this.getSistema().getProductosPreVentaSesionActiva().size(); i++) {
            Producto p = this.getSistema().getProductosPreVentaSesionActiva().get(i);
            this.getSistema().getProductosPreVentaSesionActiva().remove(p);
        }
        for (int i = 0; i < this.getSistema().getCantidadPorIdDeProd().length; i++) {
            this.getSistema().getCantidadPorIdDePreVenta()[i] = 0;
        }
        for (int i = 0; i < this.getSistema().getEnvasesALlevarEnPreVenta().size(); i++) {
            Envase envase = this.getSistema().getEnvasesALlevarEnPreVenta().get(i);
            this.getSistema().getEnvasesALlevarEnPreVenta().remove(envase);
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

            controlador.setCliente(this.getCliente());

            controlador.cargarProductos(this.getSistema().getEchoShop().getListaDeProductosEnStock(), sistema);

            stage.setOnCloseRequest(e -> controlador.cerrarVentana());

            Stage myStage = (Stage) this.btnAtras.getScene().getWindow();
            myStage.close();
        } catch (IOException ex) {
            Logger.getLogger(CarritoController.class.getName()).log(Level.SEVERE, null, ex);
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

            controlador.setCliente(this.getCliente());

            controlador.cargarProductos(this.getSistema().getEchoShop().getListaDeProductosEnStock(), sistema);

            stage.setOnCloseRequest(e -> controlador.cerrarVentana());

            Stage myStage = (Stage) this.btnAtras.getScene().getWindow();
            myStage.close();
        } catch (IOException ex) {
            Logger.getLogger(PreVentaController.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
