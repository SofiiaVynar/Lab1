package ua.lviv.iot.algo.part1.lab1.ModelTest;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ua.lviv.iot.algo.part1.lab1.Model.Drone;

import static org.junit.jupiter.api.Assertions.assertEquals;

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

    @Test
    public void testGetHeaders() {
        Drone drone = new Drone();
        String expectedHeaders = "manufacturer, maxSpeed, batteryCapacity, energyConsumptionPerMinute";
        assertEquals(expectedHeaders, drone.getHeaders());
    }

    @Test
    public void testToCSV() {
        Drone drone = new Drone("DI", 80, 500, 10);
        String expectedCSV = "DI,80,500,10";
        assertEquals(expectedCSV, drone.toCSV());
    }
}
