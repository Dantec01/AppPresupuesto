import java.io.*;
import java.util.ArrayList;

public class Calculadora
{
    //variables y metodos de prueba
    CuentaAhorro ahorro = new CuentaAhorro();
    App categoria = new App();
    private double restaTotal = 1000;
    private double ahorros;  
    private ArrayList <Categoria> categorias = new ArrayList();
    /*
    public double getGuardar(){
        if(restaTotal > 0){
            return restaTotal;
        }
        else{
            return 0;
        }
    

    }
    
    public void retirar(){
        ahorros = ahorro.getRetirar();
    }
    */
    /*public void calcularCategoria(ArrayList<Categoria> Cat){
        int numero1 = listaCat.get(0).getIngreso();
        //ArrayList<Categoria>listaCat = 0; 
    }*/
    
    public void obtenerCategoria(){
        categorias = categoria.getCategoria();
    }
    public void calcularCategoria(){
        for (int i = 0; i<categorias.size();i++){
            System.out.println(categorias.get(i)); 
        }
    }
    
    
    //-----------------------------------
    
    /*public double Calculadora(){
        
    }
    
    public double calcularCategoria(){
        
    }
    
    public double calcularTotalGastos(){
        
    }*/

}
