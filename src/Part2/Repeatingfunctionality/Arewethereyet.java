package Part2.Repeatingfunctionality;

import java.util.Scanner;

public class Arewethereyet {
    public static void main(String[] args) {
        Scanner sca=new Scanner(System.in);
        int sum=0;
        while (true){
            System.out.println("give a number");
            int num=sca.nextInt();
           if (num==0){
               break;
           }
            sum++;
        }
        System.out.println(sum);
    }
}
