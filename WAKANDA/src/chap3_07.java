import java.util.Scanner;

public class chap3_07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = sc.nextLine();
        boolean b = name.endsWith("ta");
        System.out.println(b);

    }
}
