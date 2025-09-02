package part4.CLASS;

public class Gauge {
    private int value;
    public Gauge(){
        value=0;
    }
    public void increase(){
        value++;
    }
    public void decrease(){
        value--;
    }
    public void reset() {
        value = 0;
    }
    public int value(){
        return value;
    }
    public boolean full(){
        return true;
    }

    public static void main(String[] args) {
        Gauge g1=new Gauge();
        while (!g1.full()){
            System.out.println("Not full! Value: " + g1.value());
            g1.increase();
        }
        System.out.println("Full! Value: " + g1.value());
        g1.decrease();
        System.out.println("Not full! Value: " + g1.value());
    }

}
