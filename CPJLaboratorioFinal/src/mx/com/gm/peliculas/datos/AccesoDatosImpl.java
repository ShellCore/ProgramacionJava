package mx.com.gm.peliculas.datos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import mx.com.gm.peliculas.domain.Pelicula;
import mx.com.gm.peliculas.excepciones.AccesoDatosEx;
import mx.com.gm.peliculas.excepciones.EscrituraDatosEx;
import mx.com.gm.peliculas.excepciones.LecturaDatosEx;

public class AccesoDatosImpl implements AccesoDatos {

    @Override
    public boolean existe(String nombreArchivo) throws AccesoDatosEx {
        try {
            File archivo = new File(nombreArchivo);
            return archivo.exists();
        } catch (Exception e) {
            throw new LecturaDatosEx("Error al querer validar existencia de archivo");
        }
    }

    @Override
    public List<Pelicula> listar(String nombre) throws AccesoDatosEx {
        File archivo = new File(nombre);
        List<Pelicula> peliculas = new ArrayList<>();
        try {
            BufferedReader entrada = new BufferedReader(new FileReader(archivo));
            String lectura;
            lectura = entrada.readLine();
            while (lectura != null) {
                Pelicula p = new Pelicula(lectura);
                peliculas.add(p);
                lectura = entrada.readLine();
            }
            entrada.close();
            return peliculas;
        } catch (IOException e) {
            throw new LecturaDatosEx("Error en la lectura de la lista de archivos");
        }
    }

    @Override
    public void escribir(Pelicula pelicula, String nombreArchivo, boolean anexar) throws AccesoDatosEx {
        PrintWriter salida = null;
        try {
            File archivo = new File(nombreArchivo);
            salida = new PrintWriter(new FileWriter(archivo, true));
            salida.println(pelicula.getNombre());
            salida.close();
            System.out.println("Se ha anexado la infromación correctamente\n");
        } catch (IOException ex) {
            throw new EscrituraDatosEx("Error en la escritura del archivo");
        } finally {
            salida.close();
        }
    }

    @Override
    public String buscar(String nombreArchivo, String buscar) throws AccesoDatosEx {
        List<Pelicula> peliculas = listar(nombreArchivo);
        boolean encontrado = false;
        for (Pelicula p : peliculas) {
            if (p.getNombre().equals(buscar)) {
                encontrado = true;
                break;
            }
        }
        
        if (encontrado) {
            return "La película si se encuentra en el catálogo";
        } else {
            return "No se encuentra la película en el catálogo";
        }
    }

    @Override
    public void crear(String nombreArchivo) throws AccesoDatosEx {
        File archivo = new File(nombreArchivo);
        try {
            PrintWriter salida = new PrintWriter(new FileWriter(archivo));
            salida.close();
        } catch (IOException e) {
            throw new EscrituraDatosEx("El archivo no se pudo crear");
        }
    }

    @Override
    public void borrar(String nombreArchivo) throws AccesoDatosEx {
        File archivo = new File(nombreArchivo);
        if (archivo.exists() && !archivo.delete()) {
            throw new AccesoDatosEx("No se pudo eliminar el archivo");
        }
    }
}
