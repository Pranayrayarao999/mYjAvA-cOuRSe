package J.Day13;

public interface Day20Interface {
    //In interface, all the methods are abstract methods
    //Interface support multiple inheritence
    public void Hii();
    public void Hey();
}

class D2 implements Day20Interface {

    @Override
    public void Hii() {
        System.out.println("HIIIIII");
    }

    @Override
    public void Hey() {
        System.out.println("HEYYYYYYY");
    }

    public static void main(String[] args) {
        D2 d = new D2();
        d.Hey();
        d.Hii();

    }
}
