
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import static java.util.Arrays.asList;

public class TestPresupuesto
{
    Presupuesto presupuesto;
    public TestPresupuesto(){
        presupuesto = new Presupuesto(); 
    }
    @Test
    public void agregarCategoria(){
        //Presupuesto presupuesto = new Presupuesto(); 
        listaCat.add(new Categoria("Alimentacion", 1500, 1200));
        
        assertArrayEquals(Categoria);
    }
}
