package J.Day13;

public class Day19Static {
    //static acts as a single copy of class, we dont need to create object, we can call it directly
    //Static variable will be class variable
    //static method will be class method

    //Static varible
    static String cityName;

    //non-static varible
    String fname;

    //Static method
    public static void Scores(int engScore, int ausScore){
        if(engScore > ausScore){
            System.out.println("England is the winner : "+engScore);
        }
        else if(ausScore > engScore){
            System.out.println("Australia is the winner :"+ausScore);
        }
        else{
            System.out.println("GAME TIE: SCORES LEVELED");
        }
    }

    //Non-static method
    public void Scores2(int engScore, int ausScore){
        if(engScore > ausScore){
            System.out.println("England is the winner : "+engScore);
        }
        else if(ausScore > engScore){
            System.out.println("Australia is the winner :"+ausScore);
        }
        else{
            System.out.println("GAME TIE: SCORES LEVELED");
        }
    }

    public static void main(String[] args) {
        Day19Static d9 = new Day19Static();
        d9.fname = " Rakesh";
        Day19Static.cityName = "Hyderabad";
        //cityName = "Hyderabad";

        Day19Static d8 = new Day19Static();
        d8.fname = "Raju";

        System.out.println("Hello "+d8.fname +" From "+cityName);
        System.out.println("Hello "+d9.fname +" From "+cityName);

        //Static method Calling directly and we can call it by using object.
        Scores(97,85);
        d8.Scores(98,99);

        //Non-static method , you cannot call it directly, you need to create an object (dAY19Static d8 = new dAY19Static(); )
        d8.Scores2(87,86);
    }

}
