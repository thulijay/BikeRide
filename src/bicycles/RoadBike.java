package bicycles;

public class RoadBike {
    private int speed;

    public void accelerate(){
        speed += 5;
    }

    public void brake(){
        speed -= 3;
    }

    public int currentSpeed(){
        return speed;
    }

    public final void stop(){
        speed = 0;
    }
}
