package biblioteca;

public abstract class Usuario {
    private String nombre;
    private String password;
    
    public Usuario (String nombre, String password){
        this.nombre = nombre;
        this.password = password;
    }
    
    public void verCatalogo(){
        
    }
}
