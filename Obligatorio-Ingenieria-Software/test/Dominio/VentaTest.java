package dominio;
import dominio.Venta;
import dominio.Persona;
import dominio.Envase;
import dominio.Tienda;
import dominio.Producto;
import java.util.ArrayList;
import java.util.Date;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class VentaTest {

    public VentaTest() {
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
    //Lista de Productos
    @Test
    public void testGetListaDeProductos1() {
        Envase e = new Envase();
        Venta instance = new Venta();
        ArrayList<Producto> a = new ArrayList<>();
        Producto p = new Producto();
        p.agregarEnvase(e);p.setCodigoIdentificador(18);
        Producto f = new Producto();
        instance.agregarProducto(f);
        instance.agregarProducto(p);
        a.add(f);
        a.add(p);
        ArrayList<Producto> expResult = a;
        ArrayList<Producto> result = instance.getListaDeProductosAVender();
        assertEquals(expResult, result);
    }
    @Test
    public void testGetListaDeProductos2() {
        Envase e = new Envase();
        Venta instance = new Venta();
        ArrayList<Producto> a = new ArrayList<>();
        Producto p = new Producto();
        p.agregarEnvase(e);p.setCodigoIdentificador(18);
        Producto f = new Producto();
        Producto g = new Producto();
        f = g;
        instance.agregarProducto(f);
        instance.agregarProducto(p);
        instance.agregarProducto(g);
        a.add(f);
        a.add(p);
        ArrayList<Producto> expResult = a;
        ArrayList<Producto> result = instance.getListaDeProductosAVender();
        assertEquals(expResult, result);
    }
    @Test
    public void testGetListaDeProductos3() {
        Envase e = new Envase();
        Venta instance = new Venta();
        ArrayList<Producto> a = new ArrayList<>();
        Producto p = new Producto();
        p.agregarEnvase(e);
        p.setCodigoIdentificador(18);
        Producto f = new Producto();
        Producto g = new Producto();
        g = f;
        instance.agregarProducto(f);
        instance.agregarProducto(p);
        instance.agregarProducto(g);
        instance.eliminarProducto(f);
        a.add(p);
        ArrayList<Producto> expResult = a;
        ArrayList<Producto> result = instance.getListaDeProductosAVender();
        assertEquals(expResult, result);
    }
    @Test
    public void testGetListaDeProductos4() {
        Envase e = new Envase();
        Venta instance = new Venta();
        ArrayList<Producto> a = new ArrayList<>();
        Producto p = new Producto();
        p.agregarEnvase(e);
        p.setCodigoIdentificador(18);
        Producto f = new Producto();
        Producto g = new Producto();
        g = f;
        instance.agregarProducto(f);
        instance.agregarProducto(p);
        instance.agregarProducto(g);
        instance.eliminarProducto(f);
        instance.eliminarProducto(p);
        //Pruebo eliminar un producto que no esta
        instance.eliminarProducto(p);
        ArrayList<Producto> expResult = a;
        ArrayList<Producto> result = instance.getListaDeProductosAVender();
        assertEquals(expResult, result);
    }
    @Test
    public void testSetListaDeProductos() {
        ArrayList<Producto> listaDeProductos = null;
        Venta instance = new Venta();
        instance.setListaDeProductosAVender(listaDeProductos);
    }
    //Precio
    @Test(expected = RuntimeException.class)
    public void testGetPrecioDeVenta1() {
        Venta instance = new Venta();
        instance.setPrecioTotal(0);
        int expResult = 0;
        int result = instance.getPrecioTotal();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }
    @Test(expected = RuntimeException.class)
    public void testGetPrecioDeVenta2() {
        Venta instance = new Venta();
        instance.setPrecioTotal(-1);
        int expResult = -1;
        int result = instance.getPrecioTotal();
        assertEquals(expResult, result);
    }
    @Test
    public void testGetPrecioDeVenta3() {
        Venta instance = new Venta();
        instance.setPrecioTotal(1);
        int expResult = 1;
        int result = instance.getPrecioTotal();
        assertEquals(expResult, result);
    }
    @Test
    public void testGetPrecioDeVenta4() {
        Venta instance = new Venta();
        instance.setPrecioTotal(100);
        int expResult = 100;
        int result = instance.getPrecioTotal();
        assertEquals(expResult, result);
    }
    @Test
    public void testGetPrecioDeVenta5() {
        Venta instance = new Venta();
        instance.setPrecioTotal(100000);
        int expResult = 100000;
        int result = instance.getPrecioTotal();
        assertEquals(expResult, result);
    }
    @Test(expected = RuntimeException.class)
    public void testSetPrecioDeVenta1() {
        int precioDeVenta = 0;
        Venta instance = new Venta();
        instance.setPrecioTotal(precioDeVenta);
    }
    @Test(expected = RuntimeException.class)
    public void testSetPrecioDeVenta2() {
        int precioDeVenta = -8;
        Venta instance = new Venta();
        instance.setPrecioTotal(precioDeVenta);
    }
    @Test
    public void testSetPrecioDeVenta3() {
        int precioDeVenta = 1;
        Venta instance = new Venta();
        instance.setPrecioTotal(precioDeVenta);
    }
    @Test
    public void testSetPrecioDeVenta4() {
        int precioDeVenta = 100;
        Venta instance = new Venta();
        instance.setPrecioTotal(precioDeVenta);
    }
    @Test
    public void testSetPrecioDeVenta5() {
        int precioDeVenta = 10000;
        Venta instance = new Venta();
        instance.setPrecioTotal(precioDeVenta);
    }
    //Fecha de compra
    @Test
    public void testGetFechaDeCompra() {
        Venta instance = new Venta();
        Date a = new Date();
        instance.setFechaDeCompra(a);
        Date expResult = a;
        Date result = instance.getFechaDeCompra();
        assertEquals(expResult, result);
    }
    @Test
    public void testSetFechaDeCompra() {
        Date fechaDeCompra = null;
        Venta instance = new Venta();
        instance.setFechaDeCompra(fechaDeCompra);
    }
    //Comprador
    @Test
    public void testGetComprador1() {
        Venta instance = new Venta();
        Persona p = new Persona();
        instance.setComprador(p);
        Persona expResult = p;
        Persona result = instance.getComprador();
        assertEquals(expResult, result);
    }
    @Test
    public void testGetComprador2() {
        Venta instance = new Venta();
        Persona p = new Persona("Diego", 19, "Cuareim", "Rut");
        instance.setComprador(p);
        Persona expResult = p;
        Persona result = instance.getComprador();
        assertEquals(expResult, result);
    }
    @Test
    public void testSetComprador1() {
        Persona comprador = new Persona();
        Venta instance = new Venta();
        instance.setComprador(comprador);
    }
    @Test
    public void testSetComprador2() {
        Persona comprador = new Persona("Martin", 19, "Mercedes", "Rut2");
        Venta instance = new Venta();
        instance.setComprador(comprador);
    }
    //Echo Shop
    @Test
    public void testGetEchoShop() {
        Venta instance = new Venta();
        Tienda t = new Tienda();
        Tienda expResult = t;
        instance.setEchoShop(t);
        Tienda result = instance.getEchoShop();
        assertEquals(expResult, result);
    }
    @Test
    public void testSetEchoShop() {
        Tienda t = new Tienda();
        Tienda echoShop = t;
        Venta instance = new Venta();
        instance.setEchoShop(echoShop);
    }
    //Lista de envases
    @Test
    public void testGetListaDeEnvase1() {
        Venta instance = new Venta();
        ArrayList<Envase> a = new ArrayList<>();
        instance.setListaDeEnvasesUtilizados(a);
        ArrayList<Envase> expResult = a;
        ArrayList<Envase> result = instance.getListaDeEnvasesUtilizados();
        assertEquals(expResult, result);
    }
    @Test
    public void testGetListaDeEnvase2() {
        Venta instance = new Venta();
        ArrayList<Envase> a = new ArrayList<>();
        Envase e1 = new Envase();
        e1.setNombre("Envase 1");
        instance.agregarEnvase(e1);
        instance.setListaDeEnvasesUtilizados(a);
        Envase e2 = new Envase();
        e2.setNombre("Envase 2");
        instance.agregarEnvase(e2);
        a.add(e1);
        a.add(e2);
        ArrayList<Envase> expResult = a;
        ArrayList<Envase> result = instance.getListaDeEnvasesUtilizados();
        assertEquals(expResult, result);
    }
    @Test
    public void testGetListaDeEnvase3() {
        Venta instance = new Venta();
        ArrayList<Envase> a = new ArrayList<>();
        Envase e1 = new Envase();
        e1.setNombre("Envase 1");
        instance.agregarEnvase(e1);
        instance.setListaDeEnvasesUtilizados(a);
        Envase e2 = new Envase();
        e2.setNombre("Envase 2");
        instance.agregarEnvase(e2);
        Envase e3 = new Envase();
        e3.setNombre("Envase 2");
        instance.agregarEnvase(e3);
        a.add(e1);
        a.add(e2);
        ArrayList<Envase> expResult = a;
        ArrayList<Envase> result = instance.getListaDeEnvasesUtilizados();
        assertEquals(expResult, result);
    }
    @Test
    public void testGetListaDeEnvase4() {
        Venta instance = new Venta();
        ArrayList<Envase> a = new ArrayList<>();
        Envase e1 = new Envase();
        e1.setNombre("Envase 1");
        instance.agregarEnvase(e1);
        instance.setListaDeEnvasesUtilizados(a);
        Envase e2 = new Envase();
        e2.setNombre("Envase 2");
        instance.agregarEnvase(e2);
        Envase e3 = new Envase();
        e3.setNombre("Envase 2");
        instance.agregarEnvase(e3);
        instance.eliminarEnvase(e2);
        a.add(e1);
        ArrayList<Envase> expResult = a;
        ArrayList<Envase> result = instance.getListaDeEnvasesUtilizados();
        assertEquals(expResult, result);
    }
    @Test
    public void testGetListaDeEnvase5() {
        Venta instance = new Venta();
        ArrayList<Envase> a = new ArrayList<>();
        Envase e1 = new Envase();
        e1.setNombre("Envase 1");
        instance.agregarEnvase(e1);
        instance.setListaDeEnvasesUtilizados(a);
        Envase e2 = new Envase();
        e2.setNombre("Envase 2");
        instance.agregarEnvase(e2);
        Envase e3 = new Envase();
        e3.setNombre("Envase 2");
        instance.agregarEnvase(e3);
        instance.eliminarEnvase(e2);
        instance.eliminarEnvase(e1);
        ArrayList<Envase> expResult = a;
        ArrayList<Envase> result = instance.getListaDeEnvasesUtilizados();
        assertEquals(expResult, result);
    }
    @Test
    public void testSetEnvases1() {
        Venta instance = new Venta();
        Envase e = new Envase();
        Envase e2 = new Envase();
        Envase e3 = new Envase();
        ArrayList<Envase> a = new ArrayList<>();
        a.add(e);
        a.add(e2);
        a.add(e3);
        instance.setListaDeEnvasesUtilizados(a);
    }
    @Test
    public void testSetEnvases2() {
        Venta instance = new Venta();
        Envase e = new Envase();
        Envase e2 = new Envase();
        Envase e3 = new Envase();
        ArrayList<Envase> a = new ArrayList<>();
        a.add(e);
        instance.setListaDeEnvasesUtilizados(a);
    }
    public void testSetEnvases3() {
        Venta instance = new Venta();
        Envase e = new Envase();
        Envase e2 = new Envase();
        Envase e3 = new Envase();
        ArrayList<Envase> a = new ArrayList<>();
        instance.setListaDeEnvasesUtilizados(a);
    }
    //Identificador
    @Test(expected = RuntimeException.class)
    public void testGetIdentificadorDeVenta1() {
        Venta instance = new Venta();
        instance.setCodigoIdentificadorDeVenta(0);
        int expResult = 0;
        int result = instance.getCodigoIdentificadorDeVenta();
        assertEquals(expResult, result);
    }
    @Test(expected = RuntimeException.class)
    public void testGetIdentificadorDeVenta2() {
        Venta instance = new Venta();
        instance.setCodigoIdentificadorDeVenta(-1);
        int expResult = -1;
        int result = instance.getCodigoIdentificadorDeVenta();
        assertEquals(expResult, result);
    }
    @Test
    public void testGetIdentificadorDeVenta3() {
        Venta instance = new Venta();
        instance.setCodigoIdentificadorDeVenta(1);
        int expResult = 1;
        int result = instance.getCodigoIdentificadorDeVenta();
        assertEquals(expResult, result);
    }
    @Test
    public void testGetIdentificadorDeVenta4() {
        Venta instance = new Venta();
        instance.setCodigoIdentificadorDeVenta(100);
        int expResult = 100;
        int result = instance.getCodigoIdentificadorDeVenta();
        assertEquals(expResult, result);
    }
    @Test
    public void testGetIdentificadorDeVenta5() {
        Venta instance = new Venta();
        instance.setCodigoIdentificadorDeVenta(100000);
        int expResult = 100000;
        int result = instance.getCodigoIdentificadorDeVenta();
        assertEquals(expResult, result);
    }
    @Test(expected = RuntimeException.class)
    public void testSetIdentificadorDeVenta1() {
        int identificadorDeVenta = 0;
        Venta instance = new Venta();
        instance.setCodigoIdentificadorDeVenta(identificadorDeVenta);
    }
    @Test(expected = RuntimeException.class)
    public void testSetIdentificadorDeVenta2() {
        int identificadorDeVenta = -8;
        Venta instance = new Venta();
        instance.setCodigoIdentificadorDeVenta(identificadorDeVenta);
    }
    @Test
    public void testSetIdentificadorDeVenta3() {
        int identificadorDeVenta = 1;
        Venta instance = new Venta();
        instance.setCodigoIdentificadorDeVenta(identificadorDeVenta);
    }
    @Test
    public void testSetIdentificadorDeVenta4() {
        int identificadorDeVenta = 100;
        Venta instance = new Venta();
        instance.setCodigoIdentificadorDeVenta(identificadorDeVenta);
    }
    @Test
    public void testSetIdentificadorDeVenta5() {
        int identificadorDeVenta = 10000;
        Venta instance = new Venta();
        instance.setCodigoIdentificadorDeVenta(identificadorDeVenta);
    }
    //Direccion
    @Test
    public void testGetDireccion1() {
        Venta instance = new Venta();
        instance.setDireccionAEnviar("mercedes");
        String expResult = "mercedes";
        String result = instance.getDireccionAEnviar();
        assertEquals(expResult, result);
    }
    @Test
    public void testGetDireccion2() {
        Venta instance = new Venta();
        instance.setDireccionAEnviar("Cuareim");
        String expResult = "Cuareim";
        String result = instance.getDireccionAEnviar();
        assertEquals(expResult, result);
    }
    @Test(expected = RuntimeException.class)
    public void testGetDireccion3() {
        Venta instance = new Venta();
        instance.setDireccionAEnviar("");
        String expResult = "";
        String result = instance.getDireccionAEnviar();
        assertEquals(expResult, result);
    }
    @Test(expected = RuntimeException.class)
    public void testGetDireccion4() {
        Venta instance = new Venta();
        instance.setDireccionAEnviar("    ");
        String expResult = "    ";
        String result = instance.getDireccionAEnviar();
        assertEquals(expResult, result);
    }
    @Test
    public void testSetDireccion1() {
        String dir = "Venta1";
        Venta instance = new Venta();
        instance.setDireccionAEnviar(dir);
    }
    @Test(expected = RuntimeException.class)
    public void testSetDireccion2() {
        String dir = "";
        Venta instance = new Venta();
        instance.setDireccionAEnviar(dir);
    }
    @Test(expected = RuntimeException.class)
    public void testSetDireccion3() {
        String dir = "   ";
        Venta instance = new Venta();
        instance.setDireccionAEnviar(dir);
    }
    //Equals
    @Test
    public void equals1() {
        Venta instance = new Venta();
        instance.setCodigoIdentificadorDeVenta(100000);
        Venta e = new Venta();
        e.setCodigoIdentificadorDeVenta(100000);
        boolean result = instance.equals(e);
        assertEquals(true, result);
    }
    @Test
    public void equals2() {
        Venta instance = new Venta();
        instance.setCodigoIdentificadorDeVenta(100000);
        Producto e = new Producto();
        boolean result = instance.equals(e);
        assertEquals(false, result);
    }
}
