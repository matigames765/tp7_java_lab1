import java.util.Collections;
import java.util.Arrays;
public class ej4 {
    public static void main(String[] args) {
        /*
        4.	Ordenar un array de números flotantes de mayor a menor.
         */
        Float [] order_float1_array = {1.2f,3.1f,1.1f,4.5f,6.7f};
        Arrays.sort(order_float1_array,Collections.reverseOrder());
        System.out.println("Los elementos flotantes ordenados de mayor a menor quedan:");
        for (float i: order_float1_array){
            System.out.print(i + " ");
        }
    }
}
