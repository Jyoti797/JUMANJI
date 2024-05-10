public class array_20 {
    public static void main(String[] args) {
        //WAP to and find the wealthiest person in a group
        int[][] arr = {
                {1,5,6},
                {2,4,2,5},
                {6,1,2},
                {1,2,3,4}
        };
        maximumWealth(arr);

    }
    static void maximumWealth(int [][] arr){
        int maxVal = Integer.MIN_VALUE;
        for(int person = 0; person<arr.length; person++){
            int sum = 0;
            for(int money = 0; money<arr[person].length; money++){
                 sum = sum + arr[person][money];
            }
            if(sum>maxVal)
                maxVal=sum;
        }
        System.out.println(maxVal);
    }
}
