package biblioteca;

import java.io.IOException;

public class Sistema {
<<<<<<< HEAD
       
    public void iniciar(){
        BaseDatos datos = new BaseDatos();
        Catalogo catalogoLibros = new Catalogo();
       
        boolean seguir;
        try{
            datos = datos.deSerializar("datos.txt");
            seguir = true;
        } catch (IOException | ClassNotFoundException e) {

            String u = EntradaSalida.leerString("Arranque incial del sistema.\n Administrador, ingrese su nombre de usuario ");
            if(u.equals("")){
                throw new NullPointerException("ERROR, el usuario no puede ser nulo");
            }

            String p = EntradaSalida.leerString("Ingrese su password: ");
            if(p.equals("")){
                throw new NullPointerException("ERROR, la password no puede ser nula");
            }

            guarderia.getUsuarios().add(new Administrador(u, p));

            try{
                guarderia.serializar("datos.txt");
                EntradaSalida.mostrarString("Administrador registrado. Debe reiniciarse el sistema.");
            } catch (IOException ex){}
            seguir = false;
        }


        while(seguir){
            String u = EntradaSalida.leerString("Ingrese el usuario: ");
            String p = EntradaSalida.leerString("Ingrese la password ");

            Usuario us = guarderia.buscarUsuario(u + ":" + p);

            if(us == null){
                EntradaSalida.mostrarString("No se ha encontrado el usuario o la password es incorrecta");
            } else {
                seguir = us.proceder(guarderia);
            }
        }  
=======
    
    public Sistema(){
        BaseDatos datos = new BaseDatos();
        catalogoLibros = new Catalogo();
    }
    
    public void iniciar(){
>>>>>>> b492250 (Avance de funciones)
        
    }
}







