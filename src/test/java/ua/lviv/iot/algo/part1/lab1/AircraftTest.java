package ua.lviv.iot.algo.part1.lab1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AircraftTest {

    @Test
    void testGetMaxFlyingDistance(){
        Aircraft aircraft = new Helicopter("Fly-High", 500, "Tiny", 400, 700, 400, 300);
        int expectedMaxFlyingDistance = 0;
        assertEquals(expectedMaxFlyingDistance, aircraft.getMaxFlyingDistance());
    }
    @Test
    void testGetMaxDeliveryWeight() {
        Aircraft aircraft = new Drone("Sin", 70, 2000, 10);
        int expectedMaxDeliveryWeight = 0;
        assertEquals(expectedMaxDeliveryWeight, aircraft.getMaxDeliveryWeight());
    }

    @Test
    void testGetManufacturer() {
        Aircraft aircraft = new Plane("Vinnie", 600, 20, 10000);
        String expectedManufacturer = "Vinnie";
        assertEquals(expectedManufacturer, aircraft.getManufacturer());
    }

    @Test
    void testGetMaxSpeed() {
        Aircraft aircraft = new Glider("PiN", 100, 150, 40);
        int expectedMaxSpeed = 100;
        assertEquals(expectedMaxSpeed, aircraft.getMaxSpeed());
    }

    @Test
    void testSetManufacturer() {
        Aircraft aircraft = new Helicopter("Fly-High", 500, "Tiny", 400, 700, 400, 300);
        String newManufacturer = "Manufacturer";
        aircraft.setManufacturer(newManufacturer);
        assertEquals(newManufacturer, aircraft.getManufacturer());
    }

    @Test
    void testSetMaxSpeed() {
        Aircraft aircraft = new Drone("Sin", 70, 2000, 10);
        int newMaxSpeed = 80;
        aircraft.setMaxSpeed(newMaxSpeed);
        assertEquals(newMaxSpeed, aircraft.getMaxSpeed());
    }

    @Test
    void testToString() {
        Aircraft aircraft = new Plane("Vinnie", 600, 20, 10000);
        String expectedToString = "Plane(super=Aircraft(manufacturer=Vinnie, maxSpeed=600), wingsSpan=20, weight=10000)";
        assertEquals(expectedToString, aircraft.toString());
    }
}