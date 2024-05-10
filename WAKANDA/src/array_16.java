public class array_16 {
    public static void main(String[] args) {
        //WAP to search a number in a 2D array and return its index
        int [][] arr={
                {11,22,33,44,55},
                {66,77,88},
                {99,125,375,444,797},
                {333,898}
        };
        int target = 444;
        System.out.println(twoDsearch(arr,target));
    }
    static boolean twoDsearch(int [][] arr, int target)
    { for(int row = 0; row<arr.length; row++){
        for(int col = 0; col<arr[row].length; col++){
            int element = arr[row][col];
            if(element==target)
                return true;
        }
    }
    return false;

    }
}
