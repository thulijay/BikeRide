package bicycles;

public class BikeRideThree implements BikeRide{
    private Bicycle bicycle;

    public BikeRideThree(Bicycle bicycle){
        this.bicycle = bicycle;
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
