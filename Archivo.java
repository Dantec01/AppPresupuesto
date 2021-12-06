import java.io.*;
import java.util.*;


public class Archivo
{
    private File fichero = new File (ruta());
    private String nombre;
    private boolean escrito = false;
    String contenido;
    public Archivo(){

    }

    public boolean crearArchivo(String nombre){
        boolean creado = false;
        this.nombre = nombre;
        try {
            File fichero = new File (System.getProperty("user.home") + "/desktop/"+ nombre +".txt");
              if (fichero.createNewFile()){
                System.out.println("El fichero se ha creado correctamente");
                creado = true;
            }else{
                System.out.println("No ha podido ser creado el fichero");
                creado = false;
            }
            }catch (IOException ioe) {
              ioe.printStackTrace();
        }
        return creado;
    }
    
    public String escribir(String nombre, String contenido) throws IOException {
        this.nombre = nombre;
        String respuesta = "";
        try {
            FileWriter fichero = new FileWriter(System.getProperty("user.home") + "/desktop/"+ nombre +".txt");
            if (escrito == false){
                fichero.write(contenido);
                respuesta = ("Se ha escrito en el archivo");
                fichero.close();
                escrito = true;
            }else{
                respuesta = ("No se ha escrito en el archivo");
                escrito = false;
            }
            }catch (IOException ioe) {
              ioe.printStackTrace();
        }
        return respuesta;
    }
    
    public String leerArchivo(String nombre) throws IOException{
        this.nombre = nombre;
        String respuesta="";
        String bufferReader;
        FileReader file = new FileReader(System.getProperty("user.home") + "/desktop/"+ nombre +".txt");
        BufferedReader buffer = new BufferedReader(file);
        while((bufferReader = buffer.readLine())!= null){
                respuesta += bufferReader;
        }
        return respuesta;
    }
    
    public String ruta(){
        this.nombre = nombre;
        String ruta = System.getProperty("user.home") + "/desktop/"+ nombre +".txt";;
        return ruta;
    }
    public static String ruta1(){
        
        String ruta = System.getProperty("user.home") + "/desktop/reporte.txt";;
        return ruta;
    }
}