package part3.array;

public class Printneatly {
    public static void main(String[] args) {
        int[] array1 = {5, 1, 3, 4, 2};
       printNeatly(array1);
    }
    public static void printNeatly(int[] array){
        int[] array1 = {5, 1, 3, 4, 2};
        for (int i=0;i<array1.length;i++){
            System.out.print(array1[i]);
            if (i<array1.length-1){
                System.out.print(", ");
            }
        }

    }
}
