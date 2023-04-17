package ua.lviv.iot.algo.part1.lab1.ModelTest;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ua.lviv.iot.algo.part1.lab1.Model.Aircraft;
import ua.lviv.iot.algo.part1.lab1.Model.Helicopter;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AircraftTest {
    private Aircraft aircraft;

    @BeforeEach
    public void testSetUpAircraft() {
        aircraft = new Helicopter("Fly-High", 500, "Tiny", 400, 700, 400, 300);
    }

    @Test
    void testGetMaxFlyingDistance() {
        int expectedMaxFlyingDistance = 0;
        assertEquals(expectedMaxFlyingDistance, aircraft.getMaxFlyingDistance());
    }

    @Test
    void testGetMaxDeliveryWeight() {
        int expectedMaxDeliveryWeight = 0;
        assertEquals(expectedMaxDeliveryWeight, aircraft.getMaxDeliveryWeight());
    }
}
