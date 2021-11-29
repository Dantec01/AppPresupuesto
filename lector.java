import java.io.*;
public class lector
{
    Texto1 texto = new Texto1();
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
