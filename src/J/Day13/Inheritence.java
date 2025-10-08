package J.Day13;

public class Inheritence {

    public void left(){
        System.out.println("CAR IS GOING LEFT");
    }

    public void right(){
        System.out.println("CAR IS GOING RIGHT");
    }

    public static void main(String[] args) {
        Inheritence i = new Inheritence();
        i.left();
        i.right();
    }
}
