public class array_13 {
    public static void main(String[] args) {
        int [] arr = {23,45,67,89,90,12,34,77,38};
        int target = 90;
        int ans = linearSearch(arr,target);
        System.out.println(target + " is present at " + ans + "th index in array");

    }
    static int linearSearch(int[] arr, int target){
        for(int i = 0; i<arr.length; i++){
            int element = arr[i];
            if(element==target)
                return i;
        }
        return -1;
    }

}
