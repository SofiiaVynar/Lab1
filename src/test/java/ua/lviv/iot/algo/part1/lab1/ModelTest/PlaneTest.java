package ua.lviv.iot.algo.part1.lab1.ModelTest;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ua.lviv.iot.algo.part1.lab1.Model.Plane;

import static org.junit.jupiter.api.Assertions.assertEquals;

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

    @Test
    public void testGetHeaders() {
        Plane plane = new Plane();
        String expectedHeaders = "manufacturer, maxSpeed, wingsSpan, weight";
        assertEquals(expectedHeaders, plane.getHeaders());
    }

    @Test
    public void testToCSV() {
        Plane plane = new Plane("Plan", 80, 30, 380);
        String expectedCSV = "Plan,80,30,380";
        assertEquals(expectedCSV, plane.toCSV());
    }
}
