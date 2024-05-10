public class chap4_08 {
    public static void main(String[] args) {
        for(int i = 200; i<300; i++){
            if(isPallindrome(i)){
                System.out.println(i);
            }
        }
    }
    static boolean isPallindrome(int num){
        int temp = num;
        int result = 0;
        while(temp>0){
            int rem = temp%10;
            result = 10 * result + rem;
            temp = temp/10;
        }
        if(num==result)
            return true;
        else
            return false;
    }
}
