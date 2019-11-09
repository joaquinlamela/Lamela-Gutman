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
public class ProductoTest {
    
    public ProductoTest() {
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

    @Test
    public void testGetNombre1() {
        ///System.out.println("getNombre");
        Producto instance = new Producto();
        instance.setNombre("vidrio");
        String expResult = "vidrio";
        String result = instance.getNombre();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

        @Test
    public void testGetNombre2() {
        ///System.out.println("getNombre");
        Producto instance = new Producto();
        instance.setNombre("Plastico");
        String expResult = "Plastico";
        String result = instance.getNombre();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    
        @Test(expected = RuntimeException.class)
    public void testGetNombre3() {
        ///System.out.println("getNombre");
        Producto instance = new Producto();
        instance.setNombre("");
        String expResult = "";
        String result = instance.getNombre();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    
    
        @Test(expected = RuntimeException.class)
    public void testGetNombre4() {
        ///System.out.println("getNombre");
        Producto instance = new Producto();
        instance.setNombre("   ");
        String expResult = "   ";
        String result = instance.getNombre();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    
    /**
     * Test of setNombre method, of class Producto.
     */
    @Test
    public void testSetNombre1() {
        //System.out.println("setNombre");
        String nombre = "Producto1";
        Producto instance = new Producto();
        instance.setNombre(nombre);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    @Test(expected = RuntimeException.class)
    public void testSetNombre2() {
        //System.out.println("setNombre");
        String nombre = "";
        Producto instance = new Producto();
        instance.setNombre(nombre);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test(expected = RuntimeException.class)
    public void testSetNombre3() {
        //System.out.println("setNombre");
        String nombre = "    ";
        Producto instance = new Producto();
        instance.setNombre(nombre);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    /**
     * Test of getOrigen method, of class Producto.
     */
    
    
    @Test
    public void testGetOrigen1() {
        //System.out.println("getOrigen");
        Producto instance = new Producto();
        instance.setOrigen(tipoOrigen.Animal);
        tipoOrigen expResult = tipoOrigen.Animal;
        tipoOrigen result = instance.getOrigen();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testGetOrigen2() {
        //System.out.println("getOrigen");
        Producto instance = new Producto();
        instance.setOrigen(tipoOrigen.Indefinido);
        tipoOrigen expResult = tipoOrigen.Indefinido;
        tipoOrigen result = instance.getOrigen();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setOrigen method, of class Producto.
     */
    @Test
    public void testSetOrigen() {
        //System.out.println("setOrigen");
        tipoOrigen origen =tipoOrigen.Mineral;
        Producto instance = new Producto();
        instance.setOrigen(origen);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getDescripcionDelProducto method, of class Producto.
     */
    @Test
    public void testGetDescripcion1() {
        ///System.out.println("getDescripcion");
        Producto instance = new Producto();
        instance.setDescripcionDelProducto("Caro");
        String expResult = "Caro";
        String result = instance.getDescripcionDelProducto();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

        @Test
    public void testGetDescripcion2() {
        ///System.out.println("getDescripcion");
        Producto instance = new Producto();
        instance.setDescripcionDelProducto("Barato");
        String expResult = "Barato";
        String result = instance.getDescripcionDelProducto();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    
        @Test(expected = RuntimeException.class)
    public void testGetDescripcion3() {
        ///System.out.println("getDescripcion");
        Producto instance = new Producto();
        instance.setDescripcionDelProducto("");
        String expResult = "";
        String result = instance.getDescripcionDelProducto();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    
    
        @Test(expected = RuntimeException.class)
    public void testGetDescripcion4() {
        ///System.out.println("getDescripcion");
        Producto instance = new Producto();
        instance.setDescripcionDelProducto("    ");
        String expResult = "    ";
        String result = instance.getDescripcionDelProducto();
        assertEquals(expResult, result);
       // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    
    /**
     * Test of setDescripcion method, of class Producto.
     */
    @Test
    public void testSetDescripcion1() {
        //System.out.println("setDescripcion");
        String desc = "Producto1";
        Producto instance = new Producto();
        instance.setDescripcionDelProducto(desc);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    @Test(expected = RuntimeException.class)
    public void testSetDescripcion2() {
        //System.out.println("setDescripcion");
        String desc = "";
        Producto instance = new Producto();
        instance.setDescripcionDelProducto(desc);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test(expected = RuntimeException.class)
    public void testSetDescripcion3() {
        //System.out.println("setDescripcion");
        String desc = "   ";
        Producto instance = new Producto();
        instance.setDescripcionDelProducto(desc);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of get method, of class Producto.
     */
    @Test(expected = RuntimeException.class)
    public void testGetPesoDeProducto1() {
        //System.out.println("getPesoDeProducto");
        Producto instance = new Producto();
        instance.setPesoDelProducto(0);
        int expResult = 0;
        int result = (int)instance.getPesoDelProducto();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test(expected = RuntimeException.class)
    public void testGetPesoDeProducto2() {
        //System.out.println("getPesoDeProducto");
        Producto instance = new Producto();
        instance.setPesoDelProducto(-1);
        int expResult = -1;
        int result = (int)instance.getPesoDelProducto();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testGetPesoDeProducto3() {
        //System.out.println("getPesoDeProducto");
        Producto instance = new Producto();
        instance.setPesoDelProducto(1);
        int expResult = 1;
        int result = (int)instance.getPesoDelProducto();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testGetPesoDeProducto4() {
        //System.out.println("getPesoDeProducto");
        Producto instance = new Producto();
        instance.setPesoDelProducto(100);
        int expResult = 100;
        int result = (int)instance.getPesoDelProducto();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testGetPesoDeProducto5() {
        //System.out.println("getPesoDeProducto");
        Producto instance = new Producto();
        instance.setPesoDelProducto(100000);
        int expResult = 100000;
        int result = (int)instance.getPesoDelProducto();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    /**
     * Test of setPesoDelProductoDelProductoDeProducto method, of class Producto.
     */
    @Test(expected = RuntimeException.class)
    public void testSetPesoDeProducto1() {
        //System.out.println("setPesoDelProductoDelProductoDeProducto");
        int precioDeProducto = 0;
        Producto instance = new Producto();
        instance.setPesoDelProducto(precioDeProducto);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    @Test(expected = RuntimeException.class)
    public void testSetPesoDeProducto2() {
        //System.out.println("setPesoDelProductoDelProductoDeProducto");
        int precioDeProducto = -8;
        Producto instance = new Producto();
        instance.setPesoDelProducto(precioDeProducto);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testSetPesoDeProducto3() {
        //System.out.println("setPesoDelProductoDelProductoDeProducto");
        int precioDeProducto = 1;
        Producto instance = new Producto();
        instance.setPesoDelProducto(precioDeProducto);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testSetPesoDeProducto4() {
        //System.out.println("setPesoDelProductoDelProductoDeProducto");
        int precioDeProducto = 100;
        Producto instance = new Producto();
        instance.setPesoDelProducto(precioDeProducto);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testSetPesoDeProducto5() {
        //System.out.println("setPesoDelProductoDelProductoDeProducto");
        int precioDeProducto = 10000;
        Producto instance = new Producto();
        instance.setPesoDelProducto(precioDeProducto);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getPosiblesProductosRecomendados method, of class Producto.
     */
    @Test
    public void testGetPosiblesEnvasesRecomendados1() {
        //System.out.println("getPosiblesProductosRecomendados");
        Producto instance = new Producto();
        Envase e = new Envase();
        instance.agregarEnvase(e);
        ArrayList<Envase> a = new ArrayList<>();
        a.add(e);
        ArrayList<Envase> expResult = a;
        ArrayList<Envase> result = instance.getPosiblesEnvasesRecomendados();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testGetPosiblesEnvasesRecomendados2() {
        //System.out.println("getPosiblesProductosRecomendados");
        Producto instance = new Producto();
        Envase e = new Envase();
        instance.agregarEnvase(e);
        instance.agregarEnvase(e);
        
        ArrayList<Envase> a = new ArrayList<>();
        a.add(e);
        ArrayList<Envase> expResult = a;
        ArrayList<Envase> result = instance.getPosiblesEnvasesRecomendados();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    @Test
    public void testGetPosiblesEnvasesRecomendados3() {
        //System.out.println("getPosiblesProductosRecomendados");
        Producto instance = new Producto();
        Envase e = new Envase();
        Envase e2 = new Envase();
        
        instance.agregarEnvase(e);
        instance.agregarEnvase(e2);
        
        ArrayList<Envase> a = new ArrayList<>();
        a.add(e);
        a.add(e2);
        
        ArrayList<Envase> expResult = a;
        ArrayList<Envase> result = instance.getPosiblesEnvasesRecomendados();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testGetPosiblesEnvasesRecomendados4() {
        //System.out.println("getPosiblesProductosRecomendados");
        Producto instance = new Producto();
        Envase e = new Envase();
        Envase e2 = new Envase();
        Envase e3 = new Envase();
        
        instance.agregarEnvase(e);
        instance.agregarEnvase(e2);
        instance.agregarEnvase(e3);
        instance.agregarEnvase(e3);
        instance.agregarEnvase(e3);
        
        
        ArrayList<Envase> a = new ArrayList<>();
        a.add(e);
        a.add(e2);
        a.add(e3);
        ArrayList<Envase> expResult = a;
        ArrayList<Envase> result = instance.getPosiblesEnvasesRecomendados();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testGetPosiblesEnvasesRecomendados5() {
        //System.out.println("getPosiblesProductosRecomendados");
        Producto instance = new Producto();
        Envase e = new Envase();
        Envase e2 = new Envase();
        Envase e3 = new Envase();
        
        instance.agregarEnvase(e);
        instance.agregarEnvase(e2);
        instance.agregarEnvase(e3);
        instance.agregarEnvase(e3);
        instance.agregarEnvase(e3);
        
        instance.eliminarEnvase(e3);
        ArrayList<Envase> a = new ArrayList<>();
        a.add(e);
        a.add(e2);
        ArrayList<Envase> expResult = a;
        ArrayList<Envase> result = instance.getPosiblesEnvasesRecomendados();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testGetPosiblesEnvasesRecomendados6() {
        //System.out.println("getPosiblesProductosRecomendados");
        Producto instance = new Producto();
        Envase e = new Envase();
        Envase e2 = new Envase();
        Envase e3 = new Envase();
        
        instance.agregarEnvase(e);
        instance.agregarEnvase(e2);
        instance.agregarEnvase(e3);
        instance.agregarEnvase(e3);
        instance.agregarEnvase(e3);
        
        instance.eliminarEnvase(e3);
        instance.eliminarEnvase(e2);
        ArrayList<Envase> a = new ArrayList<>();
        a.add(e);
        ArrayList<Envase> expResult = a;
        ArrayList<Envase> result = instance.getPosiblesEnvasesRecomendados();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    /**
     * Test of setPosiblesProductosRecomendados method, of class Producto.
     */
    @Test
    public void testSetPosiblesEnvasesRecomendados1() {
        //System.out.println("setPosiblesProductosRecomendados");
        Producto instance = new Producto();
        Envase e = new Envase();
        Envase e2 = new Envase();
        Envase e3 = new Envase();
        ArrayList<Envase> a = new ArrayList<>();
        a.add(e);
        a.add(e2);
        a.add(e3);
        instance.setPosiblesEnvasesRecomendados(a);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testSetPosiblesEnvasesRecomendados2() {
        //System.out.println("setPosiblesProductosRecomendados");
        Producto instance = new Producto();
        Envase e = new Envase();
        Envase e2 = new Envase();
        Envase e3 = new Envase();
        ArrayList<Envase> a = new ArrayList<>();
        a.add(e);
        instance.setPosiblesEnvasesRecomendados(a);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    public void testSetPosiblesEnvasesRecomendados3() {
        //System.out.println("setPosiblesProductosRecomendados");
        Producto instance = new Producto();
        Envase e = new Envase();
        Envase e2 = new Envase();
        Envase e3 = new Envase();

        ArrayList<Envase> a = new ArrayList<>();
        instance.setPosiblesEnvasesRecomendados(a);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    /**
     * Test of getPeso method, of class Producto.
     */
@Test(expected = RuntimeException.class)
    public void testGetPrecioDeProducto1() {
        //System.out.println("getPrecioDeProducto");
        Producto instance = new Producto();
        instance.setPrecio(0);
        int expResult = 0;
        int result = (int)instance.getPrecio();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test(expected = RuntimeException.class)
    public void testGetPrecioDeProducto2() {
        //System.out.println("getPrecioDeProducto");
        Producto instance = new Producto();
        instance.setPrecio(-1);
        int expResult = -1;
        int result = (int)instance.getPrecio();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testGetPrecioDeProducto3() {
        //System.out.println("getPrecioDeProducto");
        Producto instance = new Producto();
        instance.setPrecio(1);
        int expResult = 1;
        int result = (int)instance.getPrecio();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testGetPrecioDeProducto4() {
        //System.out.println("getPrecioDeProducto");
        Producto instance = new Producto();
        instance.setPrecio(100);
        int expResult = 100;
        int result = (int)instance.getPrecio();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testGetPrecioDeProducto5() {
        //System.out.println("getPrecioDeProducto");
        Producto instance = new Producto();
        instance.setPrecio(100000);
        int expResult = 100000;
        int result = (int)instance.getPrecio();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    /**
     * Test of setPrecioDeProducto method, of class Producto.
     */
    @Test(expected = RuntimeException.class)
    public void testSetPrecioDeProducto1() {
        //System.out.println("setPrecioDeProducto");
        int precioDeProducto = 0;
        Producto instance = new Producto();
        instance.setPrecio(precioDeProducto);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    @Test(expected = RuntimeException.class)
    public void testSetPrecioDeProducto2() {
        //System.out.println("setPrecioDeProducto");
        int precioDeProducto = -8;
        Producto instance = new Producto();
        instance.setPrecio(precioDeProducto);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testSetPrecioDeProducto3() {
        //System.out.println("setPrecioDeProducto");
        int precioDeProducto = 1;
        Producto instance = new Producto();
        instance.setPrecio(precioDeProducto);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testSetPrecioDeProducto4() {
        //System.out.println("setPrecioDeProducto");
        int precioDeProducto = 100;
        Producto instance = new Producto();
        instance.setPrecio(precioDeProducto);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testSetPrecioDeProducto5() {
        //System.out.println("setPrecioDeProducto");
        int precioDeProducto = 10000;
        Producto instance = new Producto();
        instance.setPrecio(precioDeProducto);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    /**
     * Test of getCodigoIdentificador method, of class Producto.
     */
    @Test(expected = RuntimeException.class)
    public void testGetIdentificadorDeProducto1() {
        //System.out.println("getPrecioDeProducto");
        Producto instance = new Producto();
        instance.setCodigoIdentificador(0);
        int expResult = 0;
        int result = instance.getCodigoIdentificador();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    @Test(expected = RuntimeException.class)
    public void testGetIdentificadorDeProducto2() {
        //System.out.println("getPrecioDeProducto");
        Producto instance = new Producto();
        instance.setCodigoIdentificador(-1);
        int expResult = -1;
        int result = instance.getCodigoIdentificador();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testGetIdentificadorDeProducto3() {
        //System.out.println("getPrecioDeProducto");
        Producto instance = new Producto();
        instance.setCodigoIdentificador(1);
        int expResult = 1;
        int result = instance.getCodigoIdentificador();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testGetIdentificadorDeProducto4() {
        //System.out.println("getPrecioDeProducto");
        Producto instance = new Producto();
        instance.setCodigoIdentificador(100);
        int expResult = 100;
        int result = instance.getCodigoIdentificador();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testGetIdentificadorDeProducto5() {
        //System.out.println("getPrecioDeProducto");
        Producto instance = new Producto();
        instance.setCodigoIdentificador(100000);
        int expResult = 100000;
        int result = instance.getCodigoIdentificador();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    /**
     * Test of setPrecioDeProducto method, of class Producto.
     */
    @Test(expected = RuntimeException.class)
    public void testSetIdentificadorDeProducto1() {
        //System.out.println("setPrecioDeProducto");
        int identificadorDeProducto = 0;
        Producto instance = new Producto();
        instance.setCodigoIdentificador(identificadorDeProducto);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    @Test(expected = RuntimeException.class)
    public void testSetIdentificadorDeProducto2() {
        //System.out.println("setPrecioDeProducto");
        int identificadorDeProducto = -8;
        Producto instance = new Producto();
        instance.setCodigoIdentificador(identificadorDeProducto);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testSetIdentificadorDeProducto3() {
        //System.out.println("setPrecioDeProducto");
        int identificadorDeProducto = 1;
        Producto instance = new Producto();
        instance.setCodigoIdentificador(identificadorDeProducto);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testSetIdentificadorDeProducto4() {
        //System.out.println("setPrecioDeProducto");
        int identificadorDeProducto = 100;
        Producto instance = new Producto();
        instance.setCodigoIdentificador(identificadorDeProducto);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testSetIdentificadorDeProducto5() {
        //System.out.println("setPrecioDeProducto");
        int identificadorDeProducto = 10000;
        Producto instance = new Producto();
        instance.setCodigoIdentificador(identificadorDeProducto);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getListaDeMateriales method, of class Producto.
     */
    @Test
    public void testGetlistaDeMateriales1() {
        //System.out.println("getlistaDeMateriales");
        Producto instance = new Producto();
        instance.getListaDeMateriales().add(tipoMaterial.Metal);
        ArrayList<tipoMaterial> a = new ArrayList<>();
        a.add(tipoMaterial.Metal);
        ArrayList<tipoMaterial> expResult = a;
        ArrayList<tipoMaterial> result = instance.getListaDeMateriales();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testGetListaDeMateriales2() {
        //System.out.println("getListaDeMateriales");
        Producto instance = new Producto();
        instance.getListaDeMateriales().add(tipoMaterial.Metal);
        instance.getListaDeMateriales().add(tipoMaterial.Carton);
        ArrayList<tipoMaterial> a = new ArrayList<>();
        a.add(tipoMaterial.Metal);
        a.add(tipoMaterial.Carton);
        ArrayList<tipoMaterial> expResult = a;
        ArrayList<tipoMaterial> result = instance.getListaDeMateriales();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
     @Test
    public void testGetListaDeMateriales3() {
        //System.out.println("getListaDeMateriales");
        Producto instance = new Producto();
        ArrayList<tipoMaterial> a = new ArrayList<>();
        ArrayList<tipoMaterial> expResult = a;
        ArrayList<tipoMaterial> result = instance.getListaDeMateriales();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }


    /**
     * Test of setListaDeMateriales method, of class Producto.
     */
    @Test
    public void testSetListaDeMateriales1() {
        //System.out.println("setListaDeMateriales")
        ArrayList<tipoMaterial> tiposDeMateriales = null;
        Producto instance = new Producto();
        instance.setListaDeMateriales(tiposDeMateriales);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testSetListaDeMateriales2() {
        //System.out.println("setListaDeMateriales")
        ArrayList<tipoMaterial> tiposDeMateriales = new ArrayList<>();
        Producto instance = new Producto();
        tiposDeMateriales.add(tipoMaterial.Metal);
        tiposDeMateriales.add(tipoMaterial.Plastico);
        instance.setListaDeMateriales(tiposDeMateriales);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testSetListaDeMateriales3() {
        //System.out.println("setListaDeMateriales")
        ArrayList<tipoMaterial> tiposDeMateriales = new ArrayList<>();
        Producto instance = new Producto();
        tiposDeMateriales.add(tipoMaterial.Metal);
        instance.setListaDeMateriales(tiposDeMateriales);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testSetListaDeMateriales4() {
        //System.out.println("setListaDeMateriales")
        ArrayList<tipoMaterial> tiposDeMateriales = new ArrayList<>();
        Producto instance = new Producto();
        tiposDeMateriales.add(tipoMaterial.Metal);
        tiposDeMateriales.add(tipoMaterial.Carton);
        tiposDeMateriales.add(tipoMaterial.Metal);
        instance.setListaDeMateriales(tiposDeMateriales);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testAgregarMateriales1() {
        //System.out.println("setListaDeMateriales")
        ArrayList<tipoMaterial> tiposDeMateriales = new ArrayList<>();
        Producto instance = new Producto();
        instance.agregarMateriales(tipoMaterial.Metal);
        instance.agregarMateriales(tipoMaterial.Metal);
        instance.agregarMateriales(tipoMaterial.Metal);
        
        ArrayList<tipoMaterial> a = new ArrayList<>();
        a.add(tipoMaterial.Metal);
        ArrayList<tipoMaterial> expResult = a;
        ArrayList<tipoMaterial> result = instance.getListaDeMateriales();
        assertEquals(expResult, result);
        
// TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    
    @Test
    public void testAgregarMateriales2() {
        //System.out.println("setListaDeMateriales")
        ArrayList<tipoMaterial> tiposDeMateriales = new ArrayList<>();
        Producto instance = new Producto();
        instance.agregarMateriales(tipoMaterial.Metal);
        instance.agregarMateriales(tipoMaterial.Carton);
        instance.agregarMateriales(tipoMaterial.Carton);
        
        ArrayList<tipoMaterial> a = new ArrayList<>();
        a.add(tipoMaterial.Metal);
        a.add(tipoMaterial.Carton);
        ArrayList<tipoMaterial> expResult = a;
        ArrayList<tipoMaterial> result = instance.getListaDeMateriales();
        assertEquals(expResult, result);
        
// TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testAgregarMateriales3() {
        //System.out.println("setListaDeMateriales")
        ArrayList<tipoMaterial> tiposDeMateriales = new ArrayList<>();
        Producto instance = new Producto();
        instance.agregarMateriales(tipoMaterial.Metal);
        instance.agregarMateriales(tipoMaterial.Carton);
        instance.agregarMateriales(tipoMaterial.Carton);
        instance.agregarMateriales(tipoMaterial.Papel);
        
        ArrayList<tipoMaterial> a = new ArrayList<>();
        a.add(tipoMaterial.Metal);
        a.add(tipoMaterial.Carton);
        a.add(tipoMaterial.Papel);
        
        ArrayList<tipoMaterial> expResult = a;
        ArrayList<tipoMaterial> result = instance.getListaDeMateriales();
        assertEquals(expResult, result);
        
// TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testEliminarMateriales1() {
        //System.out.println("setListaDeMateriales")
        ArrayList<tipoMaterial> tiposDeMateriales = new ArrayList<>();
        Producto instance = new Producto();
        instance.agregarMateriales(tipoMaterial.Metal);
        instance.agregarMateriales(tipoMaterial.Carton);
        instance.agregarMateriales(tipoMaterial.Carton);
        instance.agregarMateriales(tipoMaterial.Papel);
        instance.eliminarMaterial(tipoMaterial.Carton);
        
        ArrayList<tipoMaterial> a = new ArrayList<>();
        a.add(tipoMaterial.Metal);
        a.add(tipoMaterial.Papel);
        
        ArrayList<tipoMaterial> expResult = a;
        ArrayList<tipoMaterial> result = instance.getListaDeMateriales();
        assertEquals(expResult, result);
        
// TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testEliminarMateriales2() {
        //System.out.println("setListaDeMateriales")
        ArrayList<tipoMaterial> tiposDeMateriales = new ArrayList<>();
        Producto instance = new Producto();
        instance.agregarMateriales(tipoMaterial.Metal);
        instance.agregarMateriales(tipoMaterial.Carton);
        instance.agregarMateriales(tipoMaterial.Carton);
        instance.agregarMateriales(tipoMaterial.Papel);
        instance.eliminarMaterial(tipoMaterial.Carton);
        instance.eliminarMaterial(tipoMaterial.Metal);
        
        ArrayList<tipoMaterial> a = new ArrayList<>();
        a.add(tipoMaterial.Papel);
        
        ArrayList<tipoMaterial> expResult = a;
        ArrayList<tipoMaterial> result = instance.getListaDeMateriales();
        assertEquals(expResult, result);
        
// TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testEliminarMateriales3() {
        //System.out.println("setListaDeMateriales")
        ArrayList<tipoMaterial> tiposDeMateriales = new ArrayList<>();
        Producto instance = new Producto();
        instance.agregarMateriales(tipoMaterial.Metal);
        instance.agregarMateriales(tipoMaterial.Carton);
        instance.agregarMateriales(tipoMaterial.Carton);
        instance.agregarMateriales(tipoMaterial.Papel);
        instance.agregarMateriales(tipoMaterial.Papel);
        instance.eliminarMaterial(tipoMaterial.Carton);
        instance.eliminarMaterial(tipoMaterial.Metal);
        instance.eliminarMaterial(tipoMaterial.Papel);
        
        ArrayList<tipoMaterial> a = new ArrayList<>();
        
        ArrayList<tipoMaterial> expResult = a;
        ArrayList<tipoMaterial> result = instance.getListaDeMateriales();
        assertEquals(expResult, result);
        
// TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testEliminarMateriales4() {
        //System.out.println("setListaDeMateriales")
        ArrayList<tipoMaterial> tiposDeMateriales = new ArrayList<>();
        Producto instance = new Producto();
        instance.eliminarMaterial(tipoMaterial.Carton);
        instance.eliminarMaterial(tipoMaterial.Metal);
        instance.eliminarMaterial(tipoMaterial.Papel);
        
        ArrayList<tipoMaterial> a = new ArrayList<>();
        
        ArrayList<tipoMaterial> expResult = a;
        ArrayList<tipoMaterial> result = instance.getListaDeMateriales();
        assertEquals(expResult, result);
        
// TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testEliminarMateriales5() {
        //System.out.println("setListaDeMateriales")
        ArrayList<tipoMaterial> tiposDeMateriales = new ArrayList<>();
        Producto instance = new Producto();
        instance.agregarMateriales(tipoMaterial.Metal);
        instance.agregarMateriales(tipoMaterial.Indefinido);
        instance.eliminarMaterial(tipoMaterial.Carton);
        instance.eliminarMaterial(tipoMaterial.Metal);
        instance.eliminarMaterial(tipoMaterial.Papel);
        
        ArrayList<tipoMaterial> a = new ArrayList<>();
        
        a.add(tipoMaterial.Indefinido);
        ArrayList<tipoMaterial> expResult = a;
        ArrayList<tipoMaterial> result = instance.getListaDeMateriales();
        assertEquals(expResult, result);
        
// TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getCantidadVendidos method, of class Producto.
     */
    @Test
    public void testGetcantidadVendidos1() {
        //System.out.println("getcantidadVendidos");
        Producto instance = new Producto();
        instance.setCantidadVendidos(0);
        int expResult = 0;
        int result = (int)instance.getCantidadVendidos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    @Test(expected = RuntimeException.class)
    public void testGetcantidadVendidos2() {
        //System.out.println("getcantidadVendidos");
        Producto instance = new Producto();
        instance.setCantidadVendidos(-1);
        int expResult = -1;
        int result = (int)instance.getCantidadVendidos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testGetcantidadVendidos3() {
        //System.out.println("getcantidadVendidos");
        Producto instance = new Producto();
        instance.setCantidadVendidos(1);
        int expResult = 1;
        int result = (int)instance.getCantidadVendidos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testGetcantidadVendidos4() {
        //System.out.println("getcantidadVendidos");
        Producto instance = new Producto();
        instance.setCantidadVendidos(100);
        int expResult = 100;
        int result = (int)instance.getCantidadVendidos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testGetcantidadVendidos5() {
        //System.out.println("getcantidadVendidos");
        Producto instance = new Producto();
        instance.setCantidadVendidos(100000);
        int expResult = 100000;
        int result = (int)instance.getCantidadVendidos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    /**
     * Test of setcantidadVendidosDelProductoDeProducto method, of class Producto.
     */
    @Test
    public void testSetcantidadVendidos1() {
        //System.out.println("setcantidadVendidosDelProductoDeProducto");
        int precioDeProducto = 0;
        Producto instance = new Producto();
        instance.setCantidadVendidos(precioDeProducto);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    @Test(expected = RuntimeException.class)
    public void testSetcantidadVendidos2() {
        //System.out.println("setcantidadVendidosDelProductoDeProducto");
        int precioDeProducto = -8;
        Producto instance = new Producto();
        instance.setCantidadVendidos(precioDeProducto);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testSetcantidadVendidos3() {
        //System.out.println("setcantidadVendidosDelProductoDeProducto");
        int precioDeProducto = 1;
        Producto instance = new Producto();
        instance.setCantidadVendidos(precioDeProducto);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testSetcantidadVendidos4() {
        //System.out.println("setcantidadVendidosDelProductoDeProducto");
        int precioDeProducto = 100;
        Producto instance = new Producto();
        instance.setCantidadVendidos(precioDeProducto);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testSetcantidadVendidos5() {
        //System.out.println("setcantidadVendidosDelProductoDeProducto");
        int precioDeProducto = 10000;
        Producto instance = new Producto();
        instance.setCantidadVendidos(precioDeProducto);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
}
