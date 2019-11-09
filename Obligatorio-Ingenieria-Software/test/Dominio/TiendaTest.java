/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dominio;

import java.time.LocalTime;
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
public class TiendaTest {
    
    public TiendaTest() {
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
     * Test of getDireccion method, of class Tienda.
     */
   @Test
    public void testGetDireccion1() {
        ///System.out.println("getDireccion");
        Tienda instance = new Tienda();
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
        Tienda instance = new Tienda();
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
        Tienda instance = new Tienda();
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
        Tienda instance = new Tienda();
        instance.setDireccion("    ");
        String expResult = "    ";
        String result = instance.getDireccion();
        assertEquals(expResult, result);
       // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    
    /**
     * Test of setDireccion method, of class Tienda.
     */
    @Test
    public void testSetDireccion1() {
        //System.out.println("setDireccion");
        String dir = "Tienda1";
        Tienda instance = new Tienda();
        instance.setDireccion(dir);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    @Test(expected = RuntimeException.class)
    public void testSetDireccion2() {
        //System.out.println("setDireccion");
        String dir = "";
        Tienda instance = new Tienda();
        instance.setDireccion(dir);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test(expected = RuntimeException.class)
    public void testSetDireccion3() {
        //System.out.println("setDireccion");
        String dir = "   ";
        Tienda instance = new Tienda();
        instance.setDireccion(dir);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getTelefono method, of class Tienda.
     */
    @Test(expected = RuntimeException.class)
    public void testGetTelefono1() {
        //System.out.println("getTelefono");
        Tienda instance = new Tienda();
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
        Tienda instance = new Tienda();
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
        Tienda instance = new Tienda();
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
        Tienda instance = new Tienda();
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
        Tienda instance = new Tienda();
        instance.setTelefono(100000);
        int expResult = 100000;
        int result = (int)instance.getTelefono();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    /**
     * Test of setTelefonoDelTiendaDeTienda method, of class Tienda.
     */
    @Test(expected = RuntimeException.class)
    public void testSetTelefono1() {
        //System.out.println("setTelefonoDelTiendaDeTienda");
        int precioDeTienda = 0;
        Tienda instance = new Tienda();
        instance.setTelefono(precioDeTienda);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    @Test(expected = RuntimeException.class)
    public void testSetTelefono2() {
        //System.out.println("setTelefonoDelTiendaDeTienda");
        int precioDeTienda = -8;
        Tienda instance = new Tienda();
        instance.setTelefono(precioDeTienda);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testSetTelefono3() {
        //System.out.println("setTelefonoDelTiendaDeTienda");
        int precioDeTienda = 1;
        Tienda instance = new Tienda();
        instance.setTelefono(precioDeTienda);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testSetTelefono4() {
        //System.out.println("setTelefonoDelTiendaDeTienda");
        int precioDeTienda = 100;
        Tienda instance = new Tienda();
        instance.setTelefono(precioDeTienda);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testSetTelefono5() {
        //System.out.println("setTelefonoDelTiendaDeTienda");
        int precioDeTienda = 10000;
        Tienda instance = new Tienda();
        instance.setTelefono(precioDeTienda);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getListaDeProductosEnStock method, of class Tienda.
     */
    @Test
    public void testGetProductoes1() {
        //System.out.println("getListaDeProductosEnStock");
        Tienda instance = new Tienda();
        Producto s1 = new Producto();
        s1.setCodigoIdentificador(1);
        Producto s2 = new Producto();
        s2.setCodigoIdentificador(2);
        Producto s3 = new Producto();
        s3.setCodigoIdentificador(3);
        instance.agregarProducto(s1);
        
        ArrayList<Producto> a = new ArrayList<>();
        a.add(s1);
        ArrayList<Producto> expResult = a;
        ArrayList<Producto> result = instance.getListaDeProductosEnStock();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testGetProductoes2() {
        //System.out.println("getListaDeProductosEnStock");
        Tienda instance = new Tienda();
        Producto s1 = new Producto();
        s1.setCodigoIdentificador(1);
        Producto s2 = new Producto();
        s2.setCodigoIdentificador(2);
        Producto s3 = new Producto();
        s3.setCodigoIdentificador(3);
        instance.agregarProducto(s1);
        instance.agregarProducto(s1);
        
        ArrayList<Producto> a = new ArrayList<>();
        a.add(s1);
        ArrayList<Producto> expResult = a;
        ArrayList<Producto> result = instance.getListaDeProductosEnStock();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testGetProductoes3() {
        //System.out.println("getListaDeProductosEnStock");
        Tienda instance = new Tienda();
        Producto s1 = new Producto();
        s1.setCodigoIdentificador(1);
        Producto s2 = new Producto();
        s2.setCodigoIdentificador(2);
        Producto s3 = new Producto();
        s3.setCodigoIdentificador(3);
        instance.agregarProducto(s1);
        instance.agregarProducto(s1);
        instance.agregarProducto(s2);
        instance.agregarProducto(s2);
        instance.agregarProducto(s2);
       
        ArrayList<Producto> a = new ArrayList<>();
        a.add(s1);
        a.add(s2);
        ArrayList<Producto> expResult = a;
        ArrayList<Producto> result = instance.getListaDeProductosEnStock();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testGetProductoes4() {
        //System.out.println("getListaDeProductosEnStock");
        Tienda instance = new Tienda();
        Producto s1 = new Producto();
        s1.setCodigoIdentificador(1);
        Producto s2 = new Producto();
        s2.setCodigoIdentificador(2);
        Producto s3 = new Producto();
        s3.setCodigoIdentificador(3);
        instance.agregarProducto(s1);
        instance.agregarProducto(s1);
        instance.agregarProducto(s2);
        instance.agregarProducto(s2);
        instance.agregarProducto(s2);
        instance.agregarProducto(s3);
       
        ArrayList<Producto> a = new ArrayList<>();
        a.add(s1);
        a.add(s2);
        a.add(s3);
        ArrayList<Producto> expResult = a;
        ArrayList<Producto> result = instance.getListaDeProductosEnStock();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testGetProductoes5() {
        //System.out.println("getListaDeProductosEnStock");
        Tienda instance = new Tienda();
        Producto s1 = new Producto();
        s1.setCodigoIdentificador(1);
        Producto s2 = new Producto();
        s2.setCodigoIdentificador(2);
        Producto s3 = new Producto();
        s3.setCodigoIdentificador(3);
        s1 = s2;
        instance.agregarProducto(s1);
        instance.agregarProducto(s1);
        instance.agregarProducto(s2);
        instance.agregarProducto(s2);
        instance.agregarProducto(s2);
        instance.agregarProducto(s3);
       
        ArrayList<Producto> a = new ArrayList<>();
        a.add(s1);
        a.add(s3);
        ArrayList<Producto> expResult = a;
        ArrayList<Producto> result = instance.getListaDeProductosEnStock();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    
     @Test
    public void testGetProductoes6() {
        //System.out.println("getListaDeProductosEnStock");
        Tienda instance = new Tienda();
        Producto s1 = new Producto();
        s1.setCodigoIdentificador(1);
        Producto s2 = new Producto();
        s2.setCodigoIdentificador(2);
        Producto s3 = new Producto();
        s3.setCodigoIdentificador(3);
        s1 = s2;
        instance.agregarProducto(s1);
        instance.agregarProducto(s1);
        instance.agregarProducto(s2);
        instance.agregarProducto(s2);
        instance.agregarProducto(s2);
        instance.agregarProducto(s3);
        instance.eliminarProducto(s1);
       
        ArrayList<Producto> a = new ArrayList<>();
        a.add(s3);
        ArrayList<Producto> expResult = a;
        ArrayList<Producto> result = instance.getListaDeProductosEnStock();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
     @Test
    public void testGetProductoes7() {
        //System.out.println("getListaDeProductosEnStock");
        Tienda instance = new Tienda();
        Producto s1 = new Producto();
        s1.setCodigoIdentificador(1);
        Producto s2 = new Producto();
        s2.setCodigoIdentificador(2);
        Producto s3 = new Producto();
        s3.setCodigoIdentificador(3);
        s1 = s2;
        instance.agregarProducto(s1);
        instance.agregarProducto(s1);
        instance.agregarProducto(s2);
        instance.agregarProducto(s2);
        instance.agregarProducto(s2);
        instance.agregarProducto(s3);
        instance.eliminarProducto(s1);
        instance.eliminarProducto(s3);
        
        
        ArrayList<Producto> a = new ArrayList<>();
        ArrayList<Producto> expResult = a;
        ArrayList<Producto> result = instance.getListaDeProductosEnStock();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
        /**
     * Test of setListaDeProductosEnStock method, of class Tienda.
     */
    @Test
    public void testSetProductoes1() {
        //System.out.println("setListaDeProductosEnStock");
        ArrayList<Producto> sucursales = new ArrayList<>();
        Tienda instance = new Tienda();
        Producto s1 = new Producto();
        s1.setCodigoIdentificador(1);
        Producto s2 = new Producto();
        s2.setCodigoIdentificador(2);
        Producto s3 = new Producto();
        s3.setCodigoIdentificador(3);
        instance.agregarProducto(s1);
        instance.setListaDeProductosEnStock(sucursales);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testSetProductoes2() {
        //System.out.println("setListaDeProductosEnStock");
        ArrayList<Producto> sucursales = new ArrayList<>();
        Tienda instance = new Tienda();
        Producto s1 = new Producto();
        s1.setCodigoIdentificador(1);
        Producto s2 = new Producto();
        s2.setCodigoIdentificador(2);
        Producto s3 = new Producto();
        s3.setCodigoIdentificador(3);
        instance.agregarProducto(s1);
        instance.agregarProducto(s2);
        instance.setListaDeProductosEnStock(sucursales);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testSetProductoes3() {
        //System.out.println("setListaDeProductosEnStock");
        ArrayList<Producto> sucursales = new ArrayList<>();
        Tienda instance = new Tienda();
        Producto s1 = new Producto();
        s1.setCodigoIdentificador(1);
        Producto s2 = new Producto();
        s2.setCodigoIdentificador(2);
        Producto s3 = new Producto();
        s3.setCodigoIdentificador(3);
        instance.agregarProducto(s1);
        instance.agregarProducto(s2);
        instance.agregarProducto(s3);
        instance.setListaDeProductosEnStock(sucursales);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testSetProductoes4() {
        //System.out.println("setListaDeProductosEnStock");
        ArrayList<Producto> sucursales = new ArrayList<>();
        Tienda instance = new Tienda();
        Producto s1 = new Producto();
        s1.setCodigoIdentificador(1);
        Producto s2 = new Producto();
        s2.setCodigoIdentificador(2);
        Producto s3 = new Producto();
        s3.setCodigoIdentificador(3);
        instance.setListaDeProductosEnStock(sucursales);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getStockDeProductoPorId method, of class Tienda.
     */
    @Test
    public void testGetStockDeProductoPorId1() {
        //System.out.println("getStockDeProductoPorId");
        Tienda instance = new Tienda();
        int[] a = new int[10];
        instance.setStockDeProductoPorId(a);
        int[] expResult = a;
        int[] result = instance.getStockDeProductoPorId();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testGetStockDeProductoPorId2() {
        //System.out.println("getStockDeProductoPorId");
        Tienda instance = new Tienda();
        int[] a = {1,2,4,5,6,8,10};
        instance.setStockDeProductoPorId(a);
        int[] expResult = a;
        int[] result = instance.getStockDeProductoPorId();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setStockDeProductoPorId method, of class Tienda.
     */
    @Test
    public void testSetStockDeProductoPorId() {
        System.out.println("setStockDeProductoPorId");
        int[] stockDeProductoPorId = new int[15];
        Tienda instance = new Tienda();
        instance.setStockDeProductoPorId(stockDeProductoPorId);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getSucursales method, of class Tienda.
     */
    @Test
    public void testGetSucursales1() {
        //System.out.println("getSucursales");
        Tienda instance = new Tienda();
        Sucursal s1 = new Sucursal();
        Sucursal s2 = new Sucursal();
        Sucursal s3 = new Sucursal();
        instance.agregarSucursal(s1);
        
        ArrayList<Sucursal> a = new ArrayList<>();
        a.add(s1);
        ArrayList<Sucursal> expResult = a;
        ArrayList<Sucursal> result = instance.getSucursales();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testGetSucursales2() {
        //System.out.println("getSucursales");
        Tienda instance = new Tienda();
        Sucursal s1 = new Sucursal();
        Sucursal s2 = new Sucursal();
        Sucursal s3 = new Sucursal();
        instance.agregarSucursal(s1);
        instance.agregarSucursal(s1);
        
        ArrayList<Sucursal> a = new ArrayList<>();
        a.add(s1);
        ArrayList<Sucursal> expResult = a;
        ArrayList<Sucursal> result = instance.getSucursales();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testGetSucursales3() {
        //System.out.println("getSucursales");
        Tienda instance = new Tienda();
        Sucursal s1 = new Sucursal();
        Sucursal s2 = new Sucursal();
        Sucursal s3 = new Sucursal();
        instance.agregarSucursal(s1);
        instance.agregarSucursal(s1);
        instance.agregarSucursal(s2);
        instance.agregarSucursal(s2);
        instance.agregarSucursal(s2);
       
        ArrayList<Sucursal> a = new ArrayList<>();
        a.add(s1);
        a.add(s2);
        ArrayList<Sucursal> expResult = a;
        ArrayList<Sucursal> result = instance.getSucursales();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testGetSucursales4() {
        //System.out.println("getSucursales");
        Tienda instance = new Tienda();
        Sucursal s1 = new Sucursal();
        Sucursal s2 = new Sucursal();
        Sucursal s3 = new Sucursal();
        instance.agregarSucursal(s1);
        instance.agregarSucursal(s1);
        instance.agregarSucursal(s2);
        instance.agregarSucursal(s2);
        instance.agregarSucursal(s2);
        instance.agregarSucursal(s3);
       
        ArrayList<Sucursal> a = new ArrayList<>();
        a.add(s1);
        a.add(s2);
        a.add(s3);
        ArrayList<Sucursal> expResult = a;
        ArrayList<Sucursal> result = instance.getSucursales();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testGetSucursales5() {
        //System.out.println("getSucursales");
        Tienda instance = new Tienda();
        Sucursal s1 = new Sucursal();
        Sucursal s2 = new Sucursal();
        Sucursal s3 = new Sucursal();
        s1 = s2;
        instance.agregarSucursal(s1);
        instance.agregarSucursal(s1);
        instance.agregarSucursal(s2);
        instance.agregarSucursal(s2);
        instance.agregarSucursal(s2);
        instance.agregarSucursal(s3);
       
        ArrayList<Sucursal> a = new ArrayList<>();
        a.add(s1);
        a.add(s3);
        ArrayList<Sucursal> expResult = a;
        ArrayList<Sucursal> result = instance.getSucursales();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    
     @Test
    public void testGetSucursales6() {
        //System.out.println("getSucursales");
        Tienda instance = new Tienda();
        Sucursal s1 = new Sucursal();
        Sucursal s2 = new Sucursal();
        Sucursal s3 = new Sucursal();
        s1 = s2;
        instance.agregarSucursal(s1);
        instance.agregarSucursal(s1);
        instance.agregarSucursal(s2);
        instance.agregarSucursal(s2);
        instance.agregarSucursal(s2);
        instance.agregarSucursal(s3);
        instance.eliminarSucursal(s1);
       
        ArrayList<Sucursal> a = new ArrayList<>();
        a.add(s3);
        ArrayList<Sucursal> expResult = a;
        ArrayList<Sucursal> result = instance.getSucursales();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
     @Test
    public void testGetSucursales7() {
        //System.out.println("getSucursales");
        Tienda instance = new Tienda();
        Sucursal s1 = new Sucursal();
        Sucursal s2 = new Sucursal();
        Sucursal s3 = new Sucursal();
        s1 = s2;
        instance.agregarSucursal(s1);
        instance.agregarSucursal(s1);
        instance.agregarSucursal(s2);
        instance.agregarSucursal(s2);
        instance.agregarSucursal(s2);
        instance.agregarSucursal(s3);
        instance.eliminarSucursal(s1);
        instance.eliminarSucursal(s3);
        
        
        ArrayList<Sucursal> a = new ArrayList<>();
        ArrayList<Sucursal> expResult = a;
        ArrayList<Sucursal> result = instance.getSucursales();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
        /**
     * Test of setSucursales method, of class Tienda.
     */
    @Test
    public void testSetSucursales1() {
        //System.out.println("setSucursales");
        ArrayList<Sucursal> sucursales = new ArrayList<>();
        Tienda instance = new Tienda();
        Sucursal s1 = new Sucursal();
        Sucursal s2 = new Sucursal();
        Sucursal s3 = new Sucursal();
        instance.agregarSucursal(s1);
        instance.setSucursales(sucursales);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testSetSucursales2() {
        //System.out.println("setSucursales");
        ArrayList<Sucursal> sucursales = new ArrayList<>();
        Tienda instance = new Tienda();
        Sucursal s1 = new Sucursal();
        Sucursal s2 = new Sucursal();
        Sucursal s3 = new Sucursal();
        instance.agregarSucursal(s1);
        instance.agregarSucursal(s2);
        instance.setSucursales(sucursales);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testSetSucursales3() {
        //System.out.println("setSucursales");
        ArrayList<Sucursal> sucursales = new ArrayList<>();
        Tienda instance = new Tienda();
        Sucursal s1 = new Sucursal();
        Sucursal s2 = new Sucursal();
        Sucursal s3 = new Sucursal();
        instance.agregarSucursal(s1);
        instance.agregarSucursal(s2);
        instance.agregarSucursal(s3);
        instance.setSucursales(sucursales);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testSetSucursales4() {
        //System.out.println("setSucursales");
        ArrayList<Sucursal> sucursales = new ArrayList<>();
        Tienda instance = new Tienda();
        Sucursal s1 = new Sucursal();
        Sucursal s2 = new Sucursal();
        Sucursal s3 = new Sucursal();
        instance.setSucursales(sucursales);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of agregarProducto method, of class Tienda.
     */
    
}
