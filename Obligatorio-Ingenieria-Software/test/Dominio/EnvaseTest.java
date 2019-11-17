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

    //Test Nombre
    @Test
    public void testGetNombre1() {
        Envase instance = new Envase();
        instance.setNombre("vidrio");
        String expResult = "vidrio";
        String result = instance.getNombre();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetNombre2() {
        Envase instance = new Envase();
        instance.setNombre("Plastico");
        String expResult = "Plastico";
        String result = instance.getNombre();
        assertEquals(expResult, result);
    }
    
    @Test(expected = RuntimeException.class)
    public void testGetNombre3() {
        Envase instance = new Envase();
        instance.setNombre("");
        String expResult = "";
        String result = instance.getNombre();
        assertEquals(expResult, result);
    }
        
    @Test(expected = RuntimeException.class)
    public void testGetNombre4() {
        Envase instance = new Envase();
        instance.setNombre("   ");
        String expResult = "   ";
        String result = instance.getNombre();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testSetNombre1() {
        String nombre = "Envase1";
        Envase instance = new Envase();
        instance.setNombre(nombre);
    }

    @Test(expected = RuntimeException.class)
    public void testSetNombre2() {
        String nombre = "";
        Envase instance = new Envase();
        instance.setNombre(nombre);
    }
    
    @Test(expected = RuntimeException.class)
    public void testSetNombre3() {
        String nombre = "    ";
        Envase instance = new Envase();
        instance.setNombre(nombre);
    }
    
    //Test Peso Maximo
    @Test(expected = RuntimeException.class)
    public void testGetPesoMaximoSoportado1() {
        Envase instance = new Envase();
        instance.setPesoMaximoSoportado(0);
        int expResult = 0;
        int result = instance.getPesoMaximoSoportado();
        assertEquals(expResult, result);
    }
    
    @Test(expected = RuntimeException.class)
    public void testGetPesoMaximoSoportado2() {
        Envase instance = new Envase();        
        instance.setPesoMaximoSoportado(-5);
        int result = instance.getPesoMaximoSoportado();
    }

    @Test
    public void testGetPesoMaximoSoportado3() {
        Envase instance = new Envase();
        instance.setPesoMaximoSoportado(15);
        int expResult = 15;
        int result = instance.getPesoMaximoSoportado();
        assertEquals(expResult, result);
    }
    
    @Test(expected = RuntimeException.class)
    public void testGetPesoMaximoSoportado4() {
        Envase instance = new Envase();    
        instance.setPesoMaximoSoportado(101);
        int result = instance.getPesoMaximoSoportado();
    }

    @Test
    public void testGetPesoMaximoSoportado5() {
        Envase instance = new Envase();
        instance.setPesoMaximoSoportado(100);
        int expResult = 100;
        int result = instance.getPesoMaximoSoportado();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testSetPesoMaximoSoportado1() {
        int pesoMaximoSoportado = 6;
        Envase instance = new Envase();
        instance.setPesoMaximoSoportado(pesoMaximoSoportado);
    }

    @Test(expected = RuntimeException.class)
    public void testSetPesoMaximoSoportado2() {
        int pesoMaximoSoportado = -1;
        Envase instance = new Envase();
        instance.setPesoMaximoSoportado(pesoMaximoSoportado);
    }
    
    @Test(expected = RuntimeException.class)
    public void testSetPesoMaximoSoportado3() {
        int pesoMaximoSoportado = 0;
        Envase instance = new Envase();
        instance.setPesoMaximoSoportado(pesoMaximoSoportado);
    }
    
    @Test(expected = RuntimeException.class)
    public void testSetPesoMaximoSoportado4() {
        int pesoMaximoSoportado = 101;
        Envase instance = new Envase();
        instance.setPesoMaximoSoportado(pesoMaximoSoportado);
    }
    
    @Test
    public void testSetPesoMaximoSoportado5() {
        int pesoMaximoSoportado = 100;
        Envase instance = new Envase();
        instance.setPesoMaximoSoportado(pesoMaximoSoportado);
    }
    
    //Test Materiales
    @Test
    public void testGetTiposDeMateriales1() {
        Envase instance = new Envase();
        instance.getTiposDeMateriales().add(tipoMaterial.Metal);
        ArrayList<tipoMaterial> a = new ArrayList<>();
        a.add(tipoMaterial.Metal);
        ArrayList<tipoMaterial> expResult = a;
        ArrayList<tipoMaterial> result = instance.getTiposDeMateriales();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testGetTiposDeMateriales2() {
        Envase instance = new Envase();
        instance.getTiposDeMateriales().add(tipoMaterial.Metal);
        instance.getTiposDeMateriales().add(tipoMaterial.Carton);
        ArrayList<tipoMaterial> a = new ArrayList<>();
        a.add(tipoMaterial.Metal);
        a.add(tipoMaterial.Carton);
        ArrayList<tipoMaterial> expResult = a;
        ArrayList<tipoMaterial> result = instance.getTiposDeMateriales();
        assertEquals(expResult, result);
    }
    
     @Test
    public void testGetTiposDeMateriales3() {
        Envase instance = new Envase();
        ArrayList<tipoMaterial> a = new ArrayList<>();
        ArrayList<tipoMaterial> expResult = a;
        ArrayList<tipoMaterial> result = instance.getTiposDeMateriales();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetTiposDeMateriales1() {
        ArrayList<tipoMaterial> tiposDeMateriales = null;
        Envase instance = new Envase();
        instance.setTiposDeMateriales(tiposDeMateriales);
    }
    
    @Test
    public void testSetTiposDeMateriales2() {
        ArrayList<tipoMaterial> tiposDeMateriales = new ArrayList<>();
        Envase instance = new Envase();
        tiposDeMateriales.add(tipoMaterial.Metal);
        tiposDeMateriales.add(tipoMaterial.Plastico);
        instance.setTiposDeMateriales(tiposDeMateriales);
    }
    
    @Test
    public void testSetTiposDeMateriales3() {
        ArrayList<tipoMaterial> tiposDeMateriales = new ArrayList<>();
        Envase instance = new Envase();
        tiposDeMateriales.add(tipoMaterial.Metal);
        instance.setTiposDeMateriales(tiposDeMateriales);
    }
    
    @Test
    public void testSetTiposDeMateriales4() {
        ArrayList<tipoMaterial> tiposDeMateriales = new ArrayList<>();
        Envase instance = new Envase();
        tiposDeMateriales.add(tipoMaterial.Metal);
        tiposDeMateriales.add(tipoMaterial.Carton);
        tiposDeMateriales.add(tipoMaterial.Metal);
        instance.setTiposDeMateriales(tiposDeMateriales);
    }
    
    @Test
    public void testAgregarMateriales1() {
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
    }
    
    
    @Test
    public void testAgregarMateriales2() {
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
    }
    
    @Test
    public void testAgregarMateriales3() {
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
    }
    
    @Test
    public void testEliminarMateriales1() {
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
    }
    
    @Test
    public void testEliminarMateriales2() {
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
    }
    
    @Test
    public void testEliminarMateriales3() {
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
    }
    
    @Test
    public void testEliminarMateriales4() {
        ArrayList<tipoMaterial> tiposDeMateriales = new ArrayList<>();
        Envase instance = new Envase();
        instance.eliminarMaterial(tipoMaterial.Carton);
        instance.eliminarMaterial(tipoMaterial.Metal);
        instance.eliminarMaterial(tipoMaterial.Papel);
        ArrayList<tipoMaterial> a = new ArrayList<>();
        ArrayList<tipoMaterial> expResult = a;
        ArrayList<tipoMaterial> result = instance.getTiposDeMateriales();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testEliminarMateriales5() {
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
    }
    
    //Identificador
    @Test(expected = RuntimeException.class)
    public void testGetIdentificadorDeEnvase1() {
        Envase instance = new Envase();
        instance.setIdIdentificador(0);
        int expResult = 0;
        int result = instance.getIdIdentificador();
        assertEquals(expResult, result);
    }

    @Test(expected = RuntimeException.class)
    public void testGetIdentificadorDeEnvase2() {
        Envase instance = new Envase();
        instance.setIdIdentificador(-1);
        int expResult = -1;
        int result = instance.getIdIdentificador();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testGetIdentificadorDeEnvase3() {
        Envase instance = new Envase();
        instance.setIdIdentificador(1);
        int expResult = 1;
        int result = instance.getIdIdentificador();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testGetIdentificadorDeEnvase4() {
        Envase instance = new Envase();
        instance.setIdIdentificador(100);
        int expResult = 100;
        int result = instance.getIdIdentificador();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testGetIdentificadorDeEnvase5() {
        Envase instance = new Envase();
        instance.setIdIdentificador(100000);
        int expResult = 100000;
        int result = instance.getIdIdentificador();
        assertEquals(expResult, result);
    }
    
    @Test(expected = RuntimeException.class)
    public void testSetIdentificadorDeEnvase1() {
        int identificadorDeEnvase = 0;
        Envase instance = new Envase();
        instance.setIdIdentificador(identificadorDeEnvase);
    }

    @Test(expected = RuntimeException.class)
    public void testSetIdentificadorDeEnvase2() {
        int identificadorDeEnvase = -8;
        Envase instance = new Envase();
        instance.setIdIdentificador(identificadorDeEnvase);
    }
    
    @Test
    public void testSetIdentificadorDeEnvase3() {
        int identificadorDeEnvase = 1;
        Envase instance = new Envase();
        instance.setIdIdentificador(identificadorDeEnvase);
    }
    
    @Test
    public void testSetIdentificadorDeEnvase4() {
        int identificadorDeEnvase = 100;
        Envase instance = new Envase();
        instance.setIdIdentificador(identificadorDeEnvase);
    }
    
    @Test
    public void testSetIdentificadorDeEnvase5() {
        int identificadorDeEnvase = 10000;
        Envase instance = new Envase();
        instance.setIdIdentificador(identificadorDeEnvase);
    }
    
    //Equals
    @Test
    public void equals() {
        Envase instance = new Envase();
        instance.setIdIdentificador(100000);
        Envase e = new Envase();
        e.setIdIdentificador(100000);
        boolean result = instance.equals(e);
        assertEquals(true, result);
    }
    
}