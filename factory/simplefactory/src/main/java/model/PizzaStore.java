package model;

import model.pizza.Pizza;

public class PizzaStore {

    private SimplePizzaFactory factory;

    public PizzaStore(SimplePizzaFactory factory) {
        this.factory = factory;
    }

    public Pizza orderPizza(String type) {
        Pizza pizza = factory.createPizza(type);

        pizza.bake();
        pizza.cut();
        pizza.box();
        System.out.println();
        return pizza;
    }
}
