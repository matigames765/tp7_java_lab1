import java.util.Scanner;
public class ej9 {
    public static void main(String[] args) {
        /*
        9.	Ordenar un array de números enteros utilizando el algoritmo de ordenamiento burbuja.
         */
        System.out.println("Vas a ingresar elementos a un array y se ordenaran de menor a mayor:");
        Scanner sc = new Scanner(System.in);
        int[] int_array = new int[10];
        for (int i = 0; i < int_array.length; i++){
            System.out.print("Elemento " + (i + 1) + " = ");
            int_array[i] = sc.nextInt();
        }
        int length = 10;

        for (int i = 0; i < 9; i++){
            for (int j = 0; j < length - 1; j++){
                if (int_array[j] > int_array[j + 1]){
                    int auxiliar_variable = int_array[j];
                    int_array[j] = int_array[j + 1];
                    int_array[j + 1] = auxiliar_variable;
                }
            }
            length--;
        }

        System.out.println("El arreglo ordenado de menor a mayor queda:");
        for (int i = 0; i < int_array.length; i++){
            System.out.print(int_array[i] + " ");
        }
    }
}
