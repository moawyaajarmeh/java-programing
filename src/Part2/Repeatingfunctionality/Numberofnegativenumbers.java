package Part2.Repeatingfunctionality;

import java.util.Scanner;

public class Numberofnegativenumbers {
    public static void main(String[] args) {
        Scanner sca=new Scanner(System.in);
        int neg=0;
        while (true){
            System.out.println("Give a number");
            int num=sca.nextInt();
            if (num<0){
                neg++;
            } else if (num==0) {
                break;

            }
        }
        System.out.println("Number of negative numbers:"+neg);
    }
}
