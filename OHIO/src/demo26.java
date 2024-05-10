import java.util.Scanner;

public class demo26 {
    public static void main(String[] args) {
        

        
    }
}
class Calc{
    int a, b, sum;

    Scanner sc = new Scanner(System.in);
    public void run(){
        System.out.println("Enter 1st Number");
        a = sc.nextInt();
        System.out.println("Enter 2nd number");
        b = sc.nextInt();
        sum = a + b;
        System.out.println("Sum of two numbers is " + sum);
    }


}
