import java.util.Scanner;
public class ej14 {
    public static void main(String[] args) {
        /*
        14.	Codifique un algoritmo que permita cargar un array de una dimensión de 20
        elementos enteros. Finalizada la carga de los 20 elementos el programa debe
        solicitar como se desea ordenar el array ASCENDENTE O DESCENDENTE y que método
        de ordenamiento aplicar (inserción, burbuja, selección), según las opciones
        elegidas aplique el algoritmos fundamental de ordenamiento que corresponda.
        Muestre por pantalla el array original desordenado y su resultante ordenado
        según las opciones elegidas.
         */
        int[] array = new int[20];
        Scanner scanner = new Scanner(System.in);

        // Carga de elementos en el array
        System.out.println("Ingrese los 20 elementos enteros:");

        for (int i = 0; i < 20; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        // Mostrar el array original
        System.out.println("\nArray original:");
        imprimirArray(array);

        // Solicitar el tipo de orden y método de ordenamiento
        System.out.println("\n¿Cómo desea ordenar el array? (ASCENDENTE o DESCENDENTE)");
        String tipoOrden = scanner.next().toUpperCase();

        System.out.println("\n¿Qué método de ordenamiento desea aplicar? (INSERCION, BURBUJA, SELECCION)");
        String metodoOrdenamiento = scanner.next().toUpperCase();

        // Ordenar el array según las opciones elegidas
        if (tipoOrden.equals("ASCENDENTE")) {
            if (metodoOrdenamiento.equals("INSERCION")) {
                ordenarInsercionAscendente(array);
            } else if (metodoOrdenamiento.equals("BURBUJA")) {
                ordenarBurbujaAscendente(array);
            } else if (metodoOrdenamiento.equals("SELECCION")) {
                ordenarSeleccionAscendente(array);
            } else {
                System.out.println("Método de ordenamiento no válido.");
            }
        } else if (tipoOrden.equals("DESCENDENTE")) {
            if (metodoOrdenamiento.equals("INSERCION")) {
                ordenarInsercionDescendente(array);
            } else if (metodoOrdenamiento.equals("BURBUJA")) {
                ordenarBurbujaDescendente(array);
            } else if (metodoOrdenamiento.equals("SELECCION")) {
                ordenarSeleccionDescendente(array);
            } else {
                System.out.println("Método de ordenamiento no válido.");
            }
        } else {
            System.out.println("Tipo de orden no válido.");
        }

        // Mostrar el array ordenado
        System.out.println("\nArray ordenado:");
        imprimirArray(array);
    }

    public static void imprimirArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
    public static void ordenarInsercionAscendente(int[] array) {
        // Implementación del ordenamiento por inserción ascendente
        int n = array.length;
        for (int i = 1; i < n; i++) {
            int clave = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > clave) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = clave;
        }
    }

    public static void ordenarInsercionDescendente(int[] array) {
        // Implementación del ordenamiento por inserción descendente
        int n = array.length;
        for (int i = 1; i < n; i++) {
            int clave = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] < clave) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = clave;
        }
    }

    public static void ordenarBurbujaAscendente(int[] array) {
        // Implementación del ordenamiento burbuja ascendente
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    public static void ordenarBurbujaDescendente(int[] array) {
        // Implementación del ordenamiento burbuja descendente
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] < array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    public static void ordenarSeleccionAscendente(int[] array) {
        // Implementación del ordenamiento por selección ascendente
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            int min_idx = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[min_idx]) {
                    min_idx = j;
                }
            }
            int temp = array[min_idx];
            array[min_idx] = array[i];
            array[i] = temp;
        }
    }

    public static void ordenarSeleccionDescendente(int[] array) {
        // Implementación del ordenamiento por selección descendente
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            int max_idx = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j] > array[max_idx]) {
                    max_idx = j;
                }
            }
            int temp = array[max_idx];
            array[max_idx] = array[i];
            array[i] = temp;
        }
    }
}
