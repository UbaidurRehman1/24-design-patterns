package structural.bridge.abstraction;

import structural.bridge.implementation.MoveLogic;

public class Human extends Animal {

    public Human(MoveLogic moveLogic) {
        super(moveLogic);
    }

    @Override
    public void move() {
        moveLogic.move();
    }
}
