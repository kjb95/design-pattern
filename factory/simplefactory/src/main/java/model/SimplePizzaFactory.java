package model;

import model.pizza.APizza;
import model.pizza.BPizza;
import model.pizza.CPizza;
import model.pizza.Pizza;

public class SimplePizzaFactory {

    public Pizza createPizza(String type) {
        if (type.equals("A")) {
            return new APizza();
        }
        else if (type.equals("B")) {
            return new BPizza();
        }
        else if (type.equals("C")) {
            return new CPizza();
        }
        return null;
    }

}
