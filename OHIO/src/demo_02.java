import java.util.Scanner;

public class demo_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String name = sc.nextLine();
        System.out.println(middleCharInString(name));

    }
    static String middleCharInString(String name){
        int l = name.length();
        int mid = 0;
        if(l%2!=0)
            mid = l/2 + 1;
        else
            mid = l/2;
        return name.substring(mid);

    }
}
