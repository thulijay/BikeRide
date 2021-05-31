package rides;

import bicycles.Bicycle;
import bicycles.BicycleType;
import models.MountainBike;
import models.RoadBike;
import models.Tandem;
import org.junit.jupiter.api.Test;
import specifications.BicycleFromSpec;
import specifications.BicycleSpecification;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FunRideTest {

    @Test
    public void funRideShouldBeAbleToAcceptMountainBikeAndRoadBike() {
        FunRide funRide = new FunRide(8);
        MountainBike mountainBike = new MountainBike();
        RoadBike roadBike = new RoadBike();

        funRide.ridesAccepted(mountainBike);
        funRide.ridesAccepted(roadBike);

        assertEquals(2, funRide.getEnterCountRides());
    }

    @Test
    public void funRideShouldBeAbleToAccelerateMountainBike() {
        FunRide funRide = new FunRide(4);
        Bicycle mountainBike = new MountainBike();

        funRide.ridesAccepted(mountainBike);

        assertEquals(1, funRide.getBicycleTypeCount(BicycleType.MountainBike));
    }

    @Test
    public void funRideShouldBeAbleToAccelerateRoadBike() {
        FunRide funRide = new FunRide(12);
        RoadBike roadBike = new RoadBike();

        funRide.ridesAccepted(roadBike);

        assertEquals(1, funRide.getBicycleTypeCount(BicycleType.RoadBike));
    }

    @Test
    public void funRideShouldBeAbleToAccelerateTandem() {
        FunRide funRide = new FunRide(4);
        Tandem tandem = new Tandem();

        funRide.ridesAccepted(tandem);

        assertEquals(1, funRide.getBicycleTypeCount(BicycleType.Tandem));
    }

    @Test
    public void funRideShouldBeAbleToTestBicycleSpecBrakeAndAcceleration() {
        FunRide funRide = new FunRide(8);
        BicycleSpecification mountainBike = new BicycleSpecification(5, 3, BicycleType.MountainBike);
        BicycleSpecification roadBike = new BicycleSpecification(11, 4, BicycleType.RoadBike);
        Bicycle bicycle = new BicycleFromSpec(mountainBike);
        Bicycle bicycle1 = new BicycleFromSpec(roadBike);

        funRide.ridesAccepted(bicycle);
        funRide.ridesAccepted(bicycle1);

        assertEquals(2, funRide.getEnterCountRides());

    }

    @Test
    public void funRideShouldOnlyAcceptTwoRides() {
        FunRide funRide = new FunRide(8);
        BicycleSpecification mountainBike = new BicycleSpecification(5, 3, BicycleType.MountainBike);
        BicycleSpecification roadBike = new BicycleSpecification(11, 4, BicycleType.RoadBike);
        Bicycle bicycle = new BicycleFromSpec(mountainBike);
        Bicycle bicycle1 = new BicycleFromSpec(roadBike);

        funRide.ridesAccepted(bicycle);
        funRide.ridesAccepted(bicycle);
        funRide.ridesAccepted(bicycle1);

        assertEquals(2, funRide.getEnterCountRides());

    }
}