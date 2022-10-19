package model.pizza;

public class APizza implements Pizza {

    @Override
    public void bake() {
        System.out.println("A Pizza Bake");
    }

    @Override
    public void cut() {
        System.out.println("A Pizza Cut");
    }

    @Override
    public void box() {
        System.out.println("A Pizza Box");
    }
}
