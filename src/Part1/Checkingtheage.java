package Part1;

import java.util.Scanner;

public class Checkingtheage {
    public static void main(String[] args) {
        Scanner sca =new Scanner(System.in);
        System.out.println("enter age");
        int age=sca.nextInt();
        if (age>=0&&age<=120){
            System.out.println("ok");
        }
        else System.out.println("impossible");
    }
}
