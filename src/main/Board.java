package main;

import java.util.List;

public interface Board {
    int getWidth();
    int getHeight();
    Cell[][] getCells();
    void setCells(Cell[][] cells);
    Cell getCell(int x, int y);
    void setCell(int representation, int x, int y);
    List<Brick> getBricks();
    Brick getBrick(int id);
    void addBrick(Brick brick);
    void display();
    Board clone();
    boolean isPuzzleSolved();
    List<Move> getAllMovesForBoard();
    List<Move> getAllMovesForBrick(Brick brick);
    boolean isValidMove(Brick brick, Direction direction);
    void applyMove(Move move);
    Board applyMoveCloning(Move move);
    boolean isSameBoardAs(Board board);
    void normalize();
}
