/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz2;

import com.jfoenix.controls.JFXTextField;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;

/**
 * FXML Controller class
 *
 * @author user
 */
public class ProductosController extends Pane {

    @FXML
    private ImageView imagen;
    @FXML
    private JFXTextField txtNombreProd;
    @FXML
    private JFXTextField txtPrecio;
    @FXML
    private JFXTextField txtIdentificador;

    /**
     * Initializes the controller class.
     */
     

    public ProductosController() {
        super(); 
        
        try {
            FXMLLoader fxmlLoader= new FXMLLoader(getClass().getResource("Productos.fxml"));
            fxmlLoader.setController(this);
            this.getChildren().add((Node)fxmlLoader.load()); 
        } catch (IOException ex) {
            Logger.getLogger(ProductosController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
      
    
    }

    @FXML
    private void obtenerNombre(ActionEvent event) {
    }

    @FXML
    private void obtenerPrecio(ActionEvent event) {
    }

    @FXML
    private void obtenerIdentificador(ActionEvent event) {
    }
    
}
