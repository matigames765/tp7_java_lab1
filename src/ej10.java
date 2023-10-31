public class ej10 {
    public static void main(String[] args) {
        /*
        10.	Ordenar un array de números enteros utilizando el algoritmo de ordenamiento
        por selección.
         */
        int[] array = {64, 34, 25, 12, 22, 11, 90};

        System.out.println("Array original:");
        imprimirArray(array);

        int n = array.length;

        for (int i = 0; i < n - 1; i++) {
            int indiceMinimo = i;

            // Encuentra el índice del mínimo elemento en el subarray no ordenado
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[indiceMinimo]) {
                    indiceMinimo = j;
                }
            }

            // Intercambia el elemento mínimo con el elemento en la posición actual
            int temp = array[i];
            array[i] = array[indiceMinimo];
            array[indiceMinimo] = temp;
        }

        System.out.println("\nArray ordenado por selección:");
        imprimirArray(array);
    }
    public static void imprimirArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
