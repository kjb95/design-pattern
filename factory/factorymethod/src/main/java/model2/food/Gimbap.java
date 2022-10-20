package model2.food;

import java.util.List;

public class Gimbap extends AbstractFood {

    public Gimbap(List<String> materials) {
        super(materials);
    }

    @Override
    protected void introduce() {
        System.out.println("Gimbap yam yam!");
    }
}
