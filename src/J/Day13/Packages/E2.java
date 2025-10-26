package J.Day13.Packages;
import J.Day13.Packages.E1;  //This is how you can use other classes inside package

public class E2 {
    public static void main(String[] args) {
        E1 e = new E1();
        e.HelloPackage();
    }
}
