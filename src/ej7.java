import java.util.Arrays;
import java.util.Comparator;

class Persona {
    String nombre;
    int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
}

public class ej7 {
    public static void main(String[] args) {
        Persona[] personas = {
                new Persona("Alice", 30),
                new Persona("Bob", 25),
                new Persona("Charlie", 35)
        };

        // Ordenar el array de personas por edad
        Arrays.sort(personas, Comparator.comparingInt(persona -> persona.edad));

        // Mostrar el array ordenado
        for (Persona persona : personas) {
            System.out.println(persona.nombre + " - " + persona.edad);
        }
    }
}

