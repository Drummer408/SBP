package main;

import java.io.IOException;

public class Program {
    public static void main(String[] args) {
        ExternalFileFacade eff = new ExternalFileFacadeImpl();
        try {
            Board board = eff.loadBoardFromFile("SBP-level0.txt");
            board.display();
        } catch (IOException | ArrayIndexOutOfBoundsException e) {
            System.out.println("Error loading file.");
            System.exit(1);
        }
    }
}
