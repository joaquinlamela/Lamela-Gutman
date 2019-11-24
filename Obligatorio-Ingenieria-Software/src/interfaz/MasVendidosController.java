/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;
import dominio.Producto;
import dominio.Sistema;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
/**
 * FXML Controller class
 *
 * @author user
 */
public class MasVendidosController implements Initializable {
    @FXML
    private ImageView imagenProducto;
    @FXML
    private Label nombreProd;
    @FXML
    private Label precioProducto;
    @FXML
    private Label descripcion;
    @FXML
    private Label identificador;
    @FXML
    private Label cantidadVendidos;
    private Sistema sistema; 
    //Gets and sets
    public ImageView getImagenProducto() {
        return imagenProducto;
    }
    public void setImagenProducto(ImageView imagenProducto) {
        this.imagenProducto = imagenProducto;
    }
    public Label getNombreProd() {
        return nombreProd;
    }
    public void setNombreProd(Label nombreProd) {
        this.nombreProd = nombreProd;
    }
    public Label getPrecioProducto() {
        return precioProducto;
    }
    public void setPrecioProducto(Label precioProducto) {
        this.precioProducto = precioProducto;
    }
    public Label getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(Label descripcion) {
        this.descripcion = descripcion;
    }
    public Label getIdentificador() {
        return identificador;
    }
    public void setIdentificador(Label identificador) {
        this.identificador = identificador;
    }
    public Label getCantidadVendidos() {
        return cantidadVendidos;
    }
    public void setCantidadVendidos(Label cantidadVendidos) {
        this.cantidadVendidos = cantidadVendidos;
    }
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
    public void inicializarDatos(Producto producto, Sistema sistema){
        this.setSistema(sistema);
        this.imagenProducto.setImage(producto.getImagenDelProducto());
        this.nombreProd.setText(producto.getNombre());
        this.precioProducto.setText(Double.toString(producto.getPrecio()));
        this.cantidadVendidos.setText(Integer.toString(producto.getCantidadVendidos()));
        this.descripcion.setText(producto.getDescripcionDelProducto());
        this.identificador.setText(Integer.toString(producto.getCodigoIdentificador()));
    }
}
