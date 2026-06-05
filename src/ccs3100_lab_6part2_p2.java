import java.util.Scanner;

public class ccs3100_lab_6part2_p2 {
 public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
     int productNum = 0;
     double price = 0.00;
     int quantity = 0;
     double totalPrice = 0.00;

     //list
     System.out.println("Product list");
     System.out.println("ID  | Price (RM)");
     System.out.println("1   | 2.90");
     System.out.println("2   | 4.50");
     System.out.println("3   | 9.90");
     System.out.println("4   | 4.50");
     System.out.println("5   | 6.80");

     do {
         System.out.print("\nEnter a product number (0 to stop) : ");
         productNum = input.nextInt();

         if(productNum != 0) {
        	 switch (productNum) {
             case 1: price = 2.90; break;
             case 2: price = 4.50; break;
             case 3: price = 9.90; break;
             case 4: price = 4.50; break;
             case 5: price = 6.80; break;
        	 }
             System.out.print("Enter the quantity of products sold : ");
             quantity = input.nextInt();
             totalPrice = price * quantity;
             System.out.printf("Total (RM) : (%.2f x %d) = %.2f\n", price, quantity, totalPrice);
         }
         
     } while (productNum != 0); 

     System.out.println("Program finish.");
 }
}