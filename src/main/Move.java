package main;

public class Move {
    private Brick brick;
    private Direction direction;

    public Move(Brick brick, Direction direction) {
        this.brick = brick;
        this.direction = direction;
    }

    public Brick getBrick() {
        return brick;
    }

    public Direction getDirection() {
        return direction;
    }
}
