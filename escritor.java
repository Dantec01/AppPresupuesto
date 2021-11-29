import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;

public class escritor
{
    Texto1 texto = new Texto1();
    App categoria = new App();
    private ArrayList <Categoria> categorias = new ArrayList();
    
    public static void escritor(){}
    
    
    public void escribir() throws IOException {
        FileWriter fichero = new FileWriter(texto.ruta(),true);
        
        categorias = categoria.getCategoria();
        
        //fichero.write();
        //fichero.close();


    }
}
