public class jyoti6 {
    static void primeNum(int num)
    {int count = 0, i;
        for(i=2; i<num; i++){
            if(num%i==0)
                count = count + 1;
        }
        if(count==0)
            System.out.println(num);
    }

    public static void main(String[] args) {
        for(int num = 2; num <=100; num++){
            primeNum(num);
        }

    }
}
