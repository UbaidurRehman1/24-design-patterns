package structural.bridge;

import structural.bridge.abstraction.Animal;
import structural.bridge.abstraction.Bird;
import structural.bridge.abstraction.Human;
import structural.bridge.implementation.BirdMoveLogic;
import structural.bridge.implementation.HumanMoveLogic;
import structural.bridge.implementation.MoveLogic;

public class Client {

    public static void main(String[] args) {
        MoveLogic humanMoveLogic = new HumanMoveLogic();
        MoveLogic birdMoveLogic = new BirdMoveLogic();
        
        Animal human = new Human(humanMoveLogic);
        Animal bird = new Bird(birdMoveLogic);
        
        human.move();
        bird.move();
    }
}
