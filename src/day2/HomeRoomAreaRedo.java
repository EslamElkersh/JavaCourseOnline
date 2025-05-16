package day2;

import java.util.Scanner;

public class HomeRoomAreaRedo {
    private Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        HomeRoomAreaRedo homeRedo = new HomeRoomAreaRedo();
        Rectangle kitchen = homeRedo.getRoomDimensions();
        Rectangle bathRoom = homeRedo.getRoomDimensions();
        homeRedo.scanner.close();
        double totalArea=homeRedo.calculateTotalArea(kitchen,bathRoom);
        System.out.println("Total area is: "+totalArea);
    }

    public Rectangle getRoomDimensions(){

        System.out.println("Enter room length");
        double length = scanner.nextDouble();
        System.out.println("Enter room width");
        double width = scanner.nextDouble();

        Rectangle rectangle = new Rectangle(length,width);
        return rectangle;
    }
   double calculateTotalArea(Rectangle rectangle1,Rectangle rectangle2){
        return rectangle1.calculateArea()+rectangle2.calculateArea();
   }

}
