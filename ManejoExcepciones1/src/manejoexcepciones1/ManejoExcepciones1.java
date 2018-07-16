package manejoexcepciones1;

import domain.Division;
import domain.OperatorException;

public class ManejoExcepciones1 {

    public static void main(String[] args) {
        
        try {
            Division division = new Division(10, 0);
            division.visualizarOperacion();
        } catch (OperatorException e) {
            System.out.println("Ocurrió un error!!!");
            e.printStackTrace();
        }
    }
    
}
