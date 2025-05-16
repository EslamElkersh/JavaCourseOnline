package day5;

public class InheritanceTester {
    public static void main(String[] args) {
//        Person person = new Person();
//        Employee employee = new Employee();
        Rectangle rectangle = new Rectangle();
        rectangle.setLength(20);
        rectangle.setWidth(10);
//        System.out.println(rectangle.calculatePerimeter());
//        rectangle.print();
//        Square square = new Square();
//        square.setLength(10);
//        square.setSides(4);
////        System.out.println(square.calculatePerimeter());
//        square.print();
//        square.print("Ahmed");

        Mother mother = new Mother();
        mother.setName("Doaa");
        System.out.println(mother.getName());
        System.out.println(mother.getGender());



    }
}
