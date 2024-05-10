public class jassy_06 {
    public static void main(String[] args) {
        DabbaWeight MudhiDabba = new DabbaWeight(10,20,15,25);
        DabbaWeight ChiniDabba = new DabbaWeight(12,13,14,5);
        System.out.println("Volume of MudhiDabba is " + MudhiDabba.volume());
        System.out.println("weight of MudhiDabba is " + MudhiDabba.mass);
        System.out.println("Volume of ChiniDabba is " + ChiniDabba.volume());
        System.out.println("weigth of ChiniDabba is " + ChiniDabba.mass);
    }
}
class Dabba{
    int width;
    int height;
    int depth;
    int mass;
    //construct clone of an object
    Dabba(Dabba obj){
    //pass object to constructor
        width = obj.width;
        height = obj.height;
        depth = obj.depth;
    }
    //constructor used when all dimensions specified
    Dabba(int w, int h, int d){
        width = w;
        height = h;
        depth = d;
    }
    //constructor used when no dimensions specified
    Dabba(){
        width = -1;
        height = -1;
        depth = -1;
    }
    //constructor used when cube is created
    Dabba(int length){
        width = height = depth = length;
    }
    //calculate the volume
    int volume(){
        int v = width * height * depth;
        return v;
    }
}
class DabbaWeight extends Dabba{
    DabbaWeight(int w, int h, int d, int m){
        width = w;
        height = h;
        depth = d;
        mass = m;
    }
}

