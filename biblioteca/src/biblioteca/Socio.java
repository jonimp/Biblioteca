package biblioteca;

import java.io.Serializable;

public class Socio extends Usuario implements Serializable{
    
    public Socio (String nombre, String password){
        super(nombre, password);
    }
}
