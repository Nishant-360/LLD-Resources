package org.example.DecoratorDesignPattern;

public class ExtraMushroom extends ToppingDecorator{
    BasePizza basePizza;

    //Using Constructor Injection

    public ExtraMushroom(BasePizza basePizza) {
        this.basePizza = basePizza;
    }

    @Override
    public int cost() {
        return basePizza.cost()+10;
    }
}
