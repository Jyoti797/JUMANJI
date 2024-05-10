import java.util.Arrays;

public class array_04 {
    public static void main(String[] args) {
        int [] arr = {11,22,33,44,55,66,77,88};
        change(arr);
        System.out.println(Arrays.toString(arr));
    }
    static int change(int [] arr){
        arr[0] = 99;
        return arr[0];
    }
}
