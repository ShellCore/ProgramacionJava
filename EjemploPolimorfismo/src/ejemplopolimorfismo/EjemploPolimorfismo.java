package ejemplopolimorfismo;

public class EjemploPolimorfismo {

    public static void main(String[] args) {
        
        Empleado emp = new Empleado("Juan", 1000);
        imprimirDetalles(emp);
        
        Gerente ger = new Gerente("Karla", 2000, "Finanzas");
        imprimirDetalles(ger);
    }
    
    public static void imprimirDetalles(Empleado emp) {
        System.out.println(emp.obtenerDetalles());
    }
}
