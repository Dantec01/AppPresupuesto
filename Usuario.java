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
        setEmailAddres();
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
    // tambi�n es un setter (establece un valor)
    // Este m�todo comprueba si el DNI es correcto
    public boolean setEmailAddres(){ //(String emailAddres){
        //if(emailAddres.matches("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$")){
        if(email.matches("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$")){
            this.email = email;
            return true;
            System.out.println("email correcto");
        }else{
            return false;
            System.out.println("email incorrecto");
        }
    } 
}