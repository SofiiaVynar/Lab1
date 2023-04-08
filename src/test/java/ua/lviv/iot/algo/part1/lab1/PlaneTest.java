package ua.lviv.iot.algo.part1.lab1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PlaneTest {
    private final Plane plane = new Plane("Manufacturer", 100, 20, 1000);
    @Test
    void testGetMaxFlyingDistance() {
        assertEquals(10000, plane.getMaxFlyingDistance());
    }

    @Test
    void testGetMaxDeliveryWeight() {
        assertEquals(1600, plane.getMaxDeliveryWeight());
    }

    @Test
    void testToString() {
        String expected = "Plane(super=Aircraft(manufacturer=Manufacturer, maxSpeed=100), wingsSpan=20, weight=1000)";
        assertEquals(expected, plane.toString());
    }
}