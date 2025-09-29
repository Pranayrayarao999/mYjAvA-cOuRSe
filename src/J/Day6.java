package J;

public class Day6 {
    public static void main(String[] args) {
        //LOOPS (WHILE, DO-WHILE, FOR )
        //while
        int a=1;
        while(a<10){
            System.out.println(a);
            a++;
        }

        //for loop
        for(int i=0;i<=5;i++){
            System.out.print(i+" ");
        }

        //do-while
        System.out.println(" ");
        int sum= 0;
        do{
            System.out.print(sum +" ");
            sum+=1;
        }

        while(sum<=10);
    }
}
