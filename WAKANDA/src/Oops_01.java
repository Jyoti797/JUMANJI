public class Oops_01 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Jyoti Ranjan Mohanta";
        s1.age = 24;
        s1.getInfo();
        Student s2 = new Student();
        s2.name = "Asish Kant Arya Shivam";
        s2.age = 25;
        s2.getInfo();
        Student s3 = new Student();
        s3.name = "Jashobanta Mohanty";
        s3.age = 26;
        s3.getInfo();
        Student s4 = new Student();
        s4.name = "Aviram Mohapatra";
        s4.age = 22;
        s4.getInfo();
        Student s5 = new Student();
        s5.name = "Bibekananda Barik";
        s5.age = 21;
        s5.getInfo();
        Student s6 = new Student();
        s6.name = "Riteek Ku Pareek";
        s6.age = 24;
        s6.getInfo();

    }
}
    class Student{
        String name;
        int age;
        public void getInfo(){
            System.out.println("The name of the student is " + this.name);
            System.out.println("The age of the student is " + this.age);
        }
    }

