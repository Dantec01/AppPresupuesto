import java.io.*;
public class lector
{
    Texto texto = new Texto();
    public void lector() throws IOException{
        String contenido;
        FileReader file = new FileReader(texto.ruta());
        BufferedReader buffer = new BufferedReader(file);
        while((contenido = buffer.readLine())!= null){
            System.out.println(contenido);
        }
        file.close();
        buffer.close();
    }
}
