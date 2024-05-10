public class chap4_05 {
    public static void main(String[] args) {
        System.out.println(maxNum(13,56, 97));
    }
    static int maxNum(int a, int b, int c){
        if(a>b && a>c)
            return a;
        else if(b>a && b>c)
            return b;
        else
            return c;
    }
}
