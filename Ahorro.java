
public class Ahorro
{
    // instance variables - replace the example below with your own
    private int saldoA;
    private Presupuesto cuentaAhorro;
    
    public Ahorro(){
        cuentaAhorro = new Presupuesto();
        saldoA = 0;
    }

    public void sampleMethod(){
        saldoA = cuentaAhorro.getSaldo();
        
    }
}
