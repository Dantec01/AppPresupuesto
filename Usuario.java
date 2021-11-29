public class Usuario{
    private String nombre;
    private String emailAddress;
    public Usuario(){
        this.nombre = "";
        this.emailAddress = "";
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public String getEmailAddress(){
        return emailAddress;
    }
    
    public void setEmailAddress(String emailAddress){
        this.emailAddress = emailAddress;
    }
    // Este metodo es getter (devuelve un valor) pero
    // también es un setter (establece un valor)
    // Este método comprueba si el DNI es correcto
    public boolean setEmailAddres(String emailAddres){
        if(emailAddres.matches("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$")){
            this.emailAddress = emailAddress;
            return true;
        }else{
            return false;
        }
    } 
    
    public String toString(){
        return "Nombre:" +this.nombre +"\n"+ "Correo electronico:" + this.emailAddress;
    }
}