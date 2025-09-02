package part3.String;

import java.util.Scanner;

public class Printthrice {
    public static void main(String[] args) {
        Scanner sca=new Scanner(System.in);
        System.out.println("give a word");
        String str=sca.nextLine();
        for (int i=0;i<3;i++){
            System.out.print(str);
        }
    }
}
