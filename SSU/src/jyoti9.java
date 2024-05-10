import java.util.Scanner;

public class jyoti9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Area of the Quadrilateral");
        int area = sc.nextInt();
        float side = (float) Math.sqrt(area);
        System.out.println("The length of the Quadrilateral is " + side);
    }
}
