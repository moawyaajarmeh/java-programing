package Part2.Repeatingfunctionality;

import java.util.Scanner;

public class Averageofnumbers {
    public static void main(String[] args) {
    double sum=0;
    int num=0;
        Scanner sca=new Scanner(System.in);
        while (true){
            System.out.println("Give a number:");
            int mm= sca.nextInt();;
            if (mm==0){
                break;
            }
            num++;
            sum+=mm;
        }
        double avg=sum/num;
        System.out.println("number"+num);
        System.out.println("toal"+sum);
        System.out.println("Average of the numbers:"+avg);
    }
}
