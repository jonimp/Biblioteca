package biblioteca;

import java.io.Serializable;
import java.util.ArrayList;

public class BaseDatos implements Serializable{
    private ArrayList<Usuario> usuarios;
    
    public BaseDatos(ArrayList<Usuario> usuarios){
        this.usuarios = usuarios;
    }
}
