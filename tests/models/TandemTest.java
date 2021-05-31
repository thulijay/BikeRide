package models;

import models.Tandem;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TandemTest {

    @Test
    public void tandemShouldAccelerateMoreThanOnce(){
        Tandem tandem = new Tandem();

        tandem.accelerate();
        tandem.accelerate();
        tandem.accelerate();
        tandem.accelerate();
        tandem.accelerate();

        assertEquals(60, tandem.currentSpeed());
    }

    @Test
    public void tandemShouldBeAbleToMoveThenBrake(){
        Tandem tandem = new Tandem();

        tandem.accelerate();
        tandem.brake();

        assertEquals(5, tandem.currentSpeed());
    }
}
