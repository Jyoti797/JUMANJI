public class oops_08 {
    public static void main(String[] args) {
        Cylinder indane = new Cylinder();
        indane.radius=10;
        indane.height = 7;
        System.out.println("Volume of the indane cylinder is " + indane.volume());
        System.out.println("Total surafce area of the cylinder is " + indane.totalSurfaceArea());

    }
}
class Cylinder{
    int radius;
    int height;
    float volume(){
        float v = 3.14f * radius * radius * height;
        return v;
    }
    float totalSurfaceArea(){
        float tsa = 2 * 3.14f * radius * (radius + height);
        return tsa;
    }
}
