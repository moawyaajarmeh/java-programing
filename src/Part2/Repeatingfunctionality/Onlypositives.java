package Part2.Repeatingfunctionality;

import java.util.Scanner;

public class Onlypositives {
    public static void main(String[] args) {
        Scanner sca=new Scanner(System.in);
        while (true){
            System.out.println("give a number");
            int num=sca.nextInt();
        if (num>=10){
            System.out.println(num*num);
        }
        else System.out.println("Unsuitable number");
        }
    }
}
