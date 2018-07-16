package claseobject;

public class ClaseObject {

    public static void main(String[] args) {
        
        Persona p1 = new Persona("Juan", 10000);
        Persona p2 = new Persona("Juan", 10000);
        
        compararObjetos(p1, p2);
    }
    
    private static void compararObjetos(Persona p1, Persona p2) {
        System.out.println("Contenido objetos: " + p1);
        
        if (p1 == p2) {
            System.out.println("Los objetos tienen mísma dirección de memoria");
        } else {
            System.out.println("Los objetos tienen distinta dirección de memoria");
        }
        
        if (p1.equals(p2)) {
            System.out.println("Los objetos tienen el mísmo contenido, son iguales");
        } else {
            System.out.println("Los objetos no tienen el mísmo contenido, son diferentes");
        }
        
        if (p1.hashCode() == p2.hashCode()) {
            System.out.println("Los objetos tienen el mísmo código hash");
        } else {
            System.out.println("Los objetos no tienen el mísmo código hash");
        }
    }    
}
