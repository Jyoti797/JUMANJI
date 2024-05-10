import java.util.Scanner;
//To calculate LCM of 2 numbers

public class jyoti3 {

    static int GCD(int a, int b) {
        if (a == 0)
            return b;
        else
            return GCD(b % a, a);
    }
    static int LCM(int a, int b){
        return (a * b)/ GCD(a, b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number");
        int a = sc.nextInt();
        System.out.println("Enter 2nd Number");
        int b = sc.nextInt();
        int x = LCM(a,b);
        System.out.println("L.C.M of " + a + " and  " + b + " is " + x);
    }
}
