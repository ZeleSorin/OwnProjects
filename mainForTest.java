import org.junit.jupiter.api.*;
import viewsFactory.mainFactory;
;

public class mainForTest {

    public static void main(String[] args) {
        mainFactory factory = new mainFactory();
        try {
            factory.factoryDo("TicTacToe");
        } catch (Exception e) {
            e.printStackTrace();
        }
        testing();
    }
    @Test
    public static void testing(){


    }
}