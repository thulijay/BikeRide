package rides;

import bicycles.Bicycle;

public class BikeRideTwo implements BikeRide{
    private Bicycle bicycle;

    public BikeRideTwo(Bicycle bicycle){
        this.bicycle = bicycle;
    }

    public int currentSpeed (){
        return this.bicycle.currentSpeed();
    }

    @Override
    public void ride() {
        bicycle.accelerate();
        bicycle.accelerate();
        bicycle.accelerate();
        bicycle.accelerate();
        bicycle.stop();
        bicycle.accelerate();
        bicycle.accelerate();
        bicycle.brake();

    }
}
