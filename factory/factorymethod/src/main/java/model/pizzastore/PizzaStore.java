package model.pizzastore;

import model.pizza.Pizza;

public abstract class PizzaStore {

    public Pizza orderPizza(String type) {
        Pizza pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        System.out.println();
        return pizza;
    }

    protected abstract Pizza createPizza(String type);
}
