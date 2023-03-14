package ua.lviv.iot.algo.part1.lab1;

import lombok.*;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Helicopter {
    private int id = 100;
    private String model;
    private int currentAltitude;
    private int maxAltitude;
    private int fuelCapacity;
    private int currentFuel;
    private static Helicopter instance;

    public static Helicopter getInstance() {
        if (instance == null) {
            instance = new Helicopter();
        }
        return instance;
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

    public static void main(String[] args) {
        Helicopter[] helicopters = {
                new Helicopter(),
                new Helicopter(100,"Fly-High", 500, 1000,100,100),
                Helicopter.getInstance(),
                Helicopter.getInstance()
        };

        for (Helicopter helicopter : helicopters) {
            System.out.println(helicopter);
        }
    }
}