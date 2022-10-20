package model.pizzastore;

import model.pizza.KoreanCheesePizza;
import model.pizza.KoreanPeperoniPizza;
import model.pizza.Pizza;

public class KoreaPizzaStore extends PizzaStore {


    @Override
    public Pizza createPizza(String type) {
        if (type.equals("cheese")) {
            return new KoreanCheesePizza();
        }
        else if (type.equals("pepperoni")) {
            return new KoreanPeperoniPizza();
        }
        return null;
    }
}
