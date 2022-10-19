package model.pizza;

public class BPizza implements Pizza {

    @Override
    public void bake() {
        System.out.println("B Pizza Bake");
    }

    @Override
    public void cut() {
        System.out.println("B Pizza Cut");
    }

    @Override
    public void box() {
        System.out.println("B Pizza Box");
    }
}
