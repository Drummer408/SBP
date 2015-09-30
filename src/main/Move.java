package main;

public class Move {
    private Board board;
    private Brick brick;
    private Direction direction;

    public Move(Board board, Brick brick, Direction direction) {
        this.board = board;
        this.brick = brick;
        this.direction = direction;
    }

    public Board getBoard() {
        return board;
    }

    public Brick getBrick() {
        return brick;
    }

    public Direction getDirection() {
        return direction;
    }
}
