package model.pizza;

public class PepperoniPizza implements Pizza {

    @Override
    public void prepare() {
        System.out.println("Pepperoni Pizza Prepare!");
    }

    @Override
    public void bake() {
        System.out.println("Pepperoni Pizza Bake!");
    }
}
