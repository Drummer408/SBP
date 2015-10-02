package main;

import java.io.IOException;

public class Program {
    public static void main(String[] args) {
        ExternalFileFacade eff = new ExternalFileFacadeImpl();
        try {
            Board board = eff.loadBoardFromFile("SBP-level0.txt");
            SearchStrategy ss = new RandomWalkSearchStrategy();
            ss.search(board, 3);
        } catch (ArrayIndexOutOfBoundsException | IOException e) {
            System.out.println("Error loading input file.");
            System.exit(1);
        }
    }
}
