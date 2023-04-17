package ua.lviv.iot.algo.part1.lab1.Model;

import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor(force = true)
@ToString(callSuper = true)
public class Glider extends Aircraft {
    public static final String HEADER = "accelerationSpeed, wingChordLength";
    private final int accelerationSpeed;
    private final int wingChordLength;
    private static final int AVERAGEPOINT = 15;

    public Glider(final String manufacturer, final int maxSpeed,
                  final int accelerationSpeed, final int wingChordLength) {
        super(manufacturer, maxSpeed);
        this.accelerationSpeed = accelerationSpeed;
        this.wingChordLength = wingChordLength;
    }

    @Override
    public int getMaxFlyingDistance() {
        return accelerationSpeed * wingChordLength * AVERAGEPOINT;
    }

    @Override
    public int getMaxDeliveryWeight() {
        return 0;
    }

    public String getHeaders() {

        return super.getHeaders() + ", " + HEADER;
    }

    public String toCSV() {
        return super.toCSV() + "," + accelerationSpeed + "," + wingChordLength;
    }
}
