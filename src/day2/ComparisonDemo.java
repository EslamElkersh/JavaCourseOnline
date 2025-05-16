package day2;

import java.util.Scanner;

public class ComparisonDemo {
    // use for loop when you know the number of iterations
    // print from 1 to 10
    public static void main(String[] args) {
//        for (int i =1;i<=10;i++){
//            System.out.println(i);
//        }

        // use while when you don't know the number of iterations
        // take numbers from the user until he enters zero

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number ");
        int number = scanner.nextInt();
        while(number!=0){
            System.out.println("You entered "+number);
            number=scanner.nextInt();
        }

        //use do while if you want the loop to run at least once
        // show list for user and keep taking input intil he enters 0
//        Scanner scanner =new Scanner(System.in);
//        int choice;
//        do{
//            System.out.println("1 . Hello");
//            System.out.println("2 . Good morning");
//            System.out.println("3 . Good afternoon");
//            System.out.println("4 . Good evening");
//            System.out.println("0 . Exit");
//            choice = scanner.nextInt();
//            if(choice==1) System.out.println("Hello");
//            else if(choice==2) System.out.println("Good morning");
//            else if(choice==3) System.out.println("Good afternoon");
//            else if(choice==4) System.out.println("Good evening");
//        }while(choice!=0);
    }

}
