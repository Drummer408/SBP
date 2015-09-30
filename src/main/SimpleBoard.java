package main;

import java.util.ArrayList;
import java.util.List;

public class SimpleBoard implements Board {
    private int width, height;
    private Cell[][] cells;
    private List<Brick> bricks;

    public SimpleBoard(int width, int height) {
        this.width = width;
        this.height = height;
        cells = new Cell[width][height];
        bricks = new ArrayList<>();
    }

    @Override
    public int getWidth() {
        return width;
    }

    @Override
    public int getHeight() {
        return height;
    }

    @Override
    public Cell[][] getCells() {
        return cells;
    }

    @Override
    public Cell getCell(int x, int y) {
        return cells[x][y];
    }

    @Override
    public void setCells(Cell[][] cells) {
        this.cells = cells;

        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                checkCellForBrickComponents(cells[x][y], x, y);
            }
        }
    }

    @Override
    public void setCell(Cell cell, int x, int y) {
        cells[x][y] = cell;
        checkCellForBrickComponents(cell, x, y);
    }

    private void checkCellForBrickComponents(Cell cell, int x, int y) {
        if (cell.containsBrick()) {
            int brickId = cell.getRepresentation();
            BrickComponent brickComponent = new BrickComponent(x, y);
            for (Brick br : bricks) {
                if (br.getId() == brickId) {
                    br.addBrickComponent(brickComponent);
                    return;
                }
            }
            bricks.add(new Brick(brickId));
        }
    }

    @Override
    public List<Brick> getBricks() {
        return bricks;
    }

    @Override
    public Brick getBrick(int id) {
        for (Brick br : bricks) {
            if (br.getId() == id) {
                return br;
            }
        }
        return null;
    }

    @Override
    public void addBrick(Brick brick) {
        bricks.add(brick);
    }

    @Override
    public void display() {
        System.out.println(width + "," + height + ",");
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                System.out.print(cells[x][y].getRepresentation() + ", ");
            }
            System.out.println();
        }
    }

    @Override
    public Board clone() {
        Board newBoard = new SimpleBoard(width, height);
        newBoard.setCells(cells);
        return newBoard;
    }

    @Override
    public boolean isPuzzleSolved() {
        for (int x = 0; x < width; x++) {
            for (int y = 0; y < height; y++) {
                if (cells[x][y].getRepresentation() == Cell.GOAL_CELL_REPRESENTATION) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override
    public List<Move> getAllMovesForBrick(Brick brick) {
        List<Move> moves = new ArrayList<>();

        checkLeftMove(moves, brick);

        return moves;
    }

    private void checkLeftMove(List<Move> moves, Brick brick) {
        for (BrickComponent brickComponent : brick.getBrickComponents()) {
            
        }
    }
}