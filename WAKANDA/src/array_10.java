public class array_10 {
    public static void main(String[] args) {
        //WAP to find out minimum value of a 2D array
        int [][] arr = {
                {343,66,299,677,588, 899},
                {566,786,34, 121},
                {234,567,796,11}
        };
        System.out.println(min(arr));

    }

    static int min(int[][] arr){
        int minVal = Integer.MAX_VALUE;
        for(int row = 0; row<arr.length;row++){
            for(int col = 0; col<arr[row].length; col++){
                if(arr[row][col]<minVal)
                    minVal = arr[row][col];
            }
        }
        return minVal;
    }
}
