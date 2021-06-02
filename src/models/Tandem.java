package models;


import bicycles.BicycleBase;
import bicycles.BicycleType;

public class Tandem extends BicycleBase {

    @Override
    public void accelerate() {
        changeSpeed(12);
    }

    @Override
    public void brake() {
        brake(7);
    }

    @Override
    public BicycleType getBicycleType() {
        return BicycleType.Tandem;
    }
}
