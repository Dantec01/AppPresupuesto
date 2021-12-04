import java.io.*;
import java.util.*;


public class Archivo
{
    private File fichero = new File (ruta());
    
    public Archivo(){

    }

    public void archivoCrear(){
        try {
              if (fichero.createNewFile()){
                System.out.println("El fichero se ha creado correctamente");
                
            }else{
                System.out.println("No ha podido ser creado el fichero");}
             } catch (IOException ioe) {
              ioe.printStackTrace();
        }
    }
    
    public static String ruta(){
        
        String ruta = System.getProperty("user.home") + "/desktop/reporte.txt";;
        return ruta;
    }
}