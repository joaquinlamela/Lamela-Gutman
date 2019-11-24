package dominio;
import dominio.Sucursal;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

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
    //Numero de Sucursal
    @Test(expected = RuntimeException.class)
    public void testGetNumeroSucursal1() {
        Sucursal instance = new Sucursal();
        instance.setNumeroSucursal(0);
        int expResult = 0;
        int result = (int) instance.getNumeroSucursal();
        assertEquals(expResult, result);
    }
    @Test(expected = RuntimeException.class)
    public void testGetNumeroSucursal2() {
        Sucursal instance = new Sucursal();
        instance.setNumeroSucursal(-1);
        int expResult = -1;
        int result = (int) instance.getNumeroSucursal();
        assertEquals(expResult, result);
    }
    @Test
    public void testGetNumeroSucursal3() {
        Sucursal instance = new Sucursal();
        instance.setNumeroSucursal(1);
        int expResult = 1;
        int result = (int) instance.getNumeroSucursal();
        assertEquals(expResult, result);
    }
    @Test
    public void testGetNumeroSucursal4() {
        Sucursal instance = new Sucursal();
        instance.setNumeroSucursal(100);
        int expResult = 100;
        int result = (int) instance.getNumeroSucursal();
        assertEquals(expResult, result);
    }
    @Test
    public void testGetNumeroSucursal5() {
        Sucursal instance = new Sucursal();
        instance.setNumeroSucursal(100000);
        int expResult = 100000;
        int result = (int) instance.getNumeroSucursal();
        assertEquals(expResult, result);
    }
    @Test(expected = RuntimeException.class)
    public void testSetNumeroSucursal1() {
        int precioDeSucursal = 0;
        Sucursal instance = new Sucursal();
        instance.setNumeroSucursal(precioDeSucursal);
    }
    @Test(expected = RuntimeException.class)
    public void testSetNumeroSucursal2() {
        int precioDeSucursal = -8;
        Sucursal instance = new Sucursal();
        instance.setNumeroSucursal(precioDeSucursal);
    }
    @Test
    public void testSetNumeroSucursal3() {
        int precioDeSucursal = 1;
        Sucursal instance = new Sucursal();
        instance.setNumeroSucursal(precioDeSucursal);
    }
    @Test
    public void testSetNumeroSucursal4() {
        int precioDeSucursal = 100;
        Sucursal instance = new Sucursal();
        instance.setNumeroSucursal(precioDeSucursal);
    }
    @Test
    public void testSetNumeroSucursal5() {
        int precioDeSucursal = 10000;
        Sucursal instance = new Sucursal();
        instance.setNumeroSucursal(precioDeSucursal);
    }
    //Direccion
    @Test
    public void testGetDireccion1() {
        Sucursal instance = new Sucursal();
        instance.setDireccion("mercedes");
        String expResult = "mercedes";
        String result = instance.getDireccion();
        assertEquals(expResult, result);
    }
    @Test
    public void testGetDireccion2() {
        Sucursal instance = new Sucursal();
        instance.setDireccion("Cuareim");
        String expResult = "Cuareim";
        String result = instance.getDireccion();
        assertEquals(expResult, result);
    }
    @Test(expected = RuntimeException.class)
    public void testGetDireccion3() {
        Sucursal instance = new Sucursal();
        instance.setDireccion("");
        String expResult = "";
        String result = instance.getDireccion();
        assertEquals(expResult, result);
    }
    @Test(expected = RuntimeException.class)
    public void testGetDireccion4() {
        Sucursal instance = new Sucursal();
        instance.setDireccion("    ");
        String expResult = "    ";
        String result = instance.getDireccion();
        assertEquals(expResult, result);
    }
    @Test
    public void testSetDireccion1() {
        String dir = "Sucursal1";
        Sucursal instance = new Sucursal();
        instance.setDireccion(dir);
    }
    @Test(expected = RuntimeException.class)
    public void testSetDireccion2() {
        String dir = "";
        Sucursal instance = new Sucursal();
        instance.setDireccion(dir);
    }
    @Test(expected = RuntimeException.class)
    public void testSetDireccion3() {
        String dir = "   ";
        Sucursal instance = new Sucursal();
        instance.setDireccion(dir);
    }
    //Telefono
    @Test(expected = RuntimeException.class)
    public void testGetTelefono1() {
        Sucursal instance = new Sucursal();
        instance.setTelefono(0);
        int expResult = 0;
        int result = (int) instance.getTelefono();
        assertEquals(expResult, result);
    }
    @Test(expected = RuntimeException.class)
    public void testGetTelefono2() {
        Sucursal instance = new Sucursal();
        instance.setTelefono(-1);
        int expResult = -1;
        int result = (int) instance.getTelefono();
        assertEquals(expResult, result);
    }
    @Test
    public void testGetTelefono3() {
        Sucursal instance = new Sucursal();
        instance.setTelefono(1);
        int expResult = 1;
        int result = (int) instance.getTelefono();
        assertEquals(expResult, result);
    }
    @Test
    public void testGetTelefono4() {
        Sucursal instance = new Sucursal();
        instance.setTelefono(100);
        int expResult = 100;
        int result = (int) instance.getTelefono();
        assertEquals(expResult, result);
    }
    @Test
    public void testGetTelefono5() {
        Sucursal instance = new Sucursal();
        instance.setTelefono(100000);
        int expResult = 100000;
        int result = (int) instance.getTelefono();
        assertEquals(expResult, result);
    }
    @Test(expected = RuntimeException.class)
    public void testSetTelefono1() {
        int precioDeSucursal = 0;
        Sucursal instance = new Sucursal();
        instance.setTelefono(precioDeSucursal);
    }
    @Test(expected = RuntimeException.class)
    public void testSetTelefono2() {
        int precioDeSucursal = -8;
        Sucursal instance = new Sucursal();
        instance.setTelefono(precioDeSucursal);
    }
    @Test
    public void testSetTelefono3() {
        int precioDeSucursal = 1;
        Sucursal instance = new Sucursal();
        instance.setTelefono(precioDeSucursal);
    }
    @Test
    public void testSetTelefono4() {
        int precioDeSucursal = 100;
        Sucursal instance = new Sucursal();
        instance.setTelefono(precioDeSucursal);
    }
    @Test
    public void testSetTelefono5() {
        int precioDeSucursal = 10000;
        Sucursal instance = new Sucursal();
        instance.setTelefono(precioDeSucursal);
    }
    //Equals
    @Test
    public void equals1() {
        Sucursal instance = new Sucursal();
        instance.setNumeroSucursal(2);
        Sucursal e = new Sucursal();
        e.setNumeroSucursal(2);
        boolean result = instance.equals(e);
        assertEquals(true, result);
    }
    @Test
    public void equals2() {
        Sucursal instance = new Sucursal();
        Producto e = new Producto();
        boolean result = instance.equals(e);
        assertEquals(false, result);
    }
}