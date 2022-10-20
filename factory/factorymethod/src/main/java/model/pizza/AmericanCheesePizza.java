package model.pizza;

public class AmericanCheesePizza extends AbstractPizza {

    @Override
    public void prepare() {
        System.out.println("American Cheese Pizza Prepare!");
    }
}
