package part4.CLASS;

public class Whistle {
    private String sound;
    public Whistle(String whistleSound){
this.sound=whistleSound;
    }
    public void sound(){
        System.out.println(sound);
    }

    public static void main(String[] args) {
        Whistle W1=new Whistle("Kvaak");
        Whistle W2=new Whistle("Peef");
W1.sound();
W2.sound();
    }
}

