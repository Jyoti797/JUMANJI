import java.util.Scanner;

public class chap3_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        String name1 = sc.nextLine();
        String name2 = name1.substring(4,15);
        System.out.println(name2);

    }
}
