/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import dominio.Envase;
import dominio.Producto;
import dominio.Sistema;
import dominio.TipoMateriales;
import dominio.TipoOrigen;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXRadioButton;
import com.jfoenix.controls.JFXTextArea;
import com.jfoenix.controls.JFXTextField;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author user
 */
public class AgregarProductoController implements Initializable {

    @FXML
    private JFXTextField txtFNombre;
    @FXML
    private JFXTextField txtFPeso;
    @FXML
    private JFXTextField txtFPrecio;
    @FXML
    private JFXComboBox<String> cmbOrigen;
    @FXML
    private JFXButton btnAgregar;
    @FXML
    private JFXButton btnVolverVendedor;
    @FXML
    private JFXButton btnInicio;
    @FXML
    private JFXRadioButton cmbPlastico;
    @FXML
    private JFXRadioButton cmbCarton;
    @FXML
    private JFXRadioButton cmbMetal;
    @FXML
    private JFXRadioButton cmbPapel;
    @FXML
    private JFXTextField txtFDescripcion;
    /**
     * Initializes the controller class.
     */
    private Sistema sistema;
    @FXML
    private TableView<Envase> tablaDeEnvases;
    @FXML
    private TableColumn<Envase, String> nombreEnvase;
    @FXML
    private TableColumn<Envase, String> idEnvase;
    @FXML
    private TableColumn<Envase, Integer> capacidadEnvase;
    private ObservableList<Envase> listaDeEnvases;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        ObservableList<String> valoresPosibles = FXCollections.observableArrayList("Vegetal", "Mineral", "Animal", "Fosil", "Indefinido");
        this.cmbOrigen.setItems(valoresPosibles);
        this.tablaDeEnvases.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
        listaDeEnvases = FXCollections.observableArrayList();
    }

    @FXML
    private void obtenerNombre(ActionEvent event) {
    }

    @FXML
    private void obtenerPeso(ActionEvent event) {
    }

    @FXML
    private void obtenerPrecio(ActionEvent event) {
    }

    @FXML
    private void obtenerOrigen(ActionEvent event) {
    }

    public void cargarDatos(ArrayList<Envase> listaEnvases, Sistema sistema) {
        this.setSistema(sistema);
        if (this.getSistema().getEchoShop().getTodosLosEnvasesDisponibles().isEmpty()) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("¡Cuidado!");
            alert.setHeaderText("Error: no hay envases");
            alert.setContentText("¡No hay envases posibles para asociar!");
            alert.showAndWait();
        } else {
            this.nombreEnvase.setCellValueFactory(new PropertyValueFactory("nombre"));
            this.idEnvase.setCellValueFactory(new PropertyValueFactory("idIdentificador"));
            this.capacidadEnvase.setCellValueFactory(new PropertyValueFactory("pesoMaximoSoportado"));
            for (int i = 0; i < this.getSistema().getEchoShop().getTodosLosEnvasesDisponibles().size(); i++) {
                listaDeEnvases.add(this.getSistema().getEchoShop().getTodosLosEnvasesDisponibles().get(i));
            }
            this.tablaDeEnvases.setItems(listaDeEnvases);
        }
    }

    @FXML
    private void agregarProductoCreado(ActionEvent event) {
        //FALTA ACA VER EL TEMA DEL ORIGEN Y LA LISTA DE ELEMENTOS QUE HAY QUE TENER, Y QUEDAAAAA. 
        boolean esValido = true;
        int precio = 1;
        int peso = 1;
        ArrayList<Envase> listaEnvases = new ArrayList<>();
        //Parte de nombre de producto
        String nombre = txtFNombre.getText().trim();
        if (nombre.length() == 0) {
            esValido = false;
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("¡Cuidado!");
            alert.setHeaderText("Error: campo vacio");
            alert.setContentText("El campo de nombre, se encuentra vacio!");
            alert.showAndWait();
        }
        //Parte de peso
        try {
            String pesoString = txtFPeso.getText().trim();
            if (pesoString.length() == 0) {
                esValido = false;
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("¡Cuidado!");
                alert.setHeaderText("Error: campo vacio");
                alert.setContentText("El campo de peso, se encuentra vacio!");
                alert.showAndWait();
            } else {
                peso = Integer.parseInt(pesoString);
                if (peso <= 0) {
                    esValido = false;
                    Alert alert = new Alert(Alert.AlertType.ERROR);
                    alert.setTitle("¡Cuidado!");
                    alert.setHeaderText("Error: no es un precio valido");
                    alert.setContentText("Ingrese un peso entre 1 y 100");
                    alert.showAndWait();
                } else {
                    if (peso > 100) {
                        esValido = false;
                        Alert alert = new Alert(Alert.AlertType.ERROR);
                        alert.setTitle("¡Cuidado!");
                        alert.setHeaderText("Error: no es un precio valido");
                        alert.setContentText("Ingrese un peso entre 1 y 100");
                        alert.showAndWait();
                    }
                }
            }
        } catch (NumberFormatException e) {
            esValido = false;
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("¡Cuidado!");
            alert.setHeaderText("Error: no es un peso valido");
            alert.setContentText("Reingrese el valor del peso!");
            alert.showAndWait();
        }
        //Parte de precio
        try {
            String precioString = txtFPrecio.getText().trim();
            if (precioString.length() == 0) {
                esValido = false;
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("¡Cuidado!");
                alert.setHeaderText("Error: campo vacio");
                alert.setContentText("El campo de precio, se encuentra vacio!");
                alert.showAndWait();
            } else {
                precio = Integer.parseInt(precioString);
                if (precio < 1) {
                    esValido = false;
                    Alert alert = new Alert(Alert.AlertType.ERROR);
                    alert.setTitle("¡Cuidado!");
                    alert.setHeaderText("Error: no es un precio valido");
                    alert.setContentText("Ingrese un precio positivo y mayor o igual a 1!");
                    alert.showAndWait();
                }
            }
        } catch (NumberFormatException e) {
            esValido = false;
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("¡Cuidado!");
            alert.setHeaderText("Error: no es un precio valido");
            alert.setContentText("Reingrese el valor del peso!");
            alert.showAndWait();
        }
        //Parte de tipo de origen
        dominio.TipoOrigen origenReal = TipoOrigen.Indefinido;
        if (!cmbOrigen.getSelectionModel().isEmpty()) {
            String origen = this.cmbOrigen.getSelectionModel().getSelectedItem();
            if (origen.length() == 0) {
                esValido = false;
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("¡Cuidado!");
                alert.setHeaderText("Error: no ha seleccionado ningun origen");
                alert.setContentText("!Seleccione un origen!");
                alert.showAndWait();
            }
            if (origen.equals("Indefinido")) {
                origenReal = TipoOrigen.Indefinido;
            } else {
                if (origen.equals("Fosil")) {
                    origenReal = TipoOrigen.Fosil;
                } else {
                    if (origen.equals("Animal")) {
                        origenReal = TipoOrigen.Animal;
                    } else {
                        if (origen.equals("Mineral")) {
                            origenReal = TipoOrigen.Mineral;
                        } else {
                            if (origen.equals("Vegetal")) {
                                origenReal = TipoOrigen.Vegetal;
                            }
                        }
                    }
                }
            }
        } else {
            esValido = false;
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("¡Cuidado!");
            alert.setHeaderText("Error: no ha seleccionado ningun origen");
            alert.setContentText("!Seleccione un origen!");
            alert.showAndWait();
        }
        //Parte de descripcion
        String descripcion = this.txtFDescripcion.getText().trim();
        if (descripcion.length() < 10) {
            esValido = false;
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("¡Cuidado!");
            alert.setHeaderText("Error: descripcion muy corta");
            alert.setContentText("El campo de descripcion debe contener mas caracteres !");
            alert.showAndWait();
        }
        //Parte de tipos de materiales
        ArrayList<dominio.TipoMateriales> array = new ArrayList<>();
        if (cmbPlastico.isSelected()) {
            array.add(TipoMateriales.Plastico);
        }
        if (cmbPapel.isSelected()) {
            array.add(TipoMateriales.Papel);
        }
        if (cmbMetal.isSelected()) {
            array.add(TipoMateriales.Metal);
        }
        if (cmbCarton.isSelected()) {
            array.add(TipoMateriales.Carton);
        }
        if (array.isEmpty()) {
            esValido = false;
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("¡Cuidado!");
            alert.setHeaderText("Error: no ha seleccionado los materiales");
            alert.setContentText("Debe seleccionar al menos un material !");
            alert.showAndWait();
        }
        //Parte de envases
        if (tablaDeEnvases.getItems().isEmpty()) {
            esValido = false;
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("¡Cuidado!");
            alert.setHeaderText("Error: no hay envases");
            alert.setContentText("¡Debe ingresar envases al sistema!");
            alert.showAndWait();
        } else {
            ObservableList<dominio.Envase> lista = this.tablaDeEnvases.getSelectionModel().getSelectedItems();
            if (lista.isEmpty()) {
                esValido = false;
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("¡Cuidado!");
                alert.setHeaderText("Error: no ha seleccionado los envases");
                alert.setContentText("¡Debe seleccionar envases para poder ingresar el producto!");
                alert.showAndWait();
            }
            for (int i = 0; i < lista.size(); i++) {
                listaEnvases.add(lista.get(i));
            }
        }
        int pesoMaximo = 0;
        for (int i = 0; i < listaEnvases.size(); i++) {
            if (pesoMaximo < listaEnvases.get(i).getPesoMaximoSoportado()) {
                pesoMaximo = listaEnvases.get(i).getPesoMaximoSoportado();
            }
        }
        if (peso > pesoMaximo) {
            esValido = false;
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("¡Cuidado!");
            alert.setHeaderText("Error: El peso del producto no es soportador por los envases recomendados");
            alert.setContentText("¡El peso del producto debe ser menor al peso maximo soportado por los envases!");
            alert.showAndWait();
        }
        //Parte de codigo identificador
        int codigoIdentificadorDelProducto = this.getSistema().ponerIdentificadorAProducto();
        //Parte de cantidad de vewndidos de ese producto
        int cantVendidos = 0;
        for (int i = 0; i < this.sistema.getListaDeVentasDelSitema().size(); i++) {
            if (this.sistema.getListaDeVentasDelSitema().get(i).equals(nombre)) {
                cantVendidos++;
            }
        }
        //Creacion del producto si los campso son validos
        if (esValido) {
            FileChooser fileChooser = new FileChooser();
            FileChooser.ExtensionFilter filter = new FileChooser.ExtensionFilter("Imagenes (*.png, *.jpg, *.jpeg)", "*.png", "*.jpeg", "*.jpg");
            fileChooser.getExtensionFilters().add(filter);
            File selectedFile = fileChooser.showOpenDialog(new Stage());
            if (selectedFile == null) {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("¡Cuidado!");
                alert.setHeaderText("Error: seleccione una imagen");
                alert.setContentText("Debe seleccionar un imagen!");
                alert.showAndWait();
            } else {
                Image imagenProducto = new Image(selectedFile.toURI().toString());
                Producto productoACrear = new Producto(nombre, origenReal, descripcion, peso, precio, codigoIdentificadorDelProducto, listaEnvases, array, cantVendidos, imagenProducto);
                this.sistema.getEchoShop().agregarProducto(productoACrear);
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Agregado de producto");
                alert.setHeaderText("Se ha agregado correctamente el producto");
                alert.showAndWait();
            }
        }
    }

    @FXML
    private void volverInicio(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Vendedor.fxml"));
            Parent root = loader.load();
            VendedorController controlador = loader.getController();
            Scene escena = new Scene(root);
            Stage stage = new Stage();
            stage.setScene(escena);
            stage.show();
            stage.setHeight(675);
            stage.setWidth(366);
            stage.setResizable(false);
            controlador.setSistema(sistema);
            stage.setOnCloseRequest(e -> controlador.cerrarVentana());
            Stage myStage = (Stage) this.btnAgregar.getScene().getWindow();
            myStage.close();
        } catch (IOException ex) {
            Logger.getLogger(AgregarProductoController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void irAInicio(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Vendedor.fxml"));
            Parent root = loader.load();
            VendedorController controlador = loader.getController();
            Scene escena = new Scene(root);
            Stage stage = new Stage();
            stage.setScene(escena);
            stage.show();
            stage.setHeight(675);
            stage.setWidth(366);
            stage.setResizable(false);
            controlador.setSistema(sistema);
            stage.setOnCloseRequest(e -> controlador.cerrarVentana());
            Stage myStage = (Stage) this.btnAgregar.getScene().getWindow();
            myStage.close();
        } catch (IOException ex) {
            Logger.getLogger(AgregarProductoController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void cerrarVentana() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Vendedor.fxml"));
            Parent root = loader.load();
            VendedorController controlador = loader.getController();
            Scene escena = new Scene(root);
            Stage stage = new Stage();
            stage.setScene(escena);
            stage.show();
            stage.setHeight(675);
            stage.setWidth(366);
            stage.setResizable(false);
            controlador.setSistema(sistema);
            stage.setOnCloseRequest(e -> controlador.cerrarVentana());
            Stage myStage = (Stage) this.btnAgregar.getScene().getWindow();
            myStage.close();
        } catch (IOException ex) {
            Logger.getLogger(AgregarProductoController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Sistema getSistema() {
        return sistema;
    }

    public void setSistema(Sistema sistema) {
        this.sistema = sistema;
    }

    @FXML
    private void obtenerDescripcion(ActionEvent event) {
    }
}
