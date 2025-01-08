package org.example.StrategyDesignPattern.WithStrategy;

public class GoodsVehicle extends Vehicle{

    public GoodsVehicle() {
        super(new NormalDriveStrategy());
    }
}
