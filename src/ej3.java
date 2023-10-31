import java.util.Arrays;
public class ej3 {
    public static void main(String[] args) {
        /*
        3.	Ordenar un array de números flotantes de menor a mayor.
         */
        float[] order_float_array = {1.2f,3.1f,1.1f,4.5f,6.7f};
        Arrays.sort(order_float_array);
        System.out.println("Los elementos flotantes ordenados de menor a mayor quedan:");
        for (float i: order_float_array){
            System.out.print(i + " ");
        }
    }
}
