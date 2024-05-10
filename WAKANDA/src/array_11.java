public class array_11 {
    public static void main(String[] args) {
        //WAP tp find maximum element in a range in a array
        int [] arr = {11,22,33,44,55,66,77,88,99,100,151,243,456,7879};
        int start = 3;
        int end = 9;
        System.out.println(minRange(arr,start,end));
    }
    static int  minRange(int []arr, int start, int end)
    {   int minVal = Integer.MAX_VALUE;
        for(int i=start; i<end; i++){
            if(arr[i]<minVal)
                minVal = arr[i];
        }
        return minVal;
    }
}
