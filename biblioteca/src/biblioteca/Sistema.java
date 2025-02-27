package biblioteca;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.*;

public class Sistema {
    
   
    private BaseDatos datos;
    private static final String ARCHIVO_DB = "biblioteca.json";
    
    public Sistema() {
        datos = cargarDatos();
        if (datos == null) {
            // Primera ejecución - crear nueva BD con admin
            datos = new BaseDatos();
            crearAdministradorInicial();
            datos.guardarDatos();
        }
    }
    
    private void crearAdministradorInicial() {
        EntradaSalida.mostrarString("Primera ejecución - Crear administrador inicial");
        String nombre = EntradaSalida.leerString("Ingrese nombre de usuario: ");
        String password = EntradaSalida.leerString("Ingrese contraseña: ");        
        Administrador admin = new Administrador(nombre, password);
        datos.agregarUsuario(admin);
    }
    
    private BaseDatos cargarDatos() {
        try (FileReader reader = new FileReader(ARCHIVO_DB)) {
            Gson gson = new Gson();
            return gson.fromJson(reader, BaseDatos.class);
        } catch (FileNotFoundException e) {
            System.out.println("Primera ejecución: Se creará un nuevo archivo de datos.");
            return null;
        } catch (IOException e) {
            System.out.println("Error al cargar los datos: " + e.getMessage());
            return null;
        }
    }
    
    
    
    public void iniciar() {
        // Aquí continúa la lógica del sistema
        System.out.println("Sistema iniciado correctamente");
    }
}









