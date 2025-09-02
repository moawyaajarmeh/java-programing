package part3.String;

import java.util.Scanner;

public class Isittrue {
    public static void main(String[] args) {
        Scanner sca=new Scanner(System.in);
        System.out.println("Give a string:");
        String str=sca.nextLine();
        if (str.equals("true")){
            System.out.println("You got it right!");

        }
        else System.out.println("Try again!");
    }
}
