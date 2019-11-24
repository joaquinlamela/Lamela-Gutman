/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz2;

import Dominio.Envase;
import Dominio.PreVenta;
import Dominio.Producto;
import Dominio.Sistema;
import Dominio.Sucursal;
import Dominio.Tienda;
import Dominio.Venta;
import Dominio.tipoMaterial;
import Dominio.tipoOrigen;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

/**
 *
 * @author user
 */
public class ObligatorioIngenieriaSoftware extends Application {

    @Override
    public void start(Stage stage) throws Exception {

        try {
            
            Sistema sistema = new Sistema();

            FXMLLoader loader = new FXMLLoader(getClass().getResource("Inicio.fxml"));

            Parent root = loader.load();

            InicioController controlador = loader.getController();

            Scene escena = new Scene(root);
            
            stage.setScene(escena);

            stage.show();
            
            stage.setHeight(675);
            
            stage.setWidth(366);
            
            stage.setResizable(false);
            
            //Se inicializa la tienda y las sucursales
            Tienda t = new Tienda();
            t.setDireccion("Cuareim 1451, esquina Mercedes");
            
            sistema.setEchToShop(t);
            
            //Se inicializan las sucursales
            Sucursal s1= new Sucursal();
            s1.setDireccion("Cuareim 1451, esquina Mercedes");
            s1.setTelefono(29021505);
            sistema.agregarSucursal(s1);
            
            Sucursal s2= new Sucursal();
            s2.setDireccion("Rambla República del Perú 1413");
            s2.setTelefono(21234567);
            sistema.agregarSucursal(s2);
            
            Sucursal s3= new Sucursal();
            s3.setDireccion("Dr. Alfredo Navarro 3068");
            s3.setTelefono(27876543);
            sistema.agregarSucursal(s3);
            
            Sucursal s4= new Sucursal();
            s4.setDireccion("Av. Gral. Rivera 4901");
            s4.setTelefono(26008998);
            sistema.agregarSucursal(s4);
            
            //Se inicializan los envases
            Envase envasePlantas = new Envase();
            
            envasePlantas.setNombre("Envase Plantas");
            envasePlantas.setPesoMaximoSoportado(20);
            ArrayList<tipoMaterial> materiales1 = new ArrayList<>();
            materiales1.add(tipoMaterial.Carton);
            envasePlantas.setTiposDeMateriales(materiales1);
            
            sistema.getEchoShop().agregarEnvase(envasePlantas);
            
            Envase envaseAlimentos = new Envase();
            
            envaseAlimentos.setNombre("Envase Alimentos");
            envaseAlimentos.setPesoMaximoSoportado(30);
            ArrayList<tipoMaterial> materiales2 = new ArrayList<>();
            materiales2.add(tipoMaterial.Plastico);
            envaseAlimentos.setTiposDeMateriales(materiales2);
            
            sistema.getEchoShop().agregarEnvase(envaseAlimentos);
            
            Envase envaseSemillas = new Envase();
            
            envaseSemillas.setNombre("Envase Semillas");
            envaseSemillas.setPesoMaximoSoportado(15);
            ArrayList<tipoMaterial> materiales3 = new ArrayList<>();
            materiales3.add(tipoMaterial.Carton);
            envaseSemillas.setTiposDeMateriales(materiales3);
            
            sistema.getEchoShop().agregarEnvase(envaseSemillas);
            
            Envase envaseElectrodomesticos = new Envase();
            
            envaseElectrodomesticos.setNombre("Envase Semillas");
            envaseElectrodomesticos.setPesoMaximoSoportado(50);
            ArrayList<tipoMaterial> materiales4 = new ArrayList<>();
            materiales4.add(tipoMaterial.Metal);
            envaseElectrodomesticos.setTiposDeMateriales(materiales4);
            
            sistema.getEchoShop().agregarEnvase(envaseElectrodomesticos);
            
            //Se inicializan los productos
            
            ArrayList<tipoMaterial> tipoProductos = new ArrayList<>();
            tipoProductos.add(tipoMaterial.Indefinido);
            
            // Producto: Menta
            File f1 = new File("src/Imagenes/menta.jpg");     
            Image i1 = new Image(f1.toURI().toString());
            
            ArrayList<Envase> envasesRecomendados1 = new ArrayList<>();
            envasesRecomendados1.add(envasePlantas);
            Producto menta = new Producto("Menta", tipoOrigen.Vegetal, 
                    "Planta de menta, deliciciosos sabor y olor", 1, 10, 1, 
                    envasesRecomendados1, tipoProductos,0, i1);
            sistema.getEchoShop().agregarProducto(menta);
            
            
            // Producto: Semillas de cacao
            File f2 = new File("src/Imagenes/semillasCacao.jpg");     
            Image i2 = new Image(f2.toURI().toString());
            
            ArrayList<Envase> envasesRecomendados2 = new ArrayList<>();
            envasesRecomendados2.add(envaseSemillas);
            envasesRecomendados2.add(envaseAlimentos);
            Producto cacao = new Producto("Cacao", tipoOrigen.Vegetal, 
                    "Semillas de cacao, para plantar y condimentar", 1, 5, 2, 
                       envasesRecomendados2, tipoProductos,0, i2);
            sistema.getEchoShop().agregarProducto(cacao);
            
            // Producto: Pastafrola
            File f3 = new File("src/Imagenes/pastafrola.jpg");     
            Image i3 = new Image(f3.toURI().toString());
            
            ArrayList<Envase> envasesRecomendados3 = new ArrayList<>();
            envasesRecomendados3.add(envaseAlimentos);
            Producto pastafrola = new Producto("Pastafrola", tipoOrigen.Vegetal, 
                    "Tarta de pastafrola, gustos a eleccion", 5, 50, 3, 
                       envasesRecomendados3, tipoProductos,0, i3);
            sistema.getEchoShop().agregarProducto(pastafrola);
            
            //Se setea el sistema en la interface
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
