package J.Day13;

public class Day21Polymorphism {
    //poly means many , morphism means forms
    //sINGLE ENTITY CAN EXISTS IN DIFFERENT FORMS
    //POLYMORPHISM IS 2 TYPES. STATIC POLYMORPHISM AND DYNAMIC POLYMORPHISM
    //STATIC POLYMORPHISM IS ALSO KNOW AS EARLY BINDING (COMPILE TIME POLYMRPHISM), METHOD CAN EXISTS IN SAME BUT DIFF PARAMETERS, DATA TYPES, SEQUENCE (METHOD OVERLOADING)
    //DYNAMIC POLYMORPHISM IS KNOWN AS LATE BINDING (RUN TIME POLYMORPHISM, PARENT CLASS METHOD SHOULD OVERIDE IN CHILD CLASS (METHOD OVERRDIDING)
}

//Static polymorphism or early binding or overloading
class MethodOverloading {
    public void show(int a){
        System.out.println(a+"THIS IS INT");
    }

    public void show(String name){
        System.out.println(name+ "tHIS IS STRING");
    }

    public void show(int a, String name) {
        System.out.println(a+" "+name + "tHIS CONTAINS BOTH INT AND STRING");
    }

    public static void main(String[] args) {
        MethodOverloading mo = new MethodOverloading();
        mo.show(1);
        mo.show(2,"Raja");
        mo.show("Kumari");
    }
}

//Dynamic Polymorphism or late Binding or  Overriding
class MethodOverriding {


    public static void main(String[] args) {

    }
}
