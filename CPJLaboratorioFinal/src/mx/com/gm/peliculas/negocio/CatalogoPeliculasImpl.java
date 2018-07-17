package mx.com.gm.peliculas.negocio;

import java.util.List;
import mx.com.gm.peliculas.datos.AccesoDatos;
import mx.com.gm.peliculas.datos.AccesoDatosImpl;
import mx.com.gm.peliculas.domain.Pelicula;
import mx.com.gm.peliculas.excepciones.AccesoDatosEx;
import mx.com.gm.peliculas.excepciones.EscrituraDatosEx;
import mx.com.gm.peliculas.excepciones.LecturaDatosEx;

public class CatalogoPeliculasImpl implements CatalogoPeliculas {
    
    private final AccesoDatos datos;

    public CatalogoPeliculasImpl() {
        datos = new AccesoDatosImpl();
    }

    @Override
    public void agregarPelicula(String nombrePelicula, String nombreArchivo) {
        try {
            if (!datos.existe(nombreArchivo)) {
                System.out.println("No se puede acceder al archivo. El archivo no ha sido inicializado.");
            } else {
                Pelicula pelicula = new Pelicula(nombrePelicula);
                datos.escribir(pelicula, nombreArchivo, true);
            }
        } catch (EscrituraDatosEx e) {
            e.printStackTrace();
        } catch (AccesoDatosEx e) {
            e.printStackTrace();
        }
    }

    @Override
    public void listarPeliculas(String nombreArchivo) {
        try {
            if (!datos.existe(nombreArchivo)) {
                System.out.println("No se puede acceder al archivo. El archivo no ha sido inicializado.");
            } else {
                List<Pelicula> peliculas = datos.listar(nombreArchivo);
                peliculas.forEach((p) -> {
                    System.out.println(p);
                });
            }
        } catch (LecturaDatosEx e) {
            e.printStackTrace();
        } catch (AccesoDatosEx e) {
            e.printStackTrace();
        }
    }

    @Override
    public void buscarPelicula(String nombreArchivo, String buscar) {
        try {
            if (!datos.existe(nombreArchivo)) {
                System.out.println("No se puede acceder al archivo. El archivo no ha sido inicializado.");
            } else {
               String resultado = datos.buscar(nombreArchivo, buscar);
                System.out.println("Resultado de la búsqueda: " + resultado);
            }
        } catch (LecturaDatosEx e) {
            e.printStackTrace();
        } catch (AccesoDatosEx e) {
            e.printStackTrace();
        }
    }

    @Override
    public void iniciarArchivo(String nombreArchivo) {
        try {
            if (datos.existe(nombreArchivo)) {
                datos.borrar(nombreArchivo);
            }
            datos.crear(nombreArchivo);
            System.out.println("Se ha creado el archivo correctamente");
        } catch (EscrituraDatosEx e) {
            e.printStackTrace();
        } catch (AccesoDatosEx e) {
            e.printStackTrace();
        }
    }

}
