package abstracto.domain;

public class Circulo extends FiguraGeometrica {

    public Circulo(String tipoFigura) {
        super(tipoFigura);
    }

    @Override
    public void dibujar() {
        System.out.println("Aquí debería dibujar un: " + this.getClass().getSimpleName());
    }
}
