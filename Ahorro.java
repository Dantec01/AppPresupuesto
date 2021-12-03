
public class Ahorro extends App
{
    int saldoA = 0;
    
    public Ahorro(int saldo){
        
    }
    public int ahorro(){
        int aux = super.getSaldo();
        int saldoAhorro = 0;
        if(aux > 0){
            saldoAhorro += aux;
        }else{
            System.out.println("Saldo de ahorro insuficiente");
        }
        return saldoAhorro;
    }
}
