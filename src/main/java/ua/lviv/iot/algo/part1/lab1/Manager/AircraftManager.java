package ua.lviv.iot.algo.part1.lab1.Manager;

import ua.lviv.iot.algo.part1.lab1.Model.Aircraft;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class AircraftManager {
    private static final int WANTEDWEIGHT = 400;

    public List<Aircraft> getAircraft() {
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

    public void addAircraft(Aircraft aircraftList) {
        this.aircraft.add(aircraftList);
    }

}
