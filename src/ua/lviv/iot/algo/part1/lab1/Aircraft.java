package ua.lviv.iot.algo.part1.lab1;

import lombok.*;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
abstract class Aircraft{
    private String manufacturer;
    protected int maxSpeed;
    
    public abstract int getMaxFlyingDistance();
    
    public abstract int getMaxDeliveryWeight();
}