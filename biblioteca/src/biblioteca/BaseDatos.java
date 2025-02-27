package biblioteca;

import java.io.FileWriter;
import java.io.Serializable;
import java.util.ArrayList;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BaseDatos implements Serializable{
    private ArrayList<Usuario> usuarios;
    private ArrayList<Prestamo> prestamos;
    private static final String archivoDB = "biblioteca.json";
    
    public BaseDatos(){
        usuarios = new ArrayList<Usuario>();
        prestamos = new ArrayList<Prestamo>();
    }

   // Métodos para gestionar usuarios
    public void agregarUsuario(Usuario usuario) {
        usuarios.add(usuario);
        guardarDatos();
    }
    
    public ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }
    
    // Métodos para gestionar préstamos
    public void agregarPrestamo(Prestamo prestamo) {
        prestamos.add(prestamo);
        guardarDatos();
    }
    
    public ArrayList<Prestamo> getPrestamos() {
        return prestamos;
    }
    
    // Métodos para persistencia
    public void guardarDatos() {
        try (FileWriter writer = new FileWriter(archivoDB)) {
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            gson.toJson(this, writer);
        } catch (IOException e) {
            System.out.println("Error al guardar los datos: " + e.getMessage());
        }
    }
    
    public static BaseDatos cargarDatos() {
        try (FileReader reader = new FileReader(archivoDB)) {
            Gson gson = new Gson();
            return gson.fromJson(reader, BaseDatos.class);
        } catch (FileNotFoundException e) {
            System.out.println("No se encontró archivo de datos. Se creará uno nuevo.");
            return new BaseDatos();
        } catch (IOException e) {
            System.out.println("Error al cargar los datos: " + e.getMessage());
            return new BaseDatos();
        }
    }
    

}
