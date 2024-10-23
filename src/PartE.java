import java.util.Scanner;

public class PartE {
    public static double getRangedDouble(Scanner pipe, String prompt, double low, double high){
        System.out.println("Enter a double");
        return Double.parseDouble(pipe.next());
    }
}
