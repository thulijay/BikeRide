package bicycles;

public abstract class BicycleBase implements Bicycle{
    private int speed;

    protected void changeSpeed(int speedOf){
        this.speed += speedOf;
    }
    public int stop(){
       return speed = 0;
    }

    public int currentSpeed(){
        return speed;
    }

    public void brake(){
        speed -= speed;
    }
}
