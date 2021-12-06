public class CajaAhorro
{
    private int saldoRecibido;
    private int caja = 0;
    private boolean llena;
    public CajaAhorro()
    {
    }
    
    public void setSaldo(int saldo){
        saldoRecibido = saldo;
    }
    
    public void guardarCaja(){
        caja += saldoRecibido;
    }
    
    public boolean estadoCaja(){
        llena = false;
        if(caja > 0){
            llena = true;
        }
        return llena;
    }
}
