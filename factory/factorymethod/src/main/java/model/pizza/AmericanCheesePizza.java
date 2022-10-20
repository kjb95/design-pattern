package model.pizza;

public class AmericanCheesePizza implements Pizza {

    @Override
    public void prepare() {
        System.out.println("American Cheese Pizza Prepare!");
    }

    @Override
    public void bake() {
        System.out.println("American Cheese Pizza Bake!");
    }
}
