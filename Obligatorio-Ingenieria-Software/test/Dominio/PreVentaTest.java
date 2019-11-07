/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dominio;

import java.util.ArrayList;
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
public class PreVentaTest {
    
    public PreVentaTest() {
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
     * Test of getComprador method, of class PreVenta.
     */
    @Test
    public void testGetComprador() {
        System.out.println("getComprador");
        PreVenta instance = new PreVenta();
        Persona expResult = null;
        Persona result = instance.getComprador();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setComprador method, of class PreVenta.
     */
    @Test
    public void testSetComprador() {
        System.out.println("setComprador");
        Persona comprador = null;
        PreVenta instance = new PreVenta();
        instance.setComprador(comprador);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPrecioDePreVenta method, of class PreVenta.
     */
    @Test
    public void testGetPrecioDePreVenta() {
        System.out.println("getPrecioDePreVenta");
        PreVenta instance = new PreVenta();
        int expResult = 0;
        int result = instance.getPrecioDePreVenta();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPrecioDePreVenta method, of class PreVenta.
     */
    @Test
    public void testSetPrecioDePreVenta() {
        System.out.println("setPrecioDePreVenta");
        int precioDePreVenta = 0;
        PreVenta instance = new PreVenta();
        instance.setPrecioDePreVenta(precioDePreVenta);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListaDeProductos method, of class PreVenta.
     */
    @Test
    public void testGetListaDeProductos() {
        System.out.println("getListaDeProductos");
        PreVenta instance = new PreVenta();
        ArrayList<Producto> expResult = null;
        ArrayList<Producto> result = instance.getListaDeProductos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setListaDeProductos method, of class PreVenta.
     */
    @Test
    public void testSetListaDeProductos() {
        System.out.println("setListaDeProductos");
        ArrayList<Producto> listaDeProductos = null;
        PreVenta instance = new PreVenta();
        instance.setListaDeProductos(listaDeProductos);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLugarARetirar method, of class PreVenta.
     */
    @Test
    public void testGetLugarARetirar() {
        System.out.println("getLugarARetirar");
        PreVenta instance = new PreVenta();
        Tienda expResult = null;
        Tienda result = instance.getLugarARetirar();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLugarARetirar method, of class PreVenta.
     */
    @Test
    public void testSetLugarARetirar() {
        System.out.println("setLugarARetirar");
        Tienda lugarARetirar = null;
        PreVenta instance = new PreVenta();
        instance.setLugarARetirar(lugarARetirar);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTipoDePagoDefinido method, of class PreVenta.
     */
    @Test
    public void testGetTipoDePagoDefinido() {
        System.out.println("getTipoDePagoDefinido");
        PreVenta instance = new PreVenta();
        tipoPago expResult = null;
        tipoPago result = instance.getTipoDePagoDefinido();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTipoDePagoDefinido method, of class PreVenta.
     */
    @Test
    public void testSetTipoDePagoDefinido() {
        System.out.println("setTipoDePagoDefinido");
        tipoPago tipoDePagoDefinido = null;
        PreVenta instance = new PreVenta();
        instance.setTipoDePagoDefinido(tipoDePagoDefinido);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListaDeEnvase method, of class PreVenta.
     */
    @Test
    public void testGetListaDeEnvase() {
        System.out.println("getListaDeEnvase");
        PreVenta instance = new PreVenta();
        ArrayList<Envase> expResult = null;
        ArrayList<Envase> result = instance.getListaDeEnvase();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setListaDeEnvase method, of class PreVenta.
     */
    @Test
    public void testSetListaDeEnvase() {
        System.out.println("setListaDeEnvase");
        ArrayList<Envase> listaDeEnvase = null;
        PreVenta instance = new PreVenta();
        instance.setListaDeEnvase(listaDeEnvase);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getIdentificadorDePreventa method, of class PreVenta.
     */
    @Test
    public void testGetIdentificadorDePreventa() {
        System.out.println("getIdentificadorDePreventa");
        PreVenta instance = new PreVenta();
        int expResult = 0;
        int result = instance.getIdentificadorDePreventa();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIdentificadorDePreventa method, of class PreVenta.
     */
    @Test
    public void testSetIdentificadorDePreventa() {
        System.out.println("setIdentificadorDePreventa");
        int identificadorDePreventa = 0;
        PreVenta instance = new PreVenta();
        instance.setIdentificadorDePreventa(identificadorDePreventa);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class PreVenta.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object o = null;
        PreVenta instance = new PreVenta();
        boolean expResult = false;
        boolean result = instance.equals(o);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
