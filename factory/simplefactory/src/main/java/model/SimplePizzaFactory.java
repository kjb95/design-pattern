package model;

import model.pizza.CheesePizza;
import model.pizza.PepperoniPizza;
import model.pizza.Pizza;

public class SimplePizzaFactory {

    public Pizza createPizza(String type) {
        if (type.equals("cheese")) {
            return new CheesePizza();
        }
        else if (type.equals("pepperoni")) {
            return new PepperoniPizza();
        }
        return null;
    }

}
