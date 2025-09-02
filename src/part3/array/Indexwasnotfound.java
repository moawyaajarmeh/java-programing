package part3.array;

import java.util.Scanner;

public class Indexwasnotfound {
    public static void main(String[] args) {
        int[] numbers = {3, 5, 7, 9, 11, 13, 15};

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to search: ");
        int num = scanner.nextInt();

//
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == num) {
                System.out.println("Number found at index " + i);
//
                break;
            }
        }

//
    }
}
