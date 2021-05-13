package bicycles;

@SuppressWarnings("used")

public class BikeRide {
    public final Bicycle bicycles;

    public BikeRide(Bicycle bicycle){
            this.bike = bicycle;
        }

        public void ride(){
            this.bicycle.accelerate();
            this.bicycle.accelerate();
            this.bicycle.accelerate();
            this.bicycle.brake();
            this.bicycle.brake();
            this.bicycle.accelerate();
        }

        public int currentSpeed(){
            return this.bicycle.currentSpeed;
        }

    }