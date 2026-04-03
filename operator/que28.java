package operator;

import java.util.Scanner;

public class que28 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String stage = sc.nextLine();

        switch (stage) {
            case "OrderPlaced":
                System.out.println("Packed");
                System.out.println("Shipped");
                System.out.println("OutforDelivery");
                break;

            case "Packed":
                System.out.println("Shipped");
                System.out.println("OutforDelivery");
                System.out.println("Delivered");
                break;

            case "Shipped":
                System.out.println("OutforDelivery");
                System.out.println("Delivered");
                break;

            case "OutforDelivery":
                System.out.println("Delivered");
                break;

            case "Delivered":
                System.out.println("Order has already been delivered. No further stages.");
                break;

            default:
                System.out.println("Invalid order stage.");
        }
        
    }
}
