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
public class EnvaseTest {
    
    public EnvaseTest() {
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
     * Test of getNombre method, of class Envase.
     */
    @Test
    public void testGetNombre1() {
        ///System.out.println("getNombre");
        Envase instance = new Envase();
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
        Envase instance = new Envase();
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
        Envase instance = new Envase();
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
        Envase instance = new Envase();
        instance.setNombre("   ");
        String expResult = "   ";
        String result = instance.getNombre();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    
    /**
     * Test of setNombre method, of class Envase.
     */
    @Test
    public void testSetNombre1() {
        //System.out.println("setNombre");
        String nombre = "Envase1";
        Envase instance = new Envase();
        instance.setNombre(nombre);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    @Test(expected = RuntimeException.class)
    public void testSetNombre2() {
        //System.out.println("setNombre");
        String nombre = "";
        Envase instance = new Envase();
        instance.setNombre(nombre);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test(expected = RuntimeException.class)
    public void testSetNombre3() {
        //System.out.println("setNombre");
        String nombre = "    ";
        Envase instance = new Envase();
        instance.setNombre(nombre);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    /**
     * Test of getPesoMaximoSoportado method, of class Envase.
     */
    @Test(expected = RuntimeException.class)
    public void testGetPesoMaximoSoportado1() {
        //System.out.println("getPesoMaximoSoportado");
        Envase instance = new Envase();
        instance.setPesoMaximoSoportado(0);
        int expResult = 0;
        int result = instance.getPesoMaximoSoportado();
        assertEquals(expResult, result);
// TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test(expected = RuntimeException.class)
    public void testGetPesoMaximoSoportado2() {
        //System.out.println("getPesoMaximoSoportado");
        Envase instance = new Envase();
        
        instance.setPesoMaximoSoportado(-5);
        
        //int expResult = ;
        int result = instance.getPesoMaximoSoportado();
        //assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    @Test
    public void testGetPesoMaximoSoportado3() {
        //System.out.println("getPesoMaximoSoportado");
        Envase instance = new Envase();
        instance.setPesoMaximoSoportado(15);
        int expResult = 15;
        int result = instance.getPesoMaximoSoportado();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test(expected = RuntimeException.class)
    public void testGetPesoMaximoSoportado4() {
        //System.out.println("getPesoMaximoSoportado");
        Envase instance = new Envase();
        
        instance.setPesoMaximoSoportado(101);
        
        //int expResult = ;
        int result = instance.getPesoMaximoSoportado();
        //assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

     @Test
    public void testGetPesoMaximoSoportado5() {
        //System.out.println("getPesoMaximoSoportado");
        Envase instance = new Envase();
        
        instance.setPesoMaximoSoportado(100);
        
        int expResult = 100;
        int result = instance.getPesoMaximoSoportado();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    /**
     * Test of setPesoMaximoSoportado method, of class Envase.
     */
    @Test
    public void testSetPesoMaximoSoportado1() {
        //System.out.println("setPesoMaximoSoportado");
        int pesoMaximoSoportado = 6;
        Envase instance = new Envase();
        instance.setPesoMaximoSoportado(pesoMaximoSoportado);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    @Test(expected = RuntimeException.class)
    public void testSetPesoMaximoSoportado2() {
        //System.out.println("setPesoMaximoSoportado");
        int pesoMaximoSoportado = -1;
        Envase instance = new Envase();
        instance.setPesoMaximoSoportado(pesoMaximoSoportado);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
     @Test(expected = RuntimeException.class)
    public void testSetPesoMaximoSoportado3() {
        //System.out.println("setPesoMaximoSoportado");
        int pesoMaximoSoportado = 0;
        Envase instance = new Envase();
        instance.setPesoMaximoSoportado(pesoMaximoSoportado);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test(expected = RuntimeException.class)
    public void testSetPesoMaximoSoportado4() {
        //System.out.println("setPesoMaximoSoportado");
        int pesoMaximoSoportado = 101;
        Envase instance = new Envase();
        instance.setPesoMaximoSoportado(pesoMaximoSoportado);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testSetPesoMaximoSoportado5() {
        //System.out.println("setPesoMaximoSoportado");
        int pesoMaximoSoportado = 100;
        Envase instance = new Envase();
        instance.setPesoMaximoSoportado(pesoMaximoSoportado);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    /**
     * Test of getTiposDeMateriales method, of class Envase.
     */
    @Test
    public void testGetTiposDeMateriales1() {
        //System.out.println("getTiposDeMateriales");
        Envase instance = new Envase();
        instance.getTiposDeMateriales().add(tipoMaterial.Metal);
        ArrayList<tipoMaterial> a = new ArrayList<>();
        a.add(tipoMaterial.Metal);
        ArrayList<tipoMaterial> expResult = a;
        ArrayList<tipoMaterial> result = instance.getTiposDeMateriales();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testGetTiposDeMateriales2() {
        //System.out.println("getTiposDeMateriales");
        Envase instance = new Envase();
        instance.getTiposDeMateriales().add(tipoMaterial.Metal);
        instance.getTiposDeMateriales().add(tipoMaterial.Carton);
        ArrayList<tipoMaterial> a = new ArrayList<>();
        a.add(tipoMaterial.Metal);
        a.add(tipoMaterial.Carton);
        ArrayList<tipoMaterial> expResult = a;
        ArrayList<tipoMaterial> result = instance.getTiposDeMateriales();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
     @Test
    public void testGetTiposDeMateriales3() {
        //System.out.println("getTiposDeMateriales");
        Envase instance = new Envase();
        ArrayList<tipoMaterial> a = new ArrayList<>();
        ArrayList<tipoMaterial> expResult = a;
        ArrayList<tipoMaterial> result = instance.getTiposDeMateriales();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }


    /**
     * Test of setTiposDeMateriales method, of class Envase.
     */
    @Test
    public void testSetTiposDeMateriales1() {
        //System.out.println("setTiposDeMateriales")
        ArrayList<tipoMaterial> tiposDeMateriales = null;
        Envase instance = new Envase();
        instance.setTiposDeMateriales(tiposDeMateriales);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testSetTiposDeMateriales2() {
        //System.out.println("setTiposDeMateriales")
        ArrayList<tipoMaterial> tiposDeMateriales = new ArrayList<>();
        Envase instance = new Envase();
        tiposDeMateriales.add(tipoMaterial.Metal);
        tiposDeMateriales.add(tipoMaterial.Plastico);
        instance.setTiposDeMateriales(tiposDeMateriales);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testSetTiposDeMateriales3() {
        //System.out.println("setTiposDeMateriales")
        ArrayList<tipoMaterial> tiposDeMateriales = new ArrayList<>();
        Envase instance = new Envase();
        tiposDeMateriales.add(tipoMaterial.Metal);
        instance.setTiposDeMateriales(tiposDeMateriales);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testSetTiposDeMateriales4() {
        //System.out.println("setTiposDeMateriales")
        ArrayList<tipoMaterial> tiposDeMateriales = new ArrayList<>();
        Envase instance = new Envase();
        tiposDeMateriales.add(tipoMaterial.Metal);
        tiposDeMateriales.add(tipoMaterial.Carton);
        tiposDeMateriales.add(tipoMaterial.Metal);
        instance.setTiposDeMateriales(tiposDeMateriales);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testAgregarMateriales1() {
        //System.out.println("setTiposDeMateriales")
        ArrayList<tipoMaterial> tiposDeMateriales = new ArrayList<>();
        Envase instance = new Envase();
        instance.agregarMateriales(tipoMaterial.Metal);
        instance.agregarMateriales(tipoMaterial.Metal);
        instance.agregarMateriales(tipoMaterial.Metal);
        
        ArrayList<tipoMaterial> a = new ArrayList<>();
        a.add(tipoMaterial.Metal);
        ArrayList<tipoMaterial> expResult = a;
        ArrayList<tipoMaterial> result = instance.getTiposDeMateriales();
        assertEquals(expResult, result);
        
// TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    
    @Test
    public void testAgregarMateriales2() {
        //System.out.println("setTiposDeMateriales")
        ArrayList<tipoMaterial> tiposDeMateriales = new ArrayList<>();
        Envase instance = new Envase();
        instance.agregarMateriales(tipoMaterial.Metal);
        instance.agregarMateriales(tipoMaterial.Carton);
        instance.agregarMateriales(tipoMaterial.Carton);
        
        ArrayList<tipoMaterial> a = new ArrayList<>();
        a.add(tipoMaterial.Metal);
        a.add(tipoMaterial.Carton);
        ArrayList<tipoMaterial> expResult = a;
        ArrayList<tipoMaterial> result = instance.getTiposDeMateriales();
        assertEquals(expResult, result);
        
// TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testAgregarMateriales3() {
        //System.out.println("setTiposDeMateriales")
        ArrayList<tipoMaterial> tiposDeMateriales = new ArrayList<>();
        Envase instance = new Envase();
        instance.agregarMateriales(tipoMaterial.Metal);
        instance.agregarMateriales(tipoMaterial.Carton);
        instance.agregarMateriales(tipoMaterial.Carton);
        instance.agregarMateriales(tipoMaterial.Papel);
        
        ArrayList<tipoMaterial> a = new ArrayList<>();
        a.add(tipoMaterial.Metal);
        a.add(tipoMaterial.Carton);
        a.add(tipoMaterial.Papel);
        
        ArrayList<tipoMaterial> expResult = a;
        ArrayList<tipoMaterial> result = instance.getTiposDeMateriales();
        assertEquals(expResult, result);
        
// TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testEliminarMateriales1() {
        //System.out.println("setTiposDeMateriales")
        ArrayList<tipoMaterial> tiposDeMateriales = new ArrayList<>();
        Envase instance = new Envase();
        instance.agregarMateriales(tipoMaterial.Metal);
        instance.agregarMateriales(tipoMaterial.Carton);
        instance.agregarMateriales(tipoMaterial.Carton);
        instance.agregarMateriales(tipoMaterial.Papel);
        instance.eliminarMaterial(tipoMaterial.Carton);
        
        ArrayList<tipoMaterial> a = new ArrayList<>();
        a.add(tipoMaterial.Metal);
        a.add(tipoMaterial.Papel);
        
        ArrayList<tipoMaterial> expResult = a;
        ArrayList<tipoMaterial> result = instance.getTiposDeMateriales();
        assertEquals(expResult, result);
        
// TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testEliminarMateriales2() {
        //System.out.println("setTiposDeMateriales")
        ArrayList<tipoMaterial> tiposDeMateriales = new ArrayList<>();
        Envase instance = new Envase();
        instance.agregarMateriales(tipoMaterial.Metal);
        instance.agregarMateriales(tipoMaterial.Carton);
        instance.agregarMateriales(tipoMaterial.Carton);
        instance.agregarMateriales(tipoMaterial.Papel);
        instance.eliminarMaterial(tipoMaterial.Carton);
        instance.eliminarMaterial(tipoMaterial.Metal);
        
        ArrayList<tipoMaterial> a = new ArrayList<>();
        a.add(tipoMaterial.Papel);
        
        ArrayList<tipoMaterial> expResult = a;
        ArrayList<tipoMaterial> result = instance.getTiposDeMateriales();
        assertEquals(expResult, result);
        
// TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testEliminarMateriales3() {
        //System.out.println("setTiposDeMateriales")
        ArrayList<tipoMaterial> tiposDeMateriales = new ArrayList<>();
        Envase instance = new Envase();
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
        ArrayList<tipoMaterial> result = instance.getTiposDeMateriales();
        assertEquals(expResult, result);
        
// TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testEliminarMateriales4() {
        //System.out.println("setTiposDeMateriales")
        ArrayList<tipoMaterial> tiposDeMateriales = new ArrayList<>();
        Envase instance = new Envase();
        instance.eliminarMaterial(tipoMaterial.Carton);
        instance.eliminarMaterial(tipoMaterial.Metal);
        instance.eliminarMaterial(tipoMaterial.Papel);
        
        ArrayList<tipoMaterial> a = new ArrayList<>();
        
        ArrayList<tipoMaterial> expResult = a;
        ArrayList<tipoMaterial> result = instance.getTiposDeMateriales();
        assertEquals(expResult, result);
        
// TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testEliminarMateriales5() {
        //System.out.println("setTiposDeMateriales")
        ArrayList<tipoMaterial> tiposDeMateriales = new ArrayList<>();
        Envase instance = new Envase();
        instance.agregarMateriales(tipoMaterial.Metal);
        instance.agregarMateriales(tipoMaterial.Indefinido);
        instance.eliminarMaterial(tipoMaterial.Carton);
        instance.eliminarMaterial(tipoMaterial.Metal);
        instance.eliminarMaterial(tipoMaterial.Papel);
        
        ArrayList<tipoMaterial> a = new ArrayList<>();
        
        a.add(tipoMaterial.Indefinido);
        ArrayList<tipoMaterial> expResult = a;
        ArrayList<tipoMaterial> result = instance.getTiposDeMateriales();
        assertEquals(expResult, result);
        
// TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test(expected = RuntimeException.class)
    public void testGetIdentificadorDeEnvase1() {
        //System.out.println("getPrecioDeEnvase");
        Envase instance = new Envase();
        instance.setIdIdentificador(0);
        int expResult = 0;
        int result = instance.getIdIdentificador();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    @Test(expected = RuntimeException.class)
    public void testGetIdentificadorDeEnvase2() {
        //System.out.println("getPrecioDeEnvase");
        Envase instance = new Envase();
        instance.setIdIdentificador(-1);
        int expResult = -1;
        int result = instance.getIdIdentificador();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testGetIdentificadorDeEnvase3() {
        //System.out.println("getPrecioDeEnvase");
        Envase instance = new Envase();
        instance.setIdIdentificador(1);
        int expResult = 1;
        int result = instance.getIdIdentificador();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testGetIdentificadorDeEnvase4() {
        //System.out.println("getPrecioDeEnvase");
        Envase instance = new Envase();
        instance.setIdIdentificador(100);
        int expResult = 100;
        int result = instance.getIdIdentificador();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testGetIdentificadorDeEnvase5() {
        //System.out.println("getPrecioDeEnvase");
        Envase instance = new Envase();
        instance.setIdIdentificador(100000);
        int expResult = 100000;
        int result = instance.getIdIdentificador();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    /**
     * Test of setPrecioDeEnvase method, of class Envase.
     */
    @Test(expected = RuntimeException.class)
    public void testSetIdentificadorDeEnvase1() {
        //System.out.println("setPrecioDeEnvase");
        int identificadorDeEnvase = 0;
        Envase instance = new Envase();
        instance.setIdIdentificador(identificadorDeEnvase);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    @Test(expected = RuntimeException.class)
    public void testSetIdentificadorDeEnvase2() {
        //System.out.println("setPrecioDeEnvase");
        int identificadorDeEnvase = -8;
        Envase instance = new Envase();
        instance.setIdIdentificador(identificadorDeEnvase);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testSetIdentificadorDeEnvase3() {
        //System.out.println("setPrecioDeEnvase");
        int identificadorDeEnvase = 1;
        Envase instance = new Envase();
        instance.setIdIdentificador(identificadorDeEnvase);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testSetIdentificadorDeEnvase4() {
        //System.out.println("setPrecioDeEnvase");
        int identificadorDeEnvase = 100;
        Envase instance = new Envase();
        instance.setIdIdentificador(identificadorDeEnvase);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testSetIdentificadorDeEnvase5() {
        //System.out.println("setPrecioDeEnvase");
        int identificadorDeEnvase = 10000;
        Envase instance = new Envase();
        instance.setIdIdentificador(identificadorDeEnvase);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
