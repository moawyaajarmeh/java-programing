package Part1;

import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        Scanner sca=new Scanner(System.in);
        System.out.println("password");
        String str=sca.nextLine();
        if (str.equals("Wattlebird")){
            System.out.println("Off with you!");
        } else if (str.equals("Caput Draconis")) {
            System.out.println("welcome");
            
        }
    }
}
