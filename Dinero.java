public abstract class Dinero{
    protected double dinero;
    protected String descripcion;
    public void setDinero(double dinero){
        this.dinero = dinero;
    }
     
    public void setDescripcion(String descripcion){
        this.descripcion = descripcion;
    }
 
    public double getDinero(){
        return dinero;
    }
 
    public String getDescripcion(){
        return descripcion;
    }
}