package bicycles;

import java.util.ArrayList;

import java.util.List;


public class FunRide {

    private int bicycleTypeCount = 0;
    private int maxNumOfRides;
    private List<Bicycle> listOfBicycles = new ArrayList<Bicycle>();

    public FunRide(int maxSpeed) {
        this.maxNumOfRides = maxSpeed;
    }


    public void ridesAccepted(Bicycle bicycle) {
        if ((!listOfBicycles.contains(bicycle)) && (this.maxNumOfRides > listOfBicycles.size())) {

            listOfBicycles.add(bicycle);
        } else  {
            System.out.println("We cannot accept anymore rides!");
        }  {
            System.out.println("Ride Accepted!");
        }
    }

    public int getEnterCountRides() {
        return this.listOfBicycles.size();
    }

    public int getBicycleTypeCount(BicycleType bicycleType) {
        for (Bicycle bicycle : listOfBicycles) {
            if (bicycle.getBicycleType() == bicycleType) {
                bicycleTypeCount++;
            }
        }

        return bicycleTypeCount;
    }

}