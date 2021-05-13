package bicycles;

public class MountainBike {
    private int speed;

    public void accelerate(){
        speed += 11;
    }

    public void brake(){
        speed -= 4;
    }

    public int currentSpeed(){
        return speed;
    }

    public final void stop(){
        speed = 0;
    }
}
