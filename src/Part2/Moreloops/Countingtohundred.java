package Part2.Moreloops;

import java.util.Scanner;

public class Countingtohundred {
    public static void main(String[] args) {
        Scanner sca=new Scanner(System.in);
        System.out.println("enter number");
        int num= sca.nextInt();
        for (int i=num;i<=100;i++){
            System.out.println(i);
        }

    }
}
