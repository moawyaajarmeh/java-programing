package Part1;

import java.util.Scanner;

public class SpeedingTicket {
    public static void main(String[] args) {
        Scanner sca=new Scanner(System.in);
        System.out.println("enter number");
        int num=sca.nextInt();
        if (num>120){
            System.out.println("Speeding ticket!");
        }

    }
}
