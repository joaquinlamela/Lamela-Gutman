/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import dominio.Envase;
import dominio.Sistema;
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
public class EnvasesParaConfirmacionDePreventaController implements Initializable {

    @FXML
    private ImageView imagenEnvase;
    @FXML
    private Label nombreEnvase;
    @FXML
    private Label pesoEnvase;
    @FXML
    private Label materialesEnvase;
    
    
    private int codigoIdentificador; 
    
    private Sistema sistema; 
    
    private ConfirmacionCompraController controlador; 
    

    public Sistema getSistema() {
        return sistema;
    }

    public void setSistema(Sistema sistema) {
        this.sistema = sistema;
    }

    public ConfirmacionCompraController getControlador() {
        return controlador;
    }

    public void setControlador(ConfirmacionCompraController controlador) {
        this.controlador = controlador;
    }

    public int getCodigoIdentificador() {
        return codigoIdentificador;
    }

    public void setCodigoIdentificador(int codigoIdentificador) {
        this.codigoIdentificador = codigoIdentificador;
    }
    
    
    
    
    
    
   

   
    
    
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
     public void inicializarDatos2(Envase envase, Sistema sistema, ConfirmacionCompraController controlador) {
        this.setSistema(sistema);
        this.setControlador(controlador);
        this.setCodigoIdentificador(envase.getIdIdentificador());
        this.imagenEnvase.setImage(envase.getImagenDelProducto());
        this.nombreEnvase.setText(envase.getNombre());
        this.pesoEnvase.setText(Integer.toString(envase.getPesoMaximoSoportado()));
        //  this.materialesEnvase.setText(envase.getTiposDeMateriales());

    }
    
    

    private void agregarListaEnvase(ActionEvent event) {
        int codigoIdentificad = this.getCodigoIdentificador();

        ArrayList<Envase> listaEnvases = this.getSistema().getEchoShop().getTodosLosEnvasesDisponibles();

        for (int i = 0; i < listaEnvases.size(); i++) {
            if (codigoIdentificad == listaEnvases.get(i).getIdIdentificador()) {
                Envase e = listaEnvases.get(i);
                if (!this.getSistema().getEnvasesALlevarEnPreVenta().contains(e)) {
                    this.getSistema().getEnvasesALlevarEnPreVenta().add(e);
                }

            }
        }
        
        
        
    }
    
}
