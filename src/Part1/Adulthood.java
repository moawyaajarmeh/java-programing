package Part1;

import java.util.Scanner;

public class Adulthood {
    public static void main(String[] args) {
        Scanner sca=new Scanner(System.in);
        System.out.println("enter old");
        int old=sca.nextInt();
        if (old>=18){
            System.out.println("You are an adult");
        }
        else System.out.println("You are not an adult");
    }
}
