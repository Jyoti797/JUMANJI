import java.util.Scanner;

public class chap4_02 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<10; i++){
            System.out.println("Enter number" + i);
            arr[i] = sc.nextInt();
        }
            int max = arr[0];
            for( int i = 1; i<arr.length; i++){
                if (arr[i]>max)
                    max = arr[i];
            }
            System.out.println("The largest element is " + max);
            int min = arr[0];
            for(int i = 0; i<arr.length; i++){
                if(arr[i]<min)
                    min = arr[i];
            }
        System.out.println("The minimum element is " + min);
    }
}
