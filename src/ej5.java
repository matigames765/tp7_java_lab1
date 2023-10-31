import java.util.Arrays;
public class ej5 {
    public static void main(String[] args) {
        /*
        5.	Ordenar un array de cadenas de texto en orden alfabético.
         */
        String [] order_string_array = {"matias","ahi","santiago","jorge","zapato","banco"};
        Arrays.sort(order_string_array);
        System.out.println("Las cadenas del arreglo ordenadas en orden alfabetico quedan: ");
        for (String i: order_string_array){
            System.out.print(i + " ");
        }
    }
}
