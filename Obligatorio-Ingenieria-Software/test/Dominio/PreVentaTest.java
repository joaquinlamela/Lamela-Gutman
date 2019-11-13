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
    public void testGetComprador1() {
        //System.out.println("getComprador");
        PreVenta instance = new PreVenta();
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
        PreVenta instance = new PreVenta();
        Persona p = new Persona("Diego", 19, "Cuareim", "Rut");
        instance.setComprador(p);
        Persona expResult = p;
        Persona result = instance.getComprador();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setComprador method, of class PreVenta.
     */
    @Test
    public void testSetComprador1() {
        //System.out.println("setComprador");
        Persona comprador = new Persona();
        PreVenta instance = new PreVenta();
        instance.setComprador(comprador);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    @Test
    public void testSetComprador2() {
        //System.out.println("setComprador");
        Persona comprador = new Persona("Martin", 19, "Mercedes", "Rut2");
        PreVenta instance = new PreVenta();
        instance.setComprador(comprador);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getPrecioDePreVenta method, of class PreVenta.
     */
    @Test(expected = RuntimeException.class)
    public void testGetPrecioDePreVenta1() {
        //System.out.println("getPrecioDePreVenta");
        PreVenta instance = new PreVenta();
        instance.setPrecioDePreVenta(0);
        int expResult = 0;
        int result = instance.getPrecioDePreVenta();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test(expected = RuntimeException.class)
    public void testGetPrecioDePreVenta2() {
        //System.out.println("getPrecioDePreVenta");
        PreVenta instance = new PreVenta();
        instance.setPrecioDePreVenta(-1);
        int expResult = -1;
        int result = instance.getPrecioDePreVenta();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    @Test
    public void testGetPrecioDePreVenta3() {
        //System.out.println("getPrecioDePreVenta");
        PreVenta instance = new PreVenta();
        instance.setPrecioDePreVenta(1);
        int expResult = 1;
        int result = instance.getPrecioDePreVenta();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    @Test
    public void testGetPrecioDePreVenta4() {
        //System.out.println("getPrecioDePreVenta");
        PreVenta instance = new PreVenta();
        instance.setPrecioDePreVenta(100);
        int expResult = 100;
        int result = instance.getPrecioDePreVenta();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    @Test
    public void testGetPrecioDePreVenta5() {
        //System.out.println("getPrecioDePreVenta");
        PreVenta instance = new PreVenta();
        instance.setPrecioDePreVenta(100000);
        int expResult = 100000;
        int result = instance.getPrecioDePreVenta();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setPrecioDePreVenta method, of class PreVenta.
     */
    @Test(expected = RuntimeException.class)
    public void testSetPrecioDePreVenta1() {
        //System.out.println("setPrecioDePreVenta");
        int precioDePreVenta = 0;
        PreVenta instance = new PreVenta();
        instance.setPrecioDePreVenta(precioDePreVenta);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    @Test(expected = RuntimeException.class)
    public void testSetPrecioDePreVenta2() {
        //System.out.println("setPrecioDePreVenta");
        int precioDePreVenta = -8;
        PreVenta instance = new PreVenta();
        instance.setPrecioDePreVenta(precioDePreVenta);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    @Test
    public void testSetPrecioDePreVenta3() {
        //System.out.println("setPrecioDePreVenta");
        int precioDePreVenta = 1;
        PreVenta instance = new PreVenta();
        instance.setPrecioDePreVenta(precioDePreVenta);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    @Test
    public void testSetPrecioDePreVenta4() {
        //System.out.println("setPrecioDePreVenta");
        int precioDePreVenta = 100;
        PreVenta instance = new PreVenta();
        instance.setPrecioDePreVenta(precioDePreVenta);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    @Test
    public void testSetPrecioDePreVenta5() {
        //System.out.println("setPrecioDePreVenta");
        int precioDePreVenta = 10000;
        PreVenta instance = new PreVenta();
        instance.setPrecioDePreVenta(precioDePreVenta);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getListaDeProductos method, of class PreVenta.
     */
    @Test
    public void testGetListaDeProductos1() {
        //System.out.println("getListaDeProductos");
        PreVenta instance = new PreVenta();
        ArrayList<Producto> a = new ArrayList<>();
        Producto p = new Producto();
        p.setCodigoIdentificador(18);
        Producto f = new Producto();
        instance.agregarProducto(f);
        instance.agregarProducto(p);
        a.add(f);
        a.add(p);
        ArrayList<Producto> expResult = a;
        ArrayList<Producto> result = instance.getListaDeProductos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    @Test
    public void testGetListaDeProductos2() {
        //System.out.println("getListaDeProductos");
        PreVenta instance = new PreVenta();
        ArrayList<Producto> a = new ArrayList<>();
        Producto p = new Producto();
        p.setCodigoIdentificador(18);
        Producto f = new Producto();
        Producto g = new Producto();
        instance.agregarProducto(f);
        instance.agregarProducto(p);
        instance.agregarProducto(g);

        a.add(f);
        a.add(p);
        ArrayList<Producto> expResult = a;
        ArrayList<Producto> result = instance.getListaDeProductos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    @Test
    public void testGetListaDeProductos3() {
        //System.out.println("getListaDeProductos");
        PreVenta instance = new PreVenta();
        ArrayList<Producto> a = new ArrayList<>();
        Producto p = new Producto();
        p.setCodigoIdentificador(18);
        Producto f = new Producto();
        Producto g = new Producto();
        instance.agregarProducto(f);
        instance.agregarProducto(p);
        instance.agregarProducto(g);
        instance.eliminarProducto(f);

        a.add(p);
        ArrayList<Producto> expResult = a;
        ArrayList<Producto> result = instance.getListaDeProductos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setListaDeProductos method, of class PreVenta.
     */

    @Test
    public void testGetListaDeProductos4() {
        //System.out.println("getListaDeProductos");
        PreVenta instance = new PreVenta();
        ArrayList<Producto> a = new ArrayList<>();
        Producto p = new Producto();
        p.setCodigoIdentificador(18);
        Producto f = new Producto();
        Producto g = new Producto();
        instance.agregarProducto(f);
        instance.agregarProducto(p);
        instance.agregarProducto(g);
        instance.eliminarProducto(f);
        instance.eliminarProducto(p);

        ArrayList<Producto> expResult = a;
        ArrayList<Producto> result = instance.getListaDeProductos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    @Test
    public void testSetListaDeProductos() {
        //System.out.println("setListaDeProductos");
        ArrayList<Producto> listaDeProductos = null;
        PreVenta instance = new PreVenta();
        instance.setListaDeProductos(listaDeProductos);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getLugarARetirar method, of class PreVenta.
     */
    @Test
    public void testGetLugarARetirar() {
        //System.out.println("getLugarARetirar");
        PreVenta instance = new PreVenta();
        Tienda t = new Tienda();
        instance.setLugarARetirar(t);
        Tienda expResult = t;
        Tienda result = instance.getLugarARetirar();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setLugarARetirar method, of class PreVenta.
     */
    @Test
    public void testSetLugarARetirar() {
        //System.out.println("setLugarARetirar");
        Tienda lugarARetirar = new Tienda();
        PreVenta instance = new PreVenta();
        instance.setLugarARetirar(lugarARetirar);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getListaDeEnvase method, of class PreVenta.
     */
    @Test
    public void testGetListaDeEnvase1() {
        //System.out.println("getListaDeEnvase");
        PreVenta instance = new PreVenta();
        ArrayList<Envase> a = new ArrayList<>();
        instance.setListaDeEnvase(a);
        ArrayList<Envase> expResult = a;
        ArrayList<Envase> result = instance.getListaDeEnvase();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    @Test
    public void testGetListaDeEnvase2() {
        //System.out.println("getListaDeEnvase");
        PreVenta instance = new PreVenta();
        ArrayList<Envase> a = new ArrayList<>();
        Envase e1 = new Envase();
        e1.setNombre("Envase 1");
        instance.agregarEnvase(e1);
        instance.setListaDeEnvase(a);
        Envase e2 = new Envase();
        e2.setNombre("Envase 2");
        instance.agregarEnvase(e2);

        a.add(e1);
        a.add(e2);
        ArrayList<Envase> expResult = a;
        ArrayList<Envase> result = instance.getListaDeEnvase();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    @Test
    public void testGetListaDeEnvase3() {
        //System.out.println("getListaDeEnvase");
        PreVenta instance = new PreVenta();
        ArrayList<Envase> a = new ArrayList<>();
        Envase e1 = new Envase();
        e1.setNombre("Envase 1");
        instance.agregarEnvase(e1);
        instance.setListaDeEnvase(a);
        Envase e2 = new Envase();
        e2.setNombre("Envase 2");
        instance.agregarEnvase(e2);
        Envase e3 = new Envase();
        e3.setNombre("Envase 2");
        instance.agregarEnvase(e3);

        a.add(e1);
        a.add(e2);
        ArrayList<Envase> expResult = a;
        ArrayList<Envase> result = instance.getListaDeEnvase();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    @Test
    public void testGetListaDeEnvase4() {
        //System.out.println("getListaDeEnvase");
        PreVenta instance = new PreVenta();
        ArrayList<Envase> a = new ArrayList<>();
        Envase e1 = new Envase();
        e1.setNombre("Envase 1");
        instance.agregarEnvase(e1);
        instance.setListaDeEnvase(a);
        Envase e2 = new Envase();
        e2.setNombre("Envase 2");
        instance.agregarEnvase(e2);
        Envase e3 = new Envase();
        e3.setNombre("Envase 2");
        instance.agregarEnvase(e3);
        instance.eliminarEnvase(e2);

        a.add(e1);
        ArrayList<Envase> expResult = a;
        ArrayList<Envase> result = instance.getListaDeEnvase();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    @Test
    public void testGetListaDeEnvase5() {
        //System.out.println("getListaDeEnvase");
        PreVenta instance = new PreVenta();
        ArrayList<Envase> a = new ArrayList<>();
        Envase e1 = new Envase();
        e1.setNombre("Envase 1");
        instance.agregarEnvase(e1);
        instance.setListaDeEnvase(a);
        Envase e2 = new Envase();
        e2.setNombre("Envase 2");
        instance.agregarEnvase(e2);
        Envase e3 = new Envase();
        e3.setNombre("Envase 2");
        instance.agregarEnvase(e3);
        instance.eliminarEnvase(e2);
        instance.eliminarEnvase(e1);

        ArrayList<Envase> expResult = a;
        ArrayList<Envase> result = instance.getListaDeEnvase();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setListaDeEnvase method, of class PreVenta.
     */
    @Test(expected = RuntimeException.class)
    public void testGetIdentificadorDePreVenta1() {
        //System.out.println("getPrecioDePreVenta");
        PreVenta instance = new PreVenta();
        instance.setIdentificadorDePreventa(0);
        int expResult = 0;
        int result = instance.getIdentificadorDePreventa();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    @Test(expected = RuntimeException.class)
    public void testGetIdentificadorDePreVenta2() {
        //System.out.println("getPrecioDePreVenta");
        PreVenta instance = new PreVenta();
        instance.setIdentificadorDePreventa(-1);
        int expResult = -1;
        int result = instance.getIdentificadorDePreventa();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    @Test
    public void testGetIdentificadorDePreVenta3() {
        //System.out.println("getPrecioDePreVenta");
        PreVenta instance = new PreVenta();
        instance.setIdentificadorDePreventa(1);
        int expResult = 1;
        int result = instance.getIdentificadorDePreventa();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    @Test
    public void testGetIdentificadorDePreVenta4() {
        //System.out.println("getPrecioDePreVenta");
        PreVenta instance = new PreVenta();
        instance.setIdentificadorDePreventa(100);
        int expResult = 100;
        int result = instance.getIdentificadorDePreventa();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    @Test
    public void testGetIdentificadorDePreVenta5() {
        //System.out.println("getPrecioDePreVenta");
        PreVenta instance = new PreVenta();
        instance.setIdentificadorDePreventa(100000);
        int expResult = 100000;
        int result = instance.getIdentificadorDePreventa();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setPrecioDePreVenta method, of class PreVenta.
     */
    @Test(expected = RuntimeException.class)
    public void testSetIdentificadorDePreVenta1() {
        //System.out.println("setPrecioDePreVenta");
        int identificadorDePreVenta = 0;
        PreVenta instance = new PreVenta();
        instance.setIdentificadorDePreventa(identificadorDePreVenta);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    @Test(expected = RuntimeException.class)
    public void testSetIdentificadorDePreVenta2() {
        //System.out.println("setPrecioDePreVenta");
        int identificadorDePreVenta = -8;
        PreVenta instance = new PreVenta();
        instance.setIdentificadorDePreventa(identificadorDePreVenta);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    @Test
    public void testSetIdentificadorDePreVenta3() {
        //System.out.println("setPrecioDePreVenta");
        int identificadorDePreVenta = 1;
        PreVenta instance = new PreVenta();
        instance.setIdentificadorDePreventa(identificadorDePreVenta);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    @Test
    public void testSetIdentificadorDePreVenta4() {
        //System.out.println("setPrecioDePreVenta");
        int identificadorDePreVenta = 100;
        PreVenta instance = new PreVenta();
        instance.setIdentificadorDePreventa(identificadorDePreVenta);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    @Test
    public void testSetIdentificadorDePreVenta5() {
        //System.out.println("setPrecioDePreVenta");
        int identificadorDePreVenta = 10000;
        PreVenta instance = new PreVenta();
        instance.setIdentificadorDePreventa(identificadorDePreVenta);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    /**
     * Test of getIdentificadorDePreventa method, of class PreVenta.
     */
}
