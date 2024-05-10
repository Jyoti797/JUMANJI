import java.util.Scanner;


public class jyoti8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double radius;
        float area;
        System.out.println("Enter radius of the circle");
        radius = sc.nextInt();
        area =  3.14f * (float) Math.pow(radius,2);
        System.out.println("Area of the circle is " + area);

    }
}
