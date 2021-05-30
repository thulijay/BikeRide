package bicycles;

public class MountainBike extends BicycleBase {

    //these two methods now using the changeSpeed method from the BicycleBase class
    public void accelerate() {
        changeSpeed(+5);
    }

    public void brake() {
        changeSpeed(-3);
    }

    @Override
    public BicycleType getBicycleType() {
        return BicycleType.MountainBike;
    }
}
