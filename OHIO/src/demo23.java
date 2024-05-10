public class demo23 {
    public static void main(String[] args) {
        SavingsAccount uco = new SavingsAccount();
        uco.principle = 100;
        uco.interestRate = 10;
        uco.time = 3;
        uco.calculateInterest();
        uco.viewBalance();

    }
}
interface Bank{

    int deposit(int d);
    int withdraw(int w);
    void calculateInterest();
    void viewBalance();
}
class SavingsAccount implements Bank{
    int principle;
    int compoundInterest;
    float interestRate;
    int time;
    float amount;
    public int deposit(int d){
        principle = principle + d;
        return principle;
    }
    public int withdraw(int w){
        principle = principle - w;
        return  principle;
    }
    public void calculateInterest(){
      amount = principle * (float) Math.pow((1 + interestRate/100),time);
      compoundInterest = (int) amount - principle;
      System.out.println("Compound Interset is " + compoundInterest);
    }
    public void viewBalance() {
        System.out.println("Amount after " + time + " years is " + amount);
    }
}

