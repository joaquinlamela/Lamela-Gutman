package dominio;
import dominio.Sucursal;
import dominio.Producto;
import dominio.Tienda;
import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

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
    //Direccion
    @Test
    public void testGetDireccion1() {
        Tienda instance = new Tienda();
        instance.setDireccion("mercedes");
        String expResult = "mercedes";
        String result = instance.getDireccion();
        assertEquals(expResult, result);
    }
    @Test
    public void testGetDireccion2() {
        Tienda instance = new Tienda();
        instance.setDireccion("Cuareim");
        String expResult = "Cuareim";
        String result = instance.getDireccion();
        assertEquals(expResult, result);
    }
    @Test(expected = RuntimeException.class)
    public void testGetDireccion3() {
        Tienda instance = new Tienda();
        instance.setDireccion("");
        String expResult = "";
        String result = instance.getDireccion();
        assertEquals(expResult, result);
    }
    @Test(expected = RuntimeException.class)
    public void testGetDireccion4() {
        Tienda instance = new Tienda();
        instance.setDireccion("    ");
        String expResult = "    ";
        String result = instance.getDireccion();
        assertEquals(expResult, result);
    }
    @Test
    public void testSetDireccion1() {
        String dir = "Tienda1";
        Tienda instance = new Tienda();
        instance.setDireccion(dir);
    }
    @Test(expected = RuntimeException.class)
    public void testSetDireccion2() {
        String dir = "";
        Tienda instance = new Tienda();
        instance.setDireccion(dir);
    }
    @Test(expected = RuntimeException.class)
    public void testSetDireccion3() {
        String dir = "   ";
        Tienda instance = new Tienda();
        instance.setDireccion(dir);
    }
    //Telefono
    @Test(expected = RuntimeException.class)
    public void testGetTelefono1() {
        Tienda instance = new Tienda();
        instance.setTelefono(0);
        int expResult = 0;
        int result = (int) instance.getTelefono();
        assertEquals(expResult, result);
    }
    @Test(expected = RuntimeException.class)
    public void testGetTelefono2() {
        Tienda instance = new Tienda();
        instance.setTelefono(-1);
        int expResult = -1;
        int result = (int) instance.getTelefono();
        assertEquals(expResult, result);
    }
    @Test
    public void testGetTelefono3() {
        Tienda instance = new Tienda();
        instance.setTelefono(1);
        int expResult = 1;
        int result = (int) instance.getTelefono();
        assertEquals(expResult, result);
    }
    @Test
    public void testGetTelefono4() {
        Tienda instance = new Tienda();
        instance.setTelefono(100);
        int expResult = 100;
        int result = (int) instance.getTelefono();
        assertEquals(expResult, result);
    }
    @Test
    public void testGetTelefono5() {
        Tienda instance = new Tienda();
        instance.setTelefono(100000);
        int expResult = 100000;
        int result = (int) instance.getTelefono();
        assertEquals(expResult, result);
    }
    @Test(expected = RuntimeException.class)
    public void testSetTelefono1() {
        int precioDeTienda = 0;
        Tienda instance = new Tienda();
        instance.setTelefono(precioDeTienda);
    }
    @Test(expected = RuntimeException.class)
    public void testSetTelefono2() {
        int precioDeTienda = -8;
        Tienda instance = new Tienda();
        instance.setTelefono(precioDeTienda);
    }
    @Test
    public void testSetTelefono3() {
        int precioDeTienda = 1;
        Tienda instance = new Tienda();
        instance.setTelefono(precioDeTienda);
    }
    @Test
    public void testSetTelefono4() {
        int precioDeTienda = 100;
        Tienda instance = new Tienda();
        instance.setTelefono(precioDeTienda);
    }
    @Test
    public void testSetTelefono5() {
        int precioDeTienda = 10000;
        Tienda instance = new Tienda();
        instance.setTelefono(precioDeTienda);
    }
    //Stock por Id   
    @Test
    public void testGetstockPorId1() {
        Tienda instance = new Tienda();
        int[] array = {5};
        instance.setStockDeProductoPorId(array);
        int[] expResult = array;
        int[] result = instance.getStockDeProductoPorId();
        assertEquals(expResult, result);
    }
    @Test
    public void testGetstockPorId2() {
        Tienda instance = new Tienda();
        int[] array = {5, 10, 2};
        instance.setStockDeProductoPorId(array);
        int[] expResult = array;
        int[] result = instance.getStockDeProductoPorId();
        assertEquals(expResult, result);
    }
    @Test
    public void testGetstockPorId3() {
        Tienda instance = new Tienda();
        int[] array = {};
        instance.setStockDeProductoPorId(array);
        int[] expResult = array;
        int[] result = instance.getStockDeProductoPorId();
        assertEquals(expResult, result);
    }
    @Test
    public void testGetStockPorId4() {
        Tienda instance = new Tienda();
        int[] a = new int[10];
        instance.setStockDeProductoPorId(a);
        int[] expResult = a;
        int[] result = instance.getStockDeProductoPorId();
        assertArrayEquals(expResult, result);
    }
    @Test
    public void testGetStockPorId5() {
        Tienda instance = new Tienda();
        int[] a = {1, 2, 4, 5, 6, 8, 10};
        instance.setStockDeProductoPorId(a);
        int[] expResult = a;
        int[] result = instance.getStockDeProductoPorId();
        assertArrayEquals(expResult, result);
    }
    @Test
    public void testSetStockDeProductoPorId1() {
        int[] stockDeProductoPorId = new int[15];
        Tienda instance = new Tienda();
        instance.setStockDeProductoPorId(stockDeProductoPorId);
    }
    @Test
    public void testSetStockDeProductoPorId2() {
        int[] stockDeProductoPorId = new int[0];
        Tienda instance = new Tienda();
        instance.setStockDeProductoPorId(stockDeProductoPorId);
    }
    //Productos
    @Test
    public void testGetProductos1() {
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
    }
    @Test
    public void testGetProductos2() {
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
    }
    @Test
    public void testGetProductos3() {
        Tienda instance = new Tienda();
        Producto s1 = new Producto();
        s1.setCodigoIdentificador(1);
        Producto s2 = new Producto();
        s2.setCodigoIdentificador(2);
        Producto s3 = new Producto();
        s3.setCodigoIdentificador(3);
        instance.agregarProducto(s1);
        instance.agregarProducto(s2);
        ArrayList<Producto> a = new ArrayList<>();
        a.add(s1);
        a.add(s2);
        ArrayList<Producto> expResult = a;
        ArrayList<Producto> result = instance.getListaDeProductosEnStock();
        assertEquals(expResult, result);
    }
    @Test
    public void testGetProductos4() {
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
        ArrayList<Producto> a = new ArrayList<>();
        a.add(s1);
        a.add(s2);
        a.add(s3);
        ArrayList<Producto> expResult = a;
        ArrayList<Producto> result = instance.getListaDeProductosEnStock();
        assertEquals(expResult, result);
    }
    @Test
    public void testGetProductos5() {
        Tienda instance = new Tienda();
        Producto s1 = new Producto();
        s1.setCodigoIdentificador(1);
        Producto s2 = new Producto();
        s2.setCodigoIdentificador(2);
        Producto s3 = new Producto();
        s3.setCodigoIdentificador(3);
        s1 = s2;
        instance.agregarProducto(s1);
        instance.agregarProducto(s3);
        ArrayList<Producto> a = new ArrayList<>();
        a.add(s1);
        a.add(s3);
        ArrayList<Producto> expResult = a;
        ArrayList<Producto> result = instance.getListaDeProductosEnStock();
        assertEquals(expResult, result);
    }
    @Test
    public void testGetProductos6() {
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
        instance.eliminarProducto(s1);
        //Elimino un producto que ya no esta
        instance.eliminarProducto(s1);
        ArrayList<Producto> a = new ArrayList<>();
        a.add(s2);
        a.add(s3);
        ArrayList<Producto> expResult = a;
        ArrayList<Producto> result = instance.getListaDeProductosEnStock();
        assertEquals(expResult, result);
    }
    @Test
    public void testGetProductos7() {
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
        instance.eliminarProducto(s1);
        instance.eliminarProducto(s3);
        ArrayList<Producto> a = new ArrayList<>();
        a.add(s2);
        ArrayList<Producto> expResult = a;
        ArrayList<Producto> result = instance.getListaDeProductosEnStock();
        assertEquals(expResult, result);
    }
    @Test
    public void testSetProductos1() {
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
    }
    @Test
    public void testSetProductos2() {
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
    }
    @Test
    public void testSetProductos3() {
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
    }
    @Test
    public void testSetProductos4() {
        ArrayList<Producto> sucursales = new ArrayList<>();
        Tienda instance = new Tienda();
        Producto s1 = new Producto();
        s1.setCodigoIdentificador(1);
        Producto s2 = new Producto();
        s2.setCodigoIdentificador(2);
        Producto s3 = new Producto();
        s3.setCodigoIdentificador(3);
        instance.setListaDeProductosEnStock(sucursales);
    }
    //Sucursales
    @Test
    public void testGetSucursales1() {
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
    }
    @Test
    public void testGetSucursales2() {
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
    }
    @Test
    public void testGetSucursales3() {
        Tienda instance = new Tienda();
        Sucursal s1 = new Sucursal();
        Sucursal s2 = new Sucursal();
        Sucursal s3 = new Sucursal();
        instance.agregarSucursal(s1);
        instance.agregarSucursal(s2);
        ArrayList<Sucursal> a = new ArrayList<>();
        a.add(s1);
        a.add(s2);
        ArrayList<Sucursal> expResult = a;
        ArrayList<Sucursal> result = instance.getSucursales();
        assertEquals(expResult, result);
    }
    @Test
    public void testGetSucursales4() {
        Tienda instance = new Tienda();
        Sucursal s1 = new Sucursal();
        Sucursal s2 = new Sucursal();
        Sucursal s3 = new Sucursal();
        instance.agregarSucursal(s1);
        instance.agregarSucursal(s2);
        instance.agregarSucursal(s3);
        ArrayList<Sucursal> a = new ArrayList<>();
        a.add(s1);
        a.add(s2);
        a.add(s3);
        ArrayList<Sucursal> expResult = a;
        ArrayList<Sucursal> result = instance.getSucursales();
        assertEquals(expResult, result);
    }
    @Test
    public void testGetSucursales5() {
        Tienda instance = new Tienda();
        Sucursal s1 = new Sucursal();
        Sucursal s2 = new Sucursal();
        Sucursal s3 = new Sucursal();
        instance.agregarSucursal(s1);
        instance.agregarSucursal(s3);
        ArrayList<Sucursal> a = new ArrayList<>();
        a.add(s1);
        a.add(s3);
        ArrayList<Sucursal> expResult = a;
        ArrayList<Sucursal> result = instance.getSucursales();
        assertEquals(expResult, result);
    }
    @Test
    public void testGetSucursales6() {
        Tienda instance = new Tienda();
        Sucursal s1 = new Sucursal();
        Sucursal s2 = new Sucursal();
        Sucursal s3 = new Sucursal();
        instance.agregarSucursal(s1);
        instance.agregarSucursal(s2);
        instance.agregarSucursal(s3);
        instance.eliminarSucursal(s1);
        //Intento eliminar una sucursal que ya no esta
        instance.eliminarSucursal(s1);
        ArrayList<Sucursal> a = new ArrayList<>();
        a.add(s2);
        a.add(s3);
        ArrayList<Sucursal> expResult = a;
        ArrayList<Sucursal> result = instance.getSucursales();
        assertEquals(expResult, result);
    }
    @Test
    public void testGetSucursales7() {
        Tienda instance = new Tienda();
        Sucursal s1 = new Sucursal();
        Sucursal s2 = new Sucursal();
        Sucursal s3 = new Sucursal();
        instance.agregarSucursal(s1);
        instance.agregarSucursal(s2);
        instance.agregarSucursal(s3);
        instance.eliminarSucursal(s1);
        instance.eliminarSucursal(s2);
        instance.eliminarSucursal(s3);
        ArrayList<Sucursal> a = new ArrayList<>();
        ArrayList<Sucursal> expResult = a;
        ArrayList<Sucursal> result = instance.getSucursales();
        assertEquals(expResult, result);
    }
    @Test
    public void testSetSucursales1() {
        ArrayList<Sucursal> sucursales = new ArrayList<>();
        Tienda instance = new Tienda();
        Sucursal s1 = new Sucursal();
        Sucursal s2 = new Sucursal();
        Sucursal s3 = new Sucursal();
        instance.agregarSucursal(s1);
        instance.setSucursales(sucursales);
    }
    @Test
    public void testSetSucursales2() {
        ArrayList<Sucursal> sucursales = new ArrayList<>();
        Tienda instance = new Tienda();
        Sucursal s1 = new Sucursal();
        Sucursal s2 = new Sucursal();
        Sucursal s3 = new Sucursal();
        instance.agregarSucursal(s1);
        instance.agregarSucursal(s2);
        instance.setSucursales(sucursales);
    }
    @Test
    public void testSetSucursales3() {
        ArrayList<Sucursal> sucursales = new ArrayList<>();
        Tienda instance = new Tienda();
        Sucursal s1 = new Sucursal();
        Sucursal s2 = new Sucursal();
        Sucursal s3 = new Sucursal();
        instance.agregarSucursal(s1);
        instance.agregarSucursal(s2);
        instance.agregarSucursal(s3);
        instance.setSucursales(sucursales);
    }
    @Test
    public void testSetSucursales4() {
        ArrayList<Sucursal> sucursales = new ArrayList<>();
        Tienda instance = new Tienda();
        Sucursal s1 = new Sucursal();
        Sucursal s2 = new Sucursal();
        Sucursal s3 = new Sucursal();
        instance.setSucursales(sucursales);
    }
}
