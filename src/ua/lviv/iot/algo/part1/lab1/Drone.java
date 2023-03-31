package ua.lviv.iot.algo.part1.lab1;

import lombok.*;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString(callSuper = true)
public class Drone extends Aircraft{
    private int batteryCapacity;
    private int energyConsumptionPerMinute;
    public Drone(String manufacturer, int maxSpeed, int batteryCapacity, int energyConsumptionPerMinute){
        super (manufacturer, maxSpeed);
        this.batteryCapacity = batteryCapacity;
        this.energyConsumptionPerMinute = energyConsumptionPerMinute;
    }
    @Override
    public void getMaxFlyingDistance() {
        double maxDistance = ((double)batteryCapacity/energyConsumptionPerMinute)* maxSpeed;
    }
    @Override
    public void getMaxDeliveryWeight() {

    }
}