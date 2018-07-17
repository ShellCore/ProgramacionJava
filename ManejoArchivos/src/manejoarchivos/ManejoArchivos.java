package manejoarchivos;

import java.io.File;
import static utilierias.Archivos.*;

public class ManejoArchivos {
    
    private static final String NOMBRE_ARCHIVO = "C:" + File.separator + "..." + File.separator + "pruebaJava.txt";

    public static void main(String[] args) {
        crearArchivo(NOMBRE_ARCHIVO);
        escribirArchivo(NOMBRE_ARCHIVO);
        leerArchivo(NOMBRE_ARCHIVO);
        anexarArchivo(NOMBRE_ARCHIVO);
        leerArchivo(NOMBRE_ARCHIVO);
    }
}
