import java.util.Scanner;

public class PartF {
    public static boolean getYNConfirm(Scanner pipe, String prompt){
        System.out.println("Enter Y/N: ");
        return pipe.next().toLowerCase().equals("y") || pipe.next().toLowerCase().equals("yes");
    }
}
