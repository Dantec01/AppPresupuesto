
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;

public class TestGastos
{
    Presupuesto presupuesto;
    //ArrayList<Categoria> lista = new ArrayList<Categoria>();
    //private ArrayList<Categoria> listaCat;
    //Categoria categoria;
    public TestGastos(){
        presupuesto = new Presupuesto(); 
        //listaCat = new ArrayList();
    }
    @Test
    public void testCalcularGastoTotal(){
        ArrayList<Categoria> listaCat = new ArrayList();

        presupuesto.crearCategoria("Alimentacion", 1500, 1200);
        presupuesto.crearCategoria("Servicios", 300, 250);
        presupuesto.crearCategoria("Transporte", 300, 250);
        presupuesto.crearCategoria("Entretenimiento", 200, 150);
        presupuesto.crearCategoria("Alquiler", 1000, 1000);
        presupuesto.crearCategoria("Internet", 200, 190);
        
        presupuesto.calcularGastoTotal();
        
        assertEquals(3040, presupuesto.gastoTotal());
    }
    @Test
    public void calcularSaldo(){
        ArrayList<Categoria> listaCat = new ArrayList();
        
        presupuesto.crearCategoria("Alimentacion", 1500, 1200);
        presupuesto.crearCategoria("Servicios", 300, 250);
        presupuesto.crearCategoria("Transporte", 300, 250);
        presupuesto.crearCategoria("Entretenimiento", 200, 150);
        presupuesto.crearCategoria("Alquiler", 1000, 1000);
        presupuesto.crearCategoria("Internet", 200, 190);
        
        assertEquals(460, presupuesto.calcularSaldo());
        
    }
    @Test
    public void Ahorro(){
        ArrayList<Categoria> listaCat = new ArrayList();
        
        int saldoAhorro = 0;
        int saldo = 460;
        
        assertEquals(460, presupuesto.ahorro());
    }
    
    @Test
    public void Ahorro2(){
        try{
            //int saldo = 500;
            fail("Saldo insuficiente");
        }
        catch (Exception e){
            // Ok, the SUT works as expected
            int saldo = 500;
        }
    }
}
