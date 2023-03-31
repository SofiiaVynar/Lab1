package ua.lviv.iot.algo.part1.lab1;

import lombok.ToString;
@ToString(callSuper = true)
public class Plane extends Aircraft {
    public static final double halfWeight = 1.6;
    private int wingsSpan;
    private int weight;
    public Plane(String manufacturer, int maxSpeed, int wingsSpan, int weight) {
        super(manufacturer, maxSpeed);
        this.wingsSpan = wingsSpan;
        this.weight = weight;
    }
    @Override
    public int getMaxFlyingDistance() {
        return (int) (Math.pow(getMaxSpeed(), 2) / 20 * wingsSpan);
    }
    @Override
    public int getMaxDeliveryWeight() {
        return (int) (halfWeight * weight);
    }
}
