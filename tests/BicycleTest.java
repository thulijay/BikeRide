//import bicycles.Bicycle;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//
//import org.junit.jupiter.api.Test;
//
//public class BicycleTest {
//    @Test
//    public void shouldAccelerate() {
//        Bicycle bicycle = new Bicycle();
//        bicycle.accelerate();
//
//        assertEquals(5, bicycle.currentSpeed());
//    }
//
//    @Test
//    public  void shouldAccelerateANdBrakeCorrect(){
//        Bicycle bicycle = new Bicycle();
//        bicycle.accelerate();
//        bicycle.brake();
//
//        assertEquals(2, bicycle.currentSpeed());
//    }
//
//    @Test
//    public void shouldDoMultipleAccelerateAndBrakesCorrectly(){
//        Bicycle bicycle = new Bicycle();
//
//        bicycle.accelerate();
//        bicycle.brake();
//        bicycle.accelerate();
//        bicycle.brake();
//        bicycle.brake();
//        bicycle.brake();
//
//        assertEquals(1, bicycle.currentSpeed());
//    }
//
//    @Test
//    public void shouldBeAbleToStop(){
//        Bicycle bicycle = new Bicycle();
//
//        bicycle.accelerate();
//        bicycle.brake();
//        bicycle.accelerate();
//        bicycle.stop();
//
//        assertEquals(0, bicycle.currentSpeed());
//
//    }
//}
