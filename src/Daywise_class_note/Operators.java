package Daywise_class_note;

public class Operators {
    public static void main(String[] args){
        //Arthematic operators
        int a=20, b=5;
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a/b);
        System.out.println(a%b);
        System.out.println(a*b);
        //increment operator Decrememt operator
        a=20;
        b=10;
        System.out.println(++a);
        System.out.println(b++);
        System.out.println(a);
        System.out.println(b);

        int x=a++ + ++b;
        int y=++a + b++;
        System.out.println(x);
        System.out.println(y);

        a=2;
        b=4;
        x=a-- + --b;
        y=--a + b--;
        System.out.println(x);
        System.out.println(y);

        //comp operator
        a=10;
        b=40;
        System.out.println(a<b);
        System.out.println(a>b);
        System.out.println(a<=b);
        System.out.println(a>=b);
        System.out.println(a==b);
        System.out.println(a!=b);






    }
}
