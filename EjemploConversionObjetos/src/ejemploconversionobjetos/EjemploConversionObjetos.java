package ejemploconversionobjetos;

public class EjemploConversionObjetos {

    public static void main(String[] args) {
        
        Empleado empleado;
        
        empleado = new Escritor("Roy", 15000, TipoEscritura.CLASICO);
        
        imprimirDetalles(empleado);
        
        empleado = new Gerente("Laura", 18000, "Sistemas");
        
        imprimirDetalles(empleado);
    }
    
    public static void imprimirDetalles(Empleado empleado) {
        String resultado = null;
        
        System.out.println("\nDetalles: " + empleado.obtenerDetalles());
        
        if (empleado instanceof Escritor) {
            // Escritor escritor = (Escritor) empleado;
            // resultado = escritor.getTipoEscrituraTexto();
            resultado = ((Escritor) empleado).getTipoEscritura().getDescripcion();
            
            System.out.println("Resultado tipoEscritura: " + resultado);
            
        } else if (empleado instanceof Gerente) {
            resultado = ((Gerente) empleado).getDepartamento();
            System.out.println("Resultado departamento: " + resultado);
        }
    }
}
