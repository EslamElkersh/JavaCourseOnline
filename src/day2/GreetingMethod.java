package day2;

import java.util.Scanner;

public class GreetingMethod {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        scanner.close();
       greetUser(name);
    }
    static void greetUser(String name){
        System.out.println("Hello "+name);
    }


}
