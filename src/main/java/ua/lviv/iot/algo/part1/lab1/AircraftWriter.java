package ua.lviv.iot.algo.part1.lab1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class AircraftWriter {
    public String writeToFile(List<Aircraft> aircraft) throws IOException {

        String defaultFileName = "EXPECTED.CSV";

        if (aircraft == null || aircraft.isEmpty()) {
            return null;
        }

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(defaultFileName));) {
            for (Aircraft aircraft_value : aircraft) {
                bufferedWriter.write(aircraft_value.getHeaders());
                bufferedWriter.newLine();
                bufferedWriter.write(aircraft_value.toCSV());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();

        } catch (IOException e) {
        }
        return defaultFileName;
    }

    public static void main(String[] args) throws IOException{
        AircraftManager aircraftManager = new AircraftManager();
        aircraftManager.addAircraft(new Helicopter("Fly-High", 500, "Tiny", 400, 700, 400, 300));
        aircraftManager.addAircraft(new Helicopter("Fly-High", 300, "Tin", 200, 500, 600, 400));
        aircraftManager.addAircraft(new Drone("Sin", 70, 2000, 10));
        aircraftManager.addAircraft(new Drone("Son", 60, 1500, 8));
        aircraftManager.addAircraft(new Plane("Vinnie", 600, 20, 10000));
        aircraftManager.addAircraft(new Plane("Vinna", 100, 10, 5000));
        aircraftManager.addAircraft(new Glider("PiN", 100, 150, 40));
        aircraftManager.addAircraft(new Glider("PiNi", 70, 100, 25));

        AircraftWriter aircraftWriter = new AircraftWriter();
        aircraftWriter.writeToFile(aircraftManager.getAircraft());
    }
}