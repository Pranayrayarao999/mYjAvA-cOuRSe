package J;

public class Day11 {
    //STRING PART 1
    //String - group of characters (ramu) or sequence of characters
    //Char - single character (r)
    //String is also a class
    //String can be created in 2 ways , 1. String literal (String s = "Raju";)   2. new object (String s1 = new String("remo");
    //lets see the diff b/w these 2 is in terms of storage.
    //stack, heap storages -> string pool blongs to stack
    //heap stores the same data as individual data (ex: s1 =Rama , s2 = rama)
    //stack stores the same data once even there are multiple variables.( ex: s1=ramu, s2=ramu)
    //you cannot modify existing string , it will create new string in stack.
    //you can modify existing string in heap.

    //String has 2 more classes to store strings , 1. string buffer 2. string builder.
    //Buffer supports multi threading
    //Builder does not support multi threading

    public static void main(String[] args) {
        String s = "Raju";   //String literals here s is a variable/object
        String sdup = "Raju";
        System.out.println(s);
        //index starts from 0 , length starts from 1.
        System.out.println(s.charAt(2));

        //In String , it is not recommended to create like this.
        String s1 = new String("Raju");  // heap
        System.out.println(s1);
        String s3 = new String("Raju");
        System.out.println(s3);

        //String builder and buffer
        StringBuilder sc = new StringBuilder("Ramana");
        StringBuffer sb2 = new StringBuffer("Rakesh");


    }
}
