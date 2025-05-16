package day2;

import java.util.Scanner;

public class AddNumbers_DO_WHILE {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean again = false;
        do{
        System.out.println("Enter first number ");
        double num1= scanner.nextDouble();
        System.out.println("Enter second number ");
        double num2= scanner.nextDouble();

        double sum =num1+num2;
        System.out.println("the sum is : "+sum);
        System.out.println("Would you like to repeat again ?");
        again = scanner.nextBoolean();
        }while (again);
        scanner.close();

    }
}
