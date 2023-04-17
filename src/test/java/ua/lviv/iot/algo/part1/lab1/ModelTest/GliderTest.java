package ua.lviv.iot.algo.part1.lab1.ModelTest;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ua.lviv.iot.algo.part1.lab1.Model.Glider;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GliderTest {
    private Glider glider;

    @BeforeEach
    public void testSetUpGlider() {
        glider = new Glider("Airbus", 1000, 10, 20);
    }

    @Test
    void testGetMaxFlyingDistance() {
        assertEquals(3000, glider.getMaxFlyingDistance());
    }

    @Test
    void testGetMaxDeliveryWeight() {
        assertEquals(0, glider.getMaxDeliveryWeight());
    }

    @Test
    public void testGetHeaders() {
        Glider glider = new Glider();
        String expectedHeaders = "manufacturer, maxSpeed, accelerationSpeed, wingChordLength";
        assertEquals(expectedHeaders, glider.getHeaders());
    }

    @Test
    public void testToCSV() {
        Glider glider = new Glider("Gli", 80, 300, 30);
        String expectedCSV = "Gli,80,300,30";
        assertEquals(expectedCSV, glider.toCSV());
    }
}
