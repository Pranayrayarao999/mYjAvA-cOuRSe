package J;

public class Day7 {

    //METHODS/FUNCTION
    //static method
    public static String hii(String Name){
        System.out.println("HEllo " +Name);
        return Name;
    }

    //non-static method
    public void fun(){
        System.out.println("Good");
    }

    public static void main(String[] args) {
        hii("Raju");

        Day7 d7 = new Day7();
        d7.fun();
    }
}
