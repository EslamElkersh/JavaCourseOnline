package day2;

import java.util.Scanner;

public class ConditionalStatements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your Age : ");
        int personAge =scanner.nextInt();
        scanner.close();
        String status = personAge>18?"eligible":"Not Eligible";
        System.out.println(status);
//        if (personAge>=18){
//            System.out.println("Eligible for vote");
//        }
//        else{
//            System.out.println("Not eligible for vote");
//        }


//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter a number to decide even or odd");
//        int number = scanner.nextInt();
//        scanner.close();
//        if(number%2==0){
//            System.out.println("The number "+ number+ " is even");
//        }
//        else {
//            System.out.println("The number "+ number+ " is odd");
//        }

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter a number to decide positive or negative or zero");
//        int number = scanner.nextInt();
//        scanner.close();
//
//        if (number>0){
//            System.out.println("The number "+number+" is positive");
//        }
//        else if(number<0) {
//            System.out.println("The number "+number+" is negative");
//        }
//        else {
//            System.out.println("The number is zero");
//        }

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter first number ");
//        int firstNumber = scanner.nextInt();
//        System.out.println("Enter second number ");
//        int secondNumber = scanner.nextInt();
//        System.out.println("Enter third number ");
//        int thirdNumber = scanner.nextInt();
//        scanner.close();
//        if(firstNumber>secondNumber&&firstNumber>thirdNumber){
//            System.out.println("The first number is the biggest");
//        }
//        else if (secondNumber>firstNumber&&secondNumber>thirdNumber){
//            System.out.println("The second number is the biggest");
//        }
//        else{
//            System.out.println("The third number is the biggest");
//        }

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter Day Number ");
//        int dayNumber = scanner.nextInt();
//        scanner.close();
////        if (dayNumber==1){
////            System.out.println("Sunday");
////        }
////        else if (dayNumber==2){
////            System.out.println("Monday");
////        }
////        else if (dayNumber==3){
////            System.out.println("Tuesday");
////        }
////        else if (dayNumber==4){
////            System.out.println("Wednesday");
////        }
////        else if (dayNumber==5){
////            System.out.println("Thursday");
////        }
////        else if (dayNumber==6){
////            System.out.println("Friday");
////        }
////        else if (dayNumber==7){
////            System.out.println("Saturday");
////        }
////        else{
////            System.out.println("Invalid Day Number");
////        }
//switch (dayNumber){
//    case 1 :  System.out.println("Sunday");break;
//    case 2 :  System.out.println("Monday");break;
//    case 3 :  System.out.println("Tuesday");break;
//    case 4:
//        System.out.println("Wednesday");
//        break;
//    case 5:
//        System.out.println("Thursday");
//        break;
//    case 6:
//        System.out.println("Friday");
//        break;
//    case 7:
//        System.out.println("Saturday");
//        break;
//    default:
//        System.out.println("Invalid Day Number");
//
//
//}


    }
}
