/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz2;

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
public class ProductosAEliminarController implements Initializable {

    @FXML
    private ImageView imagenProducto;
    @FXML
    private Label nombreProducto;
    @FXML
    private Label identificador;
    @FXML
    private Label precio;
    @FXML
    private Label origen;
    @FXML
    private Label cantVendidos;
    @FXML
    private JFXButton btnEliminarProd;

    private Sistema sistema;
    
    
    private TopVentasController controlador; 

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    //Gets and sets
    public ImageView getImagenProducto() {
        return imagenProducto;
    }

    public void setImagenProducto(ImageView imagenProducto) {
        this.imagenProducto = imagenProducto;
    }

    public Label getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(Label nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public Label getIdentificador() {
        return identificador;
    }

    public void setIdentificador(Label identificador) {
        this.identificador = identificador;
    }

    public Label getPrecio() {
        return precio;
    }

    public void setPrecio(Label precio) {
        this.precio = precio;
    }

    public Label getOrigen() {
        return origen;
    }

    public void setOrigen(Label origen) {
        this.origen = origen;
    }

    public Label getCantVendidos() {
        return cantVendidos;
    }

    public void setCantVendidos(Label cantVendidos) {
        this.cantVendidos = cantVendidos;
    }

    public JFXButton getBtnEliminarProd() {
        return btnEliminarProd;
    }

    public void setBtnEliminarProd(JFXButton btnEliminarProd) {
        this.btnEliminarProd = btnEliminarProd;
    }

    public Sistema getSistema() {
        return sistema;
    }

    public void setSistema(Sistema sistema) {
        this.sistema = sistema;
    }

    public TopVentasController getControlador() {
        return controlador;
    }

    public void setControlador(TopVentasController controlador) {
        this.controlador = controlador;
    }
    
    

    
    //Metodos: 
    
    public void inicializarDatos(Producto producto, Sistema sistema, TopVentasController controlador ) {
        this.setSistema(sistema);
        this.setControlador(controlador);
        this.imagenProducto.setImage(producto.getImagenDelProducto());
        this.nombreProducto.setText(producto.getNombre());
        this.identificador.setText(Integer.toString(producto.getCodigoIdentificador()));
        this.precio.setText(Double.toString(producto.getPrecio()));
        this.origen.setText(producto.getOrigen().toString());
        this.cantVendidos.setText(Integer.toString(producto.getCantidadVendidos()));
    }

    @FXML
    private void eliminarProducto(ActionEvent event) {
        int codigoIdentificador= Integer.parseInt(this.getIdentificador().getText()); 
        ArrayList<Producto> listaProductos= this.getSistema().getEchoShop().getListaDeProductosEnStock(); 
        for (int i = 0; i < listaProductos.size(); i++) {
            if(codigoIdentificador== listaProductos.get(i).getCodigoIdentificador()){
                Producto p= listaProductos.get(i); 
                this.getSistema().getEchoShop().eliminarProductoSinImportarStock(p);
            }
        }
        controlador.cargarProductos(listaProductos, controlador);
    }

}
