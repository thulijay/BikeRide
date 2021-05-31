package specifications;

import bicycles.BicycleType;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BicycleFromSpecTest {
    @Test
    public void mountainBikeFromSpecShouldAccelerateAndBrake() {
        BicycleSpecification mountainBike = new BicycleSpecification(5, -3, BicycleType.MountainBike);

        assertEquals(5, mountainBike.getAccelerationSpeed());
        assertEquals(-3, mountainBike.getBrakeSpeed());
    }

    @Test
    public void roadBikeFromSpecShouldAccelerateAndBrake() {
        BicycleSpecification roadBike = new BicycleSpecification(11, -4, BicycleType.MountainBike);

        assertEquals(11, roadBike.getAccelerationSpeed());
        assertEquals(-4, roadBike.getBrakeSpeed());
    }

    @Test
    public void tandemFromSpecShouldAccelerateAndBrake() {
        BicycleSpecification tandem = new BicycleSpecification(12, -7, BicycleType.MountainBike);

        assertEquals(12, tandem.getAccelerationSpeed());
        assertEquals(-7, tandem.getBrakeSpeed());
    }
}
