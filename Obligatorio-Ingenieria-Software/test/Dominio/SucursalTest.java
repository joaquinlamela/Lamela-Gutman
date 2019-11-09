/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dominio;

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
public class SucursalTest {
    
    public SucursalTest() {
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
     * Test of getNumeroSucursal method, of class Sucursal.
     */
    @Test(expected = RuntimeException.class)
    public void testGetNumeroSucursal1() {
        //System.out.println("getNumeroSucursal");
        Sucursal instance = new Sucursal();
        instance.setNumeroSucursal(0);
        int expResult = 0;
        int result = (int)instance.getNumeroSucursal();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    @Test(expected = RuntimeException.class)
    public void testGetNumeroSucursal2() {
        //System.out.println("getNumeroSucursal");
        Sucursal instance = new Sucursal();
        instance.setNumeroSucursal(-1);
        int expResult = -1;
        int result = (int)instance.getNumeroSucursal();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testGetNumeroSucursal3() {
        //System.out.println("getNumeroSucursal");
        Sucursal instance = new Sucursal();
        instance.setNumeroSucursal(1);
        int expResult = 1;
        int result = (int)instance.getNumeroSucursal();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testGetNumeroSucursal4() {
        //System.out.println("getNumeroSucursal");
        Sucursal instance = new Sucursal();
        instance.setNumeroSucursal(100);
        int expResult = 100;
        int result = (int)instance.getNumeroSucursal();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testGetNumeroSucursal5() {
        //System.out.println("getNumeroSucursal");
        Sucursal instance = new Sucursal();
        instance.setNumeroSucursal(100000);
        int expResult = 100000;
        int result = (int)instance.getNumeroSucursal();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    /**
     * Test of setNumeroSucursalDelSucursalDeSucursal method, of class Sucursal.
     */
    @Test(expected = RuntimeException.class)
    public void testSetNumeroSucursal1() {
        //System.out.println("setNumeroSucursalDelSucursalDeSucursal");
        int precioDeSucursal = 0;
        Sucursal instance = new Sucursal();
        instance.setNumeroSucursal(precioDeSucursal);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    @Test(expected = RuntimeException.class)
    public void testSetNumeroSucursal2() {
        //System.out.println("setNumeroSucursalDelSucursalDeSucursal");
        int precioDeSucursal = -8;
        Sucursal instance = new Sucursal();
        instance.setNumeroSucursal(precioDeSucursal);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testSetNumeroSucursal3() {
        //System.out.println("setNumeroSucursalDelSucursalDeSucursal");
        int precioDeSucursal = 1;
        Sucursal instance = new Sucursal();
        instance.setNumeroSucursal(precioDeSucursal);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testSetNumeroSucursal4() {
        //System.out.println("setNumeroSucursalDelSucursalDeSucursal");
        int precioDeSucursal = 100;
        Sucursal instance = new Sucursal();
        instance.setNumeroSucursal(precioDeSucursal);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testSetNumeroSucursal5() {
        //System.out.println("setNumeroSucursalDelSucursalDeSucursal");
        int precioDeSucursal = 10000;
        Sucursal instance = new Sucursal();
        instance.setNumeroSucursal(precioDeSucursal);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getDireccion method, of class Sucursal.
     */
    @Test
    public void testGetDireccion1() {
        ///System.out.println("getDireccion");
        Sucursal instance = new Sucursal();
        instance.setDireccion("mercedes");
        String expResult = "mercedes";
        String result = instance.getDireccion();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

        @Test
    public void testGetDireccion2() {
        ///System.out.println("getDireccion");
        Sucursal instance = new Sucursal();
        instance.setDireccion("Cuareim");
        String expResult = "Cuareim";
        String result = instance.getDireccion();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    
        @Test(expected = RuntimeException.class)
    public void testGetDireccion3() {
        ///System.out.println("getDireccion");
        Sucursal instance = new Sucursal();
        instance.setDireccion("");
        String expResult = "";
        String result = instance.getDireccion();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    
    
        @Test(expected = RuntimeException.class)
    public void testGetDireccion4() {
        ///System.out.println("getDireccion");
        Sucursal instance = new Sucursal();
        instance.setDireccion("    ");
        String expResult = "    ";
        String result = instance.getDireccion();
        assertEquals(expResult, result);
       // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    
    /**
     * Test of setDireccion method, of class Sucursal.
     */
    @Test
    public void testSetDireccion1() {
        //System.out.println("setDireccion");
        String dir = "Sucursal1";
        Sucursal instance = new Sucursal();
        instance.setDireccion(dir);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    @Test(expected = RuntimeException.class)
    public void testSetDireccion2() {
        //System.out.println("setDireccion");
        String dir = "";
        Sucursal instance = new Sucursal();
        instance.setDireccion(dir);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test(expected = RuntimeException.class)
    public void testSetDireccion3() {
        //System.out.println("setDireccion");
        String dir = "   ";
        Sucursal instance = new Sucursal();
        instance.setDireccion(dir);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }


    /**
     * Test of getTelefono method, of class Sucursal.
     */
    @Test(expected = RuntimeException.class)
    public void testGetTelefono1() {
        //System.out.println("getTelefono");
        Sucursal instance = new Sucursal();
        instance.setTelefono(0);
        int expResult = 0;
        int result = (int)instance.getTelefono();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    @Test(expected = RuntimeException.class)
    public void testGetTelefono2() {
        //System.out.println("getTelefono");
        Sucursal instance = new Sucursal();
        instance.setTelefono(-1);
        int expResult = -1;
        int result = (int)instance.getTelefono();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testGetTelefono3() {
        //System.out.println("getTelefono");
        Sucursal instance = new Sucursal();
        instance.setTelefono(1);
        int expResult = 1;
        int result = (int)instance.getTelefono();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testGetTelefono4() {
        //System.out.println("getTelefono");
        Sucursal instance = new Sucursal();
        instance.setTelefono(100);
        int expResult = 100;
        int result = (int)instance.getTelefono();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testGetTelefono5() {
        //System.out.println("getTelefono");
        Sucursal instance = new Sucursal();
        instance.setTelefono(100000);
        int expResult = 100000;
        int result = (int)instance.getTelefono();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    /**
     * Test of setTelefonoDelSucursalDeSucursal method, of class Sucursal.
     */
    @Test(expected = RuntimeException.class)
    public void testSetTelefono1() {
        //System.out.println("setTelefonoDelSucursalDeSucursal");
        int precioDeSucursal = 0;
        Sucursal instance = new Sucursal();
        instance.setTelefono(precioDeSucursal);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    @Test(expected = RuntimeException.class)
    public void testSetTelefono2() {
        //System.out.println("setTelefonoDelSucursalDeSucursal");
        int precioDeSucursal = -8;
        Sucursal instance = new Sucursal();
        instance.setTelefono(precioDeSucursal);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testSetTelefono3() {
        //System.out.println("setTelefonoDelSucursalDeSucursal");
        int precioDeSucursal = 1;
        Sucursal instance = new Sucursal();
        instance.setTelefono(precioDeSucursal);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testSetTelefono4() {
        //System.out.println("setTelefonoDelSucursalDeSucursal");
        int precioDeSucursal = 100;
        Sucursal instance = new Sucursal();
        instance.setTelefono(precioDeSucursal);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testSetTelefono5() {
        //System.out.println("setTelefonoDelSucursalDeSucursal");
        int precioDeSucursal = 10000;
        Sucursal instance = new Sucursal();
        instance.setTelefono(precioDeSucursal);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
