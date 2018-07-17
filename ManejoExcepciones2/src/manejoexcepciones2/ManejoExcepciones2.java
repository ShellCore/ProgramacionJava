package manejoexcepciones2;

import datos.*;
import excepciones.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ManejoExcepciones2 {
    
    public final static int LISTAR = 0;
    public final static int INSERTAR = 1;

    public static void main(String[] args) {
        AccesoDatos datos = new ImplementacionMySql();
        
        // Activando la simulación de errores
        datos.simularError(true);
        ejecutar(datos, LISTAR);
        
        // Desactivando la simulación de errores
        datos.simularError(false);
        ejecutar(datos, INSERTAR);
    }
    
    private static void ejecutar(AccesoDatos datos, int accion) {
        switch (accion) {
            case LISTAR:
                try {
                    datos.listar();
                } catch (LecturaDatosException ex) {
                    System.out.println("Error Lectura: Procesa la excepción más expecífica de lectura de datos");
                } catch (AccesoDatosException ex) {
                    System.out.println("Error Acceso Datos: Procesa la excepción más genérica de acceso a datos");
                } catch (Exception ex) {
                    System.out.println("Error general");
                } finally {
                    System.out.println("Procesar finally es opcional, siempre se ejecutará sin importar si hubo error o no");
                }
                break;
            case INSERTAR:
                try {
                    datos.insertar();
                } catch (AccesoDatosException ex) {
                    System.out.println("Error Acceso Datos: Podemos procesar solo la excepción más genérica");
                } finally {
                    System.out.println("Procesar finally es opcional, siempre se ejecutará sin importar si hubo error o no");
                }
                break;
            default:
                System.out.println("No se proporcionó ninguna acción conocida");
                
        }
    }
}
