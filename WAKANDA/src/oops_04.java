public class oops_04 {
    public static void main(String[] args) {
        student s1 = new student();
        s1.name = "Aviram";
        s1.age = 23;
        s1.getInfo();
        student s2 = new student();
        s2.name = "Shradhha";
        s2.age = 21;
        s2.getInfo();
    }
}
 class student{
    String name;
    int age;
    public void getInfo(){
        System.out.println("The name of the student is " + this.name);
        System.out.println("The age of the student is " + this.age);
    }
}
