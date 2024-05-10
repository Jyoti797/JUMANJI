import java.util.Scanner;

public class jyoti_02 {
    public static void main(String[] args) {
        Smartphone pixel = new Smartphone();
        Smartphone nothing = new Smartphone();
        pixel.input();
        pixel.display();
        nothing.input();
        nothing.display();
    }
}
class Smartphone{
    String productName;
    int price;
    int quantity;
    Scanner sc = new Scanner(System.in);
   void input() {
       System.out.println("Enter product name");
       this.productName = sc.nextLine();
       System.out.println("Enter product price");
       this.price = sc.nextInt();
       System.out.println("Enter product quantity");
       this.quantity = sc.nextInt();
   }
   void display(){
       System.out.println("Name eof the product is " + this.productName);
       System.out.println("price of the product is " + this.price);
       System.out.println("quantities of product is " + this.quantity);
   }
}
