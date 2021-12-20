import java.util.ArrayList;

public class Categoria{
    private String nombre;
    private int ingreso;
    private int gasto;
    static ArrayList<Categoria>categorias = new ArrayList();
    public Categoria(String nombre, int ingreso, int gasto){
        this.nombre = nombre;
        this.ingreso = ingreso;
        this.gasto = gasto;
        
    }
    public Categoria(){
        addCategoria2();
    }
    public void addCategoria2(){   //para pruebas solamente
        categorias.add(new Categoria("Alimentacion", 1500, 1200));
        categorias.add(new Categoria("Servicios", 300, 250));
        categorias.add(new Categoria("Transporte", 300, 250));
        categorias.add(new Categoria("Entretenimiento", 200, 150));
        categorias.add(new Categoria("Alquiler", 1000, 1000));
        categorias.add(new Categoria("Internet", 200, 190));
        categorias.add(new Categoria("Alquiler", 1000, 1000));
    }
    public ArrayList<Categoria>getcategorias(){
        return categorias;
    }
    /*public void llamar(ArrayList<Categoria>categorias){
        return categorias;
    }*/
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