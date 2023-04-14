package ua.lviv.iot.algo.part1.lab1;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class AircraftManager {
    private static final int WANTEDWEIGHT = 400;
    private final List<Aircraft> aircraft = new LinkedList<>();

    public void addAircraft(final Aircraft aircraft) {
        this.aircraft.add(aircraft);
    }

    public List<Aircraft> findByManufacturer(final String manufacturer) {
        return aircraft.stream()
                .filter(aircraft ->
                        aircraft.getManufacturer().equals(manufacturer))
                .collect(Collectors.toList());
    }

    public List<Aircraft> findAllWithMoreMaxSpeedThan() {
        return aircraft.stream()
                .filter(aircraft -> aircraft.getMaxSpeed() > WANTEDWEIGHT)
                .collect(Collectors.toList());
    }
}
