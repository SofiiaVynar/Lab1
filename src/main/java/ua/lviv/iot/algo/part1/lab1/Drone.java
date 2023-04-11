package ua.lviv.iot.algo.part1.lab1;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString(callSuper = true)
public class Drone extends Aircraft {
    private int batteryCapacity;
    private int energyConsumptionPerMinute;

    public Drone(final String manufacturer, final int maxSpeed,
                 final int batteryCapacity,
                 final int energyConsumptionPerMinute) {
        super(manufacturer, maxSpeed);
        this.batteryCapacity = batteryCapacity;
        this.energyConsumptionPerMinute = energyConsumptionPerMinute;
    }

    @Override
    public int getMaxFlyingDistance() {
        return batteryCapacity / energyConsumptionPerMinute * getMaxSpeed();
    }

    @Override
    public int getMaxDeliveryWeight() {
        return 0;
    }
}
