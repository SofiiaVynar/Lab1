package ua.lviv.iot.algo.part1.lab1;

import lombok.ToString;

@ToString(callSuper = true)
public class Plane extends Aircraft {
    int wingsSpan;
    int weight;

    public Plane(String manufacturer, int maxSpeed, int wingsSpan, int weight) {
        super(manufacturer, maxSpeed);
        this.wingsSpan = wingsSpan;
        this.weight = weight;
    }
    @Override
    public void getMaxFlyingDistance() {
        double maxDistance = Math.pow(getMaxSpeed(), 2) / 20 * wingsSpan;
    }
    @Override
    public void getMaxDeliveryWeight() {
        double maxDeliveryWeight = 1.6 * weight;
    }
}