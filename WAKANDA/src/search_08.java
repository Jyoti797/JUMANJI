import java.lang.reflect.Array;
import java.util.Arrays;

public class search_08 {
    public static void main(String[] args) {
        //WAP to find 1st and last occurrence of a repetitive number
        int [] arr = {5,7,7,7,7,8,8,10};
        int target = 7;
        int [] ans = range(arr,target);
        System.out.println(Arrays.toString(ans));
    }
    static int [] range(int[]arr, int target){
        int [] ans = {-1,-1};
        //check for the 1st occurrence of target
        int start = search(arr,target,true);
        int end = search(arr,target,false);
        ans[0] = start;
        ans[1] = end;
        return ans;
    }
    static int search(int [] arr, int target, boolean findStartIndex){
        //this function only returns the index value of target
        int ans = -1;
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(target<arr[mid])
                end = mid-1;
            else if(target>arr[mid])
                start = mid + 1;
            else{
                ans =  mid;
                if(findStartIndex)
                    end = mid-1;
                else
                    start = mid + 1;
            }
        }
        return ans;
    }
}
