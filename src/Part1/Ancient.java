package Part1;

import java.util.Scanner;

public class Ancient {
    public static void main(String[] args) {
        Scanner sca=new Scanner(System.in);
        System.out.println("enter year");
        int year=sca.nextInt();
        if(year<2015){
            System.out.println("Ancient history!");
        }
    }
}
