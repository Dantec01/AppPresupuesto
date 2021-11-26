
public class Categoria
{
    private String categoria;
    private double ingresoIndividual;
    private double gasto = 0;
    private double gastoCat;   
    public Categoria(){
        categoria = "Alimentación";
        ingresoIndividual = 500;
        gasto = 300;
        calcularGastoIndividual();
    }
    public Categoria(String nombre, double ingreso, double gastoI){
        categoria = nombre;
        ingresoIndividual = ingreso;
        gasto = gastoI;
        calcularGastoIndividual();
    }
    public void setPresupuestoIndividual(int presu){
        ingresoIndividual = presu;
        calcularGastoIndividual();
    }
    public void setGastoIndividual(int gas){
        gasto = gas;
        calcularGastoIndividual();
    }
    public double calcularGastoIndividual(){
        gastoCat = ingresoIndividual - gasto;
        return gastoCat;
    }
    
}
