package ua.lviv.iot.algo.part1.lab1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AircraftManagerTest {
    AircraftManager aircraftManager = new AircraftManager();

    @BeforeEach
    public void testSetUp() {
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
        Helicopter helicopter = new Helicopter("Fly-High", 500, "Tiny", 400, 700, 400, 300);
        aircraftManager.addAircraft(helicopter);
        assertFalse(aircraftManager.findByManufacturer("Fly-High").isEmpty());
    }

    @Test
    void testFindByManufacturer() {
        List<Aircraft> results = aircraftManager.findByManufacturer("Sin");
        Assertions.assertEquals(1,results.size());
        for (Aircraft aircraft : results) {
            Assertions.assertEquals("Sin", aircraft.getManufacturer());
        }
    }

    @Test
    void testFindAllWithMoreMaxSpeedThan() {
        List<Aircraft> fastAircraft = aircraftManager.findAllWithMoreMaxSpeedThan();
        Assertions.assertEquals(2, fastAircraft.size());
        for (Aircraft aircraft : fastAircraft) {
            Assertions.assertTrue(aircraft.getMaxSpeed() > 400);
        }
    }
}
