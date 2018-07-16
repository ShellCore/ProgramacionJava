package paquete1;

public class Clase2 {
    
    public Clase2() {
        // Prueba Constructores
        System.out.println("");
        // Constructor público
        new Clase1(1);
        // Constructor protegido
        new Clase1(1, 2);
        // Constructor paquete
        new Clase1(1, 2, 3);
        // Constructor privado
        // new Clase1(1, 2, 3, 4);
        System.out.println("Constructor private: Acceso denegado");
    }
    
    public void pruebaDesdeClase2() {
        // Acceso a Clase1 desde Clase2
        Clase1 c1 = new Clase1();
        System.out.println("");
        
        System.out.println("Atributo público: " + c1.atrPublico);
        System.out.println("Atributo protegido: " + c1.atrProtegido);
        System.out.println("Atributo paquete: " + c1.atrPaquete);
        // System.out.println("Atributo privado: " + c1.atrPrivado);
        System.out.println("Atributo privado: " + "Acceso denegado");
        
        System.out.println("");
        System.out.println("Método público: " + c1.metodoPublico());
        System.out.println("Método protegido: " + c1.metodoProtegido());
        System.out.println("Método paquete: " + c1.metodoPaquete());
        // System.out.println("Método privado: " + c1.metodoPrivado());
        System.out.println("Método privado: " + "Acceso denegado");
    }
}
