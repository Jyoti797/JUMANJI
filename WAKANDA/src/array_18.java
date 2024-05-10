public class array_18 {
    public static void main(String[] args) {
        int [][] arr = {
                {11,22,33,44},
                {77,88,99,100},
                {345,989,676,233}
        };
        System.out.println(twoDmaximum(arr));

    }
    static int twoDmaximum (int [][] arr){
        int maxVal = Integer.MIN_VALUE;
        for(int row = 0; row<arr.length; row++){
            for(int col = 0; col<arr[row].length; col++){
                if(arr[row][col]>maxVal)
                    maxVal = arr[row][col];
            }
        }
        return maxVal;
    }
}
