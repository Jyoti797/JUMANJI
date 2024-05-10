import java.util.Scanner;

public class jyoti_03 {
    public static void main(String[] args) {
        Student jyoti = new Student();
        Student abhijit = new Student();
        jyoti.totalMarksCalculation();
        abhijit.totalMarksCalculation();
    }
}
class Student{
    String name;
    int rollNumber;
    int physics;
    int chemistry;
    int biology;
    int total;

    Scanner sc = new Scanner(System.in);
    void totalMarksCalculation(){
        System.out.println("Enter name of the student");
        this.name = sc.nextLine();
        System.out.println("Enter roll number of the student");
        this.rollNumber = sc.nextInt();
        System.out.println("Enter marks of the student in physics");
        this.physics = sc.nextInt();
        System.out.println("Enter marks of the student in chemistry");
        this.chemistry = sc.nextInt();
        System.out.println("Enter marks of the student in chemistry");
        this.biology = sc.nextInt();
        total = physics + chemistry + biology;
        System.out.println("total marks of " + this.name + " is " + this.total);

    }
}
