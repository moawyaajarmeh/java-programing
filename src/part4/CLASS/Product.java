package part4.CLASS;

public class Product {
    double price;
    int quantity;
    String name;
    public Product(String initialName, double initialPrice, int initialQuantity){
        this.price=initialPrice;
        this.quantity=initialQuantity;
        this.name=initialName;
    }
    public void print(){
        System.out.println(price);
        System.out.println(quantity);
        System.out.println(name);
    }

    public static void main(String[] args) {
        Product p1=new Product("Banana",1.1,13 );
        p1.print();
    }
}
