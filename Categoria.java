
public class Categoria
{
    private String categoria;
    private int ingresoIndividual;
    private int gasto = 0;
    private int gastoCat;   
    public Categoria(){
        categoria = "Alimentación";
        ingresoIndividual = 500;
        gasto = 300;
        calcularGastoIndividual();
    }
    public Categoria(String nombre){
        categoria = nombre;
    }
    public void setPresupuestoIndividual(int presu){
        ingresoIndividual = presu;
        calcularGastoIndividual();
    }
    public void setGastoIndividual(int gas){
        gasto = gas;
        calcularGastoIndividual();
    }
    public int calcularGastoIndividual(){
        gastoCat = ingresoIndividual - gasto;
        return gastoCat;
    }
}
