import java.util.Scanner;

public class chap4_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius of the circle");
        int radius = sc.nextInt();
        System.out.println("Perimetere of the circle is " + perimetereOfCircle(radius));
        System.out.println("Area of the circle is " + areaOfCircle(radius));
    }
    static float perimetereOfCircle(int radius){
        float perimetere =  2 * 3.14f * radius;
        return perimetere;
    }
    static float areaOfCircle(int radius){
        float area = 3.14f * radius * radius;
        return area;
    }

}
