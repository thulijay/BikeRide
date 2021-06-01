package specifications;

import bicycles.BicycleType;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BicycleSpecificationTest {
    @Test
    public void mountainBikeSpecShouldAccelerateAndBrake() {
        BicycleSpecification mountainBike = new BicycleSpecification(5,3, BicycleType.MountainBike);

        assertEquals(5, mountainBike.getAccelerationSpeed());
        assertEquals(3,mountainBike.getBrakeSpeed());
        assertEquals(BicycleType.MountainBike, mountainBike.getBicycleType());
    }

    @Test
    public void roadBikeSpecShouldAccelerateAndBrake() {
        BicycleSpecification roadBike = new BicycleSpecification(11,4, BicycleType.RoadBike);

        assertEquals(4, roadBike.getBrakeSpeed());
        assertEquals(11, roadBike.getAccelerationSpeed());
        assertEquals(BicycleType.RoadBike, roadBike.getBicycleType());
    }

    @Test
    public void tandemBikeSpecShouldAccelerateAndBrake() {
        BicycleSpecification tandemBike = new BicycleSpecification(12,7, BicycleType.Tandem);

        assertEquals(12, tandemBike.getAccelerationSpeed());
        assertEquals(7, tandemBike.getBrakeSpeed());
        assertEquals(BicycleType.Tandem, tandemBike.getBicycleType());
    }
}
