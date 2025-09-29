package J;

import java.util.Scanner;

public class Day10 {
    public static void main(String[] args) {
        //2D ARRAY - multiple rows and multiple coloumns
        int array3 [][] = new int[3][4];  //1 one for no.of rows, 2 for no.of coloumns
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<3;i++){
            for (int j=0;j<4;j++){
                System.out.println("ENTER THE ELEMENTS AT ROW = "+(i+1)+ " & COLOUMN =" +(j+1));
                array3[i][j] = sc.nextInt();
            }
        }

        for (int i=0;i<3;i++){
            for (int j=0;j<4;j++){
                System.out.print(array3[i][j] +" ");
            }
        }

    }
}
