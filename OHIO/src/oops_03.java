public class oops_03 {
    public static void main(String[] args) {
        Factorial f = new Factorial();
        System.out.println("Factorial of 5 is " + f.fact(5));
    }
}
class Factorial{
    int fact(int num){
        int result;
        if(num==1)
            return 1;
        result = fact(num-1) * num;
        return result;
    }
}
