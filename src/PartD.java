import java.util.Scanner;

public class PartD {
    public static int getRangedInt(Scanner pipe, String prompt, int low, int high){
        System.out.println("enter an integer");
        return Integer.parseInt(pipe.nextLine());
    }
}
