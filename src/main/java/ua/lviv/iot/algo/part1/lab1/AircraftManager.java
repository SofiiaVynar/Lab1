package ua.lviv.iot.algo.part1.lab1;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
public class AircraftManager{
    private final List<Aircraft> aircraft = new LinkedList<>();
    public void addAircraft(Aircraft aircraft) {
        this.aircraft.add(aircraft);
    }
    public List<Aircraft> findByManufacturer(String manufacturer){
        return aircraft.stream()
                .filter(aircraft -> aircraft.getManufacturer().equals(manufacturer))
                .collect(Collectors.toList());
    }
    public List<Aircraft> findAllWithMoreMaxSpeedThan() {
        return aircraft.stream()
                .filter(aircraft -> aircraft.getMaxSpeed()>400)
                .collect(Collectors.toList());
    }
    public static void main(String[] args){

        AircraftManager aircraftManager = new AircraftManager();

        aircraftManager.addAircraft(new Helicopter("Fly-High", 500, "Tiny", 400, 700, 400, 300));
        aircraftManager.addAircraft(new Helicopter("Fly-High", 300, "Tin", 200, 500, 600, 400));
        aircraftManager.addAircraft(new Drone("Sin", 70, 2000, 10));
        aircraftManager.addAircraft(new Drone("Son", 60, 1500, 8));
        aircraftManager.addAircraft(new Plane("Vinnie", 600, 20, 10000));
        aircraftManager.addAircraft(new Plane("Vinna", 100, 10, 5000));
        aircraftManager.addAircraft(new Glider("PiN", 100, 150, 40));
        aircraftManager.addAircraft(new Glider("PiNi", 70, 100, 25));

        System.out.println("Aircraft:");
        aircraftManager.aircraft.forEach(System.out::println);

        System.out.println("\nSearched manufacturer:");
        aircraftManager.findByManufacturer("PiN").forEach(System.out::println);

        System.out.println("\nAircraft with needed max speed:");
        aircraftManager.findAllWithMoreMaxSpeedThan().forEach(System.out::println);
    }
}
