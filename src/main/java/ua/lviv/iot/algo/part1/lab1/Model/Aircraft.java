package ua.lviv.iot.algo.part1.lab1.Model;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public abstract class Aircraft {
    private String manufacturer;
    private int maxSpeed;
    public static final String HEADER = "manufacturer, maxSpeed";

    public abstract int getMaxFlyingDistance();

    public abstract int getMaxDeliveryWeight();

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public String getHeaders() {
        return HEADER;
    }

    public String toCSV() {
        return manufacturer + "," + maxSpeed;
    }
}
