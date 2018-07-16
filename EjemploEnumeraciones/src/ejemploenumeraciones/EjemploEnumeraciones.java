package ejemploenumeraciones;

import com.sun.xml.internal.bind.v2.TODO;

public class EjemploEnumeraciones {

    public static void main(String[] args) {
        
        // Valores de la enumeración
        System.out.println("Valor 1: " + Dias.LUNES);
        
        // Hacemos un test del día utilizado
        indicarDia(Dias.VIERNES);
        
        // Utilizamos la enumeración de paises
        System.out.println("");
        System.out.println("Continente No. 4: " + Continentes.AMERICA);
        System.out.println("Paises en América: " + Continentes.AMERICA.getPaises());
        
        // Hacemos el test del número de paises por continente
        System.out.println("");
        indicarPaises(Continentes.AFRICA);
        
        // Imprimimos los continentes
        System.out.println("");
        imprimirContinentes();
    }
    
    public static void indicarDia(Dias dias) {
        switch (dias) {
            // Podemos usar algún valor constante de la enumeración directamente
            case LUNES:
                System.out.println("Primer día de la semana");
                break;
            case MARTES:
                System.out.println("Segundo día de la semana");
                break;
            default:
                System.out.println("Y así nos seguimos con los demás días");
        }
    }
    
    public static void indicarPaises(Continentes continentes) {
        switch (continentes) {
            case AFRICA:
                System.out.println("No. de paises en " + continentes + ": " + continentes.getPaises());
                break;
            default:
                System.out.println("Y así nos seguimos con los demás continentes");
        }
    }
    
    public static void imprimirContinentes() {
        // Utilizamos un ForEach
        for (Continentes c : Continentes.values()) {
            System.out.println("Continente " + c + " contiene " + c.getPaises() + " paises");
        }
    }
}
