package bicycles;


public class Tandem extends BicycleBase{

    public void accelerate() {
        changeSpeed(12);
    }

    public void brake() {
        changeSpeed(7);
    }

    @Override
    public BicycleType getBicycleType() {
        return null;
    }
}
