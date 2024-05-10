public class oops_13 {
    public static void main(String[] args) {
        test obj1 = new test(100,22);
        test obj2 = new test(75,35);
        System.out.println(obj1.equalTo(obj2));
    }
}
class test{
    int a,b;
    test(int i, int j){
        a = i;
        b = j;
    }
    //returns true if maghiaa is equal to invoking object
    boolean equalTo( test maghiaa){
        if(maghiaa.a ==a && maghiaa.b == b)
            return true;
        else
            return false;
    }
}
