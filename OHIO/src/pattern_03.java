public class pattern_03 {
    public static void main(String[] args) {
        int n = 5;
        for(int row = n; row >= 1; row--){
            for(int col = n; col>=n+1-row ; col--){
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }
}
