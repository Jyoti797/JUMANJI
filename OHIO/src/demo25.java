public class demo25 {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        c1.radius = 21;
        c1.getPerimetere();
        c1.getArea();
    }
}
interface  Shape{
    void getPerimetere();
    void getArea();
}
class Circle implements Shape{
    int radius;
    float p;
    float a;

    @Override
    public void getPerimetere() {
        p = 2 * 3.14f * radius;
        System.out.println("Perimetere of the circle is " + p);
    }

    @Override
    public void getArea() {
        a = 3.14f * radius * radius;
        System.out.println("Area of the circle is " + a);
    }
}
