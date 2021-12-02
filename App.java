import java.util.*;
import java.util.ArrayList;

public class App{
    public String nombreApp;
    private double presupuestoMensual;
    private ArrayList<Categoria>categoria;
    
    private static Scanner leer = new Scanner(System.in);
    private static int opcion;
    private static Usuario nuevoUsuario = new Usuario();
    private static String nombreUsuario = "";
    private static String emailAddress = "";
    private static boolean emailAddressValido = false;
    private static Cuenta nuevaCuenta;
    
    public static void main(String [] args){
        //1. Crear el usuario, llamar al metodo introducirUsuario
        introducirUsuario();
        /*if(introducirUsuario()){
            //Creamos cuenta
            nuevaCuenta = new Cuenta();
        }*/
    }
    
    private static boolean introducirUsuario(){
        //pidiendo nombre
        do{
            System.out.println("Introducir nombre de usuario:");
            nombreUsuario = leer.nextLine();
        }while(nombreUsuario.isEmpty());
        //pidiendo direccion de correo electronico
        do{
            System.out.println("Introducir correo electronico de usuario:");
            emailAddress = leer.nextLine();
            if (nuevoUsuario.setEmailAddres(emailAddress)==false){
                emailAddressValido = false;
                System.out.println("La direccion de correo electronico no es valido");
            }else{ 
                emailAddressValido = true;
            }
        }while(emailAddress.isEmpty()|| emailAddressValido==false);
        nuevoUsuario.setNombre(nombreUsuario);
        return true;
        
    }
    
    public App(double presupuesto){//Constructor para ingresar presupuesto
        presupuestoMensual = presupuesto;
    }
    public App(){//Constructor con 3500 de presupuesto
        presupuestoMensual = 3500;
    }
    public void crearCategoria(String a, int b, int c){  //llama a la clase categoria y le pasa parametros
        categoria.add(new Categoria(a,b,c));
        //if ()
        for (Categoria e: categoria){
            
            System.out.println(e.mostrarDatos());
        }
    }
    public void addCategoria(){//a�ade categorias para hacer pruebas
        categoria = new ArrayList();
        categoria.add(new Categoria("Alimentacion", 1000, 700));
        categoria.add(new Categoria("Servicios", 300, 150));
        categoria.add(new Categoria("Transporte", 300, 250));
        categoria.add(new Categoria("Entreteniento", 300, 200));
        categoria.add(new Categoria("Alquiler", 1000, 1000));
        categoria.add(new Categoria("Internet", 200, 190));
        //calc.obtenerCategoria(categoria);

    }
    

    public double getPresupuestoMensual(){
        return presupuestoMensual;
    }
    
    public void setPresupuestoMensual(double presupuesto){
        presupuestoMensual = presupuesto;
    }

    /*Ethan creando reporte*/
    public String reporte(){  //llama la clase para g0enerar el reporte si fuera necesario
        String mensaje = "Reporte generado con exito";
        return mensaje;
    }
    
    public ArrayList getCategoria() {
        categoria = new ArrayList<Categoria>();
        //Aqu� escribes el c�digo con el que quieras rellenar la ArrayList
        return categoria;
       }
    }
    
    

