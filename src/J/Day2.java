package J;

public class Day2 {
    public static void main(String[] args) {
        //variable,datatypes(primitive : int,short,long,double,float,boolean,char  , Non-primitive : String,char,class)
        //primitive
        int a = 10;     //initialization
        System.out.println(a);
        float f = 1.2f;
        System.out.println(f);
        double d = 1000.234;
        System.out.println(d);
        boolean b = true;
        System.out.println(b);
        //non-primitive
        String fullName = "Raju";     //camelcase rule variable, not start with $ or _ BUT THEY ARE ALLOWED
        char c = 'c';
        System.out.println(c);

        //typeconversion/typecasting
        float x = 3.14f;
        int y = (int)x ;
        System.out.println(y);

        //typeconversion order
        //BYTE -> SHORT -> INT -> LONG -> FLOAT -> DOUBLE (THIS IS CONVERSION ORDER )
        //INDIRECT CONVERSION ->  int y = (int)x ; CHECK UPPER TYPECONVERSION



    }
}
