public class jyoti6 {
    public static void main(String[] args) {
        for(int i = 1; i<=100; i++){
            if(prime(i)){
                System.out.println(i);
            }
        }

    }
    static boolean prime(int num){
        int count = 0;
        for(int i = 2; i<num; i++){
            if(num%i==0)
                count = count + 1;
        }
        if(count==0)
            return true;
        else
            return false;
    }
}
