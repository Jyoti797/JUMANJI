import java.util.Arrays;
import java.util.Scanner;

public class array_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int [3][4];
        for(int row = 0; row<arr.length; row++){
            System.out.println("Enter input for for row" + (row+1));
            for(int col = 0; col<arr[row].length; col++){
                arr [row][col] = sc.nextInt();
            }
        }
        for(int row = 0; row<arr.length; row++){
            System.out.println(Arrays.toString(arr[row]));
        }
    }
}
