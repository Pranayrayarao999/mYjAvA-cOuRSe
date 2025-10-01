package TwoDimensionalArray;

public class movie2D {
    public static String[][] movieNames(){
        String mName[][] = new String[3][4];// Assign values
        mName[0][0] = "Inception";
        mName[0][1] = "Interstellar";
        mName[0][2] = "Tenet";
        mName[0][3] = "Dunkirk";

        mName[1][0] = "The Dark Knight";
        mName[1][1] = "Batman Begins";
        mName[1][2] = "The Prestige";
        mName[1][3] = "Memento";

        mName[2][0] = "Avatar";
        mName[2][1] = "Titanic";
        mName[2][2] = "Aliens";
        mName[2][3] = "The Terminator";

        for(int i=0;i<mName.length;i++){
            for (int j=0;j<mName[i].length;j++){
                System.out.print(mName[i][j]+" ");
            }
            System.out.println();
        }
        return mName;
    }
    public static void main(String[] args) {

        movieNames();

    }
}
