package main;

import java.util.List;
import java.util.Random;

public class RandomWalkSearchStrategy implements SearchStrategy {
    private Random randomNumberGenerator;

    public RandomWalkSearchStrategy() {
        randomNumberGenerator = new Random();
    }


    @Override
    public void search(Board board, int numMoves) {
        board.display();
        List<Move> allPossibleMoves;
        Move move;
        int randomIndex;
        for (int i = 0; i < numMoves; i++) {
            allPossibleMoves = board.getAllMovesForBoard();
            randomIndex = generateRandomNumber(allPossibleMoves.size());
            move = allPossibleMoves.get(randomIndex);

            System.out.println("\n(" + move.getBrick().getId() + ", " + move.getDirection().toString() + ")\n");

            board.applyMove(move);
            board.normalize();
            board.display();
            if (board.isPuzzleSolved()) {
                System.out.println("Puzzle solved!");
                break;
            }
        }
        System.out.println();
        board.display();
    }

    private int generateRandomNumber(int upperBound) {
        return randomNumberGenerator.nextInt(upperBound);
    }
}
