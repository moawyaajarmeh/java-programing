package Part1;

import java.util.Scanner;

public class LargerThanorEqualTo {
    public static void main(String[] args) {
        Scanner sca=new Scanner(System.in);
        System.out.println("enter number1");
        int num1=sca.nextInt();
        System.out.println("enter number2");
        int num2=sca.nextInt();
        if (num1>num2){
            System.out.println("Greater number is:"+num1);
        } else if (num1==num2) {
            System.out.println("The numbers are equal!");

        } else System.out.println("Greater number is:"+num2);
    }
}
