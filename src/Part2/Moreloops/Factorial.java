package Part2.Moreloops;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sca=new Scanner(System.in);
        System.out.println("enter number");
        int num= sca.nextInt();
        int fac=1;
        for (int i=1;i<=num;i++){
            fac*=i;
        }
        System.out.println("Factorial: "+fac);
    }
}
