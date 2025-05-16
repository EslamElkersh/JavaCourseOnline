package day3;

import java.util.Scanner;

public class HomeAreaCalulatorRedo {

    private Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        HomeAreaCalulatorRedo calculator = new HomeAreaCalulatorRedo();
        Rectangle kitchen = calculator.getDimentions();
        Rectangle bathroom = calculator.getDimentions();
        calculator.scanner.close();
        double totalArea = calculator.calculateArea(kitchen,bathroom);
        System.out.println("The total area is "+totalArea);
    }

    public Rectangle getDimentions(){

        System.out.println("Enter room length");
        double length = scanner.nextDouble();

        System.out.println("Enter room width");
        double width = scanner.nextDouble();

        // Rectangle room = new Rectangle(length,width);
        //return room;
        return new Rectangle(length,width);
    }
    public double calculateArea(Rectangle rectangle1,Rectangle rectangle2){
        return rectangle1.calculateArea()+rectangle2.calculateArea();
    }

}
