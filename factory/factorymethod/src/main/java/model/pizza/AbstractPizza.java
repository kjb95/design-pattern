package model.pizza;

public abstract class AbstractPizza implements Pizza {

    @Override
    public void bake() {
        System.out.println("Pizza Bake!");
    }
}
