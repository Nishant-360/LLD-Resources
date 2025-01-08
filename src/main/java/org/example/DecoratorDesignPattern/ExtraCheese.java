package org.example.DecoratorDesignPattern;

public class ExtraCheese extends ToppingDecorator{
    BasePizza basePizza;

    //Using Constructor Injection

    public ExtraCheese(BasePizza basePizza) {
        this.basePizza = basePizza;
    }

    @Override
    public int cost() {
        return basePizza.cost()+20;
    }
}
