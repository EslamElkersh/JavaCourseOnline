package day3;

import java.util.Scanner;

public class InstantPayCheck {
    static double requiredSalary = 25000;
    static int requeredCreditScore = 700;
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        //what we have

        //what we need to get
        double salary = getSalary();
        int creditScore = getCreditScore();
        scanner.close();
        boolean qualified =isQualified(salary,creditScore);
        notifyUser(qualified);


    }


    public static double getSalary(){

        System.out.println("Enter your Salary");
        double salary = scanner.nextDouble();
        return salary;
    }

    public static int getCreditScore(){
        System.out.println("Enter your credit score");
        int creditScore = scanner.nextInt();

        return creditScore;
    }

    public static boolean isQualified(double salary , int creditScore){
        if (salary>=requiredSalary&&creditScore>=requeredCreditScore){

            return true;
        }
        else {

            return false;
        }

    }
    public static void notifyUser(boolean isQualified){
        if(isQualified){
            System.out.println("Congrats , you are qualified for the loan");
        }
        else {
            System.out.println("sorry , you are not qualified for the loan");
        }
    }

}
