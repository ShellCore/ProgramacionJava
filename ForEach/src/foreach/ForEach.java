package foreach;

public class ForEach {

    public static void main(String[] args) {
        
        // Creamos un arreglo de personas
        Persona[] personas = {
            new Persona("Juan"), 
            new Persona("Karla")
        };
        
        // Iteramos cada elemento del arreglo persona
        for (Persona p : personas) {
            // Accedemos a las propiedades y/o métodos del objeto
            System.out.println("Nombre persona: " + p.getNombre());
        }
        
        System.out.println("");
        // Creamos un arreglo de enteros
        int[] edades = {15, 20, 41, 50};
        // Iteramos el arreglo
        for (int edad : edades) {
            System.out.println("Edad: " + edad);
        }
    }
    
}