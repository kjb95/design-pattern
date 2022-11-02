package model;

public abstract class Language {
    public void introduce() {
        System.out.println("introduce!");
        hello();
    }
    abstract public void hello();

}
