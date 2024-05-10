import java.util.Scanner;

public class jyoti4 {
    static int GCD(int a, int b)
    {
        if(a==0)
            return b;
        else
            return GCD(b%a, a);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number");
        int a = sc.nextInt();
        System.out.println("Enter 2nd Number");
        int b = sc.nextInt();
        int z = GCD(a, b);
        System.out.println("LCM of " + a + " and " + b + " is " + z);

    }
}
