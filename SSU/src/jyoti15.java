import java.util.Scanner;

public class jyoti15 {
    public static void main(String[] args) {
        //calculate volume of a sphere
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius of the sphere");
        int r = sc.nextInt();
        double x = 1.33 * 3.14 * Math.pow(r,3);
        int volume = (int) x;
        System.out.println("Volume of the Sphere is " + volume);

    }
}
