public class search_03 {
    public static void main(String[] args) {
        //WAP to find the position of a number using binary search
        int [] arr = {11, 22, 33, 44, 55, 66, 77, 88, 99};
        int target = 99;
        int ans = binarySearch(arr,target);
        System.out.println(target + " is present at " + ans + " position");

    }
    static int binarySearch(int [] arr, int target){
        int start =0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(target<arr[mid])
                end = mid-1;
            else if(target>arr[mid])
                start = mid + 1;
            else
                return mid;
        }
        return -1;
    }
}
