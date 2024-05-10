import java.util.Scanner;

public class chap3_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        boolean b = name.startsWith("Jyo");
        System.out.println(b);
    }
}
