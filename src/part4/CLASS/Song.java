package part4.CLASS;

public class Song {
    private String name;
    private int length;
public Song(String name, int length){
    this.name=name;
    this.length=length;
}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public static void main(String[] args) {
        Song s1=new Song("In The Garden", 10910);
        System.out.println("The song "+s1.name+" has a length of"+s1.length);
    }
}
