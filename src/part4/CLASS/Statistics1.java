package part4.CLASS;

public class Statistics1 {
     private int number;
    public Statistics1(){
this.number=0;
    }
    public void addNumber(int number){
this.number++;    }
    public int getcount(){
        return this.number;
    }

    public static void main(String[] args) {
        Statistics1 s1=new Statistics1();
        s1.addNumber(5);
        s1.addNumber(10);
        s1.addNumber(15);
        System.out.println("Count of added numbers"+s1.getcount());
    }
}
