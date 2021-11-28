import java.util.*;
import java.util.ArrayList;

public class App{
    public String nombreApp;
    private double presupuestoMensual;
    private ArrayList<Categoria>categoria = new ArrayList();
    private double SaldoAhorro;
    
    private static Scanner leer = new Scanner(System.in);
    private static int opcion;
    private static Usuario nuevoUsuario = new Usuario();
    private static String nombreUsuario = "";
    private static String edadUsuario = "";
    private static int edadUsu = 0;
    private static String nroCarnetUsu = "";
    private static boolean nroCarnetValido = false;
    private static Cuenta nuevaCuenta;
    public void main(String [] Args){
        //1. Crear el usuario, llamar al metodo introducirUsuario
        if(introducirUsuario()){
            //Creamos cuenta
            nuevaCuenta = new Cuenta();
        }
    }
    
        private static boolean introducirUsuario(){
        //pidiendo nombre
        do{
            System.out.println("Introducir nombre de usuario:");
            nombreUsuario = leer.nextLine();
        }while(nombreUsuario.isEmpty());
        //pidiendo edad
        do{
            System.out.println("Introducir edad de usuario:");
            edadUsuario = leer.nextLine();
            try{
                edadUsu = Integer.parseInt(edadUsuario);
            }
            catch(Exception e){
                System.out.println("Debes introducir un numero mayor a 0 para la edad");
                }
        }while(edadUsuario.isEmpty()|| edadUsu>=10);
        //pidiendo numero de carnet
        do{
            System.out.println("Introducir numero de carnet de usuario:");
            nroCarnetUsu = leer.nextLine();
            if (nuevoUsuario.setNroCarnett(nroCarnetUsu)==false){
                nroCarnetValido = false;
                System.out.println("Numero de carnet no valido");
            }else{ 
                nroCarnetValido = true;
            }
        }while(nroCarnetUsu.isEmpty()|| nroCarnetValido==false);
        nuevoUsuario.setNombre(nombreUsuario);
        nuevoUsuario.setEdad(edadUsu);
        return true;
    }
    
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
