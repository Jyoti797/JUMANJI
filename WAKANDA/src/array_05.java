import java.util.Arrays;

public class array_05 {
    public static void main(String[] args) {
        int [][] arr = {
                {11,22,33},
                {44,55,66,77,88},
                {101,125,375}
        };
        for(int row = 0; row<arr.length; row++){
            System.out.println(Arrays.toString(arr[row]));
        }
    }
}
