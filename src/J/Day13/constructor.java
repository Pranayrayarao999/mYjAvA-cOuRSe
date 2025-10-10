package J.Day13;

public class constructor {

    int i;
    String name;

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //Parameterized constructor
    public constructor(int i, String name) {
        this.i = i;
        this.name = name;
    }

    //Default constructor
    public constructor() {
        System.out.println("HIII");
    }

    @Override
    public String toString() {
        return "constructor{" +
                "i=" + i +
                ", name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {
        constructor c = new constructor();
        c.i = 1;
        c.name = "Prakash";
        System.out.println(c);

        constructor c1 = new constructor(2,"rAJU");
        constructor c2 = new constructor(3,"rAMESH");

    }

}
