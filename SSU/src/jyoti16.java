import java.util.Scanner;

public class jyoti16 {
        static void decToBinary(int num) {
            int[] binaryNum = new int[10];
            int i = 0;
            while (num > 0) {
                binaryNum[i] = num % 2;
                num = num / 2;
                i++;
            }
            for (int j = i-1 ; j>=0; j--) {
                System.out.print(binaryNum[j]);
            }
        }
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
        System.out.println("Enter Decimal number");
        int num = sc.nextInt();
        System.out.println("Binary number is ");
        decToBinary(num);
        }
    }

