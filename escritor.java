import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;

public class escritor
{
    App app = new App();
    private  String[] receptorReporte;
    private File fichero = new File (ruta());
    
    
    public static void escritor(){
        
    }
    

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
        FileWriter fichero = new FileWriter(escritor.ruta(),true);
        receptorReporte = app.getReporte();
        for(int i = 0; i < receptorReporte.length; i++){
            fichero.write("\n" + receptorReporte[i]);
            //fichero.close();

        }
    }
    
    public static String ruta(){
        
        String ruta = System.getProperty("user.home") + "/desktop/reporte.txt";;
        return ruta;
    }
}
