package models;

import models.RoadBike;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RoadBikeTest {

    @Test
    public void roadBikeShouldAccelerate() {
        RoadBike bicycle = new RoadBike();

        bicycle.accelerate();

        assertEquals(11, bicycle.currentSpeed());
    }

    @Test
    public void roadBikeShouldAccelerateAndBrakeCorrectly() {
        RoadBike bicycle = new RoadBike();

        bicycle.accelerate();
        bicycle.brake();

        assertEquals(7, bicycle.currentSpeed());
    }

    @Test
    public void roadBikeShouldDoMultipleAcceleratesCorrectly() {
        RoadBike bicycle = new RoadBike();

        bicycle.accelerate();
        bicycle.accelerate();
        bicycle.accelerate();

        assertEquals(33, bicycle.currentSpeed());
    }

    @Test
    public void roadBikeShouldDoMultipleAccelerateAndBrakesCorrectly() {
        RoadBike bicycle = new RoadBike();

        bicycle.accelerate();
        bicycle.brake();
        bicycle.accelerate();
        bicycle.brake();
        bicycle.brake();

        assertEquals(10, bicycle.currentSpeed());
    }

    @Test
    public void roadBikeShouldBeAbleToStop() {
        RoadBike bicycle = new RoadBike();

        bicycle.accelerate();
        bicycle.brake();
        bicycle.accelerate();
        bicycle.stop();

        assertEquals(0, bicycle.currentSpeed());
    }
}
