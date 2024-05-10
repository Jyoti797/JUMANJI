public class oops_02 {
    public static void main(String[] args) {
        //passing object through reference
        Test jassy = new Test(111,222);
        System.out.println("jassy.a and jassy.b before call " + jassy.a + "  " + jassy.b);
        jassy.meth(jassy);
        System.out.println("jassy.a and jassy.b after call " + jassy.a + "  " + jassy.b);
    }
}
class Test{
    int a, b;
    Test(int x, int y){
        a = x;
        b = y;
    }
    //pass an object
    void meth(Test mg){
        mg.a *= 10;
        mg.b /= 10;
    }
}