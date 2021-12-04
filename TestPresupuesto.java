
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;

public class TestPresupuesto
{
    Presupuesto presupuesto;
    public TestPresupuesto(){
        presupuesto = new Presupuesto(); 
    }
    @Test
    public void agregarPresupuesto(){
        //Presupuesto presupuesto = new Presupuesto(); 
        ArrayList<Categoria>listaCat = new ArrayList("Alimentacion", 1500, 1200);
    }
}
