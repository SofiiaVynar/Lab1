package ua.lviv.iot.algo.part1.lab1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HelicopterTest {
    private Helicopter helicopter;

    @BeforeEach
    public void testSetUpHelicopter() {
        helicopter = new Helicopter("Manufacturer", 200, "Model", 500, 450, 1000, 500);
    }

    @Test
    void testTakeOff() {
        helicopter.takeOff();
        assertEquals(450, helicopter.getCurrentAltitude());
    }

    @Test
    public void testAscend() {
        helicopter.ascend(450);
        assertEquals(450, helicopter.getCurrentAltitude());

        Helicopter helicopter = new Helicopter("Manufacturer", 200, "Model", 100, 1000, 2000, 1000);
        helicopter.ascend(200);
        assertEquals(300, helicopter.getCurrentAltitude());
    }

    @Test
    void testDescend() {
        helicopter.descend(300);
        assertEquals(200, helicopter.getCurrentAltitude());
        helicopter.descend(1000);
        assertEquals(helicopter.getCurrentAltitude(), 0);
    }

    @Test
    void testRefuel() {
        helicopter.refuel(400);
        assertEquals(900, helicopter.getCurrentFuel());
        helicopter.refuel(200);
        assertEquals(1000, helicopter.getCurrentFuel());
    }

    @Test
    void testGetMaxFlyingDistance() {
        assertEquals(0, helicopter.getMaxFlyingDistance());
    }

    @Test
    void testGetMaxDeliveryWeight() {
        assertEquals(0, helicopter.getMaxDeliveryWeight());
    }

}