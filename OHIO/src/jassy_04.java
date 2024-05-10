public class jassy_04 {
    public static void main(String[] args) {
        //overloading variable argument methords
        vaTest(11,22,33,45,56,67,78,89,90);
        vaTest(true,false,true,false);
        vaTest(33.33f,16.66f,14.28f,12.5f,11.11f,9.09f,8.33f,7.69f);
    }
    static void vaTest(int...v){
        System.out.println("vaTest(int...) contains " + v.length + " contents");
        for(int x:v)
            System.out.println(x);
        System.out.println();
    }
    static void vaTest(boolean...v){
        System.out.println("vaTest(boolean...) contains " + v.length +" contents ");
        for(boolean x:v)
            System.out.println(x);
        System.out.println();
    }
    static void vaTest(float...v){
        System.out.println("vaTest(float...v) contains " + v.length + " contents");
        for(float x:v)
            System.out.println(x);
        System.out.println();
    }
}
