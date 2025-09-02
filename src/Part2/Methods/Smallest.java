package Part2.Methods;

public class Smallest {
    public static void main(String[] args) {
        System.out.println(Smallest(2,7));
    }
    public static int Smallest(int num1,int num2){
        if (num1>num2){
            return num2;
        }
        else return num1;
    }
}
