package bicycles;

public class RoadBike extends BicycleBase{
//    private int speed;

    public void accelerate(){
        changeSpeed(11);
    }

    public void brake(){
        changeSpeed(-4);
    }

    //the methods below are already implemented in the BicycleBase class

//    public int currentSpeed(){
//        return speed;
//    }
//
//    public int stop(){
//        speed = 0;
//    }
}
