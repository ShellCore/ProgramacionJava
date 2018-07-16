package beans;

import java.io.Serializable;

// Debe implementar Serializable
public class PersonaBean implements Serializable {
    
    // Los atributos deben de ser private
    private String nombre;
    private int edad;

    // Siempre debe de existir un constructor sin argumentos
    public PersonaBean() {
    }

    // No requerido (JavaBean)
    public PersonaBean(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Por cada propiedad, debe existir un get y un set o al menos uno de ellos
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
