

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class testArchivo.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class TestArchivo
{ private Archivo archivo; 
    /**
     * Default constructor for test class ReporteTest
     */
    public TestArchivo()
    {
        archivo = new Archivo();
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
    public void crearArchivo(){
        boolean creado = archivo.crearArchivo("pruebas5");
        assertEquals(true, creado);
    }
    
        @Test
    public void archivoYaCreado(){
        boolean creado = archivo.crearArchivo("pruebas1");
        assertEquals(false, creado);
    }
    
    @Test
    public void escrito() throws java.io.IOException{
        String escribir = ("Se ha escrito en el archivo");
        String escrito = archivo.escribir("pruebas3", escribir);
        assertEquals("Se ha escrito en el archivo", escrito);
    }
    
    @Test
    public void leer() throws java.io.IOException{
        String contenido = ("Se ha escrito en el archivo");
        String leido = archivo.leerArchivo("pruebas3");
        assertEquals(contenido, leido);
    }
}
