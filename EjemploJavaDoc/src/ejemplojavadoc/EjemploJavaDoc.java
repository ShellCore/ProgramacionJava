package ejemplojavadoc;

import com.gm.javadoc.Aritmetica;

/**
 * Clase para probar el concepto de JavaDoc
 * 
 * @author Cesar Morales
 * @version 1.0
 */
public class EjemploJavaDoc {

    /**
     * Método que ejecuta la prueba de la clase Aritmetica
     * @param args argumentos de la línea de comandos
     */
    public static void main(String[] args) {
        int resultado = new Aritmetica(3, 2)
                .sumar();
        
        System.out.println("Resultado: " + resultado);
    }
    
}
