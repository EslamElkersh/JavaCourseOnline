package day1;

public class OperatorsDemo {
    public static void main(String[] args) {
        /*arithmatic
        int a = 10 ,b=10;
        System.out.println("The sum of a and b is : "+(a+b));
        System.out.println("The difference between a and b is : "+(a-b));
        System.out.println("The multiplication of a and b is : "+(a*b));
        System.out.println("The division of a and b is : "+(a/b));
        System.out.println("The modulus of a and b is : "+(a%b));

        // relational
        System.out.println(a>b);
        System.out.println(a<b);
        System.out.println(a<=b);
        System.out.println(a>=b);
        System.out.println(a==b);
        System.out.println(a!=b);

        //3) Logical operators      &&     ||      !

boolean x =true,y=false;
        System.out.println(x&&y);
        System.out.println(x||y);
        System.out.println(!x);
        System.out.println(!y);

boolean b1 = 10>20;
boolean b2 = 20>10;
        System.out.println(b1&&b2);
        System.out.println(b1||b2);
        System.out.println(!b1);
        System.out.println(!b2);*/

//4)increment - decrement operators
        // incremet ++

/*int a =10;
int increment = a++;
        System.out.println(increment);
        System.out.println(a);
*/
      /*  int a =10;
        int increment = ++a;
        System.out.println(increment);
        System.out.println(a);*/


      /*  int a =10;
        int increment = a--;
        System.out.println(increment);
        System.out.println(a);

        int a =10;

        System.out.println(a++);
        System.out.println(a++);

        //5) Assignment       =     +=      -=        *=       /=     %=   short hand operators
        int a = 10 ;
        a +=2;     //a=a+2;
        a-=3;
        a/=3;
        a*=5;
        a%=4;   // a = a%4;
        System.out.println(a);


    // 6) conditional/ternary operator       ?:
    int a = 100, b=200,c;

    if(a>b){
        c=a;
    }
    else {
        c=b;
    }

        System.out.println(c);*/
        int a = 100, b=200,c;
        c = (a>b)?a:b;
        System.out.println(c);




    }
}
