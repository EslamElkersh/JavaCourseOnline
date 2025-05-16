package day2;

public class BreakAndContinueDemo {
    public static void main(String[] args) {
        for(int i=1;i<=10;i++){
            if (i==5)
                break;
            System.out.println(i);
        }

        System.out.println("______________________");
        for(int i=1;i<=10;i++){
            if (i==3||i==5||i==9)
                continue;
            System.out.println(i);
        }
    }
}
