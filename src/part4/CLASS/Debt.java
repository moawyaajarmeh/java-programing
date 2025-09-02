package part4.CLASS;

public class Debt {
    private double initialBalance;
    public double initialInterestRate;
    public Debt(double initialBalance, double initialInterestRate){
        this.initialBalance=initialBalance;
        this.initialInterestRate=initialInterestRate;
    }

    public double getInitialBalance() {
        return initialBalance;
    }

    public void setInitialBalance(double initialBalance) {
        this.initialBalance = initialBalance;
    }

    public double getInitialInterestRate() {
        return initialInterestRate;
    }

    public void setInitialInterestRate(double initialInterestRate) {
        this.initialInterestRate = initialInterestRate;
    }

    public void printBalance(){
        System.out.println("\"Current Balance: \" "+initialBalance);
        System.out.println(this.initialBalance);
    }
    public void waitOneYear(){
       initialBalance*=(1+initialInterestRate);
        System.out.println(this.initialBalance);
    }

    public static void main(String[] args) {
        Debt d1=new Debt(1000.00,0.05);
        d1.printBalance();
        d1.waitOneYear();
    }

}
