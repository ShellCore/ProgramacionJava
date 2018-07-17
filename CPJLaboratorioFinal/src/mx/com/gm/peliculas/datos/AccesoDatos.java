package mx.com.gm.peliculas.datos;

import java.util.List;
import mx.com.gm.peliculas.domain.Pelicula;
import mx.com.gm.peliculas.excepciones.AccesoDatosEx;

public interface AccesoDatos {
    boolean existe(String nombreArchivo) throws AccesoDatosEx;
    List<Pelicula> listar(String nombre) throws AccesoDatosEx;
    void escribir(Pelicula pelicula, String nombreArchivo, boolean anexar) throws AccesoDatosEx;
    String buscar(String nombreArchivo, String buscar) throws AccesoDatosEx;
    void crear(String nombreArchivo) throws AccesoDatosEx;
    void borrar(String nombreArchivo) throws AccesoDatosEx;
}
