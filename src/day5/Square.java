package day5;

public class Square extends Rectangle{
    @Override
    public double calculatePerimeter(){
        return length*sides;
    }

    public void print(String name){
        System.out.println("I am square");
    }
}
