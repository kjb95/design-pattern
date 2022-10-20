package model.pizzastore;

import model.pizza.AmericanCheesePizza;
import model.pizza.AmericanPeperoniPizza;
import model.pizza.Pizza;

public class AmericanPizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza(String type) {
        if (type.equals("cheese")) {
            return new AmericanCheesePizza();
        }
        else if (type.equals("pepperoni")) {
            return new AmericanPeperoniPizza();
        }
        return null;
    }
}
