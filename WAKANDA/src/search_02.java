public class search_02 {
    public static void main(String[] args) {
        int [] arr = {11, 22, 33, 44, 55, 66, 77, 88, 99, 121};
        int target = 121;
        int ans = binarySearch(arr, target);
        System.out.println(ans);
    }
    static int binarySearch(int [] arr, int target){
        int start = 0;
        int end = arr.length-1;
        boolean isAsc = arr[start]<arr[end];
        while(start<=end){
            int mid = start + (end-start)/2;
            if(arr[mid]==target)
                return mid;
            if(isAsc){
                if(target<arr[mid])
                    end = mid-1;
                else
                    start = mid+1;
            }
            else{
                if(target<arr[mid])
                    start = mid + 1;
                else
                    end = mid - 1;
            }
        }
        return -1;
    }
}
