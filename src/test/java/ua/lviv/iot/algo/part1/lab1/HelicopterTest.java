package ua.lviv.iot.algo.part1.lab1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class HelicopterTest {
    private Helicopter helicopter = new Helicopter("Manufacturer", 200, "Model", 500, 450, 1000, 500);

    @Test
    public void testNoArgsConstructor() {
        Helicopter helicopter = new Helicopter();
        assertNotNull(helicopter);
        assertEquals(100, helicopter.getId());
        assertNull(helicopter.getModel());
        assertEquals(0, helicopter.getCurrentAltitude());
        assertEquals(0, helicopter.getMaxAltitude());
        assertEquals(0, helicopter.getFuelCapacity());
        assertEquals(0, helicopter.getCurrentFuel());
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

    @Test
    void testGetId() {
        assertEquals(100, helicopter.getId());
    }

    @Test
    void testGetModel() {
        assertEquals("Model", helicopter.getModel());
    }

    @Test
    void testGetCurrentAltitude() {
        assertEquals(500, helicopter.getCurrentAltitude());
    }

    @Test
    void testGetMaxAltitude() {
        assertEquals(450, helicopter.getMaxAltitude());
    }

    @Test
    void testGetFuelCapacity() {
        assertEquals(1000, helicopter.getFuelCapacity());
    }

    @Test
    void testGetCurrentFuel() {
        assertEquals(500, helicopter.getCurrentFuel());
    }

    @Test
    void testSetId() {
        helicopter.setId(200);
        assertEquals(200, helicopter.getId());
    }

    @Test
    void testSetModel() {
        helicopter.setModel("New Model");
        assertEquals("New Model", helicopter.getModel());
    }

    @Test
    void testSetMaxAltitude() {
        helicopter.setMaxAltitude(10000);
        assertEquals(10000, helicopter.getMaxAltitude());
    }

    @Test
    void testSetFuelCapacity() {
        helicopter.setFuelCapacity(500);
        assertEquals(500, helicopter.getFuelCapacity());
    }

    @Test
    void testSetCurrentFuel() {
        helicopter.setCurrentFuel(50);
        assertEquals(50, helicopter.getCurrentFuel());
    }

    @Test
    void testToString() {
        assertEquals("Helicopter(super=Aircraft(manufacturer=Manufacturer, maxSpeed=200), id=100, model=Model, currentAltitude=500, maxAltitude=450, fuelCapacity=1000, currentFuel=500)", helicopter.toString());
    }
}