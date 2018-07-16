package foreach;

public class Persona {
    
    private static int contadorPersonas;
    
    private final int idPersona;
    private String nombre;

    public Persona(String nombre) {
        idPersona = ++contadorPersonas;
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
