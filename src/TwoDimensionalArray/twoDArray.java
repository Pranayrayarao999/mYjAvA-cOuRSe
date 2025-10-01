package TwoDimensionalArray;

import java.util.Scanner;

public class twoDArray {

    public static int[][] Scorecard(){
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE NO OF ROWS ? ");
        int r = sc.nextInt();
        System.out.println("ENTER THE NO OF COLOUMNS ?");
        int c = sc.nextInt();
        System.out.println("ROWS SELECTED :" +r+ " & COLOUMNS SELECTED :" +c);
        int marks [][] = new int[r][c];

        for(int i=0;i<r;i++){
            for (int j=0;j<c;j++){
                System.out.println("ENTER THE MARKS ? , ROW: " + i+ "COLOUMN: "+ j);
                marks[i][j] = sc.nextInt();
            }
        }
        return marks;
    }

    public int[][] displayScore(int arr[][]){
        System.out.println("MARKS REPORT ");
        for(int k=0;k<arr.length;k++){
            for (int l=0;l<arr[k].length;l++){
                System.out.print(arr[k][l] + " ");
            }
            System.out.println();
        }
        return arr;
    }

    public static void main(String[] args) {
        int arr[][] = Scorecard();
        twoDArray td = new twoDArray();
        td.displayScore(arr);
    }
}
