package ejemploclasesabstractas;

import abstracto.domain.Circulo;
import abstracto.domain.FiguraGeometrica;
import abstracto.domain.Rectangulo;
import abstracto.domain.Triangulo;

public class EjemploClasesAbstractas {

    public static void main(String[] args) {
        
        FiguraGeometrica rectangulo = new Rectangulo("Rectángulo");
        FiguraGeometrica triangulo = new Triangulo("Triángulo");
        FiguraGeometrica circulo = new Circulo("Círculo");
        
        System.out.println(rectangulo);
        rectangulo.dibujar();
        
        System.out.println("");
        System.out.println(triangulo);
        triangulo.dibujar();
        
        System.out.println("");
        System.out.println(circulo);
        circulo.dibujar();
    }
}
