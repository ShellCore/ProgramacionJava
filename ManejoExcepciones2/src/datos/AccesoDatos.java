package datos;

import excepciones.AccesoDatosException;

public interface AccesoDatos {
    
    void insertar() throws AccesoDatosException;
    void listar() throws AccesoDatosException;
    void simularError(boolean simularError);
}
