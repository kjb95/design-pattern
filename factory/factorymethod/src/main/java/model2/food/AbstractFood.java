package model2.food;

import java.util.List;

public abstract class AbstractFood implements Food {

    private final List<String> materials;

    public AbstractFood(List<String> materials) {
        this.materials = materials;
    }

    @Override
    public void make() {
        materials.forEach((material) -> System.out.println("Put " + material));
        introduce();
        System.out.println();
    }

    protected abstract void introduce();
}
