package part3.array;

public class Swap {
    public static void main(String[] args) {
        int[] number=new int[5];
        number[0]=1;
        number[1]=3;
        number[2]=5;
        number[3]=7;
        number[4]=9;
        int x=number[2];
        number[2]=number[4];
        number[4]=x;
        for (int i=0;i<= number.length;i++){
            System.out.println(number[i]);
        }

    }
}
