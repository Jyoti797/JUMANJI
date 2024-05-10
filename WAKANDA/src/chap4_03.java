import java.util.Scanner;

public class chap4_03 {
    public static void main(String[] args) {
        int sum = 0;
        int mul = 1;
        Scanner sc = new Scanner(System.in);
        int [] array = new int[10];
        for(int i = 0; i<array.length; i++){
            System.out.println("Enter a number " + i);
            array[i] = sc.nextInt();
        }
        for(int i = 0; i<array.length; i++){
            if(array[i]%2==0)
                sum = sum + array[i];
        }
        System.out.println("The summation of even numbers is " + sum);
        for(int i = 0; i< array.length; i++){
            if(array[i]%2!=0)
                mul = mul * array[i];
        }
        System.out.println("Multiplication of odd numbers is " + mul);

    }
}
