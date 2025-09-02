package part4.CLASS;

import java.util.Scanner;

public class Film {
    private String name;
    private int agerating;
    public Film(String filmName, int filmAgeRating){
        this.name=filmName;
        this.agerating=filmAgeRating;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAgerating() {
        return agerating;
    }

    public void setAgerating(int agerating) {
        this.agerating = agerating;
    }

    public static void main(String[] args) {
        Film f1=new Film("Alvin and the Chipmunks: The Squeakquel", 0);
        Scanner sca=new Scanner(System.in);
        System.out.println("\"How old are you?\"");
        int age=sca.nextInt();
        if (age>= f1.agerating){
            System.out.println("You may watch the film \" "+f1.name);
        }
        else System.out.println("You may not watch the film \""+f1.name);
    }
}
