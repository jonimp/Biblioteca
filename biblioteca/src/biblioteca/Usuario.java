package biblioteca;

import java.io.Serializable;

public abstract class Usuario implements Serializable{
    private String nombre;
    private String password;
    
    public Usuario (String nombre, String password){
        this.nombre = nombre;
        this.password = password;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
        
    public void verCatalogo(){
        
    }
}
