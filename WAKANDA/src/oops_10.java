public class oops_10 {
    public static void main(String[] args) {
        CompoundInterest sbi = new CompoundInterest();
        sbi.ci(100000,8,12);
    }
}
class CompoundInterest{
    int principle;
    int timeperiod;
    float interest;
    void ci(int principle, int timeperiod, float interest){
        double amount =(int) principle * Math.pow((100+interest)/100, timeperiod);
        double cInterest =(int) amount-principle;
        System.out.println("Amount after " + timeperiod + " yrs is " + amount);
        System.out.println("compound interst after " + timeperiod + "yrs is " + cInterest);
    }
}
