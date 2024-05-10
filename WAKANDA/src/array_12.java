import java.util.Arrays;

public class array_12 {
    public static void main(String[] args) {
        int [] arr = { 11, 22, 33, 44, 55, 66, 77, 88, 99};
        reverse(arr);
    }
    static void reverse(int [] arr){
         for(int i = 0; i<arr.length/2; i++){
             int temp = arr[i];
             arr[i] = arr[arr.length-1-i];
             arr[arr.length-1-i] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
