package manejointerfaces;

import datos.AccesoDatos;
import datos.ImplementacionMySql;
import datos.ImplementacionOracle;

public class ManejoInterfaces {

    public static void main(String[] args) {
        
        AccesoDatos datos = new ImplementacionOracle();
        ejecutar(datos, "listar");
        
        datos = new ImplementacionMySql();
        ejecutar(datos, "insertar");
    }
    
    private static void ejecutar(AccesoDatos datos, String accion) {
        switch(accion) {
            case "listar" : 
                datos.listar();
                break;
            case "insertar" : 
                datos.insertar();
                break;
        }
    }
}
