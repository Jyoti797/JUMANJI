public class oops_11 {
    public static void main(String[] args) {
        shape cuboid = new shape();
        int vol = cuboid.volume();
        System.out.println("Volume of the cuboid is " + vol);
    }
}
 class shape{
    int length;
    int breadth;
    int height;
    shape(){
        System.out.println("Constructing box");
        length = 10;
        breadth = 15;
        height = 8;
    }
    int volume(){
        return length * breadth * height;
    }
}
