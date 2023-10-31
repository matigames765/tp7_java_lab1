import java.util.Collections;
import java.util.Arrays;
public class ej2 {
    public static void main(String[] args) {
        /*
        2.	Ordenar un array de números enteros de mayor a menor.
         */
        Integer [] order_array = {1,2,3,4,5,6,7,8,9,10,11,12};
        Arrays.sort(order_array,Collections.reverseOrder());
        System.out.println("Los elementos ordenados del array de mayor a menor quedan:");
        for (int i: order_array){
            System.out.print(i + " ");
        }

    }
}
