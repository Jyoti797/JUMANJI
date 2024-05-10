public class search_05 {
    public static void main(String[] args) {
        //WAP to get the floor of a element using binary search
        int [] arr = { 11, 22, 33, 44, 55, 66, 77, 88, 99};
        int target = 25;
        int ans = floor(arr, target);
        System.out.println(" flooring element is " + ans);
    }
    static int floor( int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(target < arr[mid])
                end = mid - 1;
            else if(target> arr[mid])
                start = mid + 1;
            else
                return arr[mid];
        }
        return arr[end];
    }
}
