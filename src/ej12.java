public class ej12 {
    public static void main(String[] args) {
        /*
        12.	Ordenar un array de números enteros utilizando el algoritmo de ordenamiento por mezcla.
         */
        int[] array = {64, 34, 25, 12, 22, 11, 90};

        System.out.println("Array original:");
        imprimirArray(array);

        ordenarPorMezcla(array, 0, array.length - 1);

        System.out.println("\nArray ordenado por mezcla:");
        imprimirArray(array);
    }
    public static void ordenarPorMezcla(int[] array, int izquierda, int derecha) {
        if (izquierda < derecha) {
            int medio = (izquierda + derecha) / 2;
            ordenarPorMezcla(array, izquierda, medio);
            ordenarPorMezcla(array, medio + 1, derecha);
            combinar(array, izquierda, medio, derecha);
        }
    }

    public static void combinar(int[] array, int izquierda, int medio, int derecha) {
        int n1 = medio - izquierda + 1;
        int n2 = derecha - medio;

        int[] mitadIzquierda = new int[n1];
        int[] mitadDerecha = new int[n2];

        for (int i = 0; i < n1; i++) {
            mitadIzquierda[i] = array[izquierda + i];
        }

        for (int j = 0; j < n2; j++) {
            mitadDerecha[j] = array[medio + 1 + j];
        }

        int i = 0, j = 0;
        int k = izquierda;

        while (i < n1 && j < n2) {
            if (mitadIzquierda[i] <= mitadDerecha[j]) {
                array[k] = mitadIzquierda[i];
                i++;
            } else {
                array[k] = mitadDerecha[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            array[k] = mitadIzquierda[i];
            i++;
            k++;
        }

        while (j < n2) {
            array[k] = mitadDerecha[j];
            j++;
            k++;
        }
    }

    public static void imprimirArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
