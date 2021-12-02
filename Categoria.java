
public class Categoria
{
    private String categoria;
    private double ingresoCategoria;
    private double gastoCategoria; 
    private double gastoTotal = 0;
    
    public Categoria(){             //constructor temporal para pruebas
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
    public void setIngresoCategoria(int presuesto){
        ingresoCategoria = presuesto;
        calcularGastoCategoria();
    }
    public void setGastoCategoria(int gasto){
        gastoCategoria = gasto;
        calcularGastoCategoria();
    }
    public double calcularGastoCategoria(){
        double resta= ingresoCategoria - gastoCategoria;
        return resta;
    }
    public String mostrarDatos(){
        return categoria + "\t" + ingresoCategoria + "\t" + gastoCategoria;
    }
}
