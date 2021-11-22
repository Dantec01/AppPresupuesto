import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TextoIngles
{  
    public File fichero = new File (ruta());
    public void Crear(){
        try {
              if (fichero.createNewFile())
                System.out.println("El fichero se ha creado correctamente");
              else
                System.out.println("No ha podido ser creado el fichero");
             } catch (IOException ioe) {
              ioe.printStackTrace();
        }
    }
    
    public String ruta(){
        
        String ruta = System.getProperty("user.home") + "/desktop/prueba2.txt";;
        return ruta;
    }
    
    /*public void crearHora(){
        Date date = new Date() ;
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss") ;
        File file = new File(dateFormat.format(date) + ".txt") ;


    }*/
}
