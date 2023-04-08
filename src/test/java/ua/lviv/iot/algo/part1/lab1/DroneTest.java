package ua.lviv.iot.algo.part1.lab1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DroneTest {
    private Drone drone = new Drone("Manufacturer", 100, 2000, 20);

    @Test
    void testNoArgsConstructor() {
        Drone drone = new Drone();
        assertNull(drone.getManufacturer());
        assertEquals(0, drone.getMaxSpeed());
        assertEquals(0, drone.getBatteryCapacity());
        assertEquals(0, drone.getEnergyConsumptionPerMinute());
    }
    @Test
    void testGetMaxFlyingDistance() {
        assertEquals(10000, drone.getMaxFlyingDistance());
    }

    @Test
    void testGetMaxDeliveryWeight() {
        assertEquals(0, drone.getMaxDeliveryWeight());
    }

    @Test
    void testGetBatteryCapacity() {
        assertEquals(2000, drone.getBatteryCapacity());
    }

    @Test
    void testGetEnergyConsumptionPerMinute() {
        assertEquals(20, drone.getEnergyConsumptionPerMinute());
    }

    @Test
    void testSetBatteryCapacity() {
        drone.setBatteryCapacity(3000);
        assertEquals(3000, drone.getBatteryCapacity());
    }

    @Test
    void testSetEnergyConsumptionPerMinute() {
        drone.setEnergyConsumptionPerMinute(25);
        assertEquals(25, drone.getEnergyConsumptionPerMinute());
    }

    @Test
    void testToString() {
        String expected = "Drone(super=Aircraft(manufacturer=Manufacturer, maxSpeed=100), batteryCapacity=2000, energyConsumptionPerMinute=20)";
        assertEquals(expected, drone.toString());
    }
}