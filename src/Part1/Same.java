package Part1;

import java.util.Scanner;

public class Same {
    public static void main(String[] args) {
        Scanner sca=new Scanner(System.in);
        System.out.println("Enter the first string:");
        String str1=sca.nextLine();
        System.out.println("Enter the second string:");
        String str2=sca.nextLine();
        if (str1.equals(str2)){
            System.out.println("same");
        }
        else System.out.println("different");
    }
}
