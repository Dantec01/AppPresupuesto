

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;

/**
 * The test class TestCajaAhorro.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class TestCajaAhorro
{
    private Presupuesto presupuesto;
    private CajaAhorro cajaAhorro;
    private int saldo = 0;
    public TestCajaAhorro()
    {
        presupuesto = new Presupuesto(); 
        cajaAhorro = new CajaAhorro();
        presupuesto.crearCategoria("Alimentacion", 1500, 1200);
        presupuesto.crearCategoria("Servicios", 300, 250);
        presupuesto.crearCategoria("Transporte", 300, 250);
        presupuesto.crearCategoria("Entretenimiento", 200, 150);
        presupuesto.crearCategoria("Alquiler", 1000, 1000);
        presupuesto.crearCategoria("Internet", 200, 190);
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp()
    {

    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @AfterEach
    public void tearDown()
    {
    }
    
    @Test 
    public void cajaLlena(){
        saldo = presupuesto.calcularSaldo();
        cajaAhorro.setSaldo(saldo);
        cajaAhorro.guardarCaja();
        boolean lleno = cajaAhorro.estadoCaja();
        assertTrue(lleno);
    }
    
    @Test 
    public void cajaVacia(){
        cajaAhorro.setSaldo(0);
        cajaAhorro.guardarCaja();
        boolean lleno = cajaAhorro.estadoCaja();
        assertFalse(lleno);
    }
    
    @Test
    public void calcularSaldo(){
        ArrayList<Categoria> lista = new ArrayList<Categoria>();
        saldo = presupuesto.calcularSaldo();
        assertEquals(460, saldo);
    }
}
