package task2;

import java.util.Scanner;


class Product {
    private int pid;
    private double price;
    private int quantity;

    // Parameterized constructor
    public Product(int pid, double price, int quantity) {
        this.pid = pid;
        this.price = price;
        this.quantity = quantity;
    }

    // Getters for product properties
    public int getPid() {
        return pid;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }
}

class XYZ {
    // Method to calculate total amount spent on all products
    public static double calculateTotalAmount(Product[] products) {
        double totalAmount = 0;
        for (Product product : products) {
            totalAmount += product.getPrice() * product.getQuantity();
        }
        return totalAmount;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Product[] products = new Product[5];

        // Accept product information from the user
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter details for Product " + (i + 1) + ":");
            System.out.print("Product ID: ");
            int pid = scanner.nextInt();
            System.out.print("Price: ");
            double price = scanner.nextDouble();
            System.out.print("Quantity: ");
            int quantity = scanner.nextInt();

            products[i] = new Product(pid, price, quantity);
        }

        // Find the product with the highest price
        int highestPricePid = products[0].getPid();
        double highestPrice = products[0].getPrice();

        for (Product product : products) {
            if (product.getPrice() > highestPrice) {
                highestPrice = product.getPrice();
                highestPricePid = product.getPid();
            }
        }

        System.out.println("Product ID with the highest price: " + highestPricePid);

        // Calculate total amount spent on all products
        double totalAmount = calculateTotalAmount(products);
        System.out.println("Total amount spent on all products: $" + totalAmount);

        scanner.close();
    }
}
