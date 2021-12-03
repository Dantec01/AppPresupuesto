import java.util.ArrayList;

public class Calculadora
{
    private int gastoTotal;
    private int saldo;
    public Calculadora(){
        gastoTotal = 0;
        saldo = 0;
    }
    public int getGastoTotal(){
        return gastoTotal;
    }
    public void setGastoTotal(int gasto){
        gastoTotal = gasto;
    }
    public int getSaldo(){
        return saldo;
    }
    public void setSaldo(int saldo){
        this.saldo = saldo;
    }
    public int gastoPorCategoria(int num1, int num2){
        int res = num1 - num2;
        return res;
    }
    public int calcularSaldo(int valor1, int valor2){
        int res = valor1 - valor2;
        return res;
    }
}