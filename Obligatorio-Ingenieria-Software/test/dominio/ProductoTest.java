package dominio;

import dominio.TipoMateriales;
import dominio.Envase;
import dominio.TipoOrigen;
import dominio.Producto;
import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

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

    //Nombre
    @Test
    public void testGetNombre1() {

        Producto instance = new Producto();
        instance.setNombre("vidrio");
        String expResult = "vidrio";
        String result = instance.getNombre();
        assertEquals(expResult, result);

    }

    @Test
    public void testGetNombre2() {

        Producto instance = new Producto();
        instance.setNombre("Plastico");
        String expResult = "Plastico";
        String result = instance.getNombre();
        assertEquals(expResult, result);

    }

    @Test(expected = RuntimeException.class)
    public void testGetNombre3() {

        Producto instance = new Producto();
        instance.setNombre("");
        String expResult = "";
        String result = instance.getNombre();
        assertEquals(expResult, result);

    }

    @Test(expected = RuntimeException.class)
    public void testGetNombre4() {

        Producto instance = new Producto();
        instance.setNombre("   ");
        String expResult = "   ";
        String result = instance.getNombre();
        assertEquals(expResult, result);

    }

    @Test
    public void testSetNombre1() {

        String nombre = "Producto1";
        Producto instance = new Producto();
        instance.setNombre(nombre);

    }

    @Test(expected = RuntimeException.class)
    public void testSetNombre2() {

        String nombre = "";
        Producto instance = new Producto();
        instance.setNombre(nombre);

    }

    @Test(expected = RuntimeException.class)
    public void testSetNombre3() {

        String nombre = "    ";
        Producto instance = new Producto();
        instance.setNombre(nombre);

    }

    //Origen
    @Test
    public void testGetOrigen1() {

        Producto instance = new Producto();
        instance.setOrigen(TipoOrigen.Animal);
        TipoOrigen expResult = TipoOrigen.Animal;
        TipoOrigen result = instance.getOrigen();
        assertEquals(expResult, result);

    }

    @Test
    public void testGetOrigen2() {

        Producto instance = new Producto();
        instance.setOrigen(TipoOrigen.Indefinido);
        TipoOrigen expResult = TipoOrigen.Indefinido;
        TipoOrigen result = instance.getOrigen();
        assertEquals(expResult, result);

    }

    @Test
    public void testSetOrigen() {

        TipoOrigen origen = TipoOrigen.Mineral;
        Producto instance = new Producto();
        instance.setOrigen(origen);

    }

    //Descripcion
    @Test
    public void testGetDescripcion1() {

        Producto instance = new Producto();
        instance.setDescripcionDelProducto("Caro");
        String expResult = "Caro";
        String result = instance.getDescripcionDelProducto();
        assertEquals(expResult, result);

    }

    @Test
    public void testGetDescripcion2() {

        Producto instance = new Producto();
        instance.setDescripcionDelProducto("Barato");
        String expResult = "Barato";
        String result = instance.getDescripcionDelProducto();
        assertEquals(expResult, result);

    }

    @Test(expected = RuntimeException.class)
    public void testGetDescripcion3() {

        Producto instance = new Producto();
        instance.setDescripcionDelProducto("");
        String expResult = "";
        String result = instance.getDescripcionDelProducto();
        assertEquals(expResult, result);

    }

    @Test(expected = RuntimeException.class)
    public void testGetDescripcion4() {

        Producto instance = new Producto();
        instance.setDescripcionDelProducto("    ");
        String expResult = "    ";
        String result = instance.getDescripcionDelProducto();
        assertEquals(expResult, result);

    }

    @Test
    public void testSetDescripcion1() {

        String desc = "Producto1";
        Producto instance = new Producto();
        instance.setDescripcionDelProducto(desc);

    }

    @Test(expected = RuntimeException.class)
    public void testSetDescripcion2() {

        String desc = "";
        Producto instance = new Producto();
        instance.setDescripcionDelProducto(desc);

    }

    @Test(expected = RuntimeException.class)
    public void testSetDescripcion3() {

        String desc = "   ";
        Producto instance = new Producto();
        instance.setDescripcionDelProducto(desc);

    }

    //Peso
    @Test(expected = RuntimeException.class)
    public void testGetPesoDeProducto1() {

        Producto instance = new Producto();
        instance.setPesoDelProducto(0);
        int expResult = 0;
        int result = (int) instance.getPesoDelProducto();
        assertEquals(expResult, result);

        fail("The test case is a prototype.");
    }

    @Test(expected = RuntimeException.class)
    public void testGetPesoDeProducto2() {

        Producto instance = new Producto();
        instance.setPesoDelProducto(-1);
        int expResult = -1;
        int result = (int) instance.getPesoDelProducto();
        assertEquals(expResult, result);

    }

    @Test
    public void testGetPesoDeProducto3() {

        Producto instance = new Producto();
        instance.setPesoDelProducto(1);
        int expResult = 1;
        int result = (int) instance.getPesoDelProducto();
        assertEquals(expResult, result);

    }

    @Test
    public void testGetPesoDeProducto4() {

        Producto instance = new Producto();
        instance.setPesoDelProducto(100);
        int expResult = 100;
        int result = (int) instance.getPesoDelProducto();
        assertEquals(expResult, result);

    }

    @Test
    public void testGetPesoDeProducto5() {

        Producto instance = new Producto();
        instance.setPesoDelProducto(100000);
        int expResult = 100000;
        int result = (int) instance.getPesoDelProducto();
        assertEquals(expResult, result);

    }

    @Test(expected = RuntimeException.class)
    public void testSetPesoDeProducto1() {

        int precioDeProducto = 0;
        Producto instance = new Producto();
        instance.setPesoDelProducto(precioDeProducto);

    }

    @Test(expected = RuntimeException.class)
    public void testSetPesoDeProducto2() {

        int precioDeProducto = -8;
        Producto instance = new Producto();
        instance.setPesoDelProducto(precioDeProducto);

    }

    @Test
    public void testSetPesoDeProducto3() {

        int precioDeProducto = 1;
        Producto instance = new Producto();
        instance.setPesoDelProducto(precioDeProducto);

    }

    @Test
    public void testSetPesoDeProducto4() {

        int precioDeProducto = 100;
        Producto instance = new Producto();
        instance.setPesoDelProducto(precioDeProducto);

    }

    @Test
    public void testSetPesoDeProducto5() {

        int precioDeProducto = 10000;
        Producto instance = new Producto();
        instance.setPesoDelProducto(precioDeProducto);

    }

    //Envases Recomendados
    @Test
    public void testGetPosiblesEnvasesRecomendados1() {

        Producto instance = new Producto();
        Envase e = new Envase();
        instance.agregarEnvase(e);
        ArrayList<Envase> a = new ArrayList<>();
        a.add(e);
        ArrayList<Envase> expResult = a;
        ArrayList<Envase> result = instance.getPosiblesEnvasesRecomendados();
        assertEquals(expResult, result);

    }

    @Test
    public void testGetPosiblesEnvasesRecomendados2() {

        Producto instance = new Producto();
        Envase e = new Envase();
        instance.agregarEnvase(e);
        instance.agregarEnvase(e);

        ArrayList<Envase> a = new ArrayList<>();
        a.add(e);
        ArrayList<Envase> expResult = a;
        ArrayList<Envase> result = instance.getPosiblesEnvasesRecomendados();
        assertEquals(expResult, result);

    }

    @Test
    public void testGetPosiblesEnvasesRecomendados3() {

        Producto instance = new Producto();
        Envase e = new Envase();
        e.setIdIdentificador(1);
        Envase e2 = new Envase();
        e2.setIdIdentificador(2);

        instance.agregarEnvase(e);
        instance.agregarEnvase(e2);

        ArrayList<Envase> a = new ArrayList<>();
        a.add(e);
        a.add(e2);

        ArrayList<Envase> expResult = a;
        ArrayList<Envase> result = instance.getPosiblesEnvasesRecomendados();
        assertEquals(expResult, result);

    }

    @Test
    public void testGetPosiblesEnvasesRecomendados4() {

        Producto instance = new Producto();
        Envase e = new Envase();
        e.setIdIdentificador(1);
        Envase e2 = new Envase();
        e2.setIdIdentificador(2);
        Envase e3 = new Envase();
        e3.setIdIdentificador(3);

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

    }

    @Test
    public void testGetPosiblesEnvasesRecomendados5() {

        Producto instance = new Producto();
        Envase e = new Envase();
        e.setIdIdentificador(1);
        Envase e2 = new Envase();
        e2.setIdIdentificador(2);
        Envase e3 = new Envase();
        e3.setIdIdentificador(3);

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

    }

    @Test
    public void testGetPosiblesEnvasesRecomendados6() {

        Producto instance = new Producto();
        Envase e = new Envase();
        e.setIdIdentificador(1);
        Envase e2 = new Envase();
        e2.setIdIdentificador(2);
        Envase e3 = new Envase();
        e3.setIdIdentificador(3);

        instance.agregarEnvase(e);
        instance.agregarEnvase(e2);
        instance.agregarEnvase(e3);
        instance.agregarEnvase(e3);
        instance.agregarEnvase(e3);

        instance.eliminarEnvase(e3);
        instance.eliminarEnvase(e2);

        //Se intenta eliminar un envase que no esta
        instance.eliminarEnvase(e2);

        ArrayList<Envase> a = new ArrayList<>();
        a.add(e);
        ArrayList<Envase> expResult = a;
        ArrayList<Envase> result = instance.getPosiblesEnvasesRecomendados();
        assertEquals(expResult, result);

    }

    @Test
    public void testSetPosiblesEnvasesRecomendados1() {

        Producto instance = new Producto();
        Envase e = new Envase();
        e.setIdIdentificador(1);
        Envase e2 = new Envase();
        e2.setIdIdentificador(2);
        Envase e3 = new Envase();
        e3.setIdIdentificador(3);
        ArrayList<Envase> a = new ArrayList<>();

        a.add(e);
        a.add(e2);
        a.add(e3);
        instance.setPosiblesEnvasesRecomendados(a);

    }

    @Test
    public void testSetPosiblesEnvasesRecomendados2() {

        Producto instance = new Producto();
        Envase e = new Envase();
        e.setIdIdentificador(1);
        Envase e2 = new Envase();
        e2.setIdIdentificador(2);
        Envase e3 = new Envase();
        e3.setIdIdentificador(3);

        ArrayList<Envase> a = new ArrayList<>();
        a.add(e);
        instance.setPosiblesEnvasesRecomendados(a);

    }

    public void testSetPosiblesEnvasesRecomendados3() {

        Producto instance = new Producto();
        Envase e = new Envase();
        e.setIdIdentificador(1);
        Envase e2 = new Envase();
        e2.setIdIdentificador(2);
        Envase e3 = new Envase();
        e3.setIdIdentificador(3);

        ArrayList<Envase> a = new ArrayList<>();
        instance.setPosiblesEnvasesRecomendados(a);

    }

    //Precio
    @Test(expected = RuntimeException.class)
    public void testGetPrecioDeProducto1() {

        Producto instance = new Producto();
        instance.setPrecio(0);
        int expResult = 0;
        int result = (int) instance.getPrecio();
        assertEquals(expResult, result);

        fail("The test case is a prototype.");
    }

    @Test(expected = RuntimeException.class)
    public void testGetPrecioDeProducto2() {

        Producto instance = new Producto();
        instance.setPrecio(-1);
        int expResult = -1;
        int result = (int) instance.getPrecio();
        assertEquals(expResult, result);

    }

    @Test
    public void testGetPrecioDeProducto3() {

        Producto instance = new Producto();
        instance.setPrecio(1);
        int expResult = 1;
        int result = (int) instance.getPrecio();
        assertEquals(expResult, result);

    }

    @Test
    public void testGetPrecioDeProducto4() {

        Producto instance = new Producto();
        instance.setPrecio(100);
        int expResult = 100;
        int result = (int) instance.getPrecio();
        assertEquals(expResult, result);

    }

    @Test
    public void testGetPrecioDeProducto5() {

        Producto instance = new Producto();
        instance.setPrecio(100000);
        int expResult = 100000;
        int result = (int) instance.getPrecio();
        assertEquals(expResult, result);

    }

    @Test(expected = RuntimeException.class)
    public void testSetPrecioDeProducto1() {

        int precioDeProducto = 0;
        Producto instance = new Producto();
        instance.setPrecio(precioDeProducto);

    }

    @Test(expected = RuntimeException.class)
    public void testSetPrecioDeProducto2() {

        int precioDeProducto = -8;
        Producto instance = new Producto();
        instance.setPrecio(precioDeProducto);

    }

    @Test
    public void testSetPrecioDeProducto3() {

        int precioDeProducto = 1;
        Producto instance = new Producto();
        instance.setPrecio(precioDeProducto);

    }

    @Test
    public void testSetPrecioDeProducto4() {

        int precioDeProducto = 100;
        Producto instance = new Producto();
        instance.setPrecio(precioDeProducto);

    }

    @Test
    public void testSetPrecioDeProducto5() {

        int precioDeProducto = 10000;
        Producto instance = new Producto();
        instance.setPrecio(precioDeProducto);

    }

    //Identificador
    @Test(expected = RuntimeException.class)
    public void testGetIdentificadorDeProducto1() {

        Producto instance = new Producto();
        instance.setCodigoIdentificador(0);
        int expResult = 0;
        int result = instance.getCodigoIdentificador();
        assertEquals(expResult, result);

    }

    @Test(expected = RuntimeException.class)
    public void testGetIdentificadorDeProducto2() {

        Producto instance = new Producto();
        instance.setCodigoIdentificador(-1);
        int expResult = -1;
        int result = instance.getCodigoIdentificador();
        assertEquals(expResult, result);

    }

    @Test
    public void testGetIdentificadorDeProducto3() {

        Producto instance = new Producto();
        instance.setCodigoIdentificador(1);
        int expResult = 1;
        int result = instance.getCodigoIdentificador();
        assertEquals(expResult, result);

    }

    @Test
    public void testGetIdentificadorDeProducto4() {

        Producto instance = new Producto();
        instance.setCodigoIdentificador(100);
        int expResult = 100;
        int result = instance.getCodigoIdentificador();
        assertEquals(expResult, result);

    }

    @Test
    public void testGetIdentificadorDeProducto5() {

        Producto instance = new Producto();
        instance.setCodigoIdentificador(100000);
        int expResult = 100000;
        int result = instance.getCodigoIdentificador();
        assertEquals(expResult, result);

    }

    @Test(expected = RuntimeException.class)
    public void testSetIdentificadorDeProducto1() {

        int identificadorDeProducto = 0;
        Producto instance = new Producto();
        instance.setCodigoIdentificador(identificadorDeProducto);

    }

    @Test(expected = RuntimeException.class)
    public void testSetIdentificadorDeProducto2() {

        int identificadorDeProducto = -8;
        Producto instance = new Producto();
        instance.setCodigoIdentificador(identificadorDeProducto);

    }

    @Test
    public void testSetIdentificadorDeProducto3() {

        int identificadorDeProducto = 1;
        Producto instance = new Producto();
        instance.setCodigoIdentificador(identificadorDeProducto);

    }

    @Test
    public void testSetIdentificadorDeProducto4() {

        int identificadorDeProducto = 100;
        Producto instance = new Producto();
        instance.setCodigoIdentificador(identificadorDeProducto);

    }

    @Test
    public void testSetIdentificadorDeProducto5() {

        int identificadorDeProducto = 10000;
        Producto instance = new Producto();
        instance.setCodigoIdentificador(identificadorDeProducto);

    }

    //Lista de Materiales
    @Test
    public void testGetlistaDeMateriales1() {

        Producto instance = new Producto();
        instance.getListaDeMateriales().add(TipoMateriales.Metal);
        ArrayList<TipoMateriales> a = new ArrayList<>();
        a.add(TipoMateriales.Metal);
        ArrayList<TipoMateriales> expResult = a;
        ArrayList<TipoMateriales> result = instance.getListaDeMateriales();
        assertEquals(expResult, result);

    }

    @Test
    public void testGetListaDeMateriales2() {

        Producto instance = new Producto();
        instance.getListaDeMateriales().add(TipoMateriales.Metal);
        instance.getListaDeMateriales().add(TipoMateriales.Carton);
        ArrayList<TipoMateriales> a = new ArrayList<>();
        a.add(TipoMateriales.Metal);
        a.add(TipoMateriales.Carton);
        ArrayList<TipoMateriales> expResult = a;
        ArrayList<TipoMateriales> result = instance.getListaDeMateriales();
        assertEquals(expResult, result);

    }

    @Test
    public void testGetListaDeMateriales3() {

        Producto instance = new Producto();
        ArrayList<TipoMateriales> a = new ArrayList<>();
        ArrayList<TipoMateriales> expResult = a;
        ArrayList<TipoMateriales> result = instance.getListaDeMateriales();
        assertEquals(expResult, result);

    }

    @Test
    public void testSetListaDeMateriales1() {

        ArrayList<TipoMateriales> tiposDeMateriales = null;
        Producto instance = new Producto();
        instance.setListaDeMateriales(tiposDeMateriales);

    }

    @Test
    public void testSetListaDeMateriales2() {

        ArrayList<TipoMateriales> tiposDeMateriales = new ArrayList<>();
        Producto instance = new Producto();
        tiposDeMateriales.add(TipoMateriales.Metal);
        tiposDeMateriales.add(TipoMateriales.Plastico);
        instance.setListaDeMateriales(tiposDeMateriales);

    }

    @Test
    public void testSetListaDeMateriales3() {

        ArrayList<TipoMateriales> tiposDeMateriales = new ArrayList<>();
        Producto instance = new Producto();
        tiposDeMateriales.add(TipoMateriales.Metal);
        instance.setListaDeMateriales(tiposDeMateriales);

    }

    @Test
    public void testSetListaDeMateriales4() {

        ArrayList<TipoMateriales> tiposDeMateriales = new ArrayList<>();
        Producto instance = new Producto();
        tiposDeMateriales.add(TipoMateriales.Metal);
        tiposDeMateriales.add(TipoMateriales.Carton);
        tiposDeMateriales.add(TipoMateriales.Metal);
        instance.setListaDeMateriales(tiposDeMateriales);

    }

    @Test
    public void testAgregarMateriales1() {

        ArrayList<TipoMateriales> tiposDeMateriales = new ArrayList<>();
        Producto instance = new Producto();
        instance.agregarMateriales(TipoMateriales.Metal);
        instance.agregarMateriales(TipoMateriales.Metal);
        instance.agregarMateriales(TipoMateriales.Metal);

        ArrayList<TipoMateriales> a = new ArrayList<>();
        a.add(TipoMateriales.Metal);
        ArrayList<TipoMateriales> expResult = a;
        ArrayList<TipoMateriales> result = instance.getListaDeMateriales();
        assertEquals(expResult, result);

    }

    @Test
    public void testAgregarMateriales2() {

        ArrayList<TipoMateriales> tiposDeMateriales = new ArrayList<>();
        Producto instance = new Producto();
        instance.agregarMateriales(TipoMateriales.Metal);
        instance.agregarMateriales(TipoMateriales.Carton);
        instance.agregarMateriales(TipoMateriales.Carton);

        ArrayList<TipoMateriales> a = new ArrayList<>();
        a.add(TipoMateriales.Metal);
        a.add(TipoMateriales.Carton);
        ArrayList<TipoMateriales> expResult = a;
        ArrayList<TipoMateriales> result = instance.getListaDeMateriales();
        assertEquals(expResult, result);

    }

    @Test
    public void testAgregarMateriales3() {

        ArrayList<TipoMateriales> tiposDeMateriales = new ArrayList<>();
        Producto instance = new Producto();
        instance.agregarMateriales(TipoMateriales.Metal);
        instance.agregarMateriales(TipoMateriales.Carton);
        instance.agregarMateriales(TipoMateriales.Carton);
        instance.agregarMateriales(TipoMateriales.Papel);

        ArrayList<TipoMateriales> a = new ArrayList<>();
        a.add(TipoMateriales.Metal);
        a.add(TipoMateriales.Carton);
        a.add(TipoMateriales.Papel);

        ArrayList<TipoMateriales> expResult = a;
        ArrayList<TipoMateriales> result = instance.getListaDeMateriales();
        assertEquals(expResult, result);

    }

    @Test
    public void testEliminarMateriales1() {

        ArrayList<TipoMateriales> tiposDeMateriales = new ArrayList<>();
        Producto instance = new Producto();
        instance.agregarMateriales(TipoMateriales.Metal);
        instance.agregarMateriales(TipoMateriales.Carton);
        instance.agregarMateriales(TipoMateriales.Carton);
        instance.agregarMateriales(TipoMateriales.Papel);
        instance.eliminarMaterial(TipoMateriales.Carton);

        ArrayList<TipoMateriales> a = new ArrayList<>();
        a.add(TipoMateriales.Metal);
        a.add(TipoMateriales.Papel);

        ArrayList<TipoMateriales> expResult = a;
        ArrayList<TipoMateriales> result = instance.getListaDeMateriales();
        assertEquals(expResult, result);

    }

    @Test
    public void testEliminarMateriales2() {

        ArrayList<TipoMateriales> tiposDeMateriales = new ArrayList<>();
        Producto instance = new Producto();
        instance.agregarMateriales(TipoMateriales.Metal);
        instance.agregarMateriales(TipoMateriales.Carton);
        instance.agregarMateriales(TipoMateriales.Carton);
        instance.agregarMateriales(TipoMateriales.Papel);
        instance.eliminarMaterial(TipoMateriales.Carton);
        instance.eliminarMaterial(TipoMateriales.Metal);

        ArrayList<TipoMateriales> a = new ArrayList<>();
        a.add(TipoMateriales.Papel);

        ArrayList<TipoMateriales> expResult = a;
        ArrayList<TipoMateriales> result = instance.getListaDeMateriales();
        assertEquals(expResult, result);

    }

    @Test
    public void testEliminarMateriales3() {

        ArrayList<TipoMateriales> tiposDeMateriales = new ArrayList<>();
        Producto instance = new Producto();
        instance.agregarMateriales(TipoMateriales.Metal);
        instance.agregarMateriales(TipoMateriales.Carton);
        instance.agregarMateriales(TipoMateriales.Carton);
        instance.agregarMateriales(TipoMateriales.Papel);
        instance.agregarMateriales(TipoMateriales.Papel);
        instance.eliminarMaterial(TipoMateriales.Carton);
        instance.eliminarMaterial(TipoMateriales.Metal);
        instance.eliminarMaterial(TipoMateriales.Papel);

        ArrayList<TipoMateriales> a = new ArrayList<>();

        ArrayList<TipoMateriales> expResult = a;
        ArrayList<TipoMateriales> result = instance.getListaDeMateriales();
        assertEquals(expResult, result);

    }

    @Test
    public void testEliminarMateriales4() {

        ArrayList<TipoMateriales> tiposDeMateriales = new ArrayList<>();
        Producto instance = new Producto();
        instance.eliminarMaterial(TipoMateriales.Carton);
        instance.eliminarMaterial(TipoMateriales.Metal);
        instance.eliminarMaterial(TipoMateriales.Papel);

        ArrayList<TipoMateriales> a = new ArrayList<>();

        ArrayList<TipoMateriales> expResult = a;
        ArrayList<TipoMateriales> result = instance.getListaDeMateriales();
        assertEquals(expResult, result);

    }

    @Test
    public void testEliminarMateriales5() {

        ArrayList<TipoMateriales> tiposDeMateriales = new ArrayList<>();
        Producto instance = new Producto();
        instance.agregarMateriales(TipoMateriales.Metal);
        instance.agregarMateriales(TipoMateriales.Indefinido);
        instance.eliminarMaterial(TipoMateriales.Carton);
        instance.eliminarMaterial(TipoMateriales.Metal);
        instance.eliminarMaterial(TipoMateriales.Papel);

        ArrayList<TipoMateriales> a = new ArrayList<>();

        a.add(TipoMateriales.Indefinido);
        ArrayList<TipoMateriales> expResult = a;
        ArrayList<TipoMateriales> result = instance.getListaDeMateriales();
        assertEquals(expResult, result);

    }

    //Cantidad de vendidos
    @Test
    public void testGetcantidadVendidos1() {

        Producto instance = new Producto();
        instance.setCantidadVendidos(0);
        int expResult = 0;
        int result = (int) instance.getCantidadVendidos();
        assertEquals(expResult, result);

    }

    @Test(expected = RuntimeException.class)
    public void testGetcantidadVendidos2() {

        Producto instance = new Producto();
        instance.setCantidadVendidos(-1);
        int expResult = -1;
        int result = (int) instance.getCantidadVendidos();
        assertEquals(expResult, result);

    }

    @Test
    public void testGetcantidadVendidos3() {

        Producto instance = new Producto();
        instance.setCantidadVendidos(1);
        int expResult = 1;
        int result = (int) instance.getCantidadVendidos();
        assertEquals(expResult, result);

    }

    @Test
    public void testGetcantidadVendidos4() {

        Producto instance = new Producto();
        instance.setCantidadVendidos(100);
        int expResult = 100;
        int result = (int) instance.getCantidadVendidos();
        assertEquals(expResult, result);

    }

    @Test
    public void testGetcantidadVendidos5() {

        Producto instance = new Producto();
        instance.setCantidadVendidos(100000);
        int expResult = 100000;
        int result = (int) instance.getCantidadVendidos();
        assertEquals(expResult, result);

    }

    @Test
    public void testSetcantidadVendidos1() {

        int precioDeProducto = 0;
        Producto instance = new Producto();
        instance.setCantidadVendidos(precioDeProducto);

    }

    @Test(expected = RuntimeException.class)
    public void testSetcantidadVendidos2() {

        int precioDeProducto = -8;
        Producto instance = new Producto();
        instance.setCantidadVendidos(precioDeProducto);

    }

    @Test
    public void testSetcantidadVendidos3() {

        int precioDeProducto = 1;
        Producto instance = new Producto();
        instance.setCantidadVendidos(precioDeProducto);

    }

    @Test
    public void testSetcantidadVendidos4() {

        int precioDeProducto = 100;
        Producto instance = new Producto();
        instance.setCantidadVendidos(precioDeProducto);

    }

    @Test
    public void testSetcantidadVendidos5() {

        int precioDeProducto = 10000;
        Producto instance = new Producto();
        instance.setCantidadVendidos(precioDeProducto);

    }

    //Equals
    @Test
    public void equals1() {
        Producto instance = new Producto();
        instance.setCodigoIdentificador(100000);
        Producto e = new Producto();
        e.setCodigoIdentificador(100000);
        boolean result = instance.equals(e);
        assertEquals(true, result);
    }

    @Test
    public void equals2() {
        Producto instance = new Producto();
        instance.setCodigoIdentificador(100000);
        Venta e = new Venta();
        boolean result = instance.equals(e);
        assertEquals(false, result);
    }
}
