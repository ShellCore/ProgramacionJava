package datos;

import excepciones.AccesoDatosException;
import excepciones.EscrituraDatosException;
import excepciones.LecturaDatosException;

public class ImplementacionMySql implements AccesoDatos {
    
    private boolean simularError;

    @Override
    public void insertar() throws AccesoDatosException {
        if (simularError) {
            throw new EscrituraDatosException("Error en la escritura de datos");
        } else {
            System.out.println("Insertar desde MySQL");
        }
    }

    @Override
    public void listar() throws AccesoDatosException {
        if (simularError) {
            throw new LecturaDatosException("Error en la lectura de datos");
        } else {
            System.out.println("Leer desde MySQL");
        }
                
    }

    public boolean isSimularError() {
        return simularError;
    }

    @Override
    public void simularError(boolean simularError) {
        this.simularError = simularError;
    }
    
}
