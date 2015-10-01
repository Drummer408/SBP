package main;

public enum Direction {
    UP("Up", -1, 0),
    DOWN("Down", 1, 0),
    LEFT("Left", 0, -1),
    RIGHT("Right", 0, 1);

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
