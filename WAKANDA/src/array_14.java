public class array_14 {
    public static void main(String[] args) {
        int[] arr = {11, 22, 33, 44, 55, 66, 77, 88,99,356};
        int target = 55;
        System.out.println(linearSearch(arr,target));

    }
    static boolean linearSearch(int[] arr, int target){
        for(int i = 0; i<arr.length; i++){
            int element = arr[i];
            if(element==target)
                return true;
        }
        return false;
    }
}
