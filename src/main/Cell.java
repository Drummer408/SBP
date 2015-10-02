package main;

public class Cell {
    public static final int GOAL_CELL_REPRESENTATION = -1;
    public static final int EMPTY_CELL_REPRESENTATION = 0;
    public static final int WALL_CELL_REPRESENTATION = 1;
    private static final int BRICK_THRESHOLD_VALUE = 2;

    private int representation;

    public Cell() {
    }

    public Cell(int representation) {
        this.representation = representation;
    }

    public int getRepresentation() {
        return representation;
    }

    public void setRepresentation(int representation) {
        this.representation = representation;
    }

    public boolean containsBrick() {
        return representation >= BRICK_THRESHOLD_VALUE;
    }
}
