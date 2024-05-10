import java.util.Scanner;

public class jyoti12 {
    public static void main(String[] args) {
        //Interest is compounded annually
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Principle");
        int principle = sc.nextInt();
        System.out.println("Enter rate of interest");
        int r = sc.nextInt();
        System.out.println("Enter time period in year");
        int time = sc.nextInt();
        float x = (float) (100+r)/100;
        double a =  principle * Math.pow(x,time);
        int amount = (int) a;
        int ci = amount - principle;
        System.out.println("Amount after " + time + " years is " + amount);
        System.out.println("Compound interest after " + time + " years is " + ci);


        
    }
}
