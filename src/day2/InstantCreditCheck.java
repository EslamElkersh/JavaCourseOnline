package day2;
/*
       Varible scope
       instant credit check program approves anyone whose salary more than 25000
       and has credit score more than 700 and reject all other
*/

import java.util.Scanner;

public class InstantCreditCheck {
    static double requiredSalary = 25000;
    static double requiredCreditPoints= 700;
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        // what we have


        double salary = getSalary();
        double creditScore = getCreditScore();
        scanner.close();
        boolean qualified = isQualified(salary,creditScore);

        notifyUser(qualified);
    }

    static double getSalary(){

        System.out.println("Enter your Salary: ");
        double salary = scanner.nextDouble();
        return salary;
    }

    static double getCreditScore(){
        System.out.println("Enter your Credit Score : ");
        double creditScore = scanner.nextDouble();
        return creditScore;
    }
    static boolean isQualified(double sal ,double score){
        if(sal>=requiredSalary&&score>=requiredCreditPoints)
            return true;
        else return false;
    }

    static void notifyUser(boolean qualified){
        if(qualified) System.out.println("Congrats , you are qualified");
        else System.out.println("sorry , you are not qualified");
    }

}
