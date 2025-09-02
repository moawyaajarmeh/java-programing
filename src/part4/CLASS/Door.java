package part4.CLASS;

public class Door {
    public Door(){

    }
    public void knock(){
        System.out.println("Who's there?\n");
    }

    public static void main(String[] args) {
        Door d1=new Door();
        d1.knock();
        d1.knock();
    }

}
