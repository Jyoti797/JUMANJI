import java.util.Scanner;

public class jyoti5 {
    static int GCD ( int a, int b){
        if(a==0)
            return b;
        else
            return GCD( b%a, a);
    }
    static int LCM ( int a, int b){
        return (a*b)/ GCD(a,b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st Number");
        int a = sc.nextInt();
        System.out.println("Enter 2nd Number");
        int b = sc.nextInt();
        int x = GCD(a,b);
        int y = LCM(a,b);
        System.out.println("GCD of " + a + " and " + b + " is " + x);
        System.out.println("LCM of " + a + " and " + b + " is " + y);
    }
}
