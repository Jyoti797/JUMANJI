public class array_17 {
    public static void main(String[] args) {
        int [][] arr={
                {11,22,33,44,55},
                {66,77,88},
                {99,125,375,444,797},
                {333,898}
        };
        int target = 444;
        twoDsearch(arr,target);
    }
    static void twoDsearch(int [][] arr, int target)
    { for(int row = 0; row<arr.length; row++) {
        for (int col = 0; col < arr[row].length; col++) {
            int element = arr[row][col];
            if (element == target) {
                System.out.println(target + " is present at " + row + "th row and " + col + "th coloumn");
                return;
            }
        }
    }
        System.out.println(target + " is not present in the 2D array");

    }
}
