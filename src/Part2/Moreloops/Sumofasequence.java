package Part2.Moreloops;

import java.util.Scanner;

public class Sumofasequence {
    public static void main(String[] args) {
        Scanner sca=new Scanner(System.in);
        System.out.println("enter number");
        int num= sca.nextInt();
        int sum=0;
        for (int i=0;i<=num;i++){
            sum+=i;
        }
        System.out.println("The sum is"+sum);
    }
}
