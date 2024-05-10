public class search_07 {
    public static void main(String[] args) {
        //wap to find floor of a character
        char[] arr = { 'a','c', 'e', 'g', 'i', 'k', 'm', 'o','r','t'};
        char target = 'f';
        char ans = floor(arr,target);
        System.out.println("floor element is " + ans);
    }
    static char floor(char[] arr, char target){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(target<arr[mid])
                end = mid-1;
            else
                start = mid + 1;
        }
        return arr[end];
    }
}
