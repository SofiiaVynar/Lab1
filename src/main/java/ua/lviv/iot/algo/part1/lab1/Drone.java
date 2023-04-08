package ua.lviv.iot.algo.part1.lab1;

import lombok.*;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString(callSuper = true)
<<<<<<< HEAD
public class Drone extends Aircraft{
=======
public class Drone extends Aircraft1{
>>>>>>> parent of 0249248 (Initial Commit)
    private int batteryCapacity;
    private int energyConsumptionPerMinute;
    public Drone(String manufacturer, int maxSpeed, int batteryCapacity, int energyConsumptionPerMinute){
        super (manufacturer, maxSpeed);
        this.batteryCapacity = batteryCapacity;
        this.energyConsumptionPerMinute = energyConsumptionPerMinute;
    }
    @Override
    public int getMaxFlyingDistance() {
        return (int) (batteryCapacity/energyConsumptionPerMinute * maxSpeed);
    }
    @Override
    public int getMaxDeliveryWeight() {
        return 0;
    }
}