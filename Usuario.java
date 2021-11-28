
public class Usuario{
    private String nombre;
    private String nroCarnet;
    private int edad;
    public Usuario(){
        this.nombre = "";
        this.nroCarnet = "";
        this.edad = 0;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public String getNroCarnet(){
        return nroCarnet;
    }
    
    public void setNroCarnet(String nroCarnet){
        this.nroCarnet = nroCarnet;
    }
    
    public int getEdad(){
        return edad;
    }
    
    public void setEdad(int edad){
        this.edad = edad;
    }
    // Este metodo es getter (devuelve un valor) pero
    // también es un setter (establece un valor)
    // Este método comprueba si el DNI es correcto
    public boolean setNroCarnett(String nroCarnet){
        if(nroCarnet.matches("[0-9]{8}[a-zA-Z]$")){
            this.nroCarnet = nroCarnet;
            return true;
        }else{
            return false;
        }
    } 
    
    public String toString(){
        return "Nombre:" +this.nombre +"\n" + "Edad:" + this.edad + "\n"+ "Nro de Carnet:" + this.nroCarnet;
    }
}
