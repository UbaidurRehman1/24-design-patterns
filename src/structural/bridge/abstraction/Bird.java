package structural.bridge.abstraction;

import structural.bridge.implementation.MoveLogic;

public class Bird extends Animal {

    public Bird(MoveLogic moveLogic) {
        super(moveLogic);
    }

    @Override
    public void move() {
        moveLogic.move();
    }
}
