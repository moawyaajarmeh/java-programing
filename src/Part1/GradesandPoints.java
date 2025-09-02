package Part1;

import java.util.Scanner;

public class GradesandPoints {
    public static void main(String[] args) {
        Scanner sca=new Scanner(System.in);
        System.out.println("enter number");
        int num= sca.nextInt();
        if (num<0){
            System.out.println("impossible!");
        } else if (num>0&&num<49 ) {
            System.out.println("failed");
        } else if (num>=50&&num<=59) {
            System.out.println("1");
        } else if (num>=60&&num<=69) {
            System.out.println("2");
        } else if (num>=70&&num<=79) {
            System.out.println("3");
        } else if (num>=80&&num<=89) {
            System.out.println("4");
        } else if (num>=90&&num<=100) {
            System.out.println("5");
        } else if (num>100) {
            System.out.println("incredible!");

        }


    }
}
