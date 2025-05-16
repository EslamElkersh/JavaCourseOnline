package day2;

import java.util.Scanner;

public class StudentAverageScore {
    public static void main(String[] args) {
        //initialize what we know
        int numberOfStudents = 3;
        int numberOfCourses = 4;
        Scanner scanner = new Scanner(System.in);
        for (int i =0;i<numberOfStudents;i++){
            int total = 0;
            for(int j = 0;j<numberOfCourses;j++){
                System.out.println("Enter score for course "+(j+1) +" for student "+(i+1) );
                double score=scanner.nextDouble();
                total+=score;
            }
            double average = total/numberOfCourses;
            System.out.println("The average Score of student "+(i+1)+" is " +average);
        }
    }
}
