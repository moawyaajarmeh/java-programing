package part4.CLASS;

public class Agent {
    private String fname;
    private String lname;
    public Agent(String fname,String lname){
        this.fname=fname;
        this.lname=lname;

    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public static void main(String[] args) {
        Agent a1=new Agent("James", "Bond");
        Agent a2=new Agent("moawya", "ajarmeh");
        System.out.println("my name is "+a1.fname+","+a1.lname);
        System.out.println("my name is "+a2.fname+","+a2.lname);
    }
}
