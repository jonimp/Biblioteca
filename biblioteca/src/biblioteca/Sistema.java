package biblioteca;

import java.io.IOException;

public class Sistema {

       
    public void iniciar(){
        BaseDatos datos = new BaseDatos();
        Catalogo catalogoLibros = new Catalogo();
       
        boolean seguir;
        datos = datos.deSerializar("datos.txt");
        seguir = true;


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

    
    public Sistema(){
        BaseDatos datos = new BaseDatos();
        catalogoLibros = new Catalogo();
    }
    
   
}







