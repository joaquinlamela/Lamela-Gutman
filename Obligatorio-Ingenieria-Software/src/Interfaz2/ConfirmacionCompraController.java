/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz2;

import Dominio.Envase;
import Dominio.Persona;
import Dominio.PreVenta;
import Dominio.Producto;
import Dominio.Sistema;
import Dominio.Sucursal;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXDatePicker;
import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
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
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.web.WebView;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author user
 */
public class ConfirmacionCompraController implements Initializable {

    @FXML
    private JFXButton btnConfirmar;
    @FXML
    private JFXButton btnInicio;
    @FXML
    private Label nombreCliente;
    @FXML
    private ComboBox<Integer> numeroSucursal;
    @FXML
    private Label direccionSucursal;
    @FXML
    private JFXDatePicker fechaRetiro;

    @FXML
    private VBox listaDeEnvases;

    private Sistema sistema;
    @FXML
    private Label precioTotal;

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
    private void confirmarVenta(ActionEvent event) {

        boolean esValido = true;
        int numeroDeSucursal = 1;

        //Parte de sucursal
        if (!this.numeroSucursal.getSelectionModel().isEmpty()) {
            numeroDeSucursal = this.numeroSucursal.getSelectionModel().getSelectedItem();
            for (int i = 0; i < this.getSistema().getEchoShop().getSucursales().size(); i++) {
                if (numeroDeSucursal == this.getSistema().getEchoShop().getSucursales().get(i).getNumeroSucursal()) {
                    Sucursal sucursal = this.getSistema().getEchoShop().getSucursales().get(i);
                    this.direccionSucursal.setText(sucursal.getDireccion());
                }
            }

        } else {
            esValido = false;
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("¡Cuidado!");
            alert.setHeaderText("Error: no ha seleccionado ninguna sucursal para retirar");
            alert.setContentText("!Seleccione una sucursal");
            alert.showAndWait();
        }

        LocalDate fechaDeRetiro = this.fechaRetiro.getValue();

        if (fechaDeRetiro == null) {
            esValido = false;
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("¡Cuidado!");
            alert.setHeaderText("Error: no ha seleccionado ninguna fecha de retiro");
            alert.setContentText("!Seleccione uuna fecha de retiro!");
            alert.showAndWait();
        }

        if (esValido) {
            Persona cliente = new Persona();
            for (int i = 0; i < this.getSistema().getListaCliente().size(); i++) {
                if (this.nombreCliente.getText().equalsIgnoreCase(this.getSistema().getListaCliente().get(i).getNombre())) {
                    cliente = this.getSistema().getListaCliente().get(i);
                }
            }
            int precio = Integer.parseInt(this.precioTotal.getText());

            this.getSistema().getEchoShop().setDireccion(this.direccionSucursal.getText());
            this.getSistema().getEchoShop().setNumeroSucursal(numeroDeSucursal);

            PreVenta preventaAgregar = new PreVenta(cliente, precio, this.getSistema().getProductosPreVentaSesionActiva(), this.getSistema().getEchoShop(),
                    this.getSistema().getEnvasesALlevarEnPreVenta(), 1, fechaDeRetiro);

            this.getSistema().agregarPreVenta(preventaAgregar);
            
            for (int i = 0; i < this.getSistema().getEnvasesALlevarEnPreVenta().size(); i++) {
                this.getSistema().getEnvasesUtilizadosPorId()[this.getSistema().getEnvasesALlevarEnPreVenta().get(i).getIdIdentificador()]++; 
            }
            
            
            //Nuevo 
            Date fechaAhora= new Date(); 
            
            if(fechaAhora.getDay()== fechaDeRetiro.getDayOfMonth() && fechaAhora.getMonth() == fechaDeRetiro.getMonthValue() && fechaAhora.getYear() == fechaDeRetiro.getYear()){
                this.getSistema().agregarUnaPreVentaAlArray(preventaAgregar); 
                this.getSistema().agregarGananciaPreVenta(preventaAgregar);
            }
            //Hasta aca 
            

            // System.out.println(this.getSistema().getListaDePreventas());

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

                controlador.cargarProductos(this.getSistema().getEchoShop().getListaDeProductosEnStock(), sistema);

                stage.setOnCloseRequest(e -> controlador.cerrarVentana());

                Stage myStage = (Stage) this.btnConfirmar.getScene().getWindow();
                myStage.close();
            } catch (IOException ex) {
                Logger.getLogger(CarritoController.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

    }

    @FXML
    private void volverInicio(ActionEvent event) {
    }

    public void cargarProductos(ArrayList<Envase> lista, Sistema sis, ConfirmacionCompraController paraCargarPestañaCarrito) {

        this.setSistema(sis);

        this.nombreCliente.setText(this.getSistema().getListaCliente().get(this.getSistema().getListaCliente().size() - 1).getNombre());

        for (int i = 0; i < this.getSistema().getEchoShop().getSucursales().size(); i++) {
            ArrayList<Sucursal> sucursales = this.getSistema().getEchoShop().getSucursales();

            this.numeroSucursal.getItems().add(sucursales.get(i).getNumeroSucursal());

        }

        int precio = 0;
        ArrayList<Producto> listaDeProductos = this.getSistema().getProductosPreVentaSesionActiva();
        Date fechaActual = new Date();

        for (int i = 0; i < listaDeProductos.size(); i++) {

            precio += listaDeProductos.get(i).getPrecio() * this.getSistema().getCantidadPorIdDePreVenta()[listaDeProductos.get(i).getCodigoIdentificador()];

        }

        this.precioTotal.setText(Integer.toString(precio));

        this.listaDeEnvases.getChildren().clear();

        this.listaDeEnvases.setSpacing(10);

        for (int i = 0; i < lista.size(); i++) {

            try {
                Envase envase = lista.get(i);
                //Cargarart el objeto

                FXMLLoader fxml = new FXMLLoader(getClass().getResource("EnvasesParaConfirmacionDePreventa.fxml"));

                Parent nodo = fxml.load();

                //Carga los datos
                EnvasesParaConfirmacionDePreventaController controlador = fxml.getController();

                controlador.inicializarDatos2(envase, sistema, paraCargarPestañaCarrito);

                controlador.setSistema(sistema);

                //Cargo el nuevo objeto
                this.listaDeEnvases.getChildren().add((Node) nodo);

            } catch (IOException ex) {
                Logger.getLogger(ClienteController.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

    }

    public void cerrarVentana() {

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

            Stage myStage = (Stage) this.btnConfirmar.getScene().getWindow();
            myStage.close();
        } catch (IOException ex) {
            Logger.getLogger(PreVentaController.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
