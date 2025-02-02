package biblioteca;

import java.util.ArrayList;

public class Libro {
    private int idLibro;
    private String titulo;
    private String autor;
    private int año;
    private ArrayList<Ejemplar> ejemplares;
    
    public Libro (int idLibro, String titulo, String autor, int año, ArrayList<Ejemplar> ejemplares){
        this.idLibro = idLibro;
        this.titulo = titulo;
        this.autor = autor;
        this.año = año;
        this.ejemplares = ejemplares;
    }
}
