package Part2.Repeatingfunctionality;

import java.util.Scanner;

public class SumofNumbers {
    public static void main(String[] args) {
        Scanner sca=new Scanner(System.in);
        int sum=0;
        while (true){
            System.out.println("Give a number:");
            int num=sca.nextInt();
            sum+=num;
            if (num==0){
                break;
            }
        }
        System.out.println("Sum of the numbers: "+sum);
    }
}
