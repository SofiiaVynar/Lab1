package ua.lviv.iot.algo.part1.lab1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AircraftManagerTest {
    AircraftManager aircraftManager = new AircraftManager();
    @BeforeEach
    public void testSetUp() {
        aircraftManager = new AircraftManager();
        aircraftManager.addAircraft(new Helicopter("Fly-High", 500, "Tiny", 400, 700, 400, 300));
        aircraftManager.addAircraft(new Helicopter("Fly-High", 300, "Tin", 200, 500, 600, 400));
        aircraftManager.addAircraft(new Drone("Sin", 70, 2000, 10));
        aircraftManager.addAircraft(new Drone("Son", 60, 1500, 8));
        aircraftManager.addAircraft(new Plane("Vinnie", 600, 20, 10000));
        aircraftManager.addAircraft(new Plane("Vinna", 100, 10, 5000));
        aircraftManager.addAircraft(new Glider("PiN", 100, 150, 40));
        aircraftManager.addAircraft(new Glider("PiNi", 70, 100, 25));
    }

    @Test
    void testAddAircraft() {
        AircraftManager aircraftManager = new AircraftManager();
        Helicopter helicopter = new Helicopter("Fly-High", 500, "Tiny", 400, 700, 400, 300);
        assertTrue(aircraftManager.findByManufacturer("Fly-High").isEmpty());
        aircraftManager.addAircraft(helicopter);
        assertFalse(aircraftManager.findByManufacturer("Fly-High").isEmpty());
    }

    @Test
    void testFindByManufacturer() {
        aircraftManager.addAircraft(new Helicopter("Fly-High", 500, "Tiny", 400, 700, 400, 300));
        aircraftManager.addAircraft(new Helicopter("Fly-High", 300, "Tin", 200, 500, 600, 400));
        aircraftManager.addAircraft(new Drone("Sin", 70, 2000, 10));
        aircraftManager.addAircraft(new Drone("Son", 60, 1500, 8));
        aircraftManager.addAircraft(new Plane("Vinnie", 600, 20, 10000));
        aircraftManager.addAircraft(new Plane("Vinna", 100, 10, 5000));
        aircraftManager.addAircraft(new Glider("PiN", 100, 150, 40));
        aircraftManager.addAircraft(new Glider("PiNi", 70, 100, 25));
        assertEquals(4, aircraftManager.findByManufacturer("Fly-High").size());
    }

    @Test
    void testFindAllWithMoreMaxSpeedThan() {
        aircraftManager.addAircraft(new Helicopter("Fly-High", 500, "Tiny", 400, 700, 400, 300));
        aircraftManager.addAircraft(new Helicopter("Fly-High", 300, "Tin", 200, 500, 600, 400));
        aircraftManager.addAircraft(new Drone("Sin", 70, 2000, 10));
        aircraftManager.addAircraft(new Drone("Son", 60, 1500, 8));
        aircraftManager.addAircraft(new Plane("Vinnie", 600, 20, 10000));
        aircraftManager.addAircraft(new Plane("Vinna", 100, 10, 5000));
        aircraftManager.addAircraft(new Glider("PiN", 100, 150, 40));
        aircraftManager.addAircraft(new Glider("PiNi", 70, 100, 25));
        assertEquals(4, aircraftManager.findAllWithMoreMaxSpeedThan().size());
    }
}