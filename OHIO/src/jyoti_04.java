import java.util.Scanner;

public class jyoti_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number you want to calculate factorial");
        int x = sc.nextInt();
        System.out.println("factorial of " + x + "is " + fact(x));
    }
    static int fact(int num){
        if(num==0)
            return 1;
        else
            return num * fact(num-1);
    }
}
