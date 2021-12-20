import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestGastoExcedido
{
    Presupuesto presupuesto;
    public TestGastoExcedido(){
        presupuesto = new Presupuesto(3500);
    }
    @Test
    public void testGastoExcedido1(){
        presupuesto.setGastoTotal(3400);
        
        assertEquals("Correcto", presupuesto.gastoExcedido());
    }
    @Test
    public void testGastoExcedido2(){
        presupuesto.setGastoTotal(3600);
                
        assertEquals("Presupuesto Excedido con: 100 bs.", presupuesto.gastoExcedido());
    }
}
