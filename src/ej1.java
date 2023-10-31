import java.util.Arrays;
public class ej1 {
    public static void main(String[] args) {
        /*
        1.	Ordenar un array de números enteros de menor a mayor.
         */
        int[] order_array = {9,8,7,6,5,4,3,2,1};
        Arrays.sort(order_array);
        System.out.println("Los elementos ordenados de menor a mayor quedan:");
        for (int i: order_array){
            System.out.print(i + " ");
        }
    }

}
