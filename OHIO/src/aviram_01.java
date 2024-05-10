import java.util.Scanner;

public class aviram_01 {
    public static void main(String[] args) {
        Emp salonee = new Emp();
        Emp javli = new Emp();
        salonee.salaryCalculation();
        javli.salaryCalculation();
    }
}
class Emp{
    int id;
    String name;
    int basicSalary;
    float ta;
    float hra;
    float da;
    double grossSalary;
    double netSalary;
    Scanner sc = new Scanner(System.in);
     void  salaryCalculation(){
        System.out.println("Enter employee name");
        this.name = sc.nextLine();
        System.out.println("Enter basic salary");
        this.basicSalary = sc.nextInt();
        System.out.println("Enter travel allowence in percentage");
        this.ta = sc.nextFloat();
        System.out.println("Enter dearness allowence in percentage");
        this.da = sc.nextFloat();
        System.out.println("Enter house rent allowence in percentage");
        this.hra = sc.nextFloat();
        ta = basicSalary * ta/100;
        da = basicSalary * da/100;
        hra = basicSalary * hra/100;
        grossSalary = basicSalary + ta + da + hra;
        netSalary = basicSalary + ta + da;
        System.out.println("Gross salary is " + grossSalary);
        System.out.println("Net salary is " + netSalary);
    }



}

