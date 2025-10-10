package J.Day13;

public class Oops extends Inheritence {
    //OOPS (OBJECT ORIENTED PROGRAMMING) - FOR GREAT EFFICIENCY ,READABILITY WE USE OOPS
    //OOPS IS NOT VERY VERY COMPULSORY, WE CAN DO IT WITHOUT OOPS
    //IT IS 4 TYPES - ENCAPSULATION, ABSTRACTION, POLYMORPHISM, INHERITENCE
    //OBJECT -ANY REAL WORLD OBJECT , OBJECT WHICH HAS ATTRIBUTES/PROPERTIES AND FUNCTIONALITY
    //CLASS IS A BLUPRINT IN WHICH OBJECT IS GENERATED.
    //PEN IS A CLASS , WE CAN WRITE, CLOSECAP,OPENCAP IS A FUNCTIONALITY , COLOUR,COMPANY IS A PROPERTY
    String colour;
    int no;
    String company;

    //constructor is used to create objects , 2 types are default constructor,parametrized constructor
    public Oops(String colour, int no, String company) {
        this.colour = colour;
        this.no = no;
        this.company = company;
    }

    //OVERRIGHT
    public void right(){
        System.out.println("CAR GOES TO RIGHT: OOPS");
    }

    public static void main(String[] args) {
        //Oops o = new Oops();
        Oops op = new Oops("Red",1,"Technotip");
        op.right();
        op.left();
        System.out.println(op.colour +" "+op.company+" "+op.no);

        Inheritence i = new Inheritence();
        i.right();
        i.left();

    }
}
