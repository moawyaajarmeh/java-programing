package part4.CLASS;

public class Decreasingcounter {
    private int value;

    public Decreasingcounter(int value) {
        this.value = value;
    }
public void print(){
    System.out.println(value);
}

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void decrement(){
        if (value>0){
    this.value--;}
}
public void reset(){
        this.value=value-value;
}

    public static void main(String[] args) {
//        Decreasingcounter d1=new Decreasingcounter(10);
//        d1.decrement();
//        System.out.println(d1.getValue());
//        Decreasingcounter counter=new Decreasingcounter(2);
//
//        System.out.println(counter.getValue());
//        counter.decrement();
//        System.out.println(counter.getValue());
//        counter.decrement();
//        System.out.println(counter.getValue());
//        counter.decrement();
//        System.out.println(counter.getValue());
        Decreasingcounter counter=new Decreasingcounter(100);
        counter.print();
        counter.reset();
        System.out.println(counter.getValue());
    }

}
