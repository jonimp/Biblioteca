package biblioteca;

import java.io.Serializable;

public class Bibliotecario extends Usuario implements Serializable{
    
    public Bibliotecario (String nombre, String password){
        super(nombre, password);
    }
}
