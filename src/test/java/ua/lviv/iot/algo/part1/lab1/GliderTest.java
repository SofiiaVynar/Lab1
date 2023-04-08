package ua.lviv.iot.algo.part1.lab1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class GliderTest {
    private Glider glider = new Glider("Airbus", 1000, 10, 20);
    @Test
    void testGetMaxFlyingDistance() {
        assertEquals(3000, glider.getMaxFlyingDistance());
    }

    @Test
    void testGetMaxDeliveryWeight() {
        assertEquals(0, glider.getMaxDeliveryWeight());
    }

    @Test
    void testToString() {
        String expectedString = "Glider(super=Aircraft(manufacturer=Airbus, maxSpeed=1000), accelerationSpeed=10, wingChordLength=20)";
        assertEquals(expectedString, glider.toString());
    }
}