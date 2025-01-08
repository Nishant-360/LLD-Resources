package org.example.DecoratorDesignPattern;

public class DemoPizza {
    public static void main(String[] args){
        BasePizza basePizza1=new ExtraCheese(new VeggieDelight());
        System.out.println(basePizza1.cost());

        BasePizza basePizza2=new ExtraCheese(new ExtraMushroom(new FarmHouse()));
        System.out.println(basePizza2.cost());
    }
}
