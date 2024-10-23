import java.util.Scanner;

public class PartC {
    public static double getDouble(Scanner pipe, String prompt){
        System.out.print("enter a double: ");
        return Double.parseDouble(pipe.nextLine());
    }
}
