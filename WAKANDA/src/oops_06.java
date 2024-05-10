public class oops_06 {
    public static void main(String[] args) {
        Box b1 = new Box();
        b1.breadth =10;
        b1.length =25;
        b1.height = 35;
        int volume = b1.height * b1.breadth * b1.length;
        System.out.println("Volume of the box is " + volume);

    }
}
class Box{
    int breadth;
    int length;
    int height;
}
