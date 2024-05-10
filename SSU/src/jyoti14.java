import java.util.Scanner;

public class jyoti14 {
    public static void main(String[] args) {
        //calculate the volume of a cone
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius of cone");
        int r = sc.nextInt();
        System.out.println("Enter height of the cone");
        int h = sc.nextInt();
        double x = 0.33 * 3.14 * h * Math.pow(r,2);
        int volume = (int) x;
        System.out.println("Volume of the Cone is " + volume);

    }
}
