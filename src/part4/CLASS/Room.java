package part4.CLASS;

public class Room {
    private String code;
    private int seats;
    public Room(String code,int numberofseats){
        this.code=code;
        this.seats=numberofseats;

    }
    public  void prent(){
        System.out.println(code);
        System.out.println(seats);
    }

    public static void main(String[] args) {
        Room R1=new Room("MMMM",1234);
        Room R2=new Room("NNNNN",4321);
        R1.prent();
        R2.prent();

    }
}
