package Part1;

import java.util.Scanner;

public class Positivity {
    public static void main(String[] args) {
        Scanner sca=new Scanner(System.in);
        System.out.println("enter number");
        int num=sca.nextInt();
        if (num>0){
            System.out.println("The number is positive");
        }
        else System.out.println("The number is not positive.");
    }
}
