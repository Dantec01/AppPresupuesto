public class App{
    public String nombreApp;
    private double presupuestoMensual;
    private double SaldoAhorro;
    public App(double presupuesto){
        presupuestoMensual = presupuesto;
    }
    
    public void crearCategoria(){  //llama a la clase categoria y le pasa parametros
        //Categoria cateria = new Caterogia()
    }
    public void cuentaAhorro(double montoAhorro){   //crea categoria ahorro
        SaldoAhorro = montoAhorro;
    }
    public String reporte(){  //llama la clase para generar el reporte si fuera necesario
        String mensaje = "Reporte generado con exito";
        return mensaje;
    }
}
