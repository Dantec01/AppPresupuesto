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
}