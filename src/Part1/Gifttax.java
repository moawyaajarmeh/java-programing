package Part1;

import java.util.Scanner;

public class Gifttax {
    public static void main(String[] args) {
        Scanner sca=new Scanner(System.in);
        System.out.println("enter value");
        int mm=sca.nextInt();
        if (mm>=5000&&mm<25000){
            System.out.println("100");
        } else if (mm>=25000&&mm<55000) {
            System.out.println("1700");
        } else if (mm>=55000&&mm<200000) {
            System.out.println("4700");
        } else if (mm>=200000&&mm<1000000) {
            System.out.println("22100");
        } else if (mm==-1000000) {
            System.out.println("1421000");
        }
        else System.out.println("no tax");
    }
}
