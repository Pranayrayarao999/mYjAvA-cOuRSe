package J;

public class Day22 {
    //User-Defined Exceptions : We can create our own exceptions
    //throw, throws
    public void Vote(int age) throws NotEligibleToVoteException, EligibleToVoteException {
        if(age < 18){
            throw new NotEligibleToVoteException("AGE NOT SUFFICIENT");
        }
        else{
            //throw new ArithmeticException();
            throw new EligibleToVoteException();
        }
    }
    public static void main (String args[]) {
        Day22 d2 = new Day22();
        //d2.Vote(14);

        try{
            d2.Vote(14);
        }
        catch (Exception e){
            System.out.println("");
            //e.printStackTrace();
        }
    }
}

class NotEligibleToVoteException extends Exception{
    NotEligibleToVoteException(String s){
        System.out.println(s);
    }
}

class EligibleToVoteException extends Exception{
    EligibleToVoteException(){
        System.out.println("YOU ARE ELIGIBLE TO VOTE");
    }
}
