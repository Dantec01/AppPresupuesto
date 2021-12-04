import java.util.*;
public class Usuario
{
    private static Scanner leer = new Scanner(System.in);
    private static String usuario;
    private static String emailA;
    private static boolean emailAddressValido = false;
    private static boolean email;
    public Usuario(String usuario, String emailA){
        this.usuario = usuario;
        this.emailA = emailA;
    }
    
    public Usuario(){
        usuario = "Tomas";
        emailA = "tomas@gmail.com";
        //introducirUsuario();
    }
    public void setUsuario(String usuario){
        this.usuario = usuario;
    }
    
    public String getUsuario(){
        return usuario;
    }
    
    public void setEmailA(String emailA){
        this.emailA = emailA;
    }
    
    public String getEmailA(){
        return emailA;
    }
   
    private static boolean introducirUsuario(){
        //pidiendo nombre
        do{
            System.out.println("Introducir nombre de usuario:");
            usuario = leer.nextLine();
        }while(usuario.isEmpty());
        //pidiendo correo electronico
        do{
            System.out.println("Introducir correo electronico de usuario:");
            emailA = leer.nextLine();
            if (emailA.matches("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$")== false){
                emailAddressValido = false;
                System.out.println("La direccion de correo electronico no es valido");
            }else{ 
                emailAddressValido = true;
            }
        }while(emailA.isEmpty()|| emailAddressValido==false);
        return true;
    }
}