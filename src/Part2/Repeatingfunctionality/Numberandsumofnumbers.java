package Part2.Repeatingfunctionality;

import java.util.Scanner;

public class Numberandsumofnumbers {
    public static void main(String[] args) {
        int sum=0;
        int num=0;
        Scanner sca=new Scanner(System.in);
        while (true){
            System.out.println("Give a number:");
            int mm=sca.nextInt();
            if (mm==0){
                break;
            }
        num++;
            sum+=mm;
        }
        System.out.println("Number of numbers: "+num);
        System.out.println("Sum of the numbers:"+sum);
    }
}
