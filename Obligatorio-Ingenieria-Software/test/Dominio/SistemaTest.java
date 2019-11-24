package dominio;

import dominio.PreVenta;
import dominio.Sistema;
import dominio.Venta;
import dominio.Tienda;
import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class SistemaTest {

    public SistemaTest() {
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

    //Lista de ventas
    @Test
    public void testGetListaDeVentasDelSitema1() {

        Sistema instance = new Sistema();
        Venta v1 = new Venta();
        v1.setCodigoIdentificadorDeVenta(1);
        Venta v2 = new Venta();
        v2.setCodigoIdentificadorDeVenta(2);
        Venta v3 = new Venta();
        v3.setCodigoIdentificadorDeVenta(3);
        instance.agregarVenta(v1);

        ArrayList<Venta> a = new ArrayList<>();
        a.add(v1);
        ArrayList<Venta> expResult = a;
        ArrayList<Venta> result = instance.getListaDeVentasDelSitema();
        assertEquals(expResult, result);

    }

    @Test
    public void testGetListaDeVentasDelSitema2() {

        Sistema instance = new Sistema();
        Venta v1 = new Venta();
        v1.setCodigoIdentificadorDeVenta(1);
        Venta v2 = new Venta();
        v2.setCodigoIdentificadorDeVenta(2);
        Venta v3 = new Venta();
        v3.setCodigoIdentificadorDeVenta(3);
        instance.agregarVenta(v1);
        instance.agregarVenta(v2);

        ArrayList<Venta> a = new ArrayList<>();
        a.add(v1);
        a.add(v2);
        ArrayList<Venta> expResult = a;
        ArrayList<Venta> result = instance.getListaDeVentasDelSitema();
        assertEquals(expResult, result);

    }

    @Test
    public void testGetListaDeVentasDelSitema3() {

        Sistema instance = new Sistema();
        Venta v1 = new Venta();
        v1.setCodigoIdentificadorDeVenta(1);
        Venta v2 = new Venta();
        v2.setCodigoIdentificadorDeVenta(2);
        Venta v3 = new Venta();
        v3.setCodigoIdentificadorDeVenta(3);
        instance.agregarVenta(v1);
        instance.agregarVenta(v2);
        instance.agregarVenta(v2);

        ArrayList<Venta> a = new ArrayList<>();
        a.add(v1);
        a.add(v2);
        ArrayList<Venta> expResult = a;
        ArrayList<Venta> result = instance.getListaDeVentasDelSitema();
        assertEquals(expResult, result);

    }

    @Test
    public void testGetListaDeVentasDelSitema4() {

        Sistema instance = new Sistema();
        Venta v1 = new Venta();
        v1.setCodigoIdentificadorDeVenta(1);
        Venta v2 = new Venta();
        v2.setCodigoIdentificadorDeVenta(2);
        Venta v3 = new Venta();
        v3.setCodigoIdentificadorDeVenta(3);
        instance.agregarVenta(v1);
        instance.agregarVenta(v2);

        ArrayList<Venta> a = new ArrayList<>();
        a.add(v1);
        a.add(v2);
        ArrayList<Venta> expResult = a;
        ArrayList<Venta> result = instance.getListaDeVentasDelSitema();
        assertEquals(expResult, result);

    }

    @Test
    public void testGetListaDeVentasDelSitema5() {

        Sistema instance = new Sistema();
        Venta v1 = new Venta();
        v1.setCodigoIdentificadorDeVenta(1);
        Venta v2 = new Venta();
        v2.setCodigoIdentificadorDeVenta(2);
        Venta v3 = new Venta();
        v3.setCodigoIdentificadorDeVenta(3);
        instance.agregarVenta(v1);
        instance.agregarVenta(v2);
        instance.agregarVenta(v3);

        ArrayList<Venta> a = new ArrayList<>();
        a.add(v1);
        a.add(v2);
        a.add(v3);
        ArrayList<Venta> expResult = a;
        ArrayList<Venta> result = instance.getListaDeVentasDelSitema();
        assertEquals(expResult, result);

    }

    @Test
    public void testGetListaDeVentasDelSitema6() {

        Sistema instance = new Sistema();
        Venta v1 = new Venta();
        v1.setCodigoIdentificadorDeVenta(1);
        Venta v2 = new Venta();
        v2.setCodigoIdentificadorDeVenta(2);
        Venta v3 = new Venta();
        v3.setCodigoIdentificadorDeVenta(3);
        instance.agregarVenta(v1);
        instance.agregarVenta(v3);

        ArrayList<Venta> a = new ArrayList<>();
        a.add(v1);
        a.add(v3);
        ArrayList<Venta> expResult = a;
        ArrayList<Venta> result = instance.getListaDeVentasDelSitema();
        assertEquals(expResult, result);

    }

    @Test
    public void testGetListaDeVentasDelSitema7() {

        Sistema instance = new Sistema();
        Venta v1 = new Venta();
        v1.setCodigoIdentificadorDeVenta(1);
        Venta v2 = new Venta();
        v2.setCodigoIdentificadorDeVenta(2);
        Venta v3 = new Venta();
        v3.setCodigoIdentificadorDeVenta(3);
        instance.agregarVenta(v1);
        instance.agregarVenta(v2);
        instance.agregarVenta(v3);

        instance.eliminarVenta(v1);
        instance.eliminarVenta(v2);

        ArrayList<Venta> a = new ArrayList<>();
        a.add(v3);
        ArrayList<Venta> expResult = a;
        ArrayList<Venta> result = instance.getListaDeVentasDelSitema();
        assertEquals(expResult, result);

    }

    @Test
    public void testGetListaDeVentasDelSitema8() {

        Sistema instance = new Sistema();
        Venta v1 = new Venta();
        v1.setCodigoIdentificadorDeVenta(1);
        Venta v2 = new Venta();
        v2.setCodigoIdentificadorDeVenta(2);
        Venta v3 = new Venta();
        v3.setCodigoIdentificadorDeVenta(3);
        instance.agregarVenta(v1);
        instance.agregarVenta(v2);
        instance.agregarVenta(v3);

        instance.eliminarVenta(v1);
        instance.eliminarVenta(v2);
        instance.eliminarVenta(v3);

        ArrayList<Venta> a = new ArrayList<>();
        ArrayList<Venta> expResult = a;
        ArrayList<Venta> result = instance.getListaDeVentasDelSitema();
        assertEquals(expResult, result);

    }

    @Test
    public void testGetListaDeVentasDelSitema9() {

        Sistema instance = new Sistema();
        Venta v1 = new Venta();
        v1.setCodigoIdentificadorDeVenta(1);
        Venta v2 = new Venta();
        v2.setCodigoIdentificadorDeVenta(2);
        Venta v3 = new Venta();
        v3.setCodigoIdentificadorDeVenta(3);
        instance.agregarVenta(v1);
        instance.agregarVenta(v1);
        instance.agregarVenta(v2);
        instance.agregarVenta(v2);
        instance.agregarVenta(v3);

        instance.eliminarVenta(v1);
        instance.eliminarVenta(v3);
        instance.eliminarVenta(v2);

        ArrayList<Venta> a = new ArrayList<>();
        ArrayList<Venta> expResult = a;
        ArrayList<Venta> result = instance.getListaDeVentasDelSitema();
        assertEquals(expResult, result);

    }

    @Test
    public void testSetListaDeVentasDelSitema1() {

        Sistema instance = new Sistema();
        Venta v1 = new Venta();
        v1.setCodigoIdentificadorDeVenta(1);
        Venta v2 = new Venta();
        v2.setCodigoIdentificadorDeVenta(2);
        Venta v3 = new Venta();
        v3.setCodigoIdentificadorDeVenta(3);
        instance.agregarVenta(v1);

        ArrayList<Venta> a = new ArrayList<>();
        a.add(v1);
        ArrayList<Venta> listaDeVentasDelSitema = a;
        instance.setListaDeVentasDelSitema(listaDeVentasDelSitema);

    }

    @Test
    public void testSetListaDeVentasDelSitema2() {

        Sistema instance = new Sistema();
        Venta v1 = new Venta();
        v1.setCodigoIdentificadorDeVenta(1);
        Venta v2 = new Venta();
        v2.setCodigoIdentificadorDeVenta(2);
        Venta v3 = new Venta();
        v3.setCodigoIdentificadorDeVenta(3);
        instance.agregarVenta(v1);

        ArrayList<Venta> a = new ArrayList<>();
        a.add(v1);
        a.add(v2);
        ArrayList<Venta> listaDeVentasDelSitema = a;
        instance.setListaDeVentasDelSitema(listaDeVentasDelSitema);

    }

    @Test
    public void testSetListaDeVentasDelSitema3() {

        Sistema instance = new Sistema();
        Venta v1 = new Venta();
        v1.setCodigoIdentificadorDeVenta(1);
        Venta v2 = new Venta();
        v2.setCodigoIdentificadorDeVenta(2);
        Venta v3 = new Venta();
        v3.setCodigoIdentificadorDeVenta(3);
        instance.agregarVenta(v1);

        ArrayList<Venta> a = new ArrayList<>();
        a.add(v1);
        a.add(v2);
        a.add(v3);
        ArrayList<Venta> listaDeVentasDelSitema = a;
        instance.setListaDeVentasDelSitema(listaDeVentasDelSitema);

    }

    @Test
    public void testSetListaDeVentasDelSitema4() {

        Sistema instance = new Sistema();
        Venta v1 = new Venta();
        v1.setCodigoIdentificadorDeVenta(1);
        Venta v2 = new Venta();
        v2.setCodigoIdentificadorDeVenta(2);
        Venta v3 = new Venta();
        v3.setCodigoIdentificadorDeVenta(3);
        instance.agregarVenta(v1);

        ArrayList<Venta> a = new ArrayList<>();
        ArrayList<Venta> listaDeVentasDelSitema = a;
        instance.setListaDeVentasDelSitema(listaDeVentasDelSitema);

    }

    //Lista de Preventas
    @Test
    public void testGetListaDePreVentas1() {

        Sistema instance = new Sistema();
        PreVenta v1 = new PreVenta();

        PreVenta v2 = new PreVenta();

        PreVenta v3 = new PreVenta();

        instance.agregarPreVenta(v1);

        ArrayList<PreVenta> a = new ArrayList<>();
        a.add(v1);
        ArrayList<PreVenta> expResult = a;
        ArrayList<PreVenta> result = instance.getListaDePreventas();
        assertEquals(expResult, result);

    }

    @Test
    public void testGetListaDePreVentas2() {

        Sistema instance = new Sistema();
        PreVenta v1 = new PreVenta();
        v1.setIdentificadorDePreventa(1);
        PreVenta v2 = new PreVenta();
        v2.setIdentificadorDePreventa(2);
        PreVenta v3 = new PreVenta();
        v3.setIdentificadorDePreventa(3);

        instance.agregarPreVenta(v1);
        instance.agregarPreVenta(v2);

        ArrayList<PreVenta> a = new ArrayList<>();
        a.add(v1);
        a.add(v2);
        ArrayList<PreVenta> expResult = a;
        ArrayList<PreVenta> result = instance.getListaDePreventas();
        assertEquals(expResult, result);

    }

    @Test
    public void testGetListaDePreVentas3() {

        Sistema instance = new Sistema();
        PreVenta v1 = new PreVenta();
        v1.setIdentificadorDePreventa(1);
        PreVenta v2 = new PreVenta();
        v2.setIdentificadorDePreventa(2);
        PreVenta v3 = new PreVenta();
        v3.setIdentificadorDePreventa(3);
        
        instance.agregarPreVenta(v1);
        instance.agregarPreVenta(v2);

        ArrayList<PreVenta> a = new ArrayList<>();
        a.add(v1);
        a.add(v2);
        ArrayList<PreVenta> expResult = a;
        ArrayList<PreVenta> result = instance.getListaDePreventas();
        assertEquals(expResult, result);

    }

    @Test
    public void testGetListaDePreVentas4() {

        Sistema instance = new Sistema();
        PreVenta v1 = new PreVenta();
        v1.setIdentificadorDePreventa(1);
        PreVenta v2 = new PreVenta();
        v2.setIdentificadorDePreventa(2);
        PreVenta v3 = new PreVenta();
        v3.setIdentificadorDePreventa(3);
        
        instance.agregarPreVenta(v1);
        instance.agregarPreVenta(v2);

        ArrayList<PreVenta> a = new ArrayList<>();
        a.add(v1);
        a.add(v2);
        ArrayList<PreVenta> expResult = a;
        ArrayList<PreVenta> result = instance.getListaDePreventas();
        assertEquals(expResult, result);

    }

    @Test
    public void testGetListaDePreVentas5() {

        Sistema instance = new Sistema();
        PreVenta v1 = new PreVenta();
        v1.setIdentificadorDePreventa(1);
        PreVenta v2 = new PreVenta();
        v2.setIdentificadorDePreventa(2);
        PreVenta v3 = new PreVenta();
        v3.setIdentificadorDePreventa(3);
        
        instance.agregarPreVenta(v1);
        instance.agregarPreVenta(v2);
        instance.agregarPreVenta(v3);

        ArrayList<PreVenta> a = new ArrayList<>();
        a.add(v1);
        a.add(v2);
        a.add(v3);
        ArrayList<PreVenta> expResult = a;
        ArrayList<PreVenta> result = instance.getListaDePreventas();
        assertEquals(expResult, result);

    }

    @Test
    public void testGetListaDePreVentas6() {

        Sistema instance = new Sistema();
        PreVenta v1 = new PreVenta();
        v1.setIdentificadorDePreventa(1);
        PreVenta v2 = new PreVenta();
        v2.setIdentificadorDePreventa(2);
        PreVenta v3 = new PreVenta();
        v3.setIdentificadorDePreventa(3);
        
        instance.agregarPreVenta(v1);
        instance.agregarPreVenta(v3);

        ArrayList<PreVenta> a = new ArrayList<>();
        a.add(v1);
        a.add(v3);
        ArrayList<PreVenta> expResult = a;
        ArrayList<PreVenta> result = instance.getListaDePreventas();
        assertEquals(expResult, result);

    }

    @Test
    public void testGetListaDePreVentas7() {

        Sistema instance = new Sistema();
        PreVenta v1 = new PreVenta();
        v1.setIdentificadorDePreventa(1);
        PreVenta v2 = new PreVenta();
        v2.setIdentificadorDePreventa(2);
        PreVenta v3 = new PreVenta();
        v3.setIdentificadorDePreventa(3);
        
        instance.agregarPreVenta(v1);
        instance.agregarPreVenta(v3);
        instance.cancelarPreVenta(v1);

        ArrayList<PreVenta> a = new ArrayList<>();
        a.add(v3);
        ArrayList<PreVenta> expResult = a;
        ArrayList<PreVenta> result = instance.getListaDePreventas();
        assertEquals(expResult, result);

    }

    @Test
    public void testGetListaDePreVentas8() {

        Sistema instance = new Sistema();
        PreVenta v1 = new PreVenta();
        v1.setIdentificadorDePreventa(1);
        PreVenta v2 = new PreVenta();
        v2.setIdentificadorDePreventa(2);
        PreVenta v3 = new PreVenta();
        v3.setIdentificadorDePreventa(3);

        instance.agregarPreVenta(v1);
        instance.agregarPreVenta(v3);

        instance.cancelarPreVenta(v1);
        instance.cancelarPreVenta(v3);
        
        //Cancelo una preventa que ya no esta
        instance.cancelarPreVenta(v3);

        ArrayList<PreVenta> a = new ArrayList<>();
        ArrayList<PreVenta> expResult = a;
        ArrayList<PreVenta> result = instance.getListaDePreventas();
        assertEquals(expResult, result);

    }

    @Test
    public void testGetListaDePreVentas9() {

        Sistema instance = new Sistema();
        PreVenta v1 = new PreVenta();
        v1.setIdentificadorDePreventa(1);
        PreVenta v2 = new PreVenta();
        v2.setIdentificadorDePreventa(2);
        PreVenta v3 = new PreVenta();
        v3.setIdentificadorDePreventa(3);
        
        instance.agregarPreVenta(v1);
        instance.agregarPreVenta(v2);
        instance.agregarPreVenta(v3);

        instance.cancelarPreVenta(v1);
        instance.cancelarPreVenta(v3);
        instance.cancelarPreVenta(v2);

        ArrayList<PreVenta> a = new ArrayList<>();
        ArrayList<PreVenta> expResult = a;
        ArrayList<PreVenta> result = instance.getListaDePreventas();
        assertEquals(expResult, result);

    }

    @Test
    public void testSetListaDePreVentas1() {

        Sistema instance = new Sistema();
        PreVenta v1 = new PreVenta();

        PreVenta v2 = new PreVenta();

        PreVenta v3 = new PreVenta();

        instance.agregarPreVenta(v1);

        ArrayList<PreVenta> a = new ArrayList<>();
        a.add(v1);
        ArrayList<PreVenta> listaDePreVentasDelSitema = a;
        instance.setListaDePreventas(listaDePreVentasDelSitema);

    }

    @Test
    public void testSetListaDePreVentas2() {

        Sistema instance = new Sistema();
        PreVenta v1 = new PreVenta();

        PreVenta v2 = new PreVenta();

        PreVenta v3 = new PreVenta();

        instance.agregarPreVenta(v1);

        ArrayList<PreVenta> a = new ArrayList<>();
        a.add(v1);
        a.add(v2);
        ArrayList<PreVenta> listaDePreVentasDelSitema = a;
        instance.setListaDePreventas(listaDePreVentasDelSitema);

    }

    @Test
    public void testSetListaDePreVentas3() {

        Sistema instance = new Sistema();
        PreVenta v1 = new PreVenta();

        PreVenta v2 = new PreVenta();

        PreVenta v3 = new PreVenta();

        instance.agregarPreVenta(v1);

        ArrayList<PreVenta> a = new ArrayList<>();
        a.add(v1);
        a.add(v2);
        a.add(v3);
        ArrayList<PreVenta> listaDePreVentasDelSitema = a;
        instance.setListaDePreventas(listaDePreVentasDelSitema);

    }

    @Test
    public void testSetListaDePreVentas4() {

        Sistema instance = new Sistema();
        PreVenta v1 = new PreVenta();

        PreVenta v2 = new PreVenta();

        PreVenta v3 = new PreVenta();

        instance.agregarPreVenta(v1);

        ArrayList<PreVenta> a = new ArrayList<>();
        ArrayList<PreVenta> listaDePreVentasDelSitema = a;
        instance.setListaDePreventas(listaDePreVentasDelSitema);

    }

    //Echo Shop
    @Test
    public void testSetEchToShop() {

        Tienda listaDeEchoShop = new Tienda();
        Sistema instance = new Sistema();
        instance.setEchToShop(listaDeEchoShop);

    }

}
