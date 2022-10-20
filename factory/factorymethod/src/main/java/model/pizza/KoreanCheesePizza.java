package model.pizza;

public class KoreanCheesePizza implements Pizza {

    @Override
    public void prepare() {
        System.out.println("Korean Cheese Pizza Prepare!");
    }

    @Override
    public void bake() {
        System.out.println("Korean Cheese Pizza Bake!");
    }
}
