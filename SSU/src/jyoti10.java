import java.util.Scanner;

public class jyoti10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float volume;
        int radius, height;
        System.out.println("radius of the Cone is");
        radius = sc.nextInt();
        System.out.println("height of the Cone is ");
        height = sc.nextInt();
        volume = 0.33f * 3.14f * height * (float) Math.pow(radius, 2);
        System.out.println("Volume of the Cone is " + volume);
    }
}
