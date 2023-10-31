import java.util.Arrays;
import java.util.Comparator;

public class Personaej8 {
    private String nombre;
    private int edad;

    public Personaej8(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return nombre + " - " + edad;
    }

    public static void main(String[] args) {
        Personaej8[] personas = new Personaej8[5];
        personas[0] = new Personaej8("Juan", 30);
        personas[1] = new Personaej8("María", 25);
        personas[2] = new Personaej8("Carlos", 35);
        personas[3] = new Personaej8("Luisa", 28);
        personas[4] = new Personaej8("Pedro", 40);

        // Ordenar el array de personas por edad de menor a mayor
        Arrays.sort(personas, Comparator.comparing(Personaej8::getEdad));

        // Recorrer el array ordenado
        for (Personaej8 persona : personas) {
            System.out.println(persona);
        }
    }
}