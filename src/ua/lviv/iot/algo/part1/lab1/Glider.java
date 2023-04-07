package ua.lviv.iot.algo.part1.lab1;

import lombok.ToString;
@ToString(callSuper = true)
public class Glider extends Aircraft{
    private int accelerationSpeed;
    private int wingChordLength;
    public Glider(String manufacturer, int maxSpeed, int accelerationSpeed, int wingChordLength) {
        super(manufacturer, maxSpeed);
        this.accelerationSpeed = accelerationSpeed;
        this.wingChordLength = wingChordLength;
    }
    @Override
    public int getMaxFlyingDistance() {
        return accelerationSpeed * wingChordLength*15;
    }
    @Override
    public int getMaxDeliveryWeight(){
        return 0;
    }
}