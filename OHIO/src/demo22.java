import java.util.Arrays;
public class demo22 {
    public static void main(String[] args) {
        String x = "School master";
        String y = "The Class Room";
        System.out.println(isAnagram(x, y));
    }
    static boolean isAnagram(String x, String y){
        x = x.replace(" ", "");
        y = y.replace(" ", "");
        //space is removed from both strings
        x = x.toLowerCase();
        y = y.toLowerCase();
        //both strings are being converted to lowercase
        char [] arr1 = x.toCharArray();
        char [] arr2 = y.toCharArray();
        //both strings are now stored in charcter array
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        //both arrays were sorted
        if(Arrays.equals(arr1,arr2))
            return true;
        else
            return false;

    }

}
/*WAP to find 2 strings are anagram or not i.e;
all the charcters used to build 2 strings are same or not*/

