public class chap4_07 {
    public static void main(String[] args) {
        int n = 100;
        for(int i = 1; i<n; i++){
            if(isPrime(i)){
                System.out.println(i);
            }
        }
    }
    static boolean isPrime(int num){
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
