package ua.lviv.iot.algo.part1.lab1;

import lombok.ToString;
@ToString(callSuper = true)
public class Glider extends Aircraft{
    int accelerationSpeed;
    int wingChordLength;
    public Glider(String manufacturer, int maxSpeed, int accelerationSpeed, int wingChordLength) {
        super(manufacturer, maxSpeed);
        this.accelerationSpeed = accelerationSpeed;
        this.wingChordLength = wingChordLength;
    }

    @Override
    public void getMaxFlyingDistance() {
        double maxDistance = accelerationSpeed * wingChordLength*15;
    }

    @Override
    public void getMaxDeliveryWeight(){
    }
}