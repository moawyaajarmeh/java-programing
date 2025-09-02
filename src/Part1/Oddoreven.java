package Part1;

import java.util.Scanner;

public class Oddoreven {
    public static void main(String[] args) {
        Scanner sca=new Scanner(System.in);
        System.out.println("enter number");
        int num=sca.nextInt();
        if (num%2==0){
            System.out.println("number"+num+"is even");
        }
        else System.out.println("number"+num+"is odd");
    }
}
