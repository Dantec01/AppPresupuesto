import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

/**
 * The test class MOck.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class Mock
{

    /**
     * Default constructor for test class MOck
     */
    public Mock()
    {
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
    public void GuardarCaja(){
        CajaAhorrativa cajaMock = mock(CajaAhorrativa.class);
        when(cajaMock.guardarSaldo(760)).thenReturn("Se guardo el dinero");
        assertEquals("Se guardo el dinero", cajaMock.guardarSaldo(760));
    }
}
