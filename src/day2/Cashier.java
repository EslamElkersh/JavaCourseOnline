package day2;

import java.util.Scanner;

public class Cashier {
    public static void main(String[] args) {
        // get the number of items to scan
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of items");
        int quantity = scanner.nextInt();
        double total = 0;
        for (int i=0;i<quantity;i++){
            System.out.println("Enter the cost of the item");
            double price = scanner.nextDouble();
            total+=price;
        }
        scanner.close();
        System.out.println("The total price is  "+total);
    }
}
