
public class Categoria{
    private String nombre;
    private int ingreso;
    private int gasto;
    
    public Categoria(String nombre, int ingreso, int gasto){
        this.nombre = nombre;
        this.ingreso = ingreso;
        this.gasto = gasto;
    }
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public int getIngreso(){
        return ingreso;
    }
    public void setIngreso(int ingreso){
        this.ingreso = ingreso;
    }
    public int getGasto(){
        return gasto;
    }
    public void setGasto(int gasto){
        this.gasto = gasto;
    }
    @Override
    public String toString(){
        return nombre + "\t" + ingreso + "\t" + gasto;
    }
}