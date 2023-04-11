package ua.lviv.iot.algo.part1.lab1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

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
}