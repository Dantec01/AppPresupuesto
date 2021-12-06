
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.List;
import java.util.ArrayList;

public class TestPresupuesto
{
    Presupuesto presupuesto;
    //ArrayList<Categoria> lista = new ArrayList<Categoria>();
    //private ArrayList<Categoria> listaCat;
    //Categoria categoria;
    public TestPresupuesto(){
        presupuesto = new Presupuesto(); 
        //listaCat = new ArrayList();
    }
    @Test
    public void testEmptyArrayList() 
    {
        ArrayList<Categoria> lista = new ArrayList<Categoria>();
        assertEquals (lista.size(),0);
    }
    @Test
    public void agregarCategoria(){
        Categoria categoria1 = new Categoria ("Alimentacion", 1500, 1200);
        ArrayList<Categoria> lista = new ArrayList<Categoria>();
        lista.add(categoria1);
        
        //lista.add(new Categoria("Alimentacion", 1500, 1200));
        
        //assertEquals((lista.get(0)),"Alimentacion", 1500, 1200);
        //assertArrayEquals(lista.get(0), "Alimentacion", 1500, 1200);
        //assertEquals(categoria1,presupuesto.getCategoria().get(0));
        assertEquals(categoria1,lista.get(0));

    }
    @Test
    public void modificarIngreso(){
        presupuesto.crearCategoria("Alimentacion", 1500, 1200);
        presupuesto.setNuevoIngreso(0, 1300);
        int num = presupuesto.getIngreso(0);
        assertEquals(1300, num);
    }
    @Test
    public void borrarElemen(){
        //Categoria categoria2 = new Categoria ("Alimentacion", 1500, 1200);
        ArrayList<Categoria> listaCat = new ArrayList<Categoria>();
        //lista.add(categoria2);
        //lista.clear();
        //presupuesto.crearCategoria("Alimentacion", 1500, 1200);
        listaCat.add(new Categoria("Alimentacion", 1500, 1200));
        presupuesto.borrarElementoArray(0);
        //assertEquals (lista.size(),1);
        //.remove(0);
       
        assertEquals(1, listaCat.size());
    }
    
    @Test
    public void testCalcularGastoTotal(){
        //ArrayList<Categoria>lista = new ArrayList<Categoria>();
        //Categoria categoria1 = new Categoria ("Alimentacion", 1500, 1200);
        ArrayList<Categoria> lista = new ArrayList<Categoria>();
        //lista.add(categoria1);
        
        presupuesto.crearCategoria("Alimentacion", 1500, 1200);
        presupuesto.crearCategoria("Servicios", 300, 250);
        presupuesto.crearCategoria("Transporte", 300, 250);
        presupuesto.crearCategoria("Entretenimiento", 200, 150);
        presupuesto.crearCategoria("Alquiler", 1000, 1000);
        presupuesto.crearCategoria("Internet", 200, 190);
        
        //presupuesto.addCategoria();
        
        presupuesto.calcularGastoTotal();
        
        assertEquals(3040, presupuesto.gastoTotal());
    }
}
