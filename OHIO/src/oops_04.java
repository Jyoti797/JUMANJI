public class oops_04 {
    public static void main(String[] args) {
        Rec sum = new Rec();
        System.out.println("Addition of numbers till 20 is " + sum.Summation(20));
    }
}
class Rec{
    int Summation(int num){
        int result = 0;
        if(num==0)
            return 0;
        result = num + Summation(num-1);
        return result;

    }


}
