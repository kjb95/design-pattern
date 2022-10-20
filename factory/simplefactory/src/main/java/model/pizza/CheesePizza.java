package model.pizza;

public class CheesePizza implements Pizza {

    @Override
    public void prepare() {
        System.out.println("Cheese Pizza Prepare!");
    }

    @Override
    public void bake() {
        System.out.println("Cheese Pizza Bake!");
    }
}
