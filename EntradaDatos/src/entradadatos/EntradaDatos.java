package entradadatos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EntradaDatos {

    public static void main(String[] args) {
        String captura;
        InputStreamReader input = new InputStreamReader(System.in); // Para lectura de la entrada del sistema
        BufferedReader bInput = new BufferedReader(input); // Para lectura de toda la línea y no solo caracter por caracter
        try {
            System.out.println("Introduce un dato:");
            captura = bInput.readLine();
            while (captura != null) {
                System.out.println("Dato introducido: " + captura);
                captura = bInput.readLine();
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    
}
