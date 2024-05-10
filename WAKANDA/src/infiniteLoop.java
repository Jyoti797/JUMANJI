public class infiniteLoop {
    public static void main(String[] args) {
        int [] arr = {3, 5, 7, 10, 90, 100, 130, 148, 160, 170};
        int target = 100;
        System.out.println(ans(arr,target));
    }
    static  int ans(int[] arr, int target){
        //1st start with a box of size 2
        int start = 0;
        int end = 1;
        //to calculate the range of start & end
        while(target>arr[end]){
            int temp = end + 1;
            //double the box value
            end = end + (end-start+1) * 2;
            start = temp;
        }
        int index = binarySearch(arr,target,start,end);
        return index;

    }
    static int binarySearch(int[] arr, int target, int start, int end){
        while(start<=end){
            int mid = start + (end-start)/2;
            if(target<arr[mid])
                end = mid-1;
            else if(target>arr[mid])
                start=mid+1;
            else
                return mid;
        }
        return -1;
    }
}
