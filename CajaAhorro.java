public class CajaAhorro
{
    Presupuesto presupuesto;
    private int saldo;
    private int caja;
    public CajaAhorro()
    {
        presupuesto = new Presupuesto();
    }
    
    public int saldo(int saldo){
        this.saldo = saldo;
        return saldo;
    }
    
    public void caja(){
        caja = saldo;
        caja += saldo;
    }
}
