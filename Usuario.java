public class Usuario
{
    private String usuario;
    private String email;
    public Usuario(String usuario, String email){
        this.usuario = usuario;
        this.email = email;
    }
    
    public Usuario(){
        usuario = "Tomas";
        email = "tomas@gmail.com";
    }
    public void setUsuario(String usuario){
        this.usuario = usuario;
    }
    
    public String getUsuario(){
        return usuario;
    }
    
    public void setEmail(String email){
        this.email = email;
    }
    
    public String setEmail(){
        return email;
    }
    // Este metodo es getter (devuelve un valor) pero
    // también es un setter (establece un valor)
    // Este método comprueba si el DNI es correcto
    public boolean setEmailAddres(String emailAddres){
        if(emailAddres.matches("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$")){
            this.email = email;
            return true;
        }else{
            return false;
        }
    } 
    private static boolean introducirUsuario(){
        //pidiendo nombre
        do{
            System.out.println("Introducir nombre de usuario:");
            nombreUsuario = leer.nextLine();
        }while(nombreUsuario.isEmpty());
        
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
}