package J;

public class Day8 {
    public static void main(String[] args) {
        //break (stops the iteration), continue (skips the iterstion once)
        //break
        int i=0;
         while(i<5){
             if(i==3){
                 break;
             }
             System.out.print(i+ " ");
             i++;
         }

        //using for loop break
        System.out.println(" ");
        for(i=0;i<10;i++){
            if(i==4){
                break;
            }
            System.out.print(i+ " ");

        }

         //continue
        System.out.println(" ");
        int j=0;
        while(j<5){
            if(j==2){
                j++;
                continue;
            }
            System.out.print(j+ " ");
            j++;
        }

        //using for loop continue
        System.out.println(" ");
        for(j=0;j<10;j++){
            if(j==5){
                continue;
            }
            System.out.print(j+ " ");

        }
    }
}
