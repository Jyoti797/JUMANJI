public class array_19 {
    public static void main(String[] args) {
        //WAP to find number of 2digit numbers in a 2D array
         int [][] arr = {
                       {11,22,33,44},
                       {77,88,99,100},
                       {345,989,676,233}
               };
        findNubers(arr);
    }
    static void findNubers(int [][] arr){

        for(int row = 0; row<arr.length;row++ ){
            for(int col = 0; col<arr[row].length; col++) {
                numOfdigits(arr[row][col]);
            }
        }
    }

    static void numOfdigits(int num){
        if(num<0)
            num = num * -1;
        int ans = (int)(Math.log10(num) + 1);
        if(ans%2==0)
            System.out.println(num);
    }
}
