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
public class SistemaTest {
    
    public SistemaTest() {
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
     * Test of getListaDeVentasDelSitema method, of class Sistema.
     */
    @Test
    public void testGetListaDeVentasDelSitema1() {
        //System.out.println("getListaDeVentasDelSitema");
        Sistema instance = new Sistema();
        Venta v1 = new Venta();
        v1.setCodigoIdentificadorDeVenta(1);
        Venta v2 = new Venta();
        v2.setCodigoIdentificadorDeVenta(2);
        Venta v3 = new Venta();
        v3.setCodigoIdentificadorDeVenta(3);
        instance.agregarVenta(v1);
        
        ArrayList<Venta> a = new ArrayList<>();
        a.add(v1);
        ArrayList<Venta> expResult = a;
        ArrayList<Venta> result = instance.getListaDeVentasDelSitema();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

     @Test
    public void testGetListaDeVentasDelSitema2() {
        //System.out.println("getListaDeVentasDelSitema");
        Sistema instance = new Sistema();
        Venta v1 = new Venta();
        v1.setCodigoIdentificadorDeVenta(1);
        Venta v2 = new Venta();
        v2.setCodigoIdentificadorDeVenta(2);
        Venta v3 = new Venta();
        v3.setCodigoIdentificadorDeVenta(3);
        instance.agregarVenta(v1);
        instance.agregarVenta(v2);
        
        ArrayList<Venta> a = new ArrayList<>();
        a.add(v1);
        a.add(v2);
        ArrayList<Venta> expResult = a;
        ArrayList<Venta> result = instance.getListaDeVentasDelSitema();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testGetListaDeVentasDelSitema3() {
        //System.out.println("getListaDeVentasDelSitema");
        Sistema instance = new Sistema();
        Venta v1 = new Venta();
        v1.setCodigoIdentificadorDeVenta(1);
        Venta v2 = new Venta();
        v2.setCodigoIdentificadorDeVenta(2);
        Venta v3 = new Venta();
        v3.setCodigoIdentificadorDeVenta(3);
        instance.agregarVenta(v1);
        instance.agregarVenta(v2);
        instance.agregarVenta(v2);
        
        ArrayList<Venta> a = new ArrayList<>();
        a.add(v1);
        a.add(v2);
        ArrayList<Venta> expResult = a;
        ArrayList<Venta> result = instance.getListaDeVentasDelSitema();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testGetListaDeVentasDelSitema4() {
        //System.out.println("getListaDeVentasDelSitema");
        Sistema instance = new Sistema();
        Venta v1 = new Venta();
        v1.setCodigoIdentificadorDeVenta(1);
        Venta v2 = new Venta();
        v2.setCodigoIdentificadorDeVenta(2);
        Venta v3 = new Venta();
        v3.setCodigoIdentificadorDeVenta(3);
        instance.agregarVenta(v1);
        instance.agregarVenta(v1);
        instance.agregarVenta(v2);
        instance.agregarVenta(v2);
        
        ArrayList<Venta> a = new ArrayList<>();
        a.add(v1);
        a.add(v2);
        ArrayList<Venta> expResult = a;
        ArrayList<Venta> result = instance.getListaDeVentasDelSitema();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testGetListaDeVentasDelSitema5() {
        //System.out.println("getListaDeVentasDelSitema");
        Sistema instance = new Sistema();
        Venta v1 = new Venta();
        v1.setCodigoIdentificadorDeVenta(1);
        Venta v2 = new Venta();
        v2.setCodigoIdentificadorDeVenta(2);
        Venta v3 = new Venta();
        v3.setCodigoIdentificadorDeVenta(3);
        instance.agregarVenta(v1);
        instance.agregarVenta(v1);
        instance.agregarVenta(v2);
        instance.agregarVenta(v2);
        instance.agregarVenta(v3);
        
        ArrayList<Venta> a = new ArrayList<>();
        a.add(v1);
        a.add(v2);
        a.add(v3);
        ArrayList<Venta> expResult = a;
        ArrayList<Venta> result = instance.getListaDeVentasDelSitema();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testGetListaDeVentasDelSitema6() {
        //System.out.println("getListaDeVentasDelSitema");
        Sistema instance = new Sistema();
        Venta v1 = new Venta();
        v1.setCodigoIdentificadorDeVenta(1);
        Venta v2 = new Venta();
        v2.setCodigoIdentificadorDeVenta(2);
        Venta v3 = new Venta();
        v3.setCodigoIdentificadorDeVenta(3);
        v1 = v2;
        instance.agregarVenta(v1);
        instance.agregarVenta(v1);
        instance.agregarVenta(v2);
        instance.agregarVenta(v2);
        instance.agregarVenta(v3);
        
        ArrayList<Venta> a = new ArrayList<>();
        a.add(v1);
        a.add(v3);
        ArrayList<Venta> expResult = a;
        ArrayList<Venta> result = instance.getListaDeVentasDelSitema();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
     @Test
    public void testGetListaDeVentasDelSitema7() {
        //System.out.println("getListaDeVentasDelSitema");
        Sistema instance = new Sistema();
        Venta v1 = new Venta();
        v1.setCodigoIdentificadorDeVenta(1);
        Venta v2 = new Venta();
        v2.setCodigoIdentificadorDeVenta(2);
        Venta v3 = new Venta();
        v3.setCodigoIdentificadorDeVenta(3);
        instance.agregarVenta(v1);
        instance.agregarVenta(v1);
        instance.agregarVenta(v2);
        instance.agregarVenta(v2);
        instance.agregarVenta(v3);
        
        instance.eliminarVenta(v1);
        instance.eliminarVenta(v2);
        
        ArrayList<Venta> a = new ArrayList<>();
        a.add(v3);
        ArrayList<Venta> expResult = a;
        ArrayList<Venta> result = instance.getListaDeVentasDelSitema();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    
    @Test
    public void testGetListaDeVentasDelSitema8() {
        //System.out.println("getListaDeVentasDelSitema");
        Sistema instance = new Sistema();
        Venta v1 = new Venta();
        v1.setCodigoIdentificadorDeVenta(1);
        Venta v2 = new Venta();
        v2.setCodigoIdentificadorDeVenta(2);
        Venta v3 = new Venta();
        v3.setCodigoIdentificadorDeVenta(3);
        instance.agregarVenta(v1);
        instance.agregarVenta(v1);
        instance.agregarVenta(v2);
        instance.agregarVenta(v2);
        instance.agregarVenta(v3);
        
        instance.eliminarVenta(v1);
        instance.eliminarVenta(v2);
        instance.eliminarVenta(v3);
        
        ArrayList<Venta> a = new ArrayList<>();
        ArrayList<Venta> expResult = a;
        ArrayList<Venta> result = instance.getListaDeVentasDelSitema();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testGetListaDeVentasDelSitema9() {
        //System.out.println("getListaDeVentasDelSitema");
        Sistema instance = new Sistema();
        Venta v1 = new Venta();
        v1.setCodigoIdentificadorDeVenta(1);
        Venta v2 = new Venta();
        v2.setCodigoIdentificadorDeVenta(2);
        Venta v3 = new Venta();
        v3.setCodigoIdentificadorDeVenta(3);
        instance.agregarVenta(v1);
        instance.agregarVenta(v1);
        instance.agregarVenta(v2);
        instance.agregarVenta(v2);
        instance.agregarVenta(v3);
        
        instance.eliminarVenta(v1);
        instance.eliminarVenta(v3);
        instance.eliminarVenta(v2);
        
        ArrayList<Venta> a = new ArrayList<>();
        ArrayList<Venta> expResult = a;
        ArrayList<Venta> result = instance.getListaDeVentasDelSitema();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    /**
     * Test of setListaDeVentasDelSitema method, of class Sistema.
     */
    @Test
    public void testSetListaDeVentasDelSitema1() {
        //System.out.println("setListaDeVentasDelSitema");
        Sistema instance = new Sistema();
        Venta v1 = new Venta();
        v1.setCodigoIdentificadorDeVenta(1);
        Venta v2 = new Venta();
        v2.setCodigoIdentificadorDeVenta(2);
        Venta v3 = new Venta();
        v3.setCodigoIdentificadorDeVenta(3);
        instance.agregarVenta(v1);
        
        ArrayList<Venta> a = new ArrayList<>();
        a.add(v1);
        ArrayList<Venta> listaDeVentasDelSitema = a;
        instance.setListaDeVentasDelSitema(listaDeVentasDelSitema);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testSetListaDeVentasDelSitema2() {
        //System.out.println("setListaDeVentasDelSitema");
        Sistema instance = new Sistema();
        Venta v1 = new Venta();
        v1.setCodigoIdentificadorDeVenta(1);
        Venta v2 = new Venta();
        v2.setCodigoIdentificadorDeVenta(2);
        Venta v3 = new Venta();
        v3.setCodigoIdentificadorDeVenta(3);
        instance.agregarVenta(v1);
        
        ArrayList<Venta> a = new ArrayList<>();
        a.add(v1);
        a.add(v2);
        ArrayList<Venta> listaDeVentasDelSitema = a;
        instance.setListaDeVentasDelSitema(listaDeVentasDelSitema);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testSetListaDeVentasDelSitema3() {
        //System.out.println("setListaDeVentasDelSitema");
        Sistema instance = new Sistema();
        Venta v1 = new Venta();
        v1.setCodigoIdentificadorDeVenta(1);
        Venta v2 = new Venta();
        v2.setCodigoIdentificadorDeVenta(2);
        Venta v3 = new Venta();
        v3.setCodigoIdentificadorDeVenta(3);
        instance.agregarVenta(v1);
        
        ArrayList<Venta> a = new ArrayList<>();
        a.add(v1);
        a.add(v2);
        a.add(v3);
        ArrayList<Venta> listaDeVentasDelSitema = a;
        instance.setListaDeVentasDelSitema(listaDeVentasDelSitema);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    @Test
    public void testSetListaDeVentasDelSitema4() {
        //System.out.println("setListaDeVentasDelSitema");
        Sistema instance = new Sistema();
        Venta v1 = new Venta();
        v1.setCodigoIdentificadorDeVenta(1);
        Venta v2 = new Venta();
        v2.setCodigoIdentificadorDeVenta(2);
        Venta v3 = new Venta();
        v3.setCodigoIdentificadorDeVenta(3);
        instance.agregarVenta(v1);
        
        ArrayList<Venta> a = new ArrayList<>();
        ArrayList<Venta> listaDeVentasDelSitema = a;
        instance.setListaDeVentasDelSitema(listaDeVentasDelSitema);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    /**
     * Test of getListaDePreventas method, of class Sistema.
     */
    @Test
    public void testGetListaDePreVentas1() {
        //System.out.println("getListaDePreVentas");
        Sistema instance = new Sistema();
        PreVenta v1 = new PreVenta();
        //v1.setIdentificadorDePreventa(1);
        PreVenta v2 = new PreVenta();
        //v2.setIdentificadorDePreventa(2);
        PreVenta v3 = new PreVenta();
        //v3.setIdentificadorDePreventa(3);
        instance.agregarPreVenta(v1);
        
        ArrayList<PreVenta> a = new ArrayList<>();
        a.add(v1);
        ArrayList<PreVenta> expResult = a;
        ArrayList<PreVenta> result = instance.getListaDePreventas();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

     @Test
    public void testGetListaDePreVentas2() {
        //System.out.println("getListaDePrePreVentas");
        Sistema instance = new Sistema();
        PreVenta v1 = new PreVenta();
        //v1.setIdentificadorDePreventa(1);
        PreVenta v2 = new PreVenta();
        //v2.setIdentificadorDePreventa(2);
        PreVenta v3 = new PreVenta();
        //v3.setIdentificadorDePreventa(3);
        instance.agregarPreVenta(v1);
        instance.agregarPreVenta(v2);
        
        ArrayList<PreVenta> a = new ArrayList<>();
        a.add(v1);
        a.add(v2);
        ArrayList<PreVenta> expResult = a;
        ArrayList<PreVenta> result = instance.getListaDePreventas();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testGetListaDePreVentas3() {
        //System.out.println("getListaDePreVentas");
        Sistema instance = new Sistema();
        PreVenta v1 = new PreVenta();
        //v1.setIdentificadorDePreventa(1);
        PreVenta v2 = new PreVenta();
        //v2.setIdentificadorDePreventa(2);
        PreVenta v3 = new PreVenta();
        //v3.setIdentificadorDePreventa(3);
        instance.agregarPreVenta(v1);
        instance.agregarPreVenta(v2);
        instance.agregarPreVenta(v2);
        
        ArrayList<PreVenta> a = new ArrayList<>();
        a.add(v1);
        a.add(v2);
        ArrayList<PreVenta> expResult = a;
        ArrayList<PreVenta> result = instance.getListaDePreventas();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testGetListaDePreVentas4() {
        //System.out.println("getListaDePrePreVentas");
        Sistema instance = new Sistema();
        PreVenta v1 = new PreVenta();
        //v1.setIdentificadorDePreventa(1);
        PreVenta v2 = new PreVenta();
        //v2.setIdentificadorDePreventa(2);
        PreVenta v3 = new PreVenta();
        //v3.setIdentificadorDePreventa(3);
        instance.agregarPreVenta(v1);
        instance.agregarPreVenta(v1);
        instance.agregarPreVenta(v2);
        instance.agregarPreVenta(v2);
        
        ArrayList<PreVenta> a = new ArrayList<>();
        a.add(v1);
        a.add(v2);
        ArrayList<PreVenta> expResult = a;
        ArrayList<PreVenta> result = instance.getListaDePreventas();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testGetListaDePreVentas5() {
        //System.out.println("getListaDePrePreVentas");
        Sistema instance = new Sistema();
        PreVenta v1 = new PreVenta();
        //v1.setIdentificadorDePreventa(1);
        PreVenta v2 = new PreVenta();
        //v2.setIdentificadorDePreventa(2);
        PreVenta v3 = new PreVenta();
        //v3.setIdentificadorDePreventa(3);
        instance.agregarPreVenta(v1);
        instance.agregarPreVenta(v1);
        instance.agregarPreVenta(v2);
        instance.agregarPreVenta(v2);
        instance.agregarPreVenta(v3);
        
        ArrayList<PreVenta> a = new ArrayList<>();
        a.add(v1);
        a.add(v2);
        a.add(v3);
        ArrayList<PreVenta> expResult = a;
        ArrayList<PreVenta> result = instance.getListaDePreventas();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testGetListaDePreVentas6() {
        //System.out.println("getListaDePrePreVentas");
        Sistema instance = new Sistema();
        PreVenta v1 = new PreVenta();
        //v1.setIdentificadorDePreventa(1);
        PreVenta v2 = new PreVenta();
        //v2.setIdentificadorDePreventa(2);
        PreVenta v3 = new PreVenta();
        //v3.setIdentificadorDePreventa(3);
        v1 = v2;
        instance.agregarPreVenta(v1);
        instance.agregarPreVenta(v1);
        instance.agregarPreVenta(v2);
        instance.agregarPreVenta(v2);
        instance.agregarPreVenta(v3);
        
        ArrayList<PreVenta> a = new ArrayList<>();
        a.add(v1);
        a.add(v3);
        ArrayList<PreVenta> expResult = a;
        ArrayList<PreVenta> result = instance.getListaDePreventas();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
     @Test
    public void testGetListaDePreVentas7() {
        //System.out.println("getListaDePrePreVentas");
        Sistema instance = new Sistema();
        PreVenta v1 = new PreVenta();
        //v1.setIdentificadorDePreventa(1);
        PreVenta v2 = new PreVenta();
        //v2.setIdentificadorDePreventa(2);
        PreVenta v3 = new PreVenta();
        //v3.setIdentificadorDePreventa(3);
        v1 = v2;
        instance.agregarPreVenta(v1);
        instance.agregarPreVenta(v1);
        instance.agregarPreVenta(v2);
        instance.agregarPreVenta(v2);
        instance.agregarPreVenta(v3);
        
        instance.cancelarPreVenta(v1);
        
        ArrayList<PreVenta> a = new ArrayList<>();
        a.add(v3);
        ArrayList<PreVenta> expResult = a;
        ArrayList<PreVenta> result = instance.getListaDePreventas();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    
    @Test
    public void testGetListaDePreVentas8() {
        //System.out.println("getListaDePrePreVentas");
        Sistema instance = new Sistema();
        PreVenta v1 = new PreVenta();
        //v1.setIdentificadorDePreventa(1);
        PreVenta v2 = new PreVenta();
        //v2.setIdentificadorDePreventa(2);
        PreVenta v3 = new PreVenta();
        //v3.setIdentificadorDePreventa(3);
        v1 = v2;
        instance.agregarPreVenta(v1);
        instance.agregarPreVenta(v1);
        instance.agregarPreVenta(v2);
        instance.agregarPreVenta(v2);
        instance.agregarPreVenta(v3);
        
        instance.cancelarPreVenta(v1);
        
        instance.cancelarPreVenta(v3);
        
        
        ArrayList<PreVenta> a = new ArrayList<>();
        ArrayList<PreVenta> expResult = a;
        ArrayList<PreVenta> result = instance.getListaDePreventas();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testGetListaDePreVentas9() {
        //System.out.println("getListaDePrePreVentas");
        Sistema instance = new Sistema();
        PreVenta v1 = new PreVenta();
        //v1.setIdentificadorDePreventa(1);
        PreVenta v2 = new PreVenta();
        //v2.setIdentificadorDePreventa(2);
        PreVenta v3 = new PreVenta();
        //v3.setIdentificadorDePreventa(3);
        v1 = v2;
        instance.agregarPreVenta(v1);
        instance.agregarPreVenta(v1);
        instance.agregarPreVenta(v2);
        instance.agregarPreVenta(v2);
        instance.agregarPreVenta(v3);
        
        instance.cancelarPreVenta(v1);
        instance.cancelarPreVenta(v3);
        instance.cancelarPreVenta(v2);
        
        ArrayList<PreVenta> a = new ArrayList<>();
        ArrayList<PreVenta> expResult = a;
        ArrayList<PreVenta> result = instance.getListaDePreventas();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    /**
     * Test of setListaDePreVentas method, of class Sistema.
     */
    @Test
    public void testSetListaDePreVentas1() {
        //System.out.println("setListaDePreVentas");
        Sistema instance = new Sistema();
        PreVenta v1 = new PreVenta();
        //v1.setIdentificadorDePreventa(1);
        PreVenta v2 = new PreVenta();
        //v2.setIdentificadorDePreventa(2);
        PreVenta v3 = new PreVenta();
        //v3.setIdentificadorDePreventa(3);
        instance.agregarPreVenta(v1);
        
        ArrayList<PreVenta> a = new ArrayList<>();
        a.add(v1);
        ArrayList<PreVenta> listaDePreVentasDelSitema = a;
        instance.setListaDePreventas(listaDePreVentasDelSitema);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testSetListaDePreVentas2() {
        //System.out.println("setListaDePreVentas");
        Sistema instance = new Sistema();
        PreVenta v1 = new PreVenta();
        //v1.setIdentificadorDePreventa(1);
        PreVenta v2 = new PreVenta();
        //v2.setIdentificadorDePreventa(2);
        PreVenta v3 = new PreVenta();
        //v3.setIdentificadorDePreventa(3);
        instance.agregarPreVenta(v1);
        
        ArrayList<PreVenta> a = new ArrayList<>();
        a.add(v1);
        a.add(v2);
        ArrayList<PreVenta> listaDePreVentasDelSitema = a;
        instance.setListaDePreventas(listaDePreVentasDelSitema);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testSetListaDePreVentas3() {
        //System.out.println("setListaDePreVentas");
        Sistema instance = new Sistema();
        PreVenta v1 = new PreVenta();
        //v1.setIdentificadorDePreventa(1);
        PreVenta v2 = new PreVenta();
        //v2.setIdentificadorDePreventa(2);
        PreVenta v3 = new PreVenta();
        //v3.setIdentificadorDePreventa(3);
        instance.agregarPreVenta(v1);
        
        ArrayList<PreVenta> a = new ArrayList<>();
        a.add(v1);
        a.add(v2);
        a.add(v3);
        ArrayList<PreVenta> listaDePreVentasDelSitema = a;
        instance.setListaDePreventas(listaDePreVentasDelSitema);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    @Test
    public void testSetListaDePreVentas4() {
        //System.out.println("setListaDePreVentas");
        Sistema instance = new Sistema();
        PreVenta v1 = new PreVenta();
        //v1.etIdentificadorDePreventa(1);
        PreVenta v2 = new PreVenta();
        //v2.setIdentificadorDePreventa(2);
        PreVenta v3 = new PreVenta();
        //v3.setIdentificadorDePreventa(3);
        instance.agregarPreVenta(v1);
        
        ArrayList<PreVenta> a = new ArrayList<>();
        ArrayList<PreVenta> listaDePreVentasDelSitema = a;
        instance.setListaDePreventas(listaDePreVentasDelSitema);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getEchoShop method, of class Sistema.
     */
    @Test
    public void testGetEchoShop() {
        //System.out.println("getEchoShop");
        Sistema instance = new Sistema();
        Tienda t = new Tienda();
        Tienda expResult = t;
        Tienda result = instance.getEchoShop();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setEchToShop method, of class Sistema.
     */
    @Test
    public void testSetEchToShop() {
        //System.out.println("setEchToShop");
        Tienda listaDeEchoShop = new Tienda();
        Sistema instance = new Sistema();
        instance.setEchToShop(listaDeEchoShop);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
