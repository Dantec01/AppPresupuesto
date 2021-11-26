
public class Gasto extends Dinero {
 
    public Gasto(double gasto, String descripcion) {
        this.dinero=gasto;
        this.descripcion=descripcion;
    }
 
    @Override
    public String toString() {
        return "Gasto en concepto de " + this.descripcion
                + ". Importe total: " + this.dinero ;
    }  
}
