package calculadoraentradadatos;

import calculadora.Operaciones;
import java.util.Scanner;

public class CalculadoraEntradaDatos {

    public static void main(String[] args) {
        System.out.println("Proporciona el primer valor");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        System.out.println("Proporciona el segundo valor");
        int b = scan.nextInt();
        int res = Operaciones.sumar(a, b);
        System.out.println("El resultado de la suma es: " + res);
    }
}
