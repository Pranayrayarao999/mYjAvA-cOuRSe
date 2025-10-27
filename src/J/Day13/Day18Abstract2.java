package J.Day13;

public class Day18Abstract2 extends Day18Abstraction{

    //oVERRIDED ABSTRACT METHOD
    @Override
    public void Hii() {
        System.out.println("OVERRIDED ABSTRACT METHOD");
    }

    public static void main(String[] args) {
        Day18Abstract2 d = new Day18Abstract2();
        d.Hii();
        d.Hey();
    }
}
