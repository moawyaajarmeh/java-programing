package Part2.Methods;

public class Starsign {
    public static void main(String[] args) {
        start(5);
        start(3);
        start(9);
    }
    public static void start(int num){
        for (int i=0;i<=num;i++){
            System.out.print("*");
        }
        System.out.println();
    }
}
