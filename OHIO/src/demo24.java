public class demo24 {
    public static void main(String[] args) {
        Lion sheru = new Lion();
        Deer gulua = new Deer();
        sheru.sleep();
        gulua .eat();
    }
}
abstract class Animal{
    abstract void eat();
    abstract void sleep();
}
class Lion extends Animal{
    void eat(){
        System.out.println("Lion eats meat");
    }
    void sleep(){
        System.out.println("Lion rarely sleeps");
    }
}
class Deer extends Animal{
    void eat(){
        System.out.println("Deer eats grass");
    }
    void sleep(){
        System.out.println("Deer sleeps in forest");
    }
}
