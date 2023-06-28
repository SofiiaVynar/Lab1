package ua.lviv.iot.algo.part1.lab1;

import junit.framework.TestCase;
import org.junit.Rule;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.rules.TemporaryFolder;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.LinkedList;
import java.util.List;

class AircraftWriterTest extends TestCase {

    private AircraftWriter writer = new AircraftWriter();
    private static final String EXPECTED = "EXPECTED.CSV";
    private static final String ACTUAL = "ACTUAL.CSV";
    List<Aircraft> aircraftList = new LinkedList<>();


    @Rule
    public TemporaryFolder folder = new TemporaryFolder();


    private AircraftManager aircraftManager;


    @BeforeEach
    public void setUp() throws IOException {
        aircraftManager = new AircraftManager();
        aircraftManager.addAircraft(new Helicopter("Fly-High", 500, "Tiny", 400, 700, 400, 300));
        aircraftManager.addAircraft(new Helicopter("Fly-High", 300, "Tin", 200, 500, 600, 400));
        aircraftManager.addAircraft(new Drone("Sin", 70, 2000, 10));
        aircraftManager.addAircraft(new Drone("Son", 60, 1500, 8));
        aircraftManager.addAircraft(new Plane("Vinnie", 600, 20, 10000));
        aircraftManager.addAircraft(new Plane("Vinna", 100, 10, 5000));
        aircraftManager.addAircraft(new Glider("PiN", 100, 150, 40));
        aircraftManager.addAircraft(new Glider("PiNi", 70, 100, 25));
        writer = new AircraftWriter();
        aircraftList.addAll(aircraftManager.getAircraft());
    }

    @Test
    public void testFileEmpty() throws IOException {
        try {
            FileWriter writer = new FileWriter(EXPECTED);
            writer.write(aircraftList.toString());
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
            fail("Could not write to the empty list file.");
        }
        File emptyListFile = new File(EXPECTED);
        assertFalse(emptyListFile.length() == 0);
    }


    @Test
    public void testEmptyWrite() throws IOException {
        writer.writeToFile(aircraftList);
        File file = new File(EXPECTED);
        Assertions.assertTrue(file.exists());

    }

    @Test
    public void testWriteListOfAircraft() throws IOException {
        writer.writeToFile(aircraftList);
        File file = new File(EXPECTED);

        Path expected = new File(EXPECTED).toPath();
        Path actual = new File(ACTUAL).toPath();

        Assertions.assertEquals(-1L, Files.mismatch(expected, actual));
    }

    @Test
    public void testFileOverride() throws IOException {
        testWriteListOfAircraft();
    }
}
