package Part2.Methods;

import java.util.Scanner;

public class Reprint {
    public static void main(String[] args) {
printText();
    }
    public static void printText(){
        Scanner sca=new Scanner(System.in);
        System.out.println("enter number");
        int num =sca.nextInt();
        for (int i=0;i<=num;i++){
            System.out.println("In a hole in the ground there lived a method");
        }
    }
}
