
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestCategoria
{
    Categoria categoria;
    public TestCategoria()
    {
        categoria = new Categoria("Alimentacion", 1500, 1200);
    }
    @Test
    public void agregarCategoria(){
        assertEquals("Alimentacion", categoria.getNombre());
        assertEquals(1500, categoria.getIngreso());
        assertEquals(1200, categoria.getGasto());
    }
}
