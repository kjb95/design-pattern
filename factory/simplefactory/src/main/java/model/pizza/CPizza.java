package model.pizza;

public class CPizza implements Pizza {

    @Override
    public void bake() {
        System.out.println("C Pizza Bake");
    }

    @Override
    public void cut() {
        System.out.println("C Pizza Cut");
    }

    @Override
    public void box() {
        System.out.println("C Pizza Box");
    }
}
