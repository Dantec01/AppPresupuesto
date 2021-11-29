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
    
    //-----------------------------------
    
    /*public double Calculadora(){
        
    }
    
    public double calcularCategoria(){
        
    }
    
    public double calcularTotalGastos(){
        
    }*/

}
