package J;

public class Day4 {
    public static void main(String[] args) {
        //Operators
        //Arithmatic operators (+,-,*,/,%,++,--) , pre-operation (++a , --a) , post-operation(a++, a--)
        int a=10;
        int v=3;
        int c = a+v;
        int d = (a--)+v;
        System.out.println(c);
        System.out.println(d);
        a = a++;  //a+1
        a = ++a;
        System.out.println(a);

        //Assignment operators (_=,+=,%=)
        int x =+ v;
        System.out.println(x);

        //Relational operators (<,>,>=,<=,!=,==)
        int b = 1;
        int k = 2;
        System.out.println(b>k);

        //Logical operators ( && , ||, ! )
        int l = 6;
        int u = 7;
        int h = 8;
        System.out.println(l>u && u>h);
        System.out.println(l>u || h>u);
        System.out.println(l!=u || h==u);

        //Ternary operator
        int n = 10;
        int m = 12;
        int o = (n>m) ? n : m;
        System.out.println("THE GREAT VALUE IS :"+o);

        //BITWISE OPERATOR (&, | , >> ,<<) BINARY VALUE 1,0 (0- FALSE, 1- TRUE)
        int f = 6;
        int p = 8;
        System.out.println(f&p);
        System.out.println(f|p);
        System.out.println(f>>p); // f/2 power of p
        System.out.println(f<<p); // f*2 power of p
    }
}
