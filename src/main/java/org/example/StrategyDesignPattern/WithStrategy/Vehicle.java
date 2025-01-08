package org.example.StrategyDesignPattern.WithStrategy;

public class Vehicle {

    DriveStrategy driveObject;

    public Vehicle(DriveStrategy driveObject) {
        this.driveObject = driveObject;
    }

    public void drive(){
        driveObject.drive();
    }
}
