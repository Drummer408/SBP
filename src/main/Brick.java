package main;

import java.util.ArrayList;
import java.util.List;

public class Brick {
    private static final int MASTER_BRICK_ID = 2;

    private int id;
    private List<BrickComponent> brickComponents;

    public Brick(int id) {
        this.id = id;
        brickComponents = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public List<BrickComponent> getBrickComponents() {
        return brickComponents;
    }

    public void setBrickComponents(List<BrickComponent> brickComponents) {
        this.brickComponents = brickComponents;
    }

    public void addBrickComponent(BrickComponent brickComponent) {
        brickComponents.add(brickComponent);
    }

    public boolean isMasterBrick() {
        return id == MASTER_BRICK_ID;
    }
}
