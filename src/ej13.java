public class ej13 {
    public static void main(String[] args) {
        /*
        13.	Ordenar un array de números enteros utilizando el algoritmo de ordenamiento shell.
         */
        int[] array = {64, 34, 25, 12, 22, 11, 90};

        System.out.println("Array original:");
        imprimirArray(array);

        int n = array.length;

        int brecha = n / 2;
        while (brecha > 0) {
            for (int i = brecha; i < n; i++) {
                int temp = array[i];
                int j = i;
                while (j >= brecha && array[j - brecha] > temp) {
                    array[j] = array[j - brecha];
                    j -= brecha;
                }
                array[j] = temp;
            }
            brecha /= 2;
        }

        System.out.println("\nArray ordenado por ordenamiento Shell:");
        imprimirArray(array);
    }
    public static void imprimirArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
