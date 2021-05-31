package rides;

import bicycles.Bicycle;

public class BikeRideOne implements BikeRide{
    private Bicycle bicycle;

    public BikeRideOne(Bicycle bicycle) {
        this.bicycle = bicycle;
    }

    public int currentSpeed (){
        return this.bicycle.currentSpeed();
    }

    @Override
    public void ride(){
        bicycle.accelerate();
        bicycle.accelerate();
        bicycle.accelerate();
        bicycle.accelerate();
        bicycle.accelerate();
        bicycle.accelerate();
        bicycle.brake();
        bicycle.brake();
    }


}