import java.util.Scanner;

public class chap1_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter tempreture in celcius");
        int cel = sc.nextInt();
        float farenhit = cel * 1.8F + 32;
        System.out.println("Tempreture is " + farenhit + "farenhits");

    }
}
