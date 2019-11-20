package Dominio;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

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

    //Comprador
    @Test
    public void testGetComprador1() {
        PreVenta instance = new PreVenta();
        Persona p = new Persona();
        instance.setComprador(p);
        Persona expResult = p;
        Persona result = instance.getComprador();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetComprador2() {

        PreVenta instance = new PreVenta();
        Persona p = new Persona("Diego", 19, "Cuareim", "Rut");
        instance.setComprador(p);
        Persona expResult = p;
        Persona result = instance.getComprador();
        assertEquals(expResult, result);

    }

    @Test
    public void testSetComprador1() {

        Persona comprador = new Persona();
        PreVenta instance = new PreVenta();
        instance.setComprador(comprador);

    }

    @Test
    public void testSetComprador2() {

        Persona comprador = new Persona("Martin", 19, "Mercedes", "Rut2");
        PreVenta instance = new PreVenta();
        instance.setComprador(comprador);

    }

    //Precio
    @Test(expected = RuntimeException.class)
    public void testGetPrecioDePreVenta1() {

        PreVenta instance = new PreVenta();
        instance.setPrecioDePreVenta(0);
        int expResult = 0;
        int result = instance.getPrecioDePreVenta();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test(expected = RuntimeException.class)
    public void testGetPrecioDePreVenta2() {

        PreVenta instance = new PreVenta();
        instance.setPrecioDePreVenta(-1);
        int expResult = -1;
        int result = instance.getPrecioDePreVenta();
        assertEquals(expResult, result);

    }

    @Test
    public void testGetPrecioDePreVenta3() {

        PreVenta instance = new PreVenta();
        instance.setPrecioDePreVenta(1);
        int expResult = 1;
        int result = instance.getPrecioDePreVenta();
        assertEquals(expResult, result);

    }

    @Test
    public void testGetPrecioDePreVenta4() {

        PreVenta instance = new PreVenta();
        instance.setPrecioDePreVenta(100);
        int expResult = 100;
        int result = instance.getPrecioDePreVenta();
        assertEquals(expResult, result);

    }

    @Test
    public void testGetPrecioDePreVenta5() {

        PreVenta instance = new PreVenta();
        instance.setPrecioDePreVenta(100000);
        int expResult = 100000;
        int result = instance.getPrecioDePreVenta();
        assertEquals(expResult, result);

    }

    @Test(expected = RuntimeException.class)
    public void testSetPrecioDePreVenta1() {

        int precioDePreVenta = 0;
        PreVenta instance = new PreVenta();
        instance.setPrecioDePreVenta(precioDePreVenta);

    }

    @Test(expected = RuntimeException.class)
    public void testSetPrecioDePreVenta2() {

        int precioDePreVenta = -8;
        PreVenta instance = new PreVenta();
        instance.setPrecioDePreVenta(precioDePreVenta);

    }

    @Test
    public void testSetPrecioDePreVenta3() {

        int precioDePreVenta = 1;
        PreVenta instance = new PreVenta();
        instance.setPrecioDePreVenta(precioDePreVenta);

    }

    @Test
    public void testSetPrecioDePreVenta4() {

        int precioDePreVenta = 100;
        PreVenta instance = new PreVenta();
        instance.setPrecioDePreVenta(precioDePreVenta);

    }

    @Test
    public void testSetPrecioDePreVenta5() {

        int precioDePreVenta = 10000;
        PreVenta instance = new PreVenta();
        instance.setPrecioDePreVenta(precioDePreVenta);

    }

    //Lista de Productos
    @Test
    public void testGetListaDeProductos1() {

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

    }

    @Test
    public void testGetListaDeProductos2() {

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

    }

    @Test
    public void testGetListaDeProductos3() {

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

    }

    @Test
    public void testGetListaDeProductos4() {

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

    }

    @Test
    public void testSetListaDeProductos() {

        ArrayList<Producto> listaDeProductos = null;
        PreVenta instance = new PreVenta();
        instance.setListaDeProductos(listaDeProductos);

    }

    //Lugar a retirar
    @Test
    public void testGetLugarARetirar() {

        PreVenta instance = new PreVenta();
        Tienda t = new Tienda();
        instance.setLugarARetirar(t);
        Tienda expResult = t;
        Tienda result = instance.getLugarARetirar();
        assertEquals(expResult, result);

    }

    @Test
    public void testSetLugarARetirar() {

        Tienda lugarARetirar = new Tienda();
        PreVenta instance = new PreVenta();
        instance.setLugarARetirar(lugarARetirar);

    }

    //Lista de envases
    @Test
    public void testGetListaDeEnvase1() {

        PreVenta instance = new PreVenta();
        ArrayList<Envase> a = new ArrayList<>();
        instance.setListaDeEnvase(a);
        ArrayList<Envase> expResult = a;
        ArrayList<Envase> result = instance.getListaDeEnvase();
        assertEquals(expResult, result);

    }

    @Test
    public void testGetListaDeEnvase2() {

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

    }

    @Test
    public void testGetListaDeEnvase3() {

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

    }

    @Test
    public void testGetListaDeEnvase4() {

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

    }

    @Test
    public void testGetListaDeEnvase5() {

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

    }

    //Identificador
    @Test(expected = RuntimeException.class)
    public void testGetIdentificadorDePreVenta1() {

        PreVenta instance = new PreVenta();
        instance.setIdentificadorDePreventa(0);
        int expResult = 0;
        int result = instance.getIdentificadorDePreventa();
        assertEquals(expResult, result);

    }

    @Test(expected = RuntimeException.class)
    public void testGetIdentificadorDePreVenta2() {

        PreVenta instance = new PreVenta();
        instance.setIdentificadorDePreventa(-1);
        int expResult = -1;
        int result = instance.getIdentificadorDePreventa();
        assertEquals(expResult, result);

    }

    @Test
    public void testGetIdentificadorDePreVenta3() {

        PreVenta instance = new PreVenta();
        instance.setIdentificadorDePreventa(1);
        int expResult = 1;
        int result = instance.getIdentificadorDePreventa();
        assertEquals(expResult, result);

    }

    @Test
    public void testGetIdentificadorDePreVenta4() {

        PreVenta instance = new PreVenta();
        instance.setIdentificadorDePreventa(100);
        int expResult = 100;
        int result = instance.getIdentificadorDePreventa();
        assertEquals(expResult, result);

    }

    @Test
    public void testGetIdentificadorDePreVenta5() {

        PreVenta instance = new PreVenta();
        instance.setIdentificadorDePreventa(100000);
        int expResult = 100000;
        int result = instance.getIdentificadorDePreventa();
        assertEquals(expResult, result);

    }

    @Test(expected = RuntimeException.class)
    public void testSetIdentificadorDePreVenta1() {

        int identificadorDePreVenta = 0;
        PreVenta instance = new PreVenta();
        instance.setIdentificadorDePreventa(identificadorDePreVenta);

    }

    @Test(expected = RuntimeException.class)
    public void testSetIdentificadorDePreVenta2() {

        int identificadorDePreVenta = -8;
        PreVenta instance = new PreVenta();
        instance.setIdentificadorDePreventa(identificadorDePreVenta);

    }

    @Test
    public void testSetIdentificadorDePreVenta3() {

        int identificadorDePreVenta = 1;
        PreVenta instance = new PreVenta();
        instance.setIdentificadorDePreventa(identificadorDePreVenta);

    }

    @Test
    public void testSetIdentificadorDePreVenta4() {

        int identificadorDePreVenta = 100;
        PreVenta instance = new PreVenta();
        instance.setIdentificadorDePreventa(identificadorDePreVenta);

    }

    @Test
    public void testSetIdentificadorDePreVenta5() {

        int identificadorDePreVenta = 10000;
        PreVenta instance = new PreVenta();
        instance.setIdentificadorDePreventa(identificadorDePreVenta);

    }

    //Equals
    @Test
    public void equals() {
        PreVenta instance = new PreVenta();
        instance.setIdentificadorDePreventa(100000);
        PreVenta e = new PreVenta();
        e.setIdentificadorDePreventa(100000);
        boolean result = instance.equals(e);
        assertEquals(true, result);
    }
    
}
