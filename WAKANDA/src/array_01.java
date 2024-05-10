import java.util.Arrays;
import java.util.Scanner;

public class array_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[10];
        for(int i = 0; i<array.length ;i++) {
            System.out.println("Enter elements of array");
            array[i] = sc.nextInt();
        }
            for(int i = 0; i<array.length/2; i++){
                array[i] = array[array.length-1-i];
            }

        System.out.println(Arrays.toString(array));

    }

}
