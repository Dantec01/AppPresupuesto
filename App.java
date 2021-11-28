import java.util.ArrayList;

public class App{
    public String nombreApp;
    private double presupuestoMensual;
    private ArrayList<Categoria>categoria = new ArrayList();
    private double SaldoAhorro;
    
    public App(double presupuesto){         //Constructor para ingresar presupuesto
        presupuestoMensual = presupuesto;
    }
    public App(){       //Constructor con 3500 de presupuesto
        presupuestoMensual = 3500;
    }
    public void crearCategoria(String a, int b, int c){  //llama a la clase categoria y le pasa parametros
        //Categoria cateria = new Caterogia()
        categoria.add(new Categoria(a,b,c));
        
        for (Categoria e: categoria){
            
            System.out.println(e.mostrarDatos());
        }
    }
    public void addCategoria(){    //añade categorias para hacer pruebas
        System.out.println("Categoria    " + "Presupuesto  " + "gasto" + "\n" + "\t");
        categoria.add(new Categoria("Alimentacion", 1000, 700));
        categoria.add(new Categoria("Servicios", 300, 150));
        categoria.add(new Categoria("Transporte", 300, 250));
        categoria.add(new Categoria("Entreteniento", 300, 200));
        categoria.add(new Categoria("Alquiler", 1000, 1000));
        categoria.add(new Categoria("Internet", 200, 190));
        for (Categoria e: categoria){
            System.out.println(e.mostrarDatos());
        }
    }
    public double getPresupuestoMensual(){
        return presupuestoMensual;
    }
    public void setPresupuestoMensual(double presupuesto){
        presupuestoMensual = presupuesto;
    }
    public void SetcuentaAhorro(double montoAhorro){   //crea categoria ahorro
        SaldoAhorro = montoAhorro;
    }
    public String reporte(){  //llama la clase para g0enerar el reporte si fuera necesario
        String mensaje = "Reporte generado con exito";
        return mensaje;
    }
    
    
}
