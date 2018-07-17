package manejogenericos;

public class ManejoGenericos {

    public static void main(String[] args) {
        
        ClaseGenerica<Integer> objetoInt = new ClaseGenerica<Integer>(15);
        objetoInt.obtenerTipo();
        
        ClaseGenerica<String> objetoString = new ClaseGenerica<>("Prueba");
        objetoString.obtenerTipo();
        
        // ClaseGenerica<int> intPrimitivo = new ClaseGenerica<>(88);
        // Los genéricos no pueden ser aplicados a tipos primitivos,
        // por lo que la línea anterior marca un error de compilación
    }
    
}
