public class jassy_05 {
    public static void main(String[] args) {
        B obj1 = new B();
        obj1.set(10,12);
        obj1.sum();
        System.out.println("Total is " + obj1.total);
    }
}
class A {
    int i;
    int j;
    void set(int x, int y){
        i = x;
        j = y;
    }
}
//A is not acessible here \
class B extends A{
    int total;
    void sum(){
        total = i+j;
        //error j is not acessible here
    }
}
