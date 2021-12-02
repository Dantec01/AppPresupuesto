import java.io.*;

public class Calculadora
{
    //variables y metodos de prueba
    CuentaAhorro ahorro = new CuentaAhorro();
    private double restaTotal = 1000;
    private double ahorros;    
    
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
    
    public void calcularCategoria(ArrayList<Categoria> Cat){
        int numero1 = listaCat.get(0).getIngreso();
        //ArrayList<Categoria>listaCat = 0; 
    }
    public void calcularCategoria(){
        for (int i = 0; i<listaCat.size();i++){
            System.out.println(listaCat.get(i)); 
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
