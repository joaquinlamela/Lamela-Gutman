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
public class PersonaTest {
    
    public PersonaTest() {
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
     * Test of getNombre method, of class Persona.
     */
    @Test
    public void testGetNombre1() {
        ///System.out.println("getNombre");
        Persona instance = new Persona();
        instance.setNombre("Santi");
        String expResult = "Santi";
        String result = instance.getNombre();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

        @Test
    public void testGetNombre2() {
        ///System.out.println("getNombre");
        Persona instance = new Persona();
        instance.setNombre("Juan");
        String expResult = "Juan";
        String result = instance.getNombre();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    
        @Test(expected = RuntimeException.class)
    public void testGetNombre3() {
        ///System.out.println("getNombre");
        Persona instance = new Persona();
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
        Persona instance = new Persona();
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
        Persona instance = new Persona();
        instance.setNombre(nombre);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    @Test(expected = RuntimeException.class)
    public void testSetNombre2() {
        //System.out.println("setNombre");
        String nombre = "";
        Persona instance = new Persona();
        instance.setNombre(nombre);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test(expected = RuntimeException.class)
    public void testSetNombre3() {
        //System.out.println("setNombre");
        String nombre = "    ";
        Persona instance = new Persona();
        instance.setNombre(nombre);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getEdad method, of class Persona.
     */
    @Test
    public void testSetEdad1() {
        //System.out.println("getEdad");
        Persona instance = new Persona();
        instance.setEdad(0);
        int expResult = 0;
        int result = instance.getEdad();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
@Test(expected = RuntimeException.class)
    public void testSetEdad2() {
        //System.out.println("getEdad");
        Persona instance = new Persona();
        instance.setEdad(-1);
        int expResult = -1;
        int result = instance.getEdad();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test(expected = RuntimeException.class)
    public void testSetEdad3() {
        //System.out.println("getEdad");
        Persona instance = new Persona();
        int expResult = 101;
        instance.setEdad(101);
        int result = instance.getEdad();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testSetEdad4() {
        //System.out.println("getEdad");
        Persona instance = new Persona();
        instance.setEdad(1);
        int expResult = 1;
        int result = instance.getEdad();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    
    @Test
    public void testSetEdad5() {
        //System.out.println("getEdad");
        Persona instance = new Persona();
        instance.setEdad(100);
        int expResult = 100;
        int result = instance.getEdad();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testSetEdad6() {
        //System.out.println("getEdad");
        Persona instance = new Persona();
        instance.setEdad(99);
        int expResult = 99;
        int result = instance.getEdad();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    /**
     * 
     * Test of setEdad method, of class Persona.
     */
    @Test(expected = RuntimeException.class)
    public void testGetEdad1() {
        //System.out.println("setEdad");
        int edad = -1;
        Persona instance = new Persona();
        instance.setEdad(edad);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test(expected = RuntimeException.class)
    public void testGetEdad2() {
        //System.out.println("setEdad");
        int edad = -100;
        Persona instance = new Persona();
        instance.setEdad(edad);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    @Test(expected = RuntimeException.class)
    public void testGetEdad3() {
        //System.out.println("setEdad");
        int edad = 101;
        Persona instance = new Persona();
        instance.setEdad(edad);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testGetEdad4() {
        //System.out.println("setEdad");
        int edad = 50;
        Persona instance = new Persona();
        instance.setEdad(edad);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testGetEdad5() {
        //System.out.println("setEdad");
        int edad = 1;
        Persona instance = new Persona();
        instance.setEdad(edad);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testGetEdad6() {
        //System.out.println("setEdad");
        int edad = 100;
        Persona instance = new Persona();
        instance.setEdad(edad);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    /**
     * Test of getDomicilio method, of class Persona.
     */
    

    /**
     * Test of setDomicilio method, of class Persona.
     */
    
        @Test
    public void testGetDomicilio1() {
        ///System.out.println("getNombre");
        Persona instance = new Persona();
        instance.setDomicilio("Nuevo");
        String expResult = "Nuevo";
        String result = instance.getDomicilio();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

        @Test
    public void testGetDomicilio2() {
        ///System.out.println("getNombre");
        Persona instance = new Persona();
        instance.setDomicilio("Domicilio");
        String expResult = "Domicilio";
        String result = instance.getDomicilio();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    
        @Test(expected = RuntimeException.class)
    public void testGetDomicilio3() {
        ///System.out.println("getNombre");
        Persona instance = new Persona();
        instance.setDomicilio("");
        String expResult = "";
        String result = instance.getDomicilio();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    
        @Test(expected = RuntimeException.class)
    public void testGetDomicilio4() {
        ///System.out.println("getNombre");
        Persona instance = new Persona();
        instance.setDomicilio("   ");
        String expResult = "   ";
        String result = instance.getDomicilio();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    
    /**
     * Test of setNombre method, of class Envase.
     */
    @Test
    public void testSetDomicilio1() {
        //System.out.println("setNombre");
        String domicilio = "Nuevo Domicilio";
        Persona instance = new Persona();
        instance.setDomicilio(domicilio);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    @Test(expected = RuntimeException.class)
    public void testSetDomicilio2() {
        //System.out.println("setNombre");
        String domicilio = "";
        Persona instance = new Persona();
        instance.setDomicilio(domicilio);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test(expected = RuntimeException.class)
    public void testSetDomicilio3() {
        //System.out.println("setNombre");
        String domicilio = "    ";
        Persona instance = new Persona();
        instance.setDomicilio(domicilio);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getRutComprador method, of class Persona.
     */
    @Test
    public void testGetRut1() {
        ///System.out.println("getNombre");
        Persona instance = new Persona();
        instance.setRutComprador("Nuevo");
        String expResult = "Nuevo";
        String result = instance.getRutComprador();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

        @Test
    public void testGetRut2() {
        ///System.out.println("getNombre");
        Persona instance = new Persona();
        instance.setRutComprador("Domicilio");
        String expResult = "Domicilio";
        String result = instance.getRutComprador();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    
        @Test(expected = RuntimeException.class)
    public void testGetRut3() {
        ///System.out.println("getNombre");
        Persona instance = new Persona();
        instance.setRutComprador("");
        String expResult = "";
        String result = instance.getRutComprador();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    
        @Test(expected = RuntimeException.class)
    public void testGetRut4() {
        ///System.out.println("getNombre");
        Persona instance = new Persona();
        instance.setRutComprador("   ");
        String expResult = "   ";
        String result = instance.getRutComprador();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    
    /**
     * Test of setNombre method, of class Envase.
     */
    
    @Test
    public void testSetRut1() {
        //System.out.println("setNombre");
        String rut = "Nuevo rut";
        Persona instance = new Persona();
        instance.setRutComprador(rut);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test(expected = RuntimeException.class)
    public void testSetRut2() {
        //System.out.println("setNombre");
        String rut = "";
        Persona instance = new Persona();
        instance.setRutComprador(rut);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test(expected = RuntimeException.class)
    public void testSetRut3() {
        //System.out.println("setNombre");
        String rut = "    ";
        Persona instance = new Persona();
        instance.setRutComprador(rut);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
