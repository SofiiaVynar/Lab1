package ua.lviv.iot.algo.part1.lab1;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString(callSuper = true)
public class Helicopter extends Aircraft {
    private static final int ID = 100;
    private String model;
    private int currentAltitude;
    private int maxAltitude;
    private int fuelCapacity;
    private int currentFuel;
    private static final int AVERAGEALTITUDE = 100;

    public Helicopter(final String manufacturer, final int maxSpeed,
                      final String model,
                      final int currentAltitude, final int maxAltitude,
                      final int fuelCapacity, final int currentFuel) {
        super(manufacturer, maxSpeed);
        this.model = model;
        this.currentAltitude = currentAltitude;
        this.maxAltitude = maxAltitude;
        this.fuelCapacity = fuelCapacity;
        this.currentFuel = currentFuel;
    }

    public void takeOff() {
        ascend(AVERAGEALTITUDE);
    }

    public void ascend(final int altitude) {
        if (currentAltitude + altitude > maxAltitude) {
            currentAltitude = maxAltitude;
        } else {
            currentAltitude += altitude;
        }
    }

    public void descend(final int altitude) {
        if (currentAltitude - altitude < 0) {
            currentAltitude = 0;
        } else {
            currentAltitude -= altitude;
        }
    }

    public void refuel(final int fuel) {
        if (currentFuel + fuel > fuelCapacity) {
            currentFuel = fuelCapacity;
        } else {
            currentFuel += fuel;
        }
    }

    @Override
    public int getMaxFlyingDistance() {
        return currentFuel / fuelCapacity * getMaxSpeed();
    }

    @Override
    public int getMaxDeliveryWeight() {
        return 0;
    }
}
