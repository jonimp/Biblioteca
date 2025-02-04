package biblioteca;

public class Ejemplar {
    private int idEjemplar;
    private Libro obra;
    private String estado;
    
    public Ejemplar (int idEjemplar, Libro obra, String estado){
        this.idEjemplar = idEjemplar;
        this.obra = obra;
        this.estado = "Disponible";
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    
    
}
