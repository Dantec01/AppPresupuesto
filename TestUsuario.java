import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestUsuario
{
    
    public TestUsuario()
    {
    }

    @BeforeEach
    public void setUp()
    {
    }

    @AfterEach
    public void tearDown()
    {
    }
    
    @Test
    public void usuarioValido(){
        Usuario nuevoUsuario;
        nuevoUsuario = new Usuario();
        nuevoUsuario.setUsuario("Tomas");
        assertNotEquals("", nuevoUsuario.getUsuario());
    }
    
    @Test
    public void introducirEmail(){
        Usuario nuevoUsuario;
        nuevoUsuario = new Usuario();
        boolean valido = nuevoUsuario.emailValido();
        assertEquals(true, valido);
    }
}
