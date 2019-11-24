/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz2;

import Dominio.Producto;
import Dominio.Sistema;
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
public class ProductosController implements Initializable {

    @FXML
    private ImageView imagen;
    @FXML
    private JFXTextField txtNombreProd;
    @FXML
    private JFXTextField txtPrecio;
    @FXML
    private JFXTextField txtIdentificador;
    
    private Sistema sistema; 

    /**
     * Initializes the controller class.
     */
     
   @Override
    public void initialize(URL location, ResourceBundle resources) {
        //To change body of generated methods, choose Tools | Templates.
    }
    
    public void inicializarDatos(Producto producto, Sistema sistema){
        this.setSistema(sistema);
        this.imagen.setImage(producto.getImagenDelProducto());
        this.txtNombreProd.setText(producto.getNombre());
        this.txtPrecio.setText(Double.toString(producto.getPrecio()));
        this.txtIdentificador.setText(producto.getDescripcionDelProducto());
    }


    @FXML
    private void obtenerPrecio(ActionEvent event) {
    }

    @FXML
    private void obtenerIdentificador(ActionEvent event) {
    }

    public void setImagen(ImageView imagen) {
        this.imagen = imagen;
    }

    public void setTxtNombreProd(JFXTextField txtNombreProd) {
        this.txtNombreProd = txtNombreProd;
    }

    public void setTxtPrecio(JFXTextField txtPrecio) {
        this.txtPrecio = txtPrecio;
    }

    public void setTxtIdentificador(JFXTextField txtIdentificador) {
        this.txtIdentificador = txtIdentificador;
    }

    public void setSistema(Sistema sistema) {
        this.sistema = sistema;
    }

    
    
    
    
    
}
