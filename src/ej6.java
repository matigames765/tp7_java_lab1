import java.util.Collections;
import java.util.Arrays;
public class ej6 {
    public static void main(String[] args) {
        /*
        6.	Ordenar un array de cadenas de texto en orden inverso.
         */
        String [] order_string1_array = {"matias","ahi","santiago","jorge","zapato","banco"};
        Arrays.sort(order_string1_array,Collections.reverseOrder());
        System.out.println("El arreglo de cadenas ordenado en orden inverso queda:");
        for (String i: order_string1_array){
            System.out.print(i + " ");
        }
    }
}
