public class array_09 {
    public static void main(String[] args) {
        //wap to find largest element in an array
        int [][]arr= {
                {1,2,3},
                {99,88,77,66},
                {45,35},
        };
        System.out.println(max(arr));

    }
    static int max(int[][] arr){
        if(arr.length==0)
            return -1;
        int maxVal = Integer.MIN_VALUE;
        for(int row = 0; row<arr.length;row++){
            for(int col = 0; col<arr[row].length;col++){
                if(arr[row][col]>maxVal)
                    maxVal = arr[row][col];
            }
        }
        return maxVal;

    }
}
