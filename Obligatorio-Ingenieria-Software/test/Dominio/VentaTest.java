/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dominio;

import java.util.ArrayList;
import java.util.Date;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author PC
 */
public class VentaTest {
    
    public VentaTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getListaDeProductosAVender method, of class Venta.
     */
    
    @Test
    public void testGetListaDeProductos1() {
        //System.out.println("getListaDeProductos");
        Venta instance = new Venta();
        ArrayList<Producto> a = new ArrayList<>();
        Producto p = new Producto();
        p.setCodigoIdentificador(18);
        Producto f = new Producto();
        instance.agregarProducto(f);
        instance.agregarProducto(p);
        a.add(f);
        a.add(p);
        ArrayList<Producto> expResult = a;
        ArrayList<Producto> result = instance.getListaDeProductosAVender();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    @Test
    public void testGetListaDeProductos2() {
        //System.out.println("getListaDeProductos");
        Venta instance = new Venta();
        ArrayList<Producto> a = new ArrayList<>();
        Producto p = new Producto();
        p.setCodigoIdentificador(18);
        Producto f = new Producto();
        Producto g = new Producto();
        f = g;
        instance.agregarProducto(f);
        instance.agregarProducto(p);
        instance.agregarProducto(g);
        
        a.add(f);
        a.add(p);
        ArrayList<Producto> expResult = a;
        ArrayList<Producto> result = instance.getListaDeProductosAVender();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testGetListaDeProductos3() {
        //System.out.println("getListaDeProductos");
        Venta instance = new Venta();
        ArrayList<Producto> a = new ArrayList<>();
        Producto p = new Producto();
        p.setCodigoIdentificador(18);
        Producto f = new Producto();
        Producto g = new Producto();
        g = f;
        instance.agregarProducto(f);
        instance.agregarProducto(p);
        instance.agregarProducto(g);
        instance.eliminarProducto(f);
        
        a.add(p);
        ArrayList<Producto> expResult = a;
        ArrayList<Producto> result = instance.getListaDeProductosAVender();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    /**
     * Test of setListaDeProductos method, of class Venta.
     */
    
    @Test
    public void testGetListaDeProductos4() {
        //System.out.println("getListaDeProductos");
        Venta instance = new Venta();
        ArrayList<Producto> a = new ArrayList<>();
        Producto p = new Producto();
        p.setCodigoIdentificador(18);
        Producto f = new Producto();
        Producto g = new Producto();
        g =f;
        instance.agregarProducto(f);
        instance.agregarProducto(p);
        instance.agregarProducto(g);
        instance.eliminarProducto(f);
        instance.eliminarProducto(p);
        
        ArrayList<Producto> expResult = a;
        ArrayList<Producto> result = instance.getListaDeProductosAVender();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testSetListaDeProductos() {
        //System.out.println("setListaDeProductos");
        ArrayList<Producto> listaDeProductos = null;
        Venta instance = new Venta();
        instance.setListaDeProductosAVender(listaDeProductos);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    /**
     * Test of getPrecioTotal method, of class Venta.
     */
    @Test(expected = RuntimeException.class)
    public void testGetPrecioDeVenta1() {
        //System.out.println("getPrecioTotal");
        Venta instance = new Venta();
        instance.setPrecioTotal(0);
        int expResult = 0;
        int result = instance.getPrecioTotal();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test(expected = RuntimeException.class)
    public void testGetPrecioDeVenta2() {
        //System.out.println("getPrecioTotal");
        Venta instance = new Venta();
        instance.setPrecioTotal(-1);
        int expResult = -1;
        int result = instance.getPrecioTotal();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testGetPrecioDeVenta3() {
        //System.out.println("getPrecioTotal");
        Venta instance = new Venta();
        instance.setPrecioTotal(1);
        int expResult = 1;
        int result = instance.getPrecioTotal();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testGetPrecioDeVenta4() {
        //System.out.println("getPrecioTotal");
        Venta instance = new Venta();
        instance.setPrecioTotal(100);
        int expResult = 100;
        int result = instance.getPrecioTotal();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testGetPrecioDeVenta5() {
        //System.out.println("getPrecioTotal");
        Venta instance = new Venta();
        instance.setPrecioTotal(100000);
        int expResult = 100000;
        int result = instance.getPrecioTotal();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    /**
     * Test of setPrecioTotal method, of class Venta.
     */
    @Test(expected = RuntimeException.class)
    public void testSetPrecioDeVenta1() {
        //System.out.println("setPrecioTotal");
        int precioDeVenta = 0;
        Venta instance = new Venta();
        instance.setPrecioTotal(precioDeVenta);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    @Test(expected = RuntimeException.class)
    public void testSetPrecioDeVenta2() {
        //System.out.println("setPrecioTotal");
        int precioDeVenta = -8;
        Venta instance = new Venta();
        instance.setPrecioTotal(precioDeVenta);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testSetPrecioDeVenta3() {
        //System.out.println("setPrecioTotal");
        int precioDeVenta = 1;
        Venta instance = new Venta();
        instance.setPrecioTotal(precioDeVenta);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testSetPrecioDeVenta4() {
        //System.out.println("setPrecioTotal");
        int precioDeVenta = 100;
        Venta instance = new Venta();
        instance.setPrecioTotal(precioDeVenta);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testSetPrecioDeVenta5() {
        //System.out.println("setPrecioTotal");
        int precioDeVenta = 10000;
        Venta instance = new Venta();
        instance.setPrecioTotal(precioDeVenta);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getCantidadesPorProducto method, of class Venta.
     */

    /**
     * Test of getFechaDeCompra method, of class Venta.
     */
    @Test
    public void testGetFechaDeCompra() {
        //System.out.println("getFechaDeCompra");
        Venta instance = new Venta();
        Date a = new Date();
        instance.setFechaDeCompra(a);
        Date expResult = a;
        Date result = instance.getFechaDeCompra();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setFechaDeCompra method, of class Venta.
     */
    @Test
    public void testSetFechaDeCompra() {
        //System.out.println("setFechaDeCompra");
        Date fechaDeCompra = null;
        Venta instance = new Venta();
        instance.setFechaDeCompra(fechaDeCompra);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    @Test
    public void testGetComprador1() {
        //System.out.println("getComprador");
        Venta instance = new Venta();
        Persona p = new Persona();
        instance.setComprador(p);
        Persona expResult = p;
        Persona result = instance.getComprador();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    @Test
    public void testGetComprador2() {
        //System.out.println("getComprador");
        Venta instance = new Venta();
        Persona p = new Persona("Diego", 19, "Cuareim", "Rut");
        instance.setComprador(p);
        Persona expResult = p;
        Persona result = instance.getComprador();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    /**
     * Test of setComprador method, of class Venta.
     */
    @Test
    public void testSetComprador1() {
        //System.out.println("setComprador");
        Persona comprador = new Persona();
        Venta instance = new Venta();
        instance.setComprador(comprador);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    @Test
    public void testSetComprador2() {
        //System.out.println("setComprador");
        Persona comprador = new Persona("Martin", 19, "Mercedes", "Rut2");
        Venta instance = new Venta();
        instance.setComprador(comprador);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    

    /**
     * Test of getEchoShop method, of class Venta.
     */
    @Test
    public void testGetEchoShop() {
        //System.out.println("getEchoShop");
        Venta instance = new Venta();
        Tienda t = new Tienda();
        Tienda expResult = t;
        instance.setEchoShop(t);
        Tienda result = instance.getEchoShop();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setEchoShop method, of class Venta.
     */
    @Test
    public void testSetEchoShop() {
        //System.out.println("setEchoShop");
        Tienda t = new Tienda();
        Tienda echoShop = t;
        Venta instance = new Venta();
        instance.setEchoShop(echoShop);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getListaDeEnvasesUtilizados method, of class Venta.
     */
    @Test
    public void testGetListaDeEnvase1() {
        //System.out.println("getListaDeEnvase");
        Venta instance = new Venta();
        ArrayList<Envase> a = new ArrayList<>();
        instance.setListaDeEnvasesUtilizados(a);
        ArrayList<Envase> expResult = a;
        ArrayList<Envase> result = instance.getListaDeEnvasesUtilizados();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    @Test
    public void testGetListaDeEnvase2() {
        //System.out.println("getListaDeEnvase");
        Venta instance = new Venta();
        ArrayList<Envase> a = new ArrayList<>();
        Envase e1 = new Envase();
        e1.setNombre("Envase 1");
        instance.agregarEnvase(e1);
        instance.setListaDeEnvasesUtilizados(a);
        Envase e2 = new Envase();
        e2.setNombre("Envase 2");
        instance.agregarEnvase(e2);
        
        a.add(e1);
        a.add(e2);
        ArrayList<Envase> expResult = a;
        ArrayList<Envase> result = instance.getListaDeEnvasesUtilizados();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testGetListaDeEnvase3() {
        //System.out.println("getListaDeEnvase");
        Venta instance = new Venta();
        ArrayList<Envase> a = new ArrayList<>();
        Envase e1 = new Envase();
        e1.setNombre("Envase 1");
        instance.agregarEnvase(e1);
        instance.setListaDeEnvasesUtilizados(a);
        Envase e2 = new Envase();
        e2.setNombre("Envase 2");
        instance.agregarEnvase(e2);
        Envase e3 = new Envase();
        e3.setNombre("Envase 2");
        instance.agregarEnvase(e3);
        
        
        a.add(e1);
        a.add(e2);
        ArrayList<Envase> expResult = a;
        ArrayList<Envase> result = instance.getListaDeEnvasesUtilizados();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
   
    
    @Test
    public void testGetListaDeEnvase4() {
        //System.out.println("getListaDeEnvase");
        Venta instance = new Venta();
        ArrayList<Envase> a = new ArrayList<>();
        Envase e1 = new Envase();
        e1.setNombre("Envase 1");
        instance.agregarEnvase(e1);
        instance.setListaDeEnvasesUtilizados(a);
        Envase e2 = new Envase();
        e2.setNombre("Envase 2");
        instance.agregarEnvase(e2);
        Envase e3 = new Envase();
        e3.setNombre("Envase 2");
        instance.agregarEnvase(e3);
        instance.eliminarEnvase(e2);
        
        a.add(e1);
        ArrayList<Envase> expResult = a;
        ArrayList<Envase> result = instance.getListaDeEnvasesUtilizados();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testGetListaDeEnvase5() {
        //System.out.println("getListaDeEnvase");
        Venta instance = new Venta();
        ArrayList<Envase> a = new ArrayList<>();
        Envase e1 = new Envase();
        e1.setNombre("Envase 1");
        instance.agregarEnvase(e1);
        instance.setListaDeEnvasesUtilizados(a);
        Envase e2 = new Envase();
        e2.setNombre("Envase 2");
        instance.agregarEnvase(e2);
        Envase e3 = new Envase();
        e3.setNombre("Envase 2");
        instance.agregarEnvase(e3);
        instance.eliminarEnvase(e2);
        instance.eliminarEnvase(e1);
        
        ArrayList<Envase> expResult = a;
        ArrayList<Envase> result = instance.getListaDeEnvasesUtilizados();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testSetEnvases1() {
        //System.out.println("setPosiblesProductosRecomendados");
        Venta instance = new Venta();
        Envase e = new Envase();
        Envase e2 = new Envase();
        Envase e3 = new Envase();
        ArrayList<Envase> a = new ArrayList<>();
        a.add(e);
        a.add(e2);
        a.add(e3);
        instance.setListaDeEnvasesUtilizados(a);// TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testSetEnvases2() {
        //System.out.println("setPosiblesProductosRecomendados");
        Venta instance = new Venta();
        Envase e = new Envase();
        Envase e2 = new Envase();
        Envase e3 = new Envase();
        ArrayList<Envase> a = new ArrayList<>();
        a.add(e);
        instance.setListaDeEnvasesUtilizados(a);// TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    public void testSetEnvases3() {
        //System.out.println("setPosiblesProductosRecomendados");
        Venta instance = new Venta();
        Envase e = new Envase();
        Envase e2 = new Envase();
        Envase e3 = new Envase();

        ArrayList<Envase> a = new ArrayList<>();
        instance.setListaDeEnvasesUtilizados(a);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getCodigoIdentificadorDeVenta method, of class Venta.
     */
    @Test(expected = RuntimeException.class)
    public void testGetIdentificadorDeVenta1() {
        //System.out.println("getPrecioDeVenta");
        Venta instance = new Venta();
        instance.setCodigoIdentificadorDeVenta(0);
        int expResult = 0;
        int result = instance.getCodigoIdentificadorDeVenta();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    @Test(expected = RuntimeException.class)
    public void testGetIdentificadorDeVenta2() {
        //System.out.println("getPrecioDeVenta");
        Venta instance = new Venta();
        instance.setCodigoIdentificadorDeVenta(-1);
        int expResult = -1;
        int result = instance.getCodigoIdentificadorDeVenta();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testGetIdentificadorDeVenta3() {
        //System.out.println("getPrecioDeVenta");
        Venta instance = new Venta();
        instance.setCodigoIdentificadorDeVenta(1);
        int expResult = 1;
        int result = instance.getCodigoIdentificadorDeVenta();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testGetIdentificadorDeVenta4() {
        //System.out.println("getPrecioDeVenta");
        Venta instance = new Venta();
        instance.setCodigoIdentificadorDeVenta(100);
        int expResult = 100;
        int result = instance.getCodigoIdentificadorDeVenta();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testGetIdentificadorDeVenta5() {
        //System.out.println("getPrecioDeVenta");
        Venta instance = new Venta();
        instance.setCodigoIdentificadorDeVenta(100000);
        int expResult = 100000;
        int result = instance.getCodigoIdentificadorDeVenta();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    /**
     * Test of setPrecioDeVenta method, of class Venta.
     */
    @Test(expected = RuntimeException.class)
    public void testSetIdentificadorDeVenta1() {
        //System.out.println("setPrecioDeVenta");
        int identificadorDeVenta = 0;
        Venta instance = new Venta();
        instance.setCodigoIdentificadorDeVenta(identificadorDeVenta);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    @Test(expected = RuntimeException.class)
    public void testSetIdentificadorDeVenta2() {
        //System.out.println("setPrecioDeVenta");
        int identificadorDeVenta = -8;
        Venta instance = new Venta();
        instance.setCodigoIdentificadorDeVenta(identificadorDeVenta);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testSetIdentificadorDeVenta3() {
        //System.out.println("setPrecioDeVenta");
        int identificadorDeVenta = 1;
        Venta instance = new Venta();
        instance.setCodigoIdentificadorDeVenta(identificadorDeVenta);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testSetIdentificadorDeVenta4() {
        //System.out.println("setPrecioDeVenta");
        int identificadorDeVenta = 100;
        Venta instance = new Venta();
        instance.setCodigoIdentificadorDeVenta(identificadorDeVenta);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testSetIdentificadorDeVenta5() {
        //System.out.println("setPrecioDeVenta");
        int identificadorDeVenta = 10000;
        Venta instance = new Venta();
        instance.setCodigoIdentificadorDeVenta(identificadorDeVenta);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    /**
     * Test of getDireccionAEnviarAEnviar method, of class Venta.
     */
    @Test
    public void testGetDireccion1() {
        ///System.out.println("getDireccionAEnviar");
        Venta instance = new Venta();
        instance.setDireccionAEnviar("mercedes");
        String expResult = "mercedes";
        String result = instance.getDireccionAEnviar();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

        @Test
    public void testGetDireccion2() {
        ///System.out.println("getDireccionAEnviar");
        Venta instance = new Venta();
        instance.setDireccionAEnviar("Cuareim");
        String expResult = "Cuareim";
        String result = instance.getDireccionAEnviar();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    
        @Test(expected = RuntimeException.class)
    public void testGetDireccion3() {
        ///System.out.println("getDireccionAEnviar");
        Venta instance = new Venta();
        instance.setDireccionAEnviar("");
        String expResult = "";
        String result = instance.getDireccionAEnviar();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    
    
        @Test(expected = RuntimeException.class)
    public void testGetDireccion4() {
        ///System.out.println("getDireccionAEnviar");
        Venta instance = new Venta();
        instance.setDireccionAEnviar("    ");
        String expResult = "    ";
        String result = instance.getDireccionAEnviar();
        assertEquals(expResult, result);
       // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    
    /**
     * Test of setDireccionAEnviar method, of class Venta.
     */
    @Test
    public void testSetDireccion1() {
        //System.out.println("setDireccionAEnviar");
        String dir = "Venta1";
        Venta instance = new Venta();
        instance.setDireccionAEnviar(dir);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    @Test(expected = RuntimeException.class)
    public void testSetDireccion2() {
        //System.out.println("setDireccionAEnviar");
        String dir = "";
        Venta instance = new Venta();
        instance.setDireccionAEnviar(dir);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test(expected = RuntimeException.class)
    public void testSetDireccion3() {
        //System.out.println("setDireccionAEnviar");
        String dir = "   ";
        Venta instance = new Venta();
        instance.setDireccionAEnviar(dir);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getMes method, of class Venta.
     */

    /**
     * Test of agregarProductosALaVenta method, of class Venta.
     */

}
