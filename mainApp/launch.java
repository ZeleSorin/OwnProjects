package mainApp;

import viewsFactory.mainFactory;

import javax.swing.*;

public class launch {
    private static mainFactory factory = new mainFactory();
    private static JFrame frame ;
    public static void main(String[] args) {
        try {
            frame = factory.factoryDo("launch");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
