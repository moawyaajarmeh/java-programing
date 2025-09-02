package part3.String;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner sca=new Scanner(System.in);
        System.out.println("Enter username: ");
        String str=sca.nextLine();
        System.out.println("Enter password:");
        String str1=sca.nextLine();
        if (str.equals("alex")||str.equals("emma")&&str1.equals("sunshine")||str1.equals("haskell")){
            System.out.println("You have successfully logged in!\n" +
                    "\n");

        }
        else System.out.println("Incorrect username or password!\n" +
                "\n");
    }
}
