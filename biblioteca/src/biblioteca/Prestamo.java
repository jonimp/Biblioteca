package biblioteca;

import java.time.LocalDate;

public class Prestamo {
    private Integer idPrestamo;
    private Socio socio;
    private Ejemplar ejemplar;
    private LocalDate fechaPrestamo;
    private LocalDate fechaDevolucionPrevista;
    private LocalDate fechaDevolucionReal;
    private String estado; // "ACTIVO", "DEVUELTO", "VENCIDO"
    
    // Constructor, getters y setters
    
    public boolean estaVencido() {
        return LocalDate.now().isAfter(fechaDevolucionPrevista);
    }
}