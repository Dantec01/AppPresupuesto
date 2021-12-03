import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;

public class escritor
{
    Texto1 texto = new Texto1();
    App categoria = new App();
    private ArrayList <Categoria> categorias = new ArrayList();
    private File fichero = new File (ruta());
    
    
    public static void escritor(){}
    

    public void Crear(){
        try {
              if (fichero.createNewFile()){
                System.out.println("El fichero se ha creado correctamente");
                
            }else{
                System.out.println("No ha podido ser creado el fichero");}
             } catch (IOException ioe) {
              ioe.printStackTrace();
        }
    }
    
    public void escribir() throws IOException {
        FileWriter fichero = new FileWriter(texto.ruta(),true);
        
        categorias = categoria.getCategoria();
        
        //fichero.write();
        //fichero.close();


    }
    
        public String ruta(){
        
        String ruta = System.getProperty("user.home") + "/desktop/reporte.txt";;
        return ruta;
    }
}
