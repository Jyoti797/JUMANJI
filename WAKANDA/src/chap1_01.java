import java.util.Scanner;

public class chap1_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks in physics");
        int phy = sc.nextInt();
        System.out.println("Enter marks in Chemistry");
        int chem = sc.nextInt();
        System.out.println("Enter marks in math");
        int math =  sc.nextInt();
        System.out.println("Enter marks in biology");
        int bio = sc.nextInt();
        System.out.println("Enter marks in english");
        int eng = sc.nextInt();
        System.out.println("Enter marks in History and Geography");
        int ssc = sc.nextInt();
        int total = phy + chem + bio + math + eng + ssc;
        float avg = (float)total/6;
        System.out.println("Total mark of the student is " + total);
        System.out.println("Percentage of the student is " + avg);



    }
}
