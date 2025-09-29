package J;

import java.util.Scanner;

public class Day5 {
    public static void main(String[] args) {
        //Conditional (if,else,else-if ,switch)
        int a=10;
        int b=5;
        if(a>b){
            System.out.println("A IS GREATER");
        }
        else if(b>a){
            System.out.println("B IS GREATER");
        }
        else{
            System.out.println("BOTH ARE SAME");
        }

        //Switch
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER TRAFFIC LIGHT ? red,green,yellow");
        String light = sc.next();
        switch (light){
            case "red" :
                System.out.println("RED LIGHT PLEASE STOP");
                break;
            case "green" :
                System.out.println("GREEN LIGHT PLEASE GO");
                break;

            case "yellow":
                System.out.println("YELLOW LIGHT BE READY");
                break;

            default :
                System.out.println("INVALID");
                break;
        }

    }
}
