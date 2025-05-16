package day2;

public class HomeRoomArea {
    public static void main(String[] args) {
        Rectangle room1= new Rectangle();
        room1.setLenght(20);
        room1.setWidth(10);

        double areaOfRoom1=room1.calculateArea();
        System.out.println("Area of room1 is : "+areaOfRoom1);

        Rectangle room2 = new Rectangle(30,20);
        double areaOfRoom2 =room2.calculateArea();
        System.out.println("Area of room2 is : "+areaOfRoom2);
        double totalArea = areaOfRoom1+areaOfRoom2;
        System.out.println("the total area of the two rooms is : "+totalArea);

    }
}
