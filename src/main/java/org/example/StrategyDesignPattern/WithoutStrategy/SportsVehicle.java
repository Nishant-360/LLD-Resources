package org.example.StrategyDesignPattern.WithoutStrategy;

public class SportsVehicle extends Vehicle{
    //Duplication of code as similar method is present in OffRoadVehicle class
    @Override
    public void drive() {
        System.out.println("Fast Drive Capability");
    }
}
