package rides;

import models.MountainBike;
import models.RoadBike;
import models.Tandem;
import org.junit.jupiter.api.Test;
import rides.BikeRideOne;
import rides.BikeRideThree;
import rides.BikeRideTwo;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BikeRidesTest {
    @Test
    public void mountainBikeRideOneShouldAccelerateAndBrake() {
        MountainBike mountainBike = new MountainBike();
        BikeRideOne bikeRideOne = new BikeRideOne(mountainBike);

        bikeRideOne.ride();

        assertEquals(24, bikeRideOne.currentSpeed());

    }

    @Test
    public void roadBikeRideOneShouldAccelerateAndBrake() {
        RoadBike roadBike = new RoadBike();
        BikeRideOne bikeRideOne = new BikeRideOne(roadBike);

        bikeRideOne.ride();

        assertEquals(58, bikeRideOne.currentSpeed());

    }

    @Test
    public void tandemBikeRideOneShouldAccelerateAndBrake() {
        Tandem tandem = new Tandem();
        BikeRideOne bikeRideOne = new BikeRideOne(tandem);

        bikeRideOne.ride();

        assertEquals(58, bikeRideOne.currentSpeed());

    }

    @Test
    public void mountainBikeRideTwoShouldAccelerateBrakeAndStop() {
        MountainBike mountainBike = new MountainBike();
        BikeRideTwo bikeRideOne = new BikeRideTwo(mountainBike);

        bikeRideOne.ride();

        assertEquals(7, bikeRideOne.currentSpeed());

    }

    @Test
    public void roadBikeRideTwoShouldAccelerateBrakeAndStop() {
        RoadBike roadBike = new RoadBike();
        BikeRideTwo bikeRideOne = new BikeRideTwo(roadBike);

        bikeRideOne.ride();

        assertEquals(18, bikeRideOne.currentSpeed());

    }

    @Test
    public void tandemBikeRideTwoShouldAccelerateBrakeAndStop() {
        Tandem tandem = new Tandem();
        BikeRideTwo bikeRideOne = new BikeRideTwo(tandem);

        bikeRideOne.ride();

        assertEquals(17, bikeRideOne.currentSpeed());

    }

    @Test
    public void mountainBikeRideThreeShouldAccelerateAndBrake() {
        MountainBike mountainBike = new MountainBike();
        BikeRideThree bikeRideOne = new BikeRideThree(mountainBike);

        bikeRideOne.ride();

        assertEquals(9, bikeRideOne.currentSpeed());

    }

    @Test
    public void roadBikeRideThreeShouldAccelerateAndBrake() {
        RoadBike roadBike = new RoadBike();
        BikeRideThree bikeRideOne = new BikeRideThree(roadBike);

        bikeRideOne.ride();

        assertEquals(25, bikeRideOne.currentSpeed());

    }

    @Test
    public void tandemBikeRideThreeShouldAccelerateAndBrake() {
        Tandem tandem = new Tandem();
        BikeRideThree bikeRideOne = new BikeRideThree(tandem);

        bikeRideOne.ride();

        assertEquals(22, bikeRideOne.currentSpeed());

    }

}
