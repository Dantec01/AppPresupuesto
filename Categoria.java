
public class Categoria
{
    private String categoria;
    private double ingresoCategoria;
    private double gastoCategoria; 
    private double gastoTotales = 0;
    public Categoria(){
        categoria = "Alimentación";
        ingresoCategoria = 500;
        gastoCategoria = 300;
        calcularGastoCategoria();
    }
    public Categoria(String nombre, double ingreso, double gastoCat){
        categoria = nombre;
        ingresoCategoria = ingreso;
        gastoCategoria = gastoCat;
        calcularGastoCategoria();
    }
    public void setPresupuestoIndividual(int presu){
        ingresoCategoria = presu;
        calcularGastoCategoria();
    }
    public void setGastoCategoria(int gas){
        gastoCategoria = gas;
        calcularGastoCategoria();
    }
    public double calcularGastoCategoria(){
        double resta= ingresoCategoria - gastoCategoria;
        return resta;
    }
    
}
