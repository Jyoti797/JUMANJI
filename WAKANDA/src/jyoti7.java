public class jyoti7 {
    public static void main(String[] args) {
        for(int i = 1; i<1000; i++){
            if(isPallindrome(i)){
                System.out.println(i);
            }
        }

    }
    static boolean isPallindrome(int num){
        int reverse = 0;
        int temp = num;
        while(temp>0){
            int rem = temp%10;
            reverse = 10 * reverse + rem;
            temp = temp/10;
        }
        if(num==reverse)
            return true;
        else
            return false;
    }
}
