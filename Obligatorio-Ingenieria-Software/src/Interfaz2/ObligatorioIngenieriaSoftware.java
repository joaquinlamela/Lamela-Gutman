/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz2;

import Dominio.PreVenta;
import Dominio.Sistema;
import Dominio.Tienda;
import Dominio.Venta;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author user
 */
public class ObligatorioIngenieriaSoftware extends Application {

    @Override
    public void start(Stage stage) throws Exception {

        try {
            ArrayList<Venta> ventas = new ArrayList<>();
            ArrayList<PreVenta> preVentas = new ArrayList<>();
            Tienda echoShop = new Tienda();
            Sistema sistema = new Sistema(ventas, preVentas, echoShop);

            FXMLLoader loader = new FXMLLoader(getClass().getResource("Inicio.fxml"));

            Parent root = loader.load();

            InicioController controlador = loader.getController();

            Scene escena = new Scene(root);
            
            stage.setScene(escena);

            stage.show();

            controlador.setSistema(sistema);

        } catch (IOException ex) {
            Logger.getLogger(InicioController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        launch(args);
    }

}
