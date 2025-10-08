package J;

public class Day12 {
    //STRING PART2
    //index starts from 0, length starts from 1
    public static void main(String[] args) {
        String s1="Remo";
        String s2="Kamal";
        System.out.println(s1.charAt(2));
        System.out.println(s1.endsWith("m"));  //checks whether it ends with m
        System.out.println(s1.toUpperCase());  //converts to uppercase
        System.out.println(s1.toLowerCase());  //converts to lowercase
        System.out.println(s1.length());   //displays the length
        System.out.println(s1.equals("REMO"));     //checks whether both are equal or not (true/false)
        System.out.println(s1.equalsIgnoreCase("REMO")); //checks whether same or not & ignores case(upper,lower) (true/false)
        System.out.println(s1+s2);    //concatenation we use + sign
        String s3 = "Reddy";
        System.out.println(s2.concat(" "+s3));
        System.out.println(s2.contains("a"));   //checks whether this character contains inside it or not (true/false)
        System.out.println(s2.indexOf("m"));   //checks the index and displays the index number if exists

        //single line commenting
        /*   djjf   */    //multi lines commenting
    }
}
