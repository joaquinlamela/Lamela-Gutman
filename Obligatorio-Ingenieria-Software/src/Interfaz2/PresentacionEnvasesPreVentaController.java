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
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;

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
    private Label materialesEnvase;
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

    @FXML
    private void agregarListaEnvase(ActionEvent event) {
         int codigoIdentificad = this.getCodigoIdentificador();

        ArrayList<Envase> listaEnvases = this.getProducto().getPosiblesEnvasesRecomendados(); 

        for (int i = 0; i < listaEnvases.size(); i++) {
            if (codigoIdentificad == listaEnvases.get(i).getIdIdentificador()) {
                Envase e = listaEnvases.get(i);
                if (!this.getSistema().getEnvasesALlevarEnPreVenta().contains(e)) {
                    this.getSistema().getEnvasesALlevarEnPreVenta().add(e);
                }
                listaEnvases.remove(e); 
            }
            controlador.cargarProductos2(listaEnvases, sistema, controlador, this.getProducto());
        }
        
        
    }
    
    
     public void inicializarDatos(Envase envase, Sistema sistema, SeleccionarEnvasePorProductoPreVentaController controlador, Producto producto) {
        this.setSistema(sistema);
        this.setControlador(controlador);
        this.setCodigoIdentificador(envase.getIdIdentificador());
        this.setProducto(producto);
        this.imagenEnvase.setImage(envase.getImagenDelProducto());
        this.nombreEnvase.setText(envase.getNombre());
        this.pesoEnvase.setText(Integer.toString(envase.getPesoMaximoSoportado()));
        //  this.materialesEnvase.setText(envase.getTiposDeMateriales());

    }
    
}
