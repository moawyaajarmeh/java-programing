package part3.array;

public class Printinstars {
    public static void main(String[] args) {
        int[] array1 = {5, 1, 3, 4, 2};
        printArrayInStars(array1);
    }
    public static void printArrayInStars(int[] array){
        int[] array1 = {5, 1, 3, 4, 2};
        for (int i=0;i<array1.length;i++){
            for (int j=0;j<array1[i];j++){
                System.out.print("*");

            }
            System.out.println();

        }
    }
}
