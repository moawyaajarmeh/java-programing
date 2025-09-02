package part4.CLASS;

public class Multiplier {
    private int multipliervalue;
    public Multiplier(int number) {
        this.multipliervalue =number;
    }
    public int multiply(int number){
        return number*multipliervalue;
    }

    public static void main(String[] args) {
        Multiplier m1=new Multiplier(3);
        System.out.println("multiplyByThree.multiply(2): " + m1.multiply(2));
        Multiplier m2 = new Multiplier(4);

        System.out.println("multiplyByFour.multiply(2): " + m2.multiply(2));
    }
}
