package structural.bridge.implementation;

public class BirdMoveLogic implements MoveLogic {

    @Override
    public void move() {
        System.out.printf("[%s]: Bird is flying by flapping wings\n", getClass().getSimpleName());
    }
}
