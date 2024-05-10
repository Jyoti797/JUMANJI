public class search_06 {
    public static void main(String[] args) {
        char [] arr = { 'a', 'b', 'e', 'g', 'i', 'k', 'm', 'o', 'q', 's', 'u' };
        char target = 'c';
        char ans = celling(arr,target);
        System.out.println("Celling character is " + ans);

    }
    static char celling(char[] arr, char target){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(target<arr[mid])
                end = mid - 1;
            else if(target>arr[mid])
                start = mid + 1;
            else
                return arr[mid];
        }
        return arr[start];
    }
}
