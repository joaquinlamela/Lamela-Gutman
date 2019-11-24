/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;
import dominio.Persona;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

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
    //Nombre
    @Test
    public void testGetNombre1() {
        Persona instance = new Persona();
        instance.setNombre("Santi");
        String expResult = "Santi";
        String result = instance.getNombre();
        assertEquals(expResult, result);
    }
    @Test
    public void testGetNombre2() {
        Persona instance = new Persona();
        instance.setNombre("Juan");
        String expResult = "Juan";
        String result = instance.getNombre();
        assertEquals(expResult, result);
    }
    @Test(expected = RuntimeException.class)
    public void testGetNombre3() {
        Persona instance = new Persona();
        instance.setNombre("");
        String expResult = "";
        String result = instance.getNombre();
        assertEquals(expResult, result);
    }
    @Test(expected = RuntimeException.class)
    public void testGetNombre4() {
        Persona instance = new Persona();
        instance.setNombre("   ");
        String expResult = "   ";
        String result = instance.getNombre();
        assertEquals(expResult, result);
    }
    @Test
    public void testSetNombre1() {
        String nombre = "Envase1";
        Persona instance = new Persona();
        instance.setNombre(nombre);
    }
    @Test(expected = RuntimeException.class)
    public void testSetNombre2() {
        String nombre = "";
        Persona instance = new Persona();
        instance.setNombre(nombre);
    }
    @Test(expected = RuntimeException.class)
    public void testSetNombre3() {
        String nombre = "    ";
        Persona instance = new Persona();
        instance.setNombre(nombre);
    }
    //Edad
    @Test
    public void testSetEdad1() {
        Persona instance = new Persona();
        instance.setEdad(0);
        int expResult = 0;
        int result = instance.getEdad();
        assertEquals(expResult, result);
    }
    @Test(expected = RuntimeException.class)
    public void testSetEdad2() {
        Persona instance = new Persona();
        instance.setEdad(-1);
        int expResult = -1;
        int result = instance.getEdad();
        assertEquals(expResult, result);
    }
    @Test(expected = RuntimeException.class)
    public void testSetEdad3() {
        Persona instance = new Persona();
        int expResult = 101;
        instance.setEdad(101);
        int result = instance.getEdad();
        assertEquals(expResult, result);
    }
    @Test
    public void testSetEdad4() {
        Persona instance = new Persona();
        instance.setEdad(1);
        int expResult = 1;
        int result = instance.getEdad();
        assertEquals(expResult, result);
    }
    @Test
    public void testSetEdad5() {
        Persona instance = new Persona();
        instance.setEdad(100);
        int expResult = 100;
        int result = instance.getEdad();
        assertEquals(expResult, result);
    }
    @Test
    public void testSetEdad6() {
        Persona instance = new Persona();
        instance.setEdad(99);
        int expResult = 99;
        int result = instance.getEdad();
        assertEquals(expResult, result);
    }
    @Test(expected = RuntimeException.class)
    public void testGetEdad1() {
        int edad = -1;
        Persona instance = new Persona();
        instance.setEdad(edad);
    }
    @Test(expected = RuntimeException.class)
    public void testGetEdad2() {
        int edad = -100;
        Persona instance = new Persona();
        instance.setEdad(edad);
    }
    @Test(expected = RuntimeException.class)
    public void testGetEdad3() {
        int edad = 101;
        Persona instance = new Persona();
        instance.setEdad(edad);
    }
    @Test
    public void testGetEdad4() {
        int edad = 50;
        Persona instance = new Persona();
        instance.setEdad(edad);
    }
    @Test
    public void testGetEdad5() {
        int edad = 1;
        Persona instance = new Persona();
        instance.setEdad(edad);
    }
    @Test
    public void testGetEdad6() {
        int edad = 100;
        Persona instance = new Persona();
        instance.setEdad(edad);
    }
    //Domicilio
    @Test
    public void testGetDomicilio1() {
        Persona instance = new Persona();
        instance.setDomicilio("Nuevo");
        String expResult = "Nuevo";
        String result = instance.getDomicilio();
        assertEquals(expResult, result);
    }
    @Test
    public void testGetDomicilio2() {
        Persona instance = new Persona();
        instance.setDomicilio("Domicilio");
        String expResult = "Domicilio";
        String result = instance.getDomicilio();
        assertEquals(expResult, result);
    }
    @Test(expected = RuntimeException.class)
    public void testGetDomicilio3() {
        Persona instance = new Persona();
        instance.setDomicilio("");
        String expResult = "";
        String result = instance.getDomicilio();
        assertEquals(expResult, result);
    }
        @Test(expected = RuntimeException.class)
    public void testGetDomicilio4() {
        Persona instance = new Persona();
        instance.setDomicilio("   ");
        String expResult = "   ";
        String result = instance.getDomicilio();
        assertEquals(expResult, result);
    }
    @Test
    public void testSetDomicilio1() {
        String domicilio = "Nuevo Domicilio";
        Persona instance = new Persona();
        instance.setDomicilio(domicilio);
    }
    @Test(expected = RuntimeException.class)
    public void testSetDomicilio2() {
        String domicilio = "";
        Persona instance = new Persona();
        instance.setDomicilio(domicilio);
    }
    @Test(expected = RuntimeException.class)
    public void testSetDomicilio3() {
        String domicilio = "    ";
        Persona instance = new Persona();
        instance.setDomicilio(domicilio);
    }
    //Rut de comprador
    @Test
    public void testGetRut1() {
        Persona instance = new Persona();
        instance.setRutComprador("Nuevo");
        String expResult = "Nuevo";
        String result = instance.getRutComprador();
        assertEquals(expResult, result);
    }
    @Test
    public void testGetRut2() {
        Persona instance = new Persona();
        instance.setRutComprador("Domicilio");
        String expResult = "Domicilio";
        String result = instance.getRutComprador();
        assertEquals(expResult, result);
    }
    @Test(expected = RuntimeException.class)
    public void testGetRut3() {
        Persona instance = new Persona();
        instance.setRutComprador("");
        String expResult = "";
        String result = instance.getRutComprador();
        assertEquals(expResult, result);
    }
    @Test(expected = RuntimeException.class)
    public void testGetRut4() {
        Persona instance = new Persona();
        instance.setRutComprador("   ");
        String expResult = "   ";
        String result = instance.getRutComprador();
        assertEquals(expResult, result);
    }
    @Test
    public void testSetRut1() {
        String rut = "Nuevo rut";
        Persona instance = new Persona();
        instance.setRutComprador(rut);
    }
    @Test(expected = RuntimeException.class)
    public void testSetRut2() {
        String rut = "";
        Persona instance = new Persona();
        instance.setRutComprador(rut);
    }
    @Test(expected = RuntimeException.class)
    public void testSetRut3() {
        String rut = "    ";
        Persona instance = new Persona();
        instance.setRutComprador(rut);
    }
    //Equals
    @Test
    public void equals1() {
        Persona instance = new Persona();
        instance.setDomicilio("Cuareim");
        instance.setEdad(10);
        instance.setNombre("Diego");
        Persona e = new Persona();
        e.setDomicilio("Cuareim");
        e.setEdad(10);
        e.setNombre("Diego");
        boolean result = instance.equals(e);
        assertEquals(true, result);
    }
    @Test
    public void equals2() {
        Persona instance = new Persona();
        instance.setDomicilio("Cuareim");
        instance.setEdad(10);
        instance.setNombre("Diego");
        Producto e = new Producto();
        boolean result = instance.equals(e);
        assertEquals(false, result);
    }
    @Test
    public void equals3() {
        Persona instance = new Persona();
        instance.setDomicilio("Cuareim");
        instance.setEdad(10);
        instance.setNombre("Diego");
        Persona e = new Persona();
        e.setDomicilio("Cuareim");
        //e.setEdad(10);
        //e.setNombre("Diego");
        boolean result = instance.equals(e);
        assertEquals(false, result);
    }
    @Test
    public void equals4() {
        Persona instance = new Persona();
        instance.setDomicilio("Cuareim");
        instance.setEdad(10);
        instance.setNombre("Diego");
        Persona e = new Persona();
        //e.setDomicilio("Cuareim");
        e.setEdad(10);
        //e.setNombre("Diego");
        boolean result = instance.equals(e);
        assertEquals(false, result);
    }
    @Test
    public void equals5() {
        Persona instance = new Persona();
        instance.setDomicilio("Cuareim");
        instance.setEdad(10);
        instance.setNombre("Diego");
        Persona e = new Persona();
        //e.setDomicilio("Cuareim");
        //e.setEdad(10);
        e.setNombre("Diego");
        boolean result = instance.equals(e);
        assertEquals(false, result);
    }
    @Test
    public void equals6() {
        Persona instance = new Persona();
        instance.setDomicilio("Cuareim");
        instance.setEdad(10);
        instance.setNombre("Diego");
        Persona e = new Persona();
        //e.setDomicilio("Cuareim");
        e.setEdad(10);
        e.setNombre("Diego");
        e.setRutComprador("CompradorNuevo");
        boolean result = instance.equals(e);
        assertEquals(false, result);
    }
    @Test
    public void equals7() {
        Persona instance = new Persona();
        instance.setDomicilio("Cuareim");
        instance.setEdad(10);
        instance.setNombre("Diego");
        Persona e = new Persona();
        e.setDomicilio("Cuareim");
        e.setEdad(10);
        e.setNombre("Diego");
        e.setRutComprador("CompradorNuevo");
        boolean result = instance.equals(e);
        assertEquals(false, result);
    }
}
