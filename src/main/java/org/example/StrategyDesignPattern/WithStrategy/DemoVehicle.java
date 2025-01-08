package org.example.StrategyDesignPattern.WithStrategy;

public class DemoVehicle {
    public static void main(String args[]){
        Vehicle goodsVehicle=new GoodsVehicle();
        goodsVehicle.drive();

        Vehicle sportsVehicle=new SportsVehicle();
        sportsVehicle.drive();
    }
}
