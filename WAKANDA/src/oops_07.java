public class oops_07 {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        c1.radius=10;
        c1.area();
        c1.perimetere();
    }
}
class Circle{
    int radius;
    void perimetere(){
        float p =  2 * 3.14f * radius;
        System.out.println("The perimetere of the circle is " + p);

    }
    void area(){
        float a = 3.14f * radius * radius;
        System.out.println("The area of the circle is " + a);
    }
}
