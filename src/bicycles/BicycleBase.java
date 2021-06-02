package bicycles;

public abstract class BicycleBase implements Bicycle {
    private int speed;

    protected void changeSpeed(int speed){
        this.speed += speed;
    }

    public int stop(){
       return speed = 0;
    }

    public int currentSpeed(){
        return speed;
    }

    public void brake(int speed){
       this.speed -= speed;
    }
}
