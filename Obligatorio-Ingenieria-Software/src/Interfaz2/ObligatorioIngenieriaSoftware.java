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
import java.util.ArrayList;
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
        Parent root = FXMLLoader.load(getClass().getResource("Inicio.fxml"));
        
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Venta> ventas = new ArrayList<>();
        ArrayList<PreVenta> preVentas = new ArrayList<>();
        Tienda echoShop = new Tienda();
        Sistema s = new Sistema(ventas, preVentas, echoShop);
        
        launch(args);
    }
    
}
