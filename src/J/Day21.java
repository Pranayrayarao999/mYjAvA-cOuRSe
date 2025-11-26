package J;

public class Day21 {
    //Exception Handling which stops and allows the program to normally flow
    //Exception is which disrupts the normal flow of the program
    //Exception are 2 types, checked and unchecked exceptions
    //try,catch, finally  - we use these for critical code which is likely to throw an exception.
    //there can single try and multiple catch blocks
    //Exception is the parent of all other exceptions
    public static void main(String[] args) {
        int a =10;
        int b =0;
        //int d = a/b;
        String hey = "Ramesh";
        try{
            hey.charAt(7);

            int c = a/b;
            System.out.println(c);

        }
//        catch (ArithmeticException e) {
//            e.printStackTrace();
//            System.out.println("YOU ARE TRYING TO DIVIDE BY 0, IT IS UNDEFINDED");
//        }
//        catch(IndexOutOfBoundsException h){
//            h.printStackTrace();
//            System.out.println("String index not available");
//        }
        catch(Exception e2){
            //e2.printStackTrace();
            System.out.println("Exception is parent \n"  +e2);
        }

        finally {
            System.out.println("FINALLYYYY WILL EXECUTE WHETHER TRY AND CATCH EXECUTE OR NOT");
        }
    }
}
