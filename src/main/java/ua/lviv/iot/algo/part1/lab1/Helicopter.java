package ua.lviv.iot.algo.part1.lab1;

import lombok.*;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString(callSuper = true)
public class Helicopter extends Aircraft {
    private int id = 100;
    private String model;
    private int currentAltitude;
    private int maxAltitude;
    private int fuelCapacity;
    private int currentFuel;

    public Helicopter(String manufacturer, int maxSpeed, String model, int currentAltitude, int maxAltitude, int fuelCapacity, int currentFuel) {
        super (manufacturer, maxSpeed);
        this.model = model;
        this.currentAltitude = currentAltitude;
        this.maxAltitude = maxAltitude;
        this.fuelCapacity = fuelCapacity;
        this.currentFuel = currentFuel;
    }

    public void takeOff() {
        ascend(100);
    }

    public void ascend(int altitude) {
        if (currentAltitude + altitude > maxAltitude) {
            currentAltitude = maxAltitude;
        } else {
            currentAltitude += altitude;
        }
    }

    public void descend(int altitude) {
        if (currentAltitude - altitude < 0) {
            currentAltitude = 0;
        } else {
            currentAltitude -= altitude;
        }
    }
    public void refuel(int fuel) {
        if (currentFuel + fuel > fuelCapacity) {
            currentFuel = fuelCapacity;
        } else {
            currentFuel += fuel;
        }
    }

    @Override
    public int getMaxFlyingDistance() {
        return  (int)(currentFuel/fuelCapacity*maxSpeed);
    }

    @Override
    public int getMaxDeliveryWeight() {
        return 0;
    }
}