
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.*;
import java.util.List;

import java.util.ArrayList;

public class TestPresupuesto
{
    Presupuesto presupuesto;
    //ArrayList<Categoria> lista = new ArrayList<Categoria>();
    public TestPresupuesto(){
        presupuesto = new Presupuesto(); 
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
    public void modificarValor(){
        
    }
}
