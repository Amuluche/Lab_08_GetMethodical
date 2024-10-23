import java.util.Scanner;

public class PartA {
    public static String getNonZeroLenString(Scanner pipe, String prompt){
        String retString = "0"; // Set this to zero length. Loop runs until it isn't
        do
        {
            System.out.print("\n" +prompt + ": "); // show prompt add space
            retString = pipe.nextLine();
        }while(retString.length() == 0);

        return retString;


    }
}
