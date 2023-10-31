public class ej11 {
    public static void main(String[] args) {
        /*
        11.	Ordenar un array de números enteros utilizando el algoritmo de ordenamiento por inserción.
         */
        int[] array = {64, 34, 25, 12, 22, 11, 90};

        System.out.println("Array original:");
        imprimirArray(array);

        int n = array.length;

        for (int i = 1; i < n; i++) {
            int valorActual = array[i];
            int j = i - 1;

            // Mueve los elementos mayores que el valor actual una posición hacia adelante
            while (j >= 0 && array[j] > valorActual) {
                array[j + 1] = array[j];
                j--;
            }

            // Coloca el valor actual en la posición correcta
            array[j + 1] = valorActual;
        }

        System.out.println("\nArray ordenado por inserción:");
        imprimirArray(array);
    }
    public static void imprimirArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

}
