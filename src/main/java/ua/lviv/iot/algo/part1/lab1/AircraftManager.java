package ua.lviv.iot.algo.part1.lab1;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class AircraftManager {
    private static final int WANTEDWEIGHT = 400;

    List<Aircraft> getAircraft() {
        return aircraft;
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

    private final List<Aircraft> aircraft = new LinkedList<>();

    void addAircraft(Aircraft aircraftList) {
        this.aircraft.add(aircraftList);
    }
}
