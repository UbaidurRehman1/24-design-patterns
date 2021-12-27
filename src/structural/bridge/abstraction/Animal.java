package structural.bridge.abstraction;

import structural.bridge.implementation.MoveLogic;

public abstract class Animal {
    
    final MoveLogic moveLogic;

    public Animal(MoveLogic moveLogic) {
        this.moveLogic = moveLogic;
    }

    public abstract void move();
}
