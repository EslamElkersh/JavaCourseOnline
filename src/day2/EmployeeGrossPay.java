package day2;

import java.util.Scanner;

public class EmployeeGrossPay {
    public static void main(String[] args) {
        // initialize what we know
        int rate = 15;
        int maxWeeklyHours = 40;

        // get what we don't know
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your weekly hours");
        double weeklyHoursWorked = scanner.nextDouble();

        // validate the input
        while (weeklyHoursWorked>maxWeeklyHours){
            System.out.println("Invalid entry. Please enter hours between 1 and 40");
            weeklyHoursWorked = scanner.nextDouble();
        }

        // calculate the gross weekly salary
        double grossSalary = weeklyHoursWorked*rate;
        System.out.println("Your gross weekly salary is "+grossSalary+" $");

    }
}
