import java.util.Scanner;

public class jyoti7 {
    static  void ArmstromgNum(int num){
        int  result = 0;
        int rem, length = 0;
        int temp1, temp2;
        temp1 = num;
        temp2 = num;
        while(temp1!=0)
        {
            temp1 = temp1/10;
            length = length + 1;
        }
        while(temp2!=0)
        {
            rem = temp2%10;
            result = result + (int)Math.pow(rem, length);
            temp2 = temp2/10;
        }
        if(num==result)
            System.out.println(num + " is an Armstrong number");
        else
            System.out.println(num + " is not an Armstrong Number");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        ArmstromgNum(num);

    }
}
