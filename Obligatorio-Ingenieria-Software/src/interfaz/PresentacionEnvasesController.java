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
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;

/**
 * FXML Controller class
 *
 * @author user
 */
public class PresentacionEnvasesController implements Initializable {

    @FXML
    private ImageView imagenEnvase;
    @FXML
    private Label nombreEnvase;
    @FXML
    private Label pesoEnvase;
    @FXML
    private ComboBox<String> materialesEnvase;
    private Sistema sistema;
    private int codigoIdentificador;
    private SeleccionarEnvasePorProductoController controlador;
    private Producto producto;
    @FXML
    private JFXButton btnAgregar;

    public int getCodigoIdentificador() {
        return codigoIdentificador;
    }

    public void setCodigoIdentificador(int codigoIdentificiador) {
        this.codigoIdentificador = codigoIdentificiador;
    }

    public Sistema getSistema() {
        return sistema;
    }

    public void setSistema(Sistema sistema) {
        this.sistema = sistema;
    }

    public SeleccionarEnvasePorProductoController getControlador() {
        return controlador;
    }

    public void setControlador(SeleccionarEnvasePorProductoController controlador) {
        this.controlador = controlador;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public void inicializarDatos(Envase envase, Sistema sistema, SeleccionarEnvasePorProductoController controlador, Producto producto) {
        this.setSistema(sistema);
        this.setControlador(controlador);
        this.setCodigoIdentificador(envase.getIdIdentificador());
        this.setProducto(producto);
        this.imagenEnvase.setImage(envase.getImagenDelProducto());
        this.nombreEnvase.setText(envase.getNombre());
        this.pesoEnvase.setText(Integer.toString(envase.getPesoMaximoSoportado()));
        for (int i = 0; i < envase.getTiposDeMateriales().size(); i++) {
            this.materialesEnvase.getItems().add(envase.getTiposDeMateriales().get(i) + "");
        }
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
        int contador = 0;
        int codigoIdentificad = this.getCodigoIdentificador();
        ArrayList<Envase> listaEnvases = this.getProducto().getPosiblesEnvasesRecomendados();
        ArrayList<Envase> copiaDeListaDeEnvases = new ArrayList<>();
        for (int i = 0; i < listaEnvases.size(); i++) {
            if (!this.getSistema().getEnvasesALlevarEnVenta().contains(listaEnvases.get(i))) {
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

        controlador.setContadorDeEnvasesSeleccionados(++contador);
        controlador.cargarProductos2(copiaDeListaDeEnvases, sistema, controlador, this.getProducto());
    }
}
