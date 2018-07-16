package paquete2;

import paquete1.Clase1;

public class Clase3 extends Clase1 {

    public Clase3() {
        // Constructor protegido, al ser una subclase, puede acceder
        super(1, 2);
        // Constructor paquete: Al estar fuera del paquete está restringido
        // super(1, 2, 3);
        // Constructor privado: Restringido
        // super(1, 2, 3, 4);
    }
    
    public void pruebaDesdeClase3() {
        // Acceso a Clase1 desde Clase3
        Clase1 c1 = new Clase1();
        System.out.println("");
        
        System.out.println("Atributo público: " + c1.atrPublico);
        System.out.println("Atributo público (Heredado): " + atrPublico);
        // System.out.println("Atributo protegido: " + c1.atrProtegido);
        System.out.println("Atributo protegido: " + "Acceso denegado");
        System.out.println("Atributo protegido (Heredado): " + atrProtegido);
        // System.out.println("Atributo paquete: " + c1.atrPaquete);
        System.out.println("Atributo paquete: " + "Acceso denegado");
        // System.out.println("Atributo privado: " + c1.atrPrivado);
        System.out.println("Atributo privado: " + "Acceso denegado");
        
        // Constructor público
        new Clase1();
        // Los demás constructores no se pueden probar así, sino desde el
        // constructor de ésta clase, ya que ésta es una subclase en otro
        // paquete
        
        System.out.println("");
        System.out.println("Método público: " + c1.metodoPublico());
        System.out.println("Método público (Heredado): " + metodoPublico());
        // System.out.println("Método protegido: " + c1.metodoProtegido());
        System.out.println("Método protegido: " + "Acceso denegado");
        System.out.println("Método protegido (Heredado): " + metodoProtegido());
        // System.out.println("Método paquete: " + c1.metodoPaquete());
        System.out.println("Método paquete: " + "Acceso denegado");
        // System.out.println("Método privado: " + c1.metodoPrivado());
        System.out.println("Método privado: " + "Acceso denegado");
    }
}
