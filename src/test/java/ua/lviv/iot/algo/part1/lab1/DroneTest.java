package ua.lviv.iot.algo.part1.lab1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DroneTest {
    private Drone drone;

    @BeforeEach
    public void testSetUpDrone() {
        drone = new Drone("DJI", 50, 5000, 10);
    }

    @Test
    void testGetMaxFlyingDistance() {
        assertEquals(25000, drone.getMaxFlyingDistance());
    }

    @Test
    void testGetMaxDeliveryWeight() {
        assertEquals(0, drone.getMaxDeliveryWeight());
    }
}