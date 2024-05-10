public class oops_09 {
    public static void main(String[] args) {
        Cuboid pencilBox = new Cuboid();
        pencilBox.volume(10,12,8);
    }
}
class Cuboid{
    int length;
    int breadth;
    int height;
    void volume(int l, int b, int h){
       int v = l * b * h;
        System.out.println("The volume of the cuboid is " + v);
    }
    void tsa(int l, int b, int h){
        int tsa = 2 * (l*b + b*h + h*l);
        System.out.println("Total surface area of the cuboid is " + tsa);
    }
}
