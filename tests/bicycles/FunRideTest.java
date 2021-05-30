package bicycles;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FunRideTest {

    @Test
    public void funRideShouldBeAbleToTestMountainBikeAndRoadBike() {
        FunRide funRide = new FunRide(8);
        MountainBike mountainBike = new MountainBike();
        RoadBike roadBike = new RoadBike();

        funRide.ridesAccepted(mountainBike);
        funRide.ridesAccepted(roadBike);

        assertEquals(2, funRide.getEnterCountRides());
    }

    @Test
    public void funRideShouldBeAbleToTestMountainBike() {
        FunRide funRide = new FunRide(4);
        Bicycle mountainBike = new MountainBike();

        funRide.ridesAccepted(mountainBike);

        assertEquals(1, funRide.getBicycleTypeCount(BicycleType.MountainBike));
    }

    @Test
    public void funRideShouldBeAbleToTestRoadBike() {
        FunRide funRide = new FunRide(4);
        RoadBike roadBike = new RoadBike();

        funRide.ridesAccepted(roadBike);

        assertEquals(0, funRide.getBicycleTypeCount(BicycleType.RoadBike));
    }

    @Test
    public void funRideShouldBeAbleToTandem() {
        FunRide funRide = new FunRide(4);
        Tandem tandem = new Tandem();

        funRide.ridesAccepted(tandem);

        assertEquals(0, funRide.getBicycleTypeCount(BicycleType.Tandem));
    }

    @Test
    public void funRideShouldBeAbleToTestBicycleSpec() {
        FunRide funRide = new FunRide(8);
        BicycleSpecification mountainBike = new BicycleSpecification(+5, -3, BicycleType.MountainBike);
        BicycleSpecification roadBike = new BicycleSpecification(+11, -4, BicycleType.RoadBike);
        Bicycle bicycle = new BicycleFromSpec(mountainBike);
        Bicycle bicycle1 = new BicycleFromSpec(roadBike);

        funRide.ridesAccepted(bicycle);
        funRide.ridesAccepted(bicycle1);

        assertEquals(2, funRide.getEnterCountRides());

    }

    @Test
    public void funRideShouldOnlyAcceptTwoRides() {
        FunRide funRide = new FunRide(8);
        BicycleSpecification mountainBike = new BicycleSpecification(+5, -3, BicycleType.MountainBike);
        BicycleSpecification roadBike = new BicycleSpecification(+11, -4, BicycleType.RoadBike);
        Bicycle bicycle = new BicycleFromSpec(mountainBike);
        Bicycle bicycle1 = new BicycleFromSpec(roadBike);

        funRide.ridesAccepted(bicycle);
        funRide.ridesAccepted(bicycle);
        funRide.ridesAccepted(bicycle1);

        assertEquals(2, funRide.getEnterCountRides());

    }
}