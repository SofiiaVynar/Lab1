package ua.lviv.iot.algo.part1.lab1;

import lombok.ToString;

@ToString(callSuper = true)
public class Plane extends Aircraft {
    public static final double HALFWEIGHT = 1.6;
    public static final double HALFSPAN = 20;
    private final int wingsSpan;
    private final int weight;

    public Plane(final String manufacturer, final int maxSpeed,
                 final int wingsSpan, final int weight) {
        super(manufacturer, maxSpeed);
        this.wingsSpan = wingsSpan;
        this.weight = weight;
    }

    @Override
    public int getMaxFlyingDistance() {
        return (int) (Math.pow(getMaxSpeed(), 2) * HALFSPAN * wingsSpan);
    }

    @Override
    public int getMaxDeliveryWeight() {
        return (int) (HALFWEIGHT * weight);
    }
}
