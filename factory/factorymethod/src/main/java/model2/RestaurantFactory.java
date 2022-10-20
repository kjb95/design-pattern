package model2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import model2.food.Food;
import model2.food.Gimbap;
import model2.food.Ramen;

public class RestaurantFactory {

    private static Map<Integer, Function<List<String>, Food>> foodRecipe = new HashMap<>();

    static {
        foodRecipe.put(0, Gimbap::new);
        foodRecipe.put(1, Ramen::new);
    }

    public static Food foodOf(int menuNumber, List<String> materials) {
        return foodRecipe.get(menuNumber)
            .apply(materials);
    }
}
