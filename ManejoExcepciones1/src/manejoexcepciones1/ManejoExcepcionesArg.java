package manejoexcepciones1;

import domain.Division;
import domain.OperatorException;

public class ManejoExcepcionesArg {
    
    public static void main(String[] args) throws OperatorException {
        try {
            int op1 = Integer.parseInt(args[0]);
            int op2 = Integer.parseInt(args[1]);
          
            Division div = new Division(op1, op2);
            div.visualizarOperacion();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Ocurrió una excepción: ");
            System.out.println("Hubo un error al aceder un elemento fuera de rango");
            e.printStackTrace();
        } catch (NumberFormatException e) {
            System.out.println("Ocurrió una excepción: ");
            System.out.println("Uno de los argumentos no es entero");
            e.printStackTrace();
        } catch (OperatorException e) {
            System.out.println("Ocurrió una excepción: ");
            System.out.println("Se intento realizar una excepción errónea");
            e.printStackTrace();
        } finally {
            System.out.println("Se terminaron de revisar las excepciones");
        }
    }
}
