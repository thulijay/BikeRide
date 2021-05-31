package specifications;


import bicycles.BicycleType;

public class BicycleSpecification {
    private BicycleType bicycleType;
    private  int accelerationSpeed;
    private  int brakeSpeed;

//    BicycleSpecification roadBikeSpec = new BicycleSpecification(11, 4);


    public BicycleSpecification(int accelerationSpeed, int brakeSpeed, BicycleType bicycleType){
        this.accelerationSpeed = accelerationSpeed;
        this.brakeSpeed = brakeSpeed;
        this.bicycleType = bicycleType;

//        System.out.println(roadBikeSpec.getBrakeSpeed());
    }

    public int getAccelerationSpeed(){
        return accelerationSpeed;
    }

    public int getBrakeSpeed(){
        return brakeSpeed;
    }

    public BicycleType getBicycleType(){
        return bicycleType;
    }
}
