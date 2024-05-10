public class search_04 {
    public static void main(String[] args) {
        //WAP to find celling of a number
        int [] arr = { 11, 22, 33, 44, 55, 66, 77, 88, 99};
        int target = 80;
        int ans = celling(arr, target);
        System.out.println("Celling number is " + ans);
    }
    static int celling( int [] arr, int target){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(target<arr[mid])
                end = mid-1;
            else if(target >arr[mid])
                start = mid + 1;
            else
                return arr[mid];
        }
        return arr[start];
    }
}
