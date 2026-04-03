package questions_first.hard;

import java.util.Scanner;

class Product {
    int productId;
    String productName;
    double price;

    Product(int productId, String productName, double price) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
    }
}

class Inventory {
    Product[] products = new Product[4];
    int count = 0;

    void addProduct(Product p) {
        if (count < 4) {
            products[count++] = p;
        }
    }

    void displayProducts() {
        System.out.println("Products:");
        for (int i = 0; i < count; i++) {
            System.out.println(
                "ID: " + products[i].productId +
                ", Name: " + products[i].productName +
                ", Price: " + products[i].price
            );
        }
    }

    double totalValue() {
        double sum = 0;
        for (int i = 0; i < count; i++) {
            sum += products[i].price;
        }
        return sum;
    }
}

public class que24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Inventory inventory = new Inventory();

        int n = sc.nextInt(); 

        for (int i = 0; i < n; i++) {
            int id = sc.nextInt();
            String name = sc.next();
            double price = sc.nextDouble();
            inventory.addProduct(new Product(id, name, price));
        }

        inventory.displayProducts();
        System.out.println("Total Inventory Value: " + inventory.totalValue());

        sc.close();
    }
}
