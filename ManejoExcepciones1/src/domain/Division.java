package domain;

public class Division {
    
    private int numerador;
    private int denominador;

    public Division(int numerador, int denominador) throws OperatorException {
        if (denominador == 0) {
            throw new OperatorException("Denominador igual a cero");
        }
        
        this.numerador = numerador;
        this.denominador = denominador;
    }
    
    public void visualizarOperacion() {
        System.out.println("El resultado de la división es: " + (numerador / denominador));
    }
}
