package manejocolecciones;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ManejoColecciones {

    public static void main(String[] args) {
        List miLista = new ArrayList();
        miLista.add("1");
        miLista.add("2");
        miLista.add("3");
        miLista.add("4");
        // Elemento repetido
        miLista.add("4");
        imprimir(miLista);
        
        Set miSet = new HashSet();
        miSet.add("100");
        miSet.add("200");
        miSet.add("300");
        // No permite elementos repetidos, lo ignora
        miSet.add("300");
        imprimir(miSet);
        
        Map miMap = new HashMap();
        miMap.put("1", "Juan");
        miMap.put("2", "Carlos");
        miMap.put("3", "Rosario");
        miMap.put("4", "Esperanza");
        // Se imprimen todas las llaves
        imprimir(miMap.keySet());
        // Se imprimen todos los valores
        imprimir(miMap.values());
    }
    
    private static void imprimir(Collection col) {
        col.forEach((obj) -> {
            System.out.print(obj + " ");
        });
        System.out.println("");
    }
}
