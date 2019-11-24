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
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author user
 */
public class PresentacionEnvasesPreVentaController implements Initializable {

    @FXML
    private ImageView imagenEnvase;
    @FXML
    private Label nombreEnvase;
    @FXML
    private Label pesoEnvase;
    @FXML
    private ComboBox<String> materialesEnvase;
    @FXML
    private JFXButton btnAgregar;

    private Sistema sistema;

    private SeleccionarEnvasePorProductoPreVentaController controlador;

    private int codigoIdentificador;

    private Producto producto;

    //Gets and sets: 
    public Sistema getSistema() {
        return sistema;
    }

    public void setSistema(Sistema sistema) {
        this.sistema = sistema;
    }

    public SeleccionarEnvasePorProductoPreVentaController getControlador() {
        return controlador;
    }

    public void setControlador(SeleccionarEnvasePorProductoPreVentaController controlador) {
        this.controlador = controlador;
    }

    public int getCodigoIdentificador() {
        return codigoIdentificador;
    }

    public void setCodigoIdentificador(int codigoIdentificador) {
        this.codigoIdentificador = codigoIdentificador;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
    
    
     public void inicializarDatos(Envase envase, Sistema sistema, SeleccionarEnvasePorProductoPreVentaController controlador, Producto producto) {
        this.setSistema(sistema);
        this.setControlador(controlador);
        this.setCodigoIdentificador(envase.getIdIdentificador());
        this.setProducto(producto);
        this.imagenEnvase.setImage(envase.getImagenDelProducto());
        this.nombreEnvase.setText(envase.getNombre());
        this.pesoEnvase.setText(Integer.toString(envase.getPesoMaximoSoportado()));
        for (int i = 0; i < envase.getTiposDeMateriales().size(); i++) {
            this.materialesEnvase.getItems().add(envase.getTiposDeMateriales().get(i)+""); 
        }

    }
    

    @FXML
    private void agregarListaEnvase(ActionEvent event) {
        
        int codigoIdentificad = this.getCodigoIdentificador();

        ArrayList<Envase> listaEnvases = this.getProducto().getPosiblesEnvasesRecomendados();

        ArrayList<Envase> copiaDeListaDeEnvases = new ArrayList<>();

        for (int i = 0; i < listaEnvases.size(); i++) {
            if (!this.getSistema().getEnvasesALlevarEnPreVenta().contains(listaEnvases.get(i)) ) {
                copiaDeListaDeEnvases.add(listaEnvases.get(i));
            }
        }

        for (int i = 0; i < copiaDeListaDeEnvases.size(); i++) {
            if (codigoIdentificad == copiaDeListaDeEnvases.get(i).getIdIdentificador()) {
                Envase e = copiaDeListaDeEnvases.get(i);
                if (!this.getSistema().getEnvasesALlevarEnPreVenta().contains(e)) {
                    this.getSistema().getEnvasesALlevarEnPreVenta().add(e);
                    copiaDeListaDeEnvases.remove(e);
                }else {
                    Alert alert = new Alert(Alert.AlertType.ERROR);
                    alert.setTitle("¡Cuidado!");
                    alert.setHeaderText("Error: El peso del envase es menor al peso del producto");
                    alert.setContentText("!Seleccione un envase correspondiente al peso del producto!");
                    alert.showAndWait();
                }
                
            }
            
        }
        controlador.cargarProductos2(copiaDeListaDeEnvases, sistema, controlador, this.getProducto());

    }
    
    
    
    /*
    @FXML
    private void agregarListaEnvase(ActionEvent event) {

        int codigoIdentificad = this.getCodigoIdentificador();

        ArrayList<Envase> listaEnvases = this.getProducto().getPosiblesEnvasesRecomendados();

        ArrayList<Envase> copiaDeListaDeEnvases = new ArrayList<>();

        for (int i = 0; i < listaEnvases.size(); i++) {
            if(!this.getSistema().getEnvasesALlevarEnVenta().contains(listaEnvases.get(i))){
                copiaDeListaDeEnvases.add(listaEnvases.get(i));
            }
            
        }

        for (int i = 0; i < copiaDeListaDeEnvases.size(); i++) {
            if (codigoIdentificad == copiaDeListaDeEnvases.get(i).getIdIdentificador()) {
                Envase e = copiaDeListaDeEnvases.get(i);
                if (!this.getSistema().getEnvasesALlevarEnVenta().contains(e)) {  // && e.getPesoMaximoSoportado() >= this.getProducto().getPesoDelProducto()) {
                    this.getSistema().getEnvasesALlevarEnVenta().add(e);

                    copiaDeListaDeEnvases.remove(e);
                } else {
                    Alert alert = new Alert(Alert.AlertType.ERROR);
                    alert.setTitle("¡Cuidado!");
                    alert.setHeaderText("Error: El peso del envase es menor al peso del producto");
                    alert.setContentText("!Seleccione un envase correspondiente al peso del producto!");
                    alert.showAndWait();
                }

            }
        }
        controlador.cargarProductos2(copiaDeListaDeEnvases, sistema, controlador, this.getProducto());

    }
*/ 
    

   

}
