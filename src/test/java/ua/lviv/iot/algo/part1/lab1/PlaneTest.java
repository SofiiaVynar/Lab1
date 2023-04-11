package ua.lviv.iot.algo.part1.lab1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PlaneTest {
    private Plane plane;

    @BeforeEach
    public void testSetUpPlane() {
        plane = new Plane("Manufacturer", 100, 20, 1000);
    }

    @Test
    void testGetMaxFlyingDistance() {
        assertEquals(4000000, plane.getMaxFlyingDistance());
    }

    @Test
    void testGetMaxDeliveryWeight() {
        assertEquals(1600, plane.getMaxDeliveryWeight());
    }
}