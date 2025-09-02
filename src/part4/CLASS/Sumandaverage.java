package part4.CLASS;

public class Sumandaverage {
    private int number;
    private int sum;
    private double avg;

    public Sumandaverage(){
        this.sum=0;
        this.avg=0;
        this.number=0;
    }

    public void addNumber(int number){
        this.number++;
    }
    public int getCount() {
        return this.number;
    }
    public int sum() {
       return this.sum+=this.number;
    }
    public double average() {
        return this.sum/this.number;
    }

    public static void main(String[] args) {
        Sumandaverage s1=new Sumandaverage();
        s1.addNumber(5);
        s1.addNumber(5);
        s1.addNumber(5);
        System.out.println(s1.getCount());
        System.out.println(s1.sum);
           }

}
