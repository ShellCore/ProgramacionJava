package manejocoleccionesgenericas;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ManejoColeccionesGenericas {

    public static void main(String[] args) {
        
        List<String> miLista = new ArrayList<>();
        miLista.add("1");
        miLista.add("2");
        miLista.add("3");
        miLista.add("4");
        miLista.add("4");
        imprimirLista(miLista);
        
        Set<String> miSet = new HashSet<>();
        miSet.add("100");
        miSet.add("200");
        miSet.add("300");
        miSet.add("300");
        imprimirLista(miSet);
        
        Map<String, String> miMapa = new HashMap<>();
        miMapa.put("1", "Juan");
        miMapa.put("2", "Carlos");
        miMapa.put("3", "Rosario");
        miMapa.put("4", "Esperanza");
        imprimirLista(miMapa.keySet());
        imprimirLista(miMapa.values());
    }
    
    private static void imprimirLista(Collection<String> col) {
        col.forEach((elemento) -> {
            System.out.print(elemento + " ");
        });
        System.out.println("");
    }
}
