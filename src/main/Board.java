package main;

import java.util.List;

public interface Board {
    int getWidth();
    int getHeight();
    Cell[][] getCells();
    void setCells(Cell[][] cells);
    Cell getCell(int x, int y);
    void setCell(Cell cell, int x, int y);
    List<Brick> getBricks();
    Brick getBrick(int id);
    void addBrick(Brick brick);
    void display();
    Board clone();
    boolean isPuzzleSolved();
    List<Move> getAllMovesForBrick(Brick brick);
}
