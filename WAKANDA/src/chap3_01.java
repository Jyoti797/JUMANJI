import java.util.Locale;
import java.util.Scanner;

public class chap3_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = sc.nextLine();
        String name2 = name.toLowerCase(Locale.ROOT);
        System.out.println(name2);
    }
}
