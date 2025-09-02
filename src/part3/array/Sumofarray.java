package part3.array;

public class Sumofarray {
    public static void main(String[] args) {
        int[] numbers = {5, 1, 3, 4, 2};
        System.out.println(sumOfNumbers(numbers));
    }
    public static int sumOfNumbers(int[] array) {
        int sum = 0;
        int[] numbers = {5, 1, 3, 4, 2};
        for (int i=0;i<numbers.length;i++){
            sum+=numbers[i];
        }
        return sum;
    }



}
