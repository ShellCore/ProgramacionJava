package com.gm.javadoc;

/**
 * Esta clase permite realizar operaciones de aritmética como sumar, restar, etc
 * 
 * @author Cesar Morales
 * @version 1.0
 */

public class Aritmetica {
    
    /**
     * Primer operando
     */
    int operandoA;
    
    /**
     * Segundo operando
     */
    int operandoB;

    /**
     * Constructor vacío de la clase
     */
    public Aritmetica() {
    }

    /**
     * Constructor con parametros
     * @param operandoA
     * @param operandoB 
     */
    public Aritmetica(int operandoA, int operandoB) {
        this.operandoA = operandoA;
        this.operandoB = operandoB;
    }
    
    /**
     * Éste método realiza la suma de dos operandos enteros
     * @return int resultado de la suma
     */
    public int sumar() {
        return operandoA + operandoB;
    }
}
