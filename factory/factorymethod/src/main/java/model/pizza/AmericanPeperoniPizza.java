package model.pizza;

public class AmericanPeperoniPizza implements Pizza {

    @Override
    public void prepare() {
        System.out.println("American Peperoni Pizza Prepare!");
    }

    @Override
    public void bake() {
        System.out.println("American Peperoni Pizza Bake!");
    }
}
