package org.example.StrategyDesignPattern.WithoutStrategy;

public class OffRoadVehicle extends Vehicle{
    //Duplication of code as similar method is present in SportsVehicle class
    @Override
    public void drive() {
       System.out.println("Fast Drive Capability");
    }
}
