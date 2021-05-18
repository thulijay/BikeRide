package bicycles;

public class RoadBike extends BicycleBase {
//    private int speed;

    public void accelerate() {
        changeSpeed(11);
    }

    public void brake() {
        changeSpeed(-4);
    }
}