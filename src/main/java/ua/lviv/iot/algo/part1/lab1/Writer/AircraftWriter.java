package ua.lviv.iot.algo.part1.lab1.Writer;


import ua.lviv.iot.algo.part1.lab1.Model.Aircraft;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Comparator;
import java.util.List;

public class AircraftWriter {
    public final static String DEFAULT_FILENAME = "EXPECTED.CSV";

    public static String writeToFile(List<Aircraft> aircrafts) throws IOException {

        if (aircrafts == null || aircrafts.isEmpty()) {
            return null;
        }

        aircrafts.sort(Comparator.comparing(o -> o.getClass().getSimpleName()));
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(DEFAULT_FILENAME))) {
            String previouslyWrittenAircraft = null;
            for (var aircraft : aircrafts) {
                if (!aircraft.getClass().getSimpleName().equals(previouslyWrittenAircraft)) {
                    bufferedWriter.write(aircraft.getHeaders() + System.lineSeparator());
                    previouslyWrittenAircraft = aircraft.getClass().getSimpleName();
                }
                bufferedWriter.write(aircraft.toCSV());
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return DEFAULT_FILENAME;
    }
}
