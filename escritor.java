import java.io.*;
import java.util.Scanner;
public class escritor
{
    Texto texto = new Texto();
    Scanner lector = new Scanner(System.in);
    public void escritor() throws IOException{
        FileWriter fichero = new FileWriter(texto.ruta(),true);
        fichero.write("\n"+lector.nextLine());
        fichero.close();
        /*if(!(texto.getFichero()).exists()){
         
        }
        else{
        }*/

    }
}
