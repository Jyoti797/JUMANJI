public class search_01 {
    public static void main(String[] args) {
        int [] arr = { 11, 22, 33, 44, 55, 66, 77, 88, 99};
        int target = 22;
        int ans = binarySearch(arr,target);
        System.out.println(ans);
    }
    static int binarySearch(int [] arr, int target){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(target < arr[mid])
                end = mid-1;
            else if (target > arr[mid])
                start = mid + 1;
            else
                return mid;
        }
        return -1;
    }
}
