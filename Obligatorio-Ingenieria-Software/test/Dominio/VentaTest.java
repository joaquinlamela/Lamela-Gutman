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
    /* FALTAN LOS METODOS DE ARRAYLIST DE PRODUCTOS
    TODO metodos*/

    /**
     * Test of getPrecioTotal method, of class Venta.
     */
    @Test
    public void testGetPrecioTotal() {
        System.out.println("getPrecioTotal");
        Venta instance = new Venta();
        int expResult = 0;
        int result = instance.getPrecioTotal();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPrecioTotal method, of class Venta.
     */
    @Test
    public void testSetPrecioTotal() {
        System.out.println("setPrecioTotal");
        int precioTotal = 0;
        Venta instance = new Venta();
        instance.setPrecioTotal(precioTotal);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCantidadesPorProducto method, of class Venta.
     */
    @Test
    public void testGetCantidadesPorProducto() {
        System.out.println("getCantidadesPorProducto");
        Venta instance = new Venta();
        int[] expResult = null;
        int[] result = instance.getCantidadesPorProducto();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCantidadesPorProducto method, of class Venta.
     */
    @Test
    public void testSetCantidadesPorProducto() {
        System.out.println("setCantidadesPorProducto");
        int[] cantidadesPorProducto = null;
        Venta instance = new Venta();
        instance.setCantidadesPorProducto(cantidadesPorProducto);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFechaDeCompra method, of class Venta.
     */
    @Test
    public void testGetFechaDeCompra() {
        System.out.println("getFechaDeCompra");
        Venta instance = new Venta();
        Date expResult = null;
        Date result = instance.getFechaDeCompra();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFechaDeCompra method, of class Venta.
     */
    @Test
    public void testSetFechaDeCompra() {
        System.out.println("setFechaDeCompra");
        Date fechaDeCompra = null;
        Venta instance = new Venta();
        instance.setFechaDeCompra(fechaDeCompra);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getComprador method, of class Venta.
     */
    @Test
    public void testGetComprador() {
        System.out.println("getComprador");
        Venta instance = new Venta();
        Persona expResult = null;
        Persona result = instance.getComprador();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setComprador method, of class Venta.
     */
    @Test
    public void testSetComprador() {
        System.out.println("setComprador");
        Persona comprador = null;
        Venta instance = new Venta();
        instance.setComprador(comprador);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTipoDePago method, of class Venta.
     */
    @Test
    public void testGetTipoDePago() {
        System.out.println("getTipoDePago");
        Venta instance = new Venta();
        tipoPago expResult = null;
        tipoPago result = instance.getTipoDePago();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTipoDePago method, of class Venta.
     */
    @Test
    public void testSetTipoDePago() {
        System.out.println("setTipoDePago");
        tipoPago tipoDePago = null;
        Venta instance = new Venta();
        instance.setTipoDePago(tipoDePago);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEchoShop method, of class Venta.
     */
    @Test
    public void testGetEchoShop() {
        System.out.println("getEchoShop");
        Venta instance = new Venta();
        Tienda expResult = null;
        Tienda result = instance.getEchoShop();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEchoShop method, of class Venta.
     */
    @Test
    public void testSetEchoShop() {
        System.out.println("setEchoShop");
        Tienda echoShop = null;
        Venta instance = new Venta();
        instance.setEchoShop(echoShop);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListaDeEnvasesUtilizados method, of class Venta.
     */
    @Test
    public void testGetListaDeEnvasesUtilizados() {
        System.out.println("getListaDeEnvasesUtilizados");
        Venta instance = new Venta();
        ArrayList<Envase> expResult = null;
        ArrayList<Envase> result = instance.getListaDeEnvasesUtilizados();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setListaDeEnvasesUtilizados method, of class Venta.
     */
    @Test
    public void testSetListaDeEnvasesUtilizados() {
        System.out.println("setListaDeEnvasesUtilizados");
        ArrayList<Envase> listaDeEnvasesUtilizados = null;
        Venta instance = new Venta();
        instance.setListaDeEnvasesUtilizados(listaDeEnvasesUtilizados);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCodigoIdentificadorDeVenta method, of class Venta.
     */
    @Test
    public void testGetCodigoIdentificadorDeVenta() {
        System.out.println("getCodigoIdentificadorDeVenta");
        Venta instance = new Venta();
        int expResult = 0;
        int result = instance.getCodigoIdentificadorDeVenta();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCodigoIdentificadorDeVenta method, of class Venta.
     */
    @Test
    public void testSetCodigoIdentificadorDeVenta() {
        System.out.println("setCodigoIdentificadorDeVenta");
        int codigoIdentificadorDeVenta = 0;
        Venta instance = new Venta();
        instance.setCodigoIdentificadorDeVenta(codigoIdentificadorDeVenta);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDireccionAEnviar method, of class Venta.
     */
    @Test
    public void testGetDireccionAEnviar() {
        System.out.println("getDireccionAEnviar");
        Venta instance = new Venta();
        String expResult = "";
        String result = instance.getDireccionAEnviar();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDireccionAEnviar method, of class Venta.
     */
    @Test
    public void testSetDireccionAEnviar() {
        System.out.println("setDireccionAEnviar");
        String direccionAEnviar = "";
        Venta instance = new Venta();
        instance.setDireccionAEnviar(direccionAEnviar);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMes method, of class Venta.
     */
    @Test
    public void testGetMes() {
        System.out.println("getMes");
        Venta instance = new Venta();
        int expResult = 0;
        int result = instance.getMes();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMes method, of class Venta.
     */
    @Test
    public void testSetMes() {
        System.out.println("setMes");
        int mes = 0;
        Venta instance = new Venta();
        instance.setMes(mes);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of agregarProductosALaVenta method, of class Venta.
     */
    @Test
    public void testAgregarProductosALaVenta() {
        System.out.println("agregarProductosALaVenta");
        Producto producto = null;
        Venta instance = new Venta();
        instance.agregarProducto(producto);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of eliminarProductosDeLaVenta method, of class Venta.
     */
    @Test
    public void testEliminarProductosDeLaVenta() {
        System.out.println("eliminarProductosDeLaVenta");
        Producto producto = null;
        Venta instance = new Venta();
        instance.eliminarProducto(producto);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
