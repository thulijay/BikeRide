package bicycles;

public class MountainBike extends BicycleBase{
//    private int speed;

    //these two methods now using the changeSpeed method from the BicycleBase class
    public void accelerate(){
        changeSpeed(5);
    }

    public void brake(){
        changeSpeed(-3);
    }

//    public int currentSpeed(){
//        changeSpeed();
//    }
//
//    public int stop(){
//        changeSpeed(0);
//    }
}
