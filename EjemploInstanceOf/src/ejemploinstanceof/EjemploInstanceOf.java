package ejemploinstanceof;

public class EjemploInstanceOf {

    public static void main(String[] args) {
        FiguraGeometrica figura;
        figura = new Elipse();
        
        determinaTipo(figura);
        
        System.out.println("\nTodos sus tipos:");
        determinaTodosLosTipos(figura);
    }
    
    private static void determinaTipo(FiguraGeometrica figura) {
        if (figura instanceof Elipse) {
            System.out.println("Es una elipse");
        } else if (figura instanceof Circulo) {
            System.out.println("Es un círculo");
        } else if (figura instanceof Rectangulo) {
            System.out.println("Es un rectángulo");
        } else if (figura instanceof Triangulo) {
            System.out.println("Es un triángulo");
        } else if (figura instanceof FiguraGeometrica) {
            System.out.println("Es una figura geométrica");
        } else if (figura instanceof Object) {
            System.out.println("Es un Object");
        } else {
            System.out.println("No se encontró el tipo");
        }
    }
    
    private static void determinaTodosLosTipos(FiguraGeometrica figura) {
        if (figura instanceof Elipse) {
            System.out.println("Es una elipse");
        }
        if (figura instanceof Circulo) {
            System.out.println("Es un círculo");
        }
        if (figura instanceof Rectangulo) {
            System.out.println("Es un rectángulo");
        }
        if (figura instanceof Triangulo) {
            System.out.println("Es un trángulo");
        }
        if (figura instanceof FiguraGeometrica) {
            System.out.println("Es una figura geométrica");
        }
        if (figura instanceof Object) {
            System.out.println("Es un Object");
        }else {
            System.out.println("No se encontró el tipo");
        }
        
    }
}
