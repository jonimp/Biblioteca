package biblioteca;

import java.io.Serializable;
import java.util.ArrayList;

public class Socio extends Usuario implements Serializable{
    
    ArrayList<String> prestamos = new ArrayList<>();
    
    public Socio (String nombre, String password){
        super(nombre, password);
    }
    
    public boolean puedeRealizarPrestamo() {
        // Verificar límite de préstamos activos
        return prestamos.size() < 3;
    }
}
