import java.util.Scanner;

public class jyoti11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Principle ");
        int p = sc.nextInt();
        System.out.println("Enter Time period(in months)");
        int t = sc.nextInt();
        System.out.println("Enter rate of interest");
        float r = sc.nextFloat();
        float si = (float) (p * t * r)/1200;
        int amount = (int) (si + p);
        System.out.println("Simple interest is " + si);
        System.out.println("Amount is " + amount);

    }
}
