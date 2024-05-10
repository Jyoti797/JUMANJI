public class oops_05 {
    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.colour = "blue";
        Pen p2 = new Pen();
        p2.colour = "red";
        Pen p3 = new Pen();
        p3.colour = "green";
        p1.printColour();
        p2.printColour();
        p3.printColour();
    }
}
class Pen{
    String colour;
    public void printColour(){
        System.out.println("The colour of this pen is " + this.colour);
    }
}
