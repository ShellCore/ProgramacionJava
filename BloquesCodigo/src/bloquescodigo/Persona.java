package bloquescodigo;

public class Persona {
    
    private static int contadorPersonas;
    
    private final int idPersona;
    
    // Bloque de inicialización estático
    static {
        // Iniciamos el idPersonas desde el valor 10
        contadorPersonas = 10;
        // Aquí se pueden usar variables no estáticas
        // idPersona = 1;
        System.out.println("Ejecuta el bloque estático");
    }
    
    // Bloque de código para inicializar atributos de la clase
    // El bloque se copia a cada constructor de la clase
    {
        System.out.println("Ejecuta el bloque inicializador");
        idPersona = ++contadorPersonas;
    }

    public Persona() {
        System.out.println("Ejecuta constructor");
    }
    
    public int getIdPersona() {
        return idPersona;
    }
}
