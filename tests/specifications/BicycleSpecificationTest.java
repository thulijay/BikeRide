package bicycles;

import org.junit.jupiter.api.Test;
import specifications.BicycleSpecification;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BicycleSpecificationTest {
    @Test
    public void mountainBikeSpecShouldAccelerateAndBrake() {

        BicycleSpecification mountainBike = new BicycleSpecification(5,-3, BicycleType.MountainBike);

        assertEquals(BicycleType.MountainBike, mountainBike.getBicycleType());
    }
    @Test
    public void roadBikeSpecShouldAccelerateAndBrake() {

        BicycleSpecification roadBike = new BicycleSpecification(11,-4, BicycleType.RoadBike);

        assertEquals(BicycleType.RoadBike, roadBike.getBicycleType());
    }
    @Test
    public void tandemBikeSpecShouldAccelerateAndBrake() {

        BicycleSpecification tandemBike = new BicycleSpecification(12,-7, BicycleType.Tandem);

        assertEquals(BicycleType.Tandem, tandemBike.getBicycleType());
    }
}
