import java.util.Scanner;
import static org.apache.commons.lang3.StringUtils.isNumeric;
import static org.apache.commons.lang3.StringUtils.swapCase;
import static org.apache.commons.lang3.StringUtils.reverse;

public class NewMainClass {

    public static void main(String[] args) {
        Scanner mvn = new Scanner(System.in);
        System.out.print("Enter Something:");
        String answer = mvn.nextLine();
        System.out.println("You Entered:\" "  + answer + "\"");
        System.out.print("\"" + answer + "\"");
        if (isNumeric(answer)) {
            System.out.println(" is a number.");
        } else System.out.println(" is not a number.");

        System.out.println("Flipped Case: " + swapCase(answer));
        System.out.println("Reversed: " + reverse(answer));
        //String answer = mvn.nextLine();
        //System.out.println(isNumeric(23));
        //swapCase();
        //reverse();
    }
}

