
public class CuentaAhorro
{
    Calculadora calc = new Calculadora();
    private double sumaDinero;
    
    public CuentaAhorro(){
    
    }
    
    public void Guardar(){
        sumaDinero = sumaDinero+calc.getGuardar();
    }
    public double getRetirar(){
        if(sumaDinero > 0){
            return sumaDinero;
        }
        else{
            return 0;
        }
    }
}