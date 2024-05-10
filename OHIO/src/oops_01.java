public class oops_01 {
    public static void main(String[] args) {
        Box pencildabba = new Box();
        Box tiffinDabba = new Box(12,11,9);
        Box GolDabba = new Box(11);
        System.out.println("volume of tiffin dabba is " + tiffinDabba.volume());
        System.out.println("volume of goldabba is " + GolDabba.volume());
    }
}
class Box{
    int length;
    int breadth;
    int height;

    Box (Box ob){
        length = ob.length;
        breadth = ob.breadth;
        height = ob.height;
    }
    Box (int l, int b, int h){
        length = l;
        breadth = b;
        height = h;
    }
    Box  (){
        //when no dimensions specified
        length = -1;
        breadth = -1;
        height = -1;
    }
    Box (int l){
        height = breadth = length=l;
    }
    int volume(){
        return length * breadth * height;
    }
}
