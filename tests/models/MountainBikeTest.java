package models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MountainBikeTest {

    @Test
    public void mountainBikeShouldAccelerate() {
        MountainBike bicycle = new MountainBike();

        bicycle.accelerate();

        assertEquals(5, bicycle.currentSpeed());
    }

    @Test
    public void mountainBikeShouldAccelerateAndBrakeCorrect() {
        MountainBike bicycle = new MountainBike();

        bicycle.accelerate();
        bicycle.brake();

        assertEquals(2, bicycle.currentSpeed());
    }

    @Test
    public void mountainBikeShouldDoMultipleAcceleratesCorrectly() {
        MountainBike bicycle = new MountainBike();

        bicycle.accelerate();
        bicycle.accelerate();
        bicycle.accelerate();

        assertEquals(15, bicycle.currentSpeed());
    }

    @Test
    public void mountainBikeShouldDoMultipleAccelerateAndBrakesCorrectly() {
        MountainBike bicycle = new MountainBike();

        bicycle.accelerate();
        bicycle.brake();
        bicycle.accelerate();
        bicycle.brake();
        bicycle.brake();

        assertEquals(1, bicycle.currentSpeed());
    }

    @Test
    public void mountainBikeShouldBeAbleToStop() {
        MountainBike bicycle = new MountainBike();

        bicycle.accelerate();
        bicycle.brake();
        bicycle.accelerate();
        bicycle.stop();

        assertEquals(0, bicycle.currentSpeed());
    }

}
