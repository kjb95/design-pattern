package model2.food;

import java.util.List;

public class Ramen extends AbstractFood {

    public Ramen(List<String> materials) {
        super(materials);
    }

    @Override
    protected void introduce() {
        System.out.println("Ramen yam yam!");
    }
}
