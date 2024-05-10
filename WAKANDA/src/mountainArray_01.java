public class mountainArray_01 {
    public static void main(String[] args) {
        //wap to find peak element in a mountain array
        int [] arr = {11, 22, 33, 44, 55, 66, 77, 88, 575, 85, 75, 65, 55, 45};
        int maxVal = peakIndexInMountainArray(arr);
        System.out.println(maxVal);
    }
    static  int peakIndexInMountainArray(int [] arr){
        int start = 0;
        int end = arr.length-1;
        while(start<end){
            int mid = start + (end-start)/2;
            if(arr[mid]>arr[mid+1]) {
                //you are in descending part of array
                end = mid;
            }
            else{
                //you are in Increasing part of array
                start = mid+1;
            }

        }
        return arr[start];//In the end start & end both are equal
    }
}
