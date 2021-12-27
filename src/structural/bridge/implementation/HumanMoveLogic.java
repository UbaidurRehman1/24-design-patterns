package structural.bridge.implementation;

public class HumanMoveLogic implements MoveLogic {

    @Override
    public void move() {
        System.out.printf("[%s]: Human is walking by alternating legs\n", getClass().getSimpleName());
    }
}
