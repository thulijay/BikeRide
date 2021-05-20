package bicycles;

public class BikeRideOne implements BikeRide{
    private final Bicycle bicycle;

    public BikeRideOne(Bicycle bicycle) {
        this.bicycle = bicycle;
    }

    @Override
    public void ride(){
        this.bicycle.accelerate();
        this.bicycle.accelerate();
        this.bicycle.accelerate();
        this.bicycle.accelerate();
        this.bicycle.brake();
        this.bicycle.brake();
        this.bicycle.brake();
        this.bicycle.brake();
    }
}