
public class Categoria
{
    private String categoria;
    private int presupuestoIndividual;
    private int gastos = 0;
    private int gastoCat;   
    public Categoria(){
        categoria = "Alimentación";
        presupuestoIndividual = 500;
        gastos = 300;
        calcularGastoIndividual();
    }
    public Categoria(String nombre){
        categoria = nombre;
    }
    public void setPresupuestoIndividual(int presu){
        presupuestoIndividual = presu;
        calcularGastoIndividual();
    }
    public void setGastoIndividual(int gas){
        gastos = gas;
        calcularGastoIndividual();
    }
    public int calcularGastoIndividual(){
        gastoCat = presupuestoIndividual - gastos;
        return gastoCat;
    }
}
