/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz2;

import Dominio.Envase;
import Dominio.Persona;
import Dominio.PreVenta;
import Dominio.Producto;
import Dominio.Sistema;
import Dominio.Sucursal;
import Dominio.Tienda;
import Dominio.Venta;
import Dominio.TipoMateriales;
import Dominio.TipoOrigen;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
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

        
        //Poner imagenes a los productos
        
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
            
            File fi1 = new File("src/Imagenes/EnvasePlanta.jpg");     
            Image e1 = new Image(fi1.toURI().toString());
            
            envasePlantas.setNombre("Envase Plantas");
            envasePlantas.setPesoMaximoSoportado(20);
            ArrayList<TipoMateriales> materiales1 = new ArrayList<>();
            materiales1.add(TipoMateriales.Carton);
            envasePlantas.setTiposDeMateriales(materiales1);
            envasePlantas.setImagenDelProducto(e1);
            
            sistema.getEchoShop().agregarEnvase(envasePlantas);
            
            Envase envaseAlimentos = new Envase();
            
            File fi2 = new File("src/Imagenes/EnvaseAlimentos.jpg");     
            Image e2 = new Image(fi2.toURI().toString());
            
            envaseAlimentos.setNombre("Envase Alimentos");
            envaseAlimentos.setPesoMaximoSoportado(30);
            ArrayList<TipoMateriales> materiales2 = new ArrayList<>();
            materiales2.add(TipoMateriales.Plastico);
            envaseAlimentos.setTiposDeMateriales(materiales2);
            envaseAlimentos.setImagenDelProducto(e2);
            
            sistema.getEchoShop().agregarEnvase(envaseAlimentos);
            
            Envase envaseSemillas = new Envase();
            
            File fi3 = new File("src/Imagenes/EnvaseSemilla.jpg");     
            Image e3 = new Image(fi3.toURI().toString());
            
            envaseSemillas.setNombre("Envase Semillas");
            envaseSemillas.setPesoMaximoSoportado(15);
            ArrayList<TipoMateriales> materiales3 = new ArrayList<>();
            materiales3.add(TipoMateriales.Carton);
            envaseSemillas.setTiposDeMateriales(materiales3);
            envaseSemillas.setImagenDelProducto(e3);
            
            sistema.getEchoShop().agregarEnvase(envaseSemillas);
            
            Envase envaseElectrodomesticos = new Envase();
            
            File fi4 = new File("src/Imagenes/EnvaseSemilla.jpg");     
            Image e4 = new Image(fi4.toURI().toString());
            
            envaseElectrodomesticos.setNombre("Envase Electrodomesticos");
            envaseElectrodomesticos.setPesoMaximoSoportado(50);
            ArrayList<TipoMateriales> materiales4 = new ArrayList<>();
            materiales4.add(TipoMateriales.Metal);
            envaseElectrodomesticos.setTiposDeMateriales(materiales4);
            envaseElectrodomesticos.setImagenDelProducto(e4);
            
            sistema.getEchoShop().agregarEnvase(envaseElectrodomesticos);
            
            //Se inicializan los productos
            
            ArrayList<TipoMateriales> tipoProductos = new ArrayList<>();
            tipoProductos.add(TipoMateriales.Indefinido);
            
            // Producto: Menta
            File f1 = new File("src/Imagenes/menta.jpg");     
            Image i1 = new Image(f1.toURI().toString());
            
            ArrayList<Envase> envasesRecomendados1 = new ArrayList<>();
            envasesRecomendados1.add(envasePlantas);
            Producto menta = new Producto("Menta", TipoOrigen.Vegetal, 
                    "Planta de menta, deliciciosos sabor y olor", 1, 10, 1, 
                    envasesRecomendados1, tipoProductos,0, i1);
            sistema.getEchoShop().agregarProducto(menta);
            
            
            // Producto: Semillas de cacao
            File f2 = new File("src/Imagenes/semillasCacao.jpg");     
            Image i2 = new Image(f2.toURI().toString());
            
            ArrayList<Envase> envasesRecomendados2 = new ArrayList<>();
            envasesRecomendados2.add(envaseSemillas);
            envasesRecomendados2.add(envaseAlimentos);
            Producto cacao = new Producto("Cacao", TipoOrigen.Vegetal, 
                    "Semillas de cacao, para plantar y condimentar", 1, 5, 2, 
                       envasesRecomendados2, tipoProductos,0, i2);
            sistema.getEchoShop().agregarProducto(cacao);
            
            // Producto: Pastafrola
            File f3 = new File("src/Imagenes/pastafrola.jpg");     
            Image i3 = new Image(f3.toURI().toString());
            
            ArrayList<Envase> envasesRecomendados3 = new ArrayList<>();
            envasesRecomendados3.add(envaseAlimentos);
            Producto pastafrola = new Producto("Pastafrola", TipoOrigen.Vegetal, 
                    "Tarta de pastafrola, gustos a eleccion", 5, 50, 3, 
                       envasesRecomendados3, tipoProductos,0, i3);
            sistema.getEchoShop().agregarProducto(pastafrola);
            
            //Producto: Mandarinas
            File f4 = new File("src/Imagenes/mandarinas.jpg");     
            Image i4 = new Image(f4.toURI().toString());
            
            ArrayList<Envase> envasesRecomendados4 = new ArrayList<>();
            envasesRecomendados4.add(envasePlantas);
            Producto mandarinas = new Producto("Mandarina", TipoOrigen.Vegetal, 
                    "Delicosas mandarinas, jugosas.", 2, 5, 4, 
                    envasesRecomendados4, tipoProductos,0, i4);
            sistema.getEchoShop().agregarProducto(mandarinas);
            
           //Producto: Frijoles 
            File f5 = new File("src/Imagenes/Frijoles.jpg");     
            Image i5 = new Image(f5.toURI().toString());
            
            ArrayList<Envase> envasesRecomendados5 = new ArrayList<>();
            envasesRecomendados5.add(envaseSemillas);
            Producto frijoles = new Producto("Frijoles", TipoOrigen.Vegetal, 
                    "Para el guiso del domingo ", 5, 15, 5, 
                    envasesRecomendados5, tipoProductos,0, i5);
            sistema.getEchoShop().agregarProducto(frijoles);
            
            //Producto: Pizza
            File f6 = new File("src/Imagenes/Pizza.jpg");     
            Image i6 = new Image(f6.toURI().toString());
            
            ArrayList<Envase> envasesRecomendados6 = new ArrayList<>();
            envasesRecomendados6.add(envaseAlimentos);
            Producto pizza = new Producto("Pizza para llevar", TipoOrigen.Indefinido, 
                    "Pizza recien hecha, deliciosa ", 1, 100, 6, 
                    envasesRecomendados6, tipoProductos,0, i6);
            sistema.getEchoShop().agregarProducto(pizza);
            
            
            //Se inicializan las ventas en el sistema
            //Venta 1
            ArrayList<Producto> listaDeProductos1 = new ArrayList<>();
            listaDeProductos1.add(menta);
            listaDeProductos1.add(pizza);
            listaDeProductos1.add(pastafrola);
            sistema.setProductosAVenderEnSesionActiva(listaDeProductos1);
            int[] cantidadesPorId = {0, 10,0, 2, 0, 0, 4};
            sistema.setCantidadPorIdDeProd(cantidadesPorId);
            
            int precioTotal = 0;
            for (int i = 0; i < listaDeProductos1.size(); i++) {
                sistema.getProductosAVenderEnSesionActiva().get(i).setCantidadVendidos(
                        sistema.getProductosAVenderEnSesionActiva().get(i).getCantidadVendidos()
                        + sistema.getCantidadPorIdDeProd()[listaDeProductos1.get(i).getCodigoIdentificador()]);
                precioTotal += (listaDeProductos1.get(i).getPrecio() * sistema.getCantidadPorIdDeProd()[listaDeProductos1.get(i).getCodigoIdentificador()]);
            }
            
            ArrayList<Envase> uti1 = new ArrayList<>();
            uti1.add(envaseAlimentos);
            Date fecha = new Date();
            fecha.setMonth(7);
            Persona comprador = new Persona();
            Tienda tienda = sistema.getEchoShop();
            ArrayList<Envase> listaDeEnvasesUtilizados = uti1;
            int codigoIdentificador = 1;
            String direccionComprador = comprador.getDomicilio();
            Venta ventaAgregar1 = new Venta(listaDeProductos1, precioTotal, cantidadesPorId,
                    fecha, comprador, tienda, listaDeEnvasesUtilizados, codigoIdentificador,
                    direccionComprador);
            sistema.agregarVenta(ventaAgregar1);
            
            sistema.agregarUnaVentaAlArray(ventaAgregar1);
            sistema.agregarGananciaEnVenta(ventaAgregar1);
            
            for (int i = 0; i < listaDeEnvasesUtilizados.size(); i++) {
                sistema.getEnvasesUtilizadosPorId()[listaDeEnvasesUtilizados.get(i).getIdIdentificador()]++; 
            }
            
            //Venta 2
            ArrayList<Producto> listaDeProductos = new ArrayList<>();
            listaDeProductos.add(frijoles);
            listaDeProductos.add(mandarinas);
            listaDeProductos.add(cacao);
            sistema.setProductosAVenderEnSesionActiva(listaDeProductos);
            int[] cantidadesPorId2 = {0, 0,9, 0, 15, 2, 0};
            sistema.setCantidadPorIdDeProd(cantidadesPorId2);
            
            int precioTotal2 = 0;
            for (int i = 0; i < listaDeProductos.size(); i++) {
                sistema.getProductosAVenderEnSesionActiva().get(i).setCantidadVendidos(
                        sistema.getProductosAVenderEnSesionActiva().get(i).getCantidadVendidos()
                        + sistema.getCantidadPorIdDeProd()[listaDeProductos.get(i).getCodigoIdentificador()]);
                precioTotal2 += (listaDeProductos.get(i).getPrecio() * sistema.getCantidadPorIdDeProd()[listaDeProductos.get(i).getCodigoIdentificador()]);
            }
            
            ArrayList<Envase> uti2 = new ArrayList<>();
            uti2.add(envasePlantas);
            uti2.add(envaseAlimentos);
            uti2.add(envaseSemillas);
            Date fecha2 = new Date();
            fecha2.setMonth(4);
            Persona comprador2 = new Persona();
            Tienda tienda2 = sistema.getEchoShop();
            ArrayList<Envase> listaDeEnvasesUtilizados2 = uti2;
            int codigoIdentificador2 = 2;
            String direccionComprador2 = comprador2.getDomicilio();
            Venta ventaAgregar2 = new Venta(listaDeProductos, precioTotal2, cantidadesPorId2,
                    fecha2, comprador2, tienda2, listaDeEnvasesUtilizados2, codigoIdentificador2,
                    direccionComprador2);
            sistema.agregarVenta(ventaAgregar2);
            
            sistema.agregarUnaVentaAlArray(ventaAgregar2);
            sistema.agregarGananciaEnVenta(ventaAgregar2);
            
            for (int i = 0; i < listaDeEnvasesUtilizados2.size(); i++) {
                sistema.getEnvasesUtilizadosPorId()[listaDeEnvasesUtilizados2.get(i).getIdIdentificador()]++; 
            }
            
            sistema.getProductosAVenderEnSesionActiva().clear();
            
            for (int i = 0; i < sistema.getCantidadPorIdDeProd().length; i++) {
                sistema.getCantidadPorIdDeProd()[i] = 0;
            }
            
            sistema.getEnvasesALlevarEnVenta().clear();
            
            
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
