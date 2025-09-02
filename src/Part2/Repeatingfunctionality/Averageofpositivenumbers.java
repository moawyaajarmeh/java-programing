package Part2.Repeatingfunctionality;

import java.util.Scanner;

public class Averageofpositivenumbers {
    public static void main(String[] args) {
        double sum=0;
        int num=0;

        Scanner sca=new Scanner(System.in);
        while (true){
            System.out.println("enter number");
            int mm= sca.nextInt();
            if (mm>0){
               sum+=mm;
               num++;
            }
               if (mm==0){
                   break;
               }
        }
        double avg=sum/num;
        System.out.println(avg);

    }
}
