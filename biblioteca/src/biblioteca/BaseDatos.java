package biblioteca;

import java.io.Serializable;
import java.util.ArrayList;

public class BaseDatos implements Serializable{
    private ArrayList<Usuario> usuarios;
    private ArrayList<Prestamo> prestamos;
    
    public BaseDatos(ArrayList<Usuario> usuarios, ArrayList<Prestamo> prestamos){
        this.usuarios = usuarios;
        this.prestamos = prestamos;
    }

    BaseDatos deSerializar(String datostxt) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
