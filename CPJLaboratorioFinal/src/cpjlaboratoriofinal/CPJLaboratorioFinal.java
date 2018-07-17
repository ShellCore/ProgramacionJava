package cpjlaboratoriofinal;

import java.util.Scanner;
import mx.com.gm.peliculas.negocio.CatalogoPeliculas;
import mx.com.gm.peliculas.negocio.CatalogoPeliculasImpl;

public class CPJLaboratorioFinal {
    
    private static final String nombreArchivo = "C:...\\CatalogoPeliculas\\peliculas.txt";
    private static Scanner scanner;
    private static int opcion;
    private static CatalogoPeliculas catalogoPeliculas;

    public static void main(String[] args) {
        catalogoPeliculas = new CatalogoPeliculasImpl();
        mostrarMenuOpciones();
        scanner = new Scanner(System.in);
        opcion = scanner.nextInt();
        while (opcion != 0) {
            switch (opcion) {
                case 0:
                    return;
                case 1:
                    iniciarCatalogo();
                    break;
                case 2:
                    agregarPelicula();
                    break;
                case 3:
                    listarPeliculas();
                    break;
                case 4:
                    buscarPeliculas();
                    break;
                default:
                    System.out.println("Opción no válida.\n");
                    break;
                    
            }
            mostrarMenuOpciones();
            opcion = scanner.nextInt();
        }
    }
    
    private static void mostrarMenuOpciones() {
        System.out.println("\nElige opción:");
        System.out.println("1. Iniciar catálogo de películas");
        System.out.println("2. Agregar película");
        System.out.println("3. Listar películas");
        System.out.println("4. Buscar película");
        System.out.println("0. Salir");
    }
    
    private static void iniciarCatalogo() {
        catalogoPeliculas.iniciarArchivo(nombreArchivo);
    }
    
    private static void agregarPelicula() {
        System.out.println("Escribe el nombre de la pelicula:");
        scanner.nextLine();
        String nombrePelicula = scanner.nextLine();
        catalogoPeliculas.agregarPelicula(nombrePelicula, nombreArchivo);
    }
    
    private static void listarPeliculas() {
        catalogoPeliculas.listarPeliculas(nombreArchivo);
    }
    
    private static void buscarPeliculas() {
        System.out.println("Escribe el nombre de la película a buscar: ");
        scanner.nextLine();
        String nombrePelicula = scanner.nextLine();
        catalogoPeliculas.buscarPelicula(nombreArchivo, nombrePelicula);
    }
}
