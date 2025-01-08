package org.example.StrategyDesignPattern.WithStrategy;

public class OffRoadVehicle extends Vehicle{
    public OffRoadVehicle(DriveStrategy driveObject) {
        super(new SportsDriveStrategy());
    }
}
