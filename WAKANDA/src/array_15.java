public class array_15 {
    public static void main(String[] args) {
        //WAP to find a character in a String
        String name = "Jyoti Ranjan Mohanta";
        char target = 'o';
        System.out.println(search(name,target));
    }
    static boolean search(String name, char target){
        if(name.length()==0)
            return false;
        for(int i=0; i<name.length(); i++){
            if(target==name.charAt(i))
                return true;
        }
        return false;
    }
}
