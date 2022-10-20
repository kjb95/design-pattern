package model.pizza;

public class KoreanPeperoniPizza implements Pizza {

    @Override
    public void prepare() {
        System.out.println("Korean Peperoni Pizza Prepare!");
    }

    @Override
    public void bake() {
        System.out.println("Korean Peperoni Pizza Bake!");
    }
}
