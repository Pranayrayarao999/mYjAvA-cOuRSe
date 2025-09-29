package J;

import java.util.Scanner;

public class Day9 {
    public static void main(String[] args) {
        // ARRAYS / 1D ARRAY - single row multiple coloumns
        int array [] = {1,2,3,4,5};
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println(array[3]);
        System.out.println(array[4]);
        System.out.println("**********************");

        int array2 [] = new int[5];    //array size declared for variable array2
        Scanner sc = new Scanner(System.in);
        for (int i=0;i<array2.length;i++){
            System.out.println("ENTER MARKS OF STUDENTS ?" +i);
            array2[i] = sc.nextInt();
        }

        for (int i=0;i<5;i++){
            System.out.println(array2[i]);
        }
    }
}
