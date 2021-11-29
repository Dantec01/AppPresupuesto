public class Ingreso extends Dinero {
 
    public Ingreso(double ingreso, String descripcion) {
        this.dinero=ingreso;
        this.descripcion=descripcion;
    }
 
    
    public String toString() {
        return "Ingreso a su favor en concepto de " + this.descripcion
                + ". Importe total: " + this.dinero ;
    } 
}