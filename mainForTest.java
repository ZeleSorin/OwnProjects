import org.junit.jupiter.api.*;
import viewsFactory.mainFactory;
;import java.util.Scanner;

public class mainForTest {

    public static void main(String[] args) {
        mainFactory factory = new mainFactory();
        Scanner scan = new Scanner(System.in);
        System.out.println("[MOB]: Enter the type of panel required \n Or help for details...");
        try {
            String input;
            while (true) {
                input = scan.nextLine();
                if (input.equalsIgnoreCase("help")) {
                    printHelp();
                } else {
                    break;
                }
            }
            factory.factoryDo(input);
        } catch (Exception e) {
            e.printStackTrace();
        }
        testing();
    }

    @Test
    public static void testing() {


    }

    /**
     * Method created to print the help screen of my app that have different details
     * The help will later be removed since all actions will take place using the G.U.I.
     */
    public static void printHelp() {
        System.out.println("Hello, here are the informations : ");
        System.out.println("For ticTacToe type \"tictactoe\"");
        System.out.println("For launch page type \"launch \"");
        System.out.println("");
    }
}