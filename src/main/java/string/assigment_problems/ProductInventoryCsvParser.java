package string.assigment_problems;

import java.util.Scanner;

public class ProductInventoryCsvParser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter product details (ID,Name,Quantity,Price): ");
        String input = sc.nextLine();

        String[] data = input.split(",");

        if (data.length == 4) {
            String productId = data[0].trim();
            String productName = data[1].trim();
            int quantity = Integer.parseInt(data[2].trim());
            double price = Double.parseDouble(data[3].trim());

            double totalValue = quantity * price;

            System.out.println("Product ID: " + productId);
            System.out.println("Product Name: " + productName);
            System.out.println("Quantity: " + quantity);
            System.out.println("Price: " + price);
            System.out.println("Total Inventory Value: " + totalValue);
        } else {
            System.out.println("Invalid product details");
        }

        sc.close();
    }
}