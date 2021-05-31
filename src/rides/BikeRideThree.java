package rides;

import bicycles.Bicycle;

public class BikeRideThree implements BikeRide{
    private Bicycle bicycle;

    public BikeRideThree(Bicycle bicycle){
        this.bicycle = bicycle;
    }

    public int currentSpeed (){
        return this.bicycle.currentSpeed();
    }

    @Override
    public void ride() {
        bicycle.accelerate();
        bicycle.brake();
        bicycle.accelerate();
        bicycle.accelerate();
        bicycle.brake();
    }
}
