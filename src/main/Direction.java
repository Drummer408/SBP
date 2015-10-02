package main;

public enum Direction {
    UP("Up", 0, -1),
    DOWN("Down", 0, 1),
    LEFT("Left", -1, 0),
    RIGHT("Right", 1, 0);

    private final String direction;
    private final int xOffset;
    private final int yOffset;

    Direction(String direction, int xOffset, int yOffset) {
        this.direction = direction;
        this.xOffset = xOffset;
        this.yOffset = yOffset;
    }

    @Override
    public String toString() {
        return direction;
    }

    public int getXOffset() {
        return xOffset;
    }

    public int getYOffset() {
        return yOffset;
    }
}
