package paquete2;

import paquete1.Clase1;

public class Clase4 {
    
    public Clase4() {
        // Constructor protegido, restringido al no ser una sublcase
        // super(1, 2);
        // Constructor paquete, restringido al estar afuera del paquete
        // super(1, 2, 3);
        // Constructor privado, restringido
        // super(1, 2, 3, 4);
    }
    
    public void pruebaDesdeClase4() {
        // Acceso a Clase1 desde Clase4
        // Clase4 no es subclase y está en otro paquete
        Clase1 c1 = new Clase1();
        System.out.println("");
        
        System.out.println("Atributo público: " + c1.atrPublico);
        // System.out.println("Atributo protegido: " + c1.atrProtegido);
        System.out.println("Atributo protegido: " + "Acceso denegado");
        // System.out.println("Atributo paquete: " + c1.atrPaquete);
        System.out.println("Atributo paquete: " + "Acceso denegado");
        // System.out.println("Atributo privado: " + c1.atrPrivado);
        System.out.println("Atributo privado: " + "Acceso denegado");
        
        System.out.println("");
        System.out.println("Método público: " + c1.metodoPublico());
        // System.out.println("Método protegido: " + c1.metodoProtegido());
        System.out.println("Método protegido: " + "Acceso denegado");
        // System.out.println("Método paquete: " + c1.metodoPaquete());
        System.out.println("Método paquete: " + "Acceso denegado");
        // System.out.println("Método privado: " + c1.metodoPrivado());
        System.out.println("Método privado: " + "Acceso denegado");
    }
    
}
