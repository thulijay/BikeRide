package bicycles;

import models.MountainBike;
import models.RoadBike;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BicycleTest {

    @Test
    public void mountainBikeShouldAccelerate() {
        MountainBike bicycle = new MountainBike();

        bicycle.accelerate();

        assertEquals(5, bicycle.currentSpeed());
    }

    @Test
    public void mountainBikeShouldBrake() {
        MountainBike bicycle = new MountainBike();

        bicycle.accelerate();
        bicycle.brake();

        assertEquals(2, bicycle.currentSpeed());
    }

    @Test
    public void mountainBikeShouldBrakeAndAccelerate() {
        MountainBike bicycle = new MountainBike();

        bicycle.accelerate();
        bicycle.accelerate();
        bicycle.brake();

        assertEquals(7, bicycle.currentSpeed());
    }

    @Test
    public void mountainBikeShouldStop() {
        MountainBike bicycle = new MountainBike();

        bicycle.accelerate();
        bicycle.brake();
        bicycle.accelerate();
        bicycle.stop();

        assertEquals(0, bicycle.currentSpeed());
    }

    @Test
    public void mountainBikeShouldAccelerateMoreThanOnce() {
        MountainBike mountainBike = new MountainBike();

        mountainBike.accelerate();
        mountainBike.accelerate();
        mountainBike.accelerate();
        mountainBike.accelerate();
        mountainBike.accelerate();
        mountainBike.accelerate();

        assertEquals(30, mountainBike.currentSpeed());
    }

    @Test
    public void roadBikeShouldAccelerate() {
        RoadBike bicycle = new RoadBike();

        bicycle.accelerate();

        assertEquals(11, bicycle.currentSpeed());
    }

    @Test
    public void roadBikeShouldBrake() {
        RoadBike bicycle = new RoadBike();

        bicycle.accelerate();
        bicycle.brake();

        assertEquals(7, bicycle.currentSpeed());
    }


    @Test
    public void roadBikeShouldBrakeAndAccelerate() {
        RoadBike bicycle = new RoadBike();

        bicycle.accelerate();
        bicycle.brake();

        assertEquals(7, bicycle.currentSpeed());
    }

    @Test
    public void roadBikeShouldStop() {
        RoadBike bicycle = new RoadBike();

        bicycle.accelerate();
        bicycle.brake();
        bicycle.accelerate();
        bicycle.stop();

        assertEquals(0, bicycle.currentSpeed());
    }

    @Test
    public void roadBikeShouldAccelerateMoreThanOnce() {
        RoadBike roadBike = new RoadBike();

        roadBike.accelerate();
        roadBike.accelerate();
        roadBike.accelerate();
        roadBike.accelerate();
        roadBike.accelerate();
        roadBike.accelerate();

        assertEquals(66, roadBike.currentSpeed());
    }
}