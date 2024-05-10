import java.util.Scanner;

public class chap4_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre salary of the employee");
        double salary = sc.nextInt();
        if(salary>250000 && salary<500000)
            salary = 0.9 * salary;
        else if (salary>500000 && salary<750000)
            salary = 0.85 * salary;
        else if(salary>750000 && salary<1000000)
            salary = 0.8 * salary;
        else if(salary>1000000 && salary<1500000)
            salary = 0.75 * salary;
        else
            salary = 0.7 * salary;
        System.out.println("Salary after deduction of tax is " + salary);
    }
}
